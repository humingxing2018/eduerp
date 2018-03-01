package cn.service.standarddetail;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.standarddetail.StandardDetailMapper;
import cn.pojo.StandardDetail;
@Service
public class StandardDetailServiceImpl implements StandardDetailService {
	@Resource
    private StandardDetailMapper standardDetailMapper;
    
	public StandardDetailMapper getStandardDetailMapper() {
		return standardDetailMapper;
	}

	public void setStandardDetailMapper(StandardDetailMapper standardDetailMapper) {
		this.standardDetailMapper = standardDetailMapper;
	}

	@Override
	public List<StandardDetail> findBy(StandardDetail standardDetail) {
		
		return standardDetailMapper.findBy(standardDetail);
	}

}
