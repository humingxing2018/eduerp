package cn.service.flowinfo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.flowinfo.FlowInfoMapper;
import cn.pojo.FlowInfo;
@Service
public class FlowInfoServiceImpl implements FlowInfoService{
	@Resource
	private FlowInfoMapper flowinfoMapper;
	

	public FlowInfoMapper getFlowinfoMapper() {
		return flowinfoMapper;
	}

	public void setFlowinfoMapper(FlowInfoMapper flowinfoMapper) {
		this.flowinfoMapper = flowinfoMapper;
	}

	@Override
	public List<FlowInfo> findById(FlowInfo flowinfo) {
		// TODO Auto-generated method stub
		return flowinfoMapper.findBy(flowinfo);
	}

	@Override
	public int update(FlowInfo flowinfo) {
		// TODO Auto-generated method stub
		return flowinfoMapper.update(flowinfo);
	}

	@Override
	public int delete(FlowInfo flowinfo) {
		// TODO Auto-generated method stub
		return flowinfoMapper.delete(flowinfo);
	}

	@Override
	public int insert(FlowInfo flowinfo) {
		// TODO Auto-generated method stub
		return flowinfoMapper.insert(flowinfo);
	}

	@Override
	public List<FlowInfo> findAll() {
		// TODO Auto-generated method stub
		return flowinfoMapper.findAll();
	}

}
