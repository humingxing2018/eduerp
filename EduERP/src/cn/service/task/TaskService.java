package cn.service.task;

import java.util.List;
import cn.pojo.Task;
import cn.pojo.User;
/**
 * 任务接口
 * @author cql
 *
 */
public interface TaskService {
	public List<Task> findAll();
	public List<Task> findBy(Task task);
	public List<Task> findList(Task task);
	public int insert(Task task);
	public int update(Task task);
	public int delete(Task task);
}