package cn.service.user;

import java.util.List;
import java.util.Map;

import cn.pojo.PageSupport;
import cn.pojo.User;
/**
 * 
 * @author hmx20180125 15:33
 * @updator 
 * 
 */
public interface UserService {
	public List<User> login(User user);
	public List<User> findAll();
	public Map<String, Object> findList(User user,PageSupport ps);
	public int insert(User user);
	public int update(User user);
	public int delete(User user);
	public List<User> findBy(User user);
	public List<User> findPage(User user);
}
