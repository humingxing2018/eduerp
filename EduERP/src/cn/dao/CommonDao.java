package cn.dao;

import java.util.List;

public interface CommonDao<T> {
	//修改数据通用方法
	public int update(T t);
	//删除数据通用方法
	public int delete(T t);
	//添加数据通用方法
	public int insert(T t);
	//查询数据通用方法
	public List<T> findAll();
	//通过ID查询数据的通用方法
	public List<T> findBy(T t);
}
