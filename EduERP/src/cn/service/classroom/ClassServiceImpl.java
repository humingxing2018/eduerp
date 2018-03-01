package cn.service.classroom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.classroom.ClassMapper;
import cn.pojo.ClassRoom;
import cn.pojo.PageSupport;
/**
 * 
 * @author 曾晨豪
 *2018年2月3日11:39:24
 */
@Service
public class ClassServiceImpl implements ClassService {
	
	@Resource
	private ClassMapper classMapper;
	@Override
	public List<ClassRoom> findBy(ClassRoom room){
	    return classMapper.findBy(room);
	}
	@Override
	public int insert(ClassRoom room) {
		return classMapper.insert(room);
	}
	@Override
	public int update(ClassRoom room) {
		return classMapper.update(room);
	}
	@Override
	public int delete(ClassRoom room) {
		return classMapper.delete(room);
	}
	@Override
	public List<ClassRoom> findAll() {
		return classMapper.findAll();
	}
	@Override
	public Map<String, Object> findList(ClassRoom classroom, PageSupport ps) {
		List<ClassRoom> list=classMapper.findBy(classroom);
		Map<String, Object> map=new HashMap<String, Object>();
		if(ps==null){
			ps=new PageSupport();
		}
		ps.setPageSize(2);
		ps.setTotalCount(list.size());
		classroom.setStartRow(ps.getStartRow());
		classroom.setPageSize(ps.getPageSize());
		List<ClassRoom> ulist=classMapper.findPage(classroom);
		map.put("page", ps);
		map.put("list", ulist);
		return map;
	}
	
	
	
}
