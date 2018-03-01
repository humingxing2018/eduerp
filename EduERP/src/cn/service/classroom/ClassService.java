package cn.service.classroom;

import java.util.List;
import java.util.Map;

import cn.pojo.ClassRoom;
import cn.pojo.PageSupport;

/**
 * 
 * @author 曾晨豪
 *2018年2月3日11:38:52
 */
public interface ClassService {
	/**
	 * 查询教室信息
	 * @return
	 */
	public List<ClassRoom> findAll();
	/**
	 * 条件查询教室信息
	 * @return	
	 */
	public List<ClassRoom> findBy(ClassRoom room);
	/**
	 * 分页查询
	 * @return
	 */
	public Map<String, Object> findList(ClassRoom classroom,PageSupport ps);
	/**
	 * 添加
	 */
	public int insert(ClassRoom room);
	/**
	 * 修改
	 */
	public int update(ClassRoom room);
	/**
	 * 删除
	 */
	public int delete(ClassRoom room);
}
