package cn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.pojo.PageSupport;
import cn.pojo.User;
import cn.service.user.UserService;
/**
 * 
 * @author hmx20180125 15:33
 * @updator
 */
@Controller
@RequestMapping(value="/user")
public class UserContoller {
	@Resource
	private UserService userService;
	@RequestMapping(value="/page",method=RequestMethod.GET)
	//@ResponseBody
	public String page(Model model,HttpSession session,PageSupport ps){
		User user=new User();
		List<User> list=userService.findBy(user);
		if(ps==null){
			ps=new PageSupport();
		}
		ps.setPageSize(2);
		ps.setTotalCount(list.size());
		user.setStartRow(ps.getStartRow());
		user.setPageSize(ps.getPageSize());
		list=userService.findPage(user);
		//Map<String, Object> map=userService.findList(user,ps);//new HashMap<String, Object>();
//		Map<String, Object> map=new HashMap<String, Object>();
//		map.put("page", ps);
//		map.put("list", list);
		model.addAttribute("pages", ps);
		model.addAttribute("appInfoList", list);
		return "userList";
	}
	@RequestMapping("/list")
	public String list(Model model){
		List<User> userList=userService.findBy(new User());
		PageSupport ps=new PageSupport();
		ps.setPageSize(2);
		ps.setTotalCount(userList.size());
//		user.setStartRow(ps.getStartRow());
//		user.setPageSize(ps.getPageSize());
//		list=userService.findPage(user);
		
		model.addAttribute("pages", ps);
		model.addAttribute("appInfoList", userList);
		return "userList";
	}
	@RequestMapping("/login")
	public String login(@Param("user")User user,Model model,HttpSession session){
		List<User> list=userService.login(user);
		if(list!=null&&list.size()>0){
			List<User> userList=userService.findAll();
			model.addAttribute("userList", userList);
			session.setAttribute("userSession", userList.get(0));
			return "main";
		}else{
			return "redirect:/login.jsp";
		}
	}
	@RequestMapping("/addUser")
	public String preAddUser(){
		return "/user/addUser";
	}
	@RequestMapping("/doAddUser")
	public String doAddUser(User user){
		int isadd=userService.insert(user);
		if(isadd>0){
			return "redirect:/user/list";
		}
		return "redirect:/user/addUser";
	}
	@RequestMapping("/delete")
	public String delete(User user){
		int isdelete=userService.delete(user);
		if(isdelete>0){
			return "redirect:/user/list";
		}
		return "redirect:/user/addUser";
	}
	@RequestMapping("/preUpdate")
	public String preUpdate(User user,Model model){
		@SuppressWarnings("unchecked")
		List<User> list=(List<User>)userService.findList(user,null).get("list");
		if(list!=null&&list.size()>0){
			model.addAttribute("user", list.get(0));
			return "/user/updateUser";
		}
		return "redirect:/user/list";
	}
	@RequestMapping("/update")
	public String update(User user){
		int isup=userService.update(user);
		if(isup>0){
			return "redirect:/user/list";
		}
		return "redirect:/user/preUpdate";
	}
}
