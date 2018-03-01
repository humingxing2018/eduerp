package cn.service.flowinfo;

import java.util.List;

import cn.pojo.FlowInfo;
/**
 * 流程主表Service
 * @author 吴乾煌 陈珍福
 * 2018-1-22 15:46
 */
public interface FlowInfoService {
	public List<FlowInfo> findById(FlowInfo flowinfo);
	
	public int update(FlowInfo flowinfo);
	
	public int delete(FlowInfo flowinfo);
		
	public int insert(FlowInfo flowinfo);
		
	public List<FlowInfo> findAll();
}
