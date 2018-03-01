package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pojo.Chapter;
import cn.service.chapter.ChapterService;

@Controller
@RequestMapping(value="/chapter")
public class ChapterContoller {
	@Resource
	private ChapterService chapterService;
	@RequestMapping("/chapter")
	public String findby(@RequestParam(value="chapter",required=false)Chapter chapter,Model model){
		List<Chapter> List = chapterService.findBy(chapter);
		model.addAttribute("List", List);
		return "chapter";
	}
	/*
	 * 预添加信息
	 */
	@RequestMapping("/insertcha")
	public String preinsert(){
		return "/chapter/insertcha";
	}
	/*
	 * 添加信息
	 */
	@RequestMapping("/addcha")
	public String insert(Chapter chapter){
		int c = chapterService.insert(chapter);
		if(c>0){
			return "redirect:/chapter/chapter";
		}
		return "/chapter/insertcha";
	}
	/*
	 * 删除信息
	 */
	@RequestMapping("/deletecha")
	public String delete(Chapter chapter){
		int delete = chapterService.delete(chapter);
		if(delete>0){
			return "redirect:/chapter/chapter";
		}
		return "/chapter/insertcha";
	}
	/*
	 * 预修改信息
	 */
	@RequestMapping("/preupdate")
	public String preUpdate(Chapter chapter,Model model){
		List<Chapter> list=chapterService.findBy(chapter);
		if(list!=null&&list.size()>0){
			model.addAttribute("list", list.get(0));
			return "/chapter/updatecha";
		}
		return "/chapter";
	}
	/*
	 * 修改信息
	 */
	@RequestMapping("/update")
	public String Update(Chapter chapter){
		int update=chapterService.update(chapter);
		if(update>0){
			return "redirect:/chapter/chapter";
		}
		return "/chapter/updatecha";
	}
}
