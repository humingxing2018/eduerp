package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.pojo.Standard;
import cn.service.standard.StandardService;

@Controller
@RequestMapping(value="/standard")
public class StandardController {
	@Resource
      private StandardService standardService;

	public StandardService getStandardService() {
		return standardService;
	}

	public void setStandardService(StandardService standardService) {
		this.standardService = standardService;
	}
      @RequestMapping(value="/standardlist")
      public String getStandardList(Model model){
  		List<Standard> standardList = standardService.findAll();
    	model.addAttribute("standardList", standardList);
		        return "standardlist";
	}
		  	
}