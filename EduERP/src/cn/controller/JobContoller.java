package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pojo.Job;
import cn.service.job.JobService;

@Controller
@RequestMapping(value="/job")
public class JobContoller {
	@Resource
	private JobService jobService;
	@RequestMapping("/job")
	public String findBy(@RequestParam(value="job",required=false)Job job,Model model){
		List<Job> list = jobService.findBy(job);
		model.addAttribute("List", list);
		return "job";
	}
	/*
	 * 预添加信息
	 */
	@RequestMapping("/preinsert")
	public String preinsert(){
		return "/job/insertjob";
	}
	/*
	 * 添加信息
	 */
	@RequestMapping("/addjob")
	public String insert(Job job){
		int add = jobService.insert(job);
		if(add>0){
			return "redirect:/job/job";
		}
		return "/job/insertjob";
	}
	/*
	 * 删除信息
	 */
	@RequestMapping("/deletejob")
	public String delete(Job job){
		int delete = jobService.delete(job);
		if(delete>0){
			return "redirect:/job/job";
		}
		return "/job/insertjob";
	}
	/*
	 * 预修改信息
	 */
	@RequestMapping("/preupdate")
	public String preUpdate(Job job,Model model){
		List<Job> list=jobService.findBy(job);
		if(list!=null&&list.size()>0){
			model.addAttribute("list", list.get(0));
			return "/job/updatejob";
		}
		return "/job/job";
	}
	/*
	 * 修改信息
	 */
	@RequestMapping("/update")
	public String Update(Job job){
		int update=jobService.update(job);
		if(update>0){
			return "redirect:/job/job";
		}
		return "/job/updatejob";
	}
}
