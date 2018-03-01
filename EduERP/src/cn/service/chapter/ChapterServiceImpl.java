package cn.service.chapter;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.chapter.ChapterMapper;
import cn.pojo.Chapter;
@Service
public class ChapterServiceImpl implements ChapterService {

	@Resource
	public ChapterMapper chapterMapper;
	@Override
	public List<Chapter> findBy(Chapter chapter) {
		
		return chapterMapper.findBy(chapter);
	}

	@Override
	public int insert(Chapter chapter) {
		// TODO Auto-generated method stub
		return chapterMapper.insert(chapter);
	}

	@Override
	public int update(Chapter chapter) {
		// TODO Auto-generated method stub
		return chapterMapper.update(chapter);
	}

	@Override
	public int delete(Chapter chapter) {
		// TODO Auto-generated method stub
		return chapterMapper.delete(chapter);
	}

}
