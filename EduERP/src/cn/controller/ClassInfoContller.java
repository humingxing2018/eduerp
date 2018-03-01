package cn.controller;
/**
 * 刘森奇2018.2.3
 */
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pojo.ClassInfo;
import cn.service.classinfo.ClassInfoService;

@Controller()
@RequestMapping(value="/classInfo")
public class ClassInfoContller {
	@Resource
	private ClassInfoService classInfoService;
	public  ClassInfoService getClassInfoService(){
		return classInfoService;
	}
	public void setClassService(ClassInfoService classInfoService) {
		this.classInfoService =  classInfoService;
	}
	//查询
	@RequestMapping("/classInfo.html")
	public String findBy(@RequestParam(value="classinfo",required=false)ClassInfo classinfo,Model model){
		List<ClassInfo> List = classInfoService.findBy(classinfo);
		model.addAttribute("List",List);
		return "/classInfolist";
	}
	 //添加数据
	   @RequestMapping("/preAddClassInfo")
		public String preAddClassInfo(){
			return "/classinfo/addClassInfo";
		}
	@RequestMapping("/doAddClassInfo")
	public String doAddClassInfo(ClassInfo classinfo){
		int iRet=classInfoService.insert(classinfo);
		if(iRet>0){
			return "redirect:/classInfo/classInfo.html";
		}
		return "redirect:/classInfo/preaddClassInfo";
	}
    //修改数据
	@RequestMapping("/preUpdateClassInfo")
	public String preUpdate(ClassInfo classinfo,Model model){
		List<ClassInfo> list=classInfoService.findBy(classinfo);
		if(list!=null&&list.size()>0){
			model.addAttribute("classInfo", list.get(0));
			return "/classinfo/updateClassInfo";
		}
		return "redirect:/classinfo/classInfo.html";
	}
	@RequestMapping("/update")
	public String updateClassInfo(ClassInfo classinfo){
		int iRet=classInfoService.update(classinfo);
		if(iRet>0){
			return "redirect:/classInfo/classInfo.html";
		}
		return "redirect:/classInfo/preUpdateClassInfo";
	}
	//删除数据
	@RequestMapping(value="/deleteclassinfo")
  public String deleteClassInfo(ClassInfo classinfo){
		 int iRet=classInfoService.delete(classinfo);
		 if(iRet>0){
			return "redirect:/classInfo/classInfo.html";
		 }
		   return "redirect:/classInfo/preAddClassInfo";
}
}