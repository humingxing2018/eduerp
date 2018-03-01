package cn.service.job;

import java.util.List;

import cn.pojo.Job;

public interface JobService {

	public List<Job> findBy(Job job); //查找
	public int insert(Job job); //添加
	public int update(Job job); //修改
	public int delete(Job job); //删除
}
