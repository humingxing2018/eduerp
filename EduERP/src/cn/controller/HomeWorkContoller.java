package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.pojo.HomeWork;
import cn.service.homework.HomeWorkService;
@Controller
@RequestMapping(value="/homeWork")
public class HomeWorkContoller {
	@Resource
	private HomeWorkService homeWorkService;
	public HomeWorkService getHomeWorkService() {
		return homeWorkService;
	}

	public void setHomeWorkService(HomeWorkService homeWorkService) {
		this.homeWorkService = homeWorkService;
	}
	
	@RequestMapping("/delete")
	public String delete(HomeWork homeWork){
		int isdelete=homeWorkService.delete(homeWork);
		if(isdelete>0){
			return "redirect:/homeWork/homeWork.html";
		}
		return "redirect:/homeWork/homeWorkAdd";
	}
	
	@RequestMapping("/preUpdate")
	public String preUpdate(HomeWork homeWork,Model model){
		List<HomeWork> list=homeWorkService.cx(homeWork);
		if(list!=null&&list.size()>0){
			model.addAttribute("user", list.get(0));
			return "/homeWork/updateHomeWork";
		}
		return "redirect:/homeWork/homeWork.html";
	}
	
	@RequestMapping("/doAddService")
	public String doAddService(HomeWork homeWork){
		int isadd=homeWorkService.insert(homeWork);
		if(isadd>0){
			return "redirect:/homeWork/homeWork.html";
		}
		return "redirect:/homeWork/homeWorkAdd";
	}
	
	@RequestMapping(value="/homeWorkAdd.html",method=RequestMethod.GET)
	public String homeWorkAdd(){
		return "homeWork/homeWorkAdd";
	}
	@RequestMapping("/homeWork.html")
	public String cx(@Param("homeWork")HomeWork homeWork,Model model){
		List<HomeWork> homeWorklist=homeWorkService.cx(homeWork);
		model.addAttribute("homeWorklist", homeWorklist);
			return "homeWorklist";
	}
	@RequestMapping(value="/updateHomeWork.html",method=RequestMethod.POST)
	public String updateHomeWork(@ModelAttribute(value="homeWork") HomeWork homeWork){
		int isup=homeWorkService.update(homeWork);
		if(isup>0){
			return "redirect:/homeWork/homeWork.html";
		}
		return "redirect:/homeWork/preUpdate";
	}
	}
