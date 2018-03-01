package cn.dao.user;
import java.util.List;

import cn.dao.CommonDao;
import cn.pojo.User;

public interface UserMapper extends CommonDao<User> {
	public List<User> findPage(User user);
}
