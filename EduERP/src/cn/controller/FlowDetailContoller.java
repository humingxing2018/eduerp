package cn.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pojo.FlowDetail;
import cn.service.flowdetail.FlowDetailService;

@Controller()
@RequestMapping(value="/flowdatail")
public class FlowDetailContoller {
	@Resource
	private FlowDetailService flowDetailService;

	public FlowDetailService getFlowDetailService() {
		return flowDetailService;
	}

	public void setFlowDetailService(FlowDetailService flowDetailService) {
		this.flowDetailService = flowDetailService;
	}	
	@RequestMapping(value="/flowdatailList")
	public String getFlowDetailList(Model model){
		List<FlowDetail> flowdataillist=flowDetailService.findAll();
		model.addAttribute("flowdatailList", flowdataillist);
		return "flowdatailList";
		
	}
}
