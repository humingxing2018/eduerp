package cn.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.pojo.ClassRoom;
import cn.pojo.PageSupport;
import cn.service.classroom.ClassService;

@Controller()
@RequestMapping(value="/class")
public class ClassRomContoller {
	
	//得到service层
	@Resource
	private ClassService classservice;
	
	@RequestMapping(value="/page",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> page(PageSupport ps){
		ClassRoom classroom=new ClassRoom();
		Map<String, Object> map=classservice.findList(classroom,ps);//new HashMap<String, Object>();
		return map;
	}
	
	//刷新视图
	@RequestMapping("/list")
	public String list(Model model){
		List<ClassRoom> List=classservice.findAll();
		model.addAttribute("list", List);
		return "classroomList";
	}
	
	//跳转到查询页面
	@RequestMapping("/classroomList")
	public String findBy(@RequestParam(value="classroom",required=false)ClassRoom room,Model model){
		List<ClassRoom> list = classservice.findBy(room);
		model.addAttribute("list",list);
		return "classroomList";
	}
	
	//跳转到添加页面
	@RequestMapping("/addClassroom")
	public String getInsert(Model model){
		return "/classroom/addClassroom";
	}
	
	//添加 并 返回结果
	@RequestMapping("/insert")
	public String insert(ClassRoom room){
		Integer isadd = classservice.insert(room);
		if(isadd>0){
			return "redirect:/class/list";
		}
		return "redirect:/class/addClassroom";
	}
	
	//跳转到修改页面
	@RequestMapping("/preUpdate")
	public String preUpdate(ClassRoom room,Model model){
		List<ClassRoom> list=classservice.findBy(room);
		if(list!=null&&list.size()>0){
			model.addAttribute("Class", list.get(0));
			return "/classroom/updateClass";
		}
		return "redirect:/class/list";
	}
	
	
	//修改 并 返回结果
	@RequestMapping("/update")
	public String update(ClassRoom room,Model model){
		Integer isupdate = classservice.update(room);
		if(isupdate>0){
			return "redirect:/class/list";
		}
		return "redirect:/class/updateClass";
	}
	
	//删除 并 返回结果
	@RequestMapping("/delete")
	public String delete(ClassRoom room,Model model){
		Integer isdelete = classservice.delete(room);
		return "redirect:/class/list";
	}
}
