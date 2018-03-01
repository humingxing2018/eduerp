package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.pojo.HomeWork;
import cn.pojo.Task;
import cn.pojo.User;
import cn.service.task.TaskService;

/**
 * 任务
 * @author clq
 *
 */
@Controller
@RequestMapping(value="/task")
public class TaskController {
	@Resource
	private TaskService taskService;

	public TaskService getTaskService() {
		return taskService;
	}
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}
	//查询列表
	@RequestMapping(value="/tasklist")
	public String getTaskList(Model model){
		List<Task> taskList = taskService.findAll();
		model.addAttribute("tasklist", taskList);
		return "tasklist";
	}
	
	//添加
	@RequestMapping("/addTask")
	public String preAddTask(){
		return "/task/addTask";
	}
	@RequestMapping("/doAddTask")
	public String doAddTask(Task task){
		int isaddTask=taskService.insert(task);
		if(isaddTask>0){
			return "redirect:/task/tasklist";
		}
		return "redirect:/task/addTask";
	}
	
	//删除列表
		@RequestMapping("/delete")
		public String delete(Task task){
			int isdelete=taskService.delete(task);
			if(isdelete>0){
				return "redirect:/task/tasklist";
			}
			return "redirect:/task/addTask";
		}
		
	
	//修改
	@RequestMapping("/preUpdate")
	public String preUpdate(Task task,Model model){
		List<Task> list=taskService.findBy(task);
		if(list!=null  && list.size()>0){
			model.addAttribute("task", list.get(0));
			return "/task/updateTask";
		}
		return "redirect:/task/tasklist";
	}
	@RequestMapping("/update")
	public String update(Task task){
		int isupdate=taskService.update(task);
		if(isupdate>0){
			return "redirect:/task/tasklist";
		}
		return "redirect:/task/preUpdate";
	}
	
	
}
