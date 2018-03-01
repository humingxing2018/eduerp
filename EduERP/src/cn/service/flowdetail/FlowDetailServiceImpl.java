package cn.service.flowdetail;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.flowdetail.FlowDetailMapper;
import cn.pojo.FlowDetail;
@Service
public class FlowDetailServiceImpl implements FlowDetailService {
	@Resource
	private FlowDetailMapper flowDetailMapper;
	


	public FlowDetailMapper getFlowDetailMapper() {
		return flowDetailMapper;
	}

	public void setFlowDetailMapper(FlowDetailMapper flowDetailMapper) {
		this.flowDetailMapper = flowDetailMapper;
	}

	@Override
	public List<FlowDetail> findAll() {
		// TODO Auto-generated method stub
		return flowDetailMapper.findAll();
	}


}
