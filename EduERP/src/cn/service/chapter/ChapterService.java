package cn.service.chapter;

import java.util.List;

import cn.pojo.Chapter;

public interface ChapterService {

	public List<Chapter> findBy(Chapter chapter);//查询
	
	public int insert(Chapter chapter);//添加
	
	public int update(Chapter chapter);//修改
	
	public int delete(Chapter chapter);//删除
}
