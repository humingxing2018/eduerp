package cn.service.standard;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.standard.StandardMapper;
import cn.pojo.Standard;
@Service
public class StandardServiceImpl implements StandardService {
	@Resource
     private StandardMapper standardMapper;
     
	public StandardMapper getStandardMapper() {
		return standardMapper;
	}
	public void setStandardMapper(StandardMapper standardMapper) {
		this.standardMapper = standardMapper;
	}
	@Override
	public List<Standard> findAll() {
		return standardMapper.findAll();
	}



}
