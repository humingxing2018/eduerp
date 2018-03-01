package cn.service.task;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.task.TaskMapper;
import cn.pojo.Task;
@Service
public class TaskServiceImpl implements TaskService{
	@Resource
	private TaskMapper taskMapper;
	public TaskMapper getTaskMapper() {
		return taskMapper;
	}
	public void setTaskMapper(TaskMapper taskMapper) {
		this.taskMapper = taskMapper;
	}
	@Override
	public List<Task> findAll() {
		return taskMapper.findAll();
	}

	@Override
	public List<Task> findList(Task task) {
		return taskMapper.findBy(task);
	}

	@Override
	public int insert(Task task) {
		return taskMapper.insert(task);
	}

	@Override
	public int update(Task task) {
		return taskMapper.update(task);
	}

	@Override
	public int delete(Task task) {
		return taskMapper.delete(task);
	}
	@Override
	public List<Task> findBy(Task task) {
		return taskMapper.findBy(task);
	}

}
