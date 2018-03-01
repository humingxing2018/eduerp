package cn.service.homework;

import java.util.List;

import cn.pojo.HomeWork;
import cn.pojo.User;

public interface HomeWorkService {
	public List<HomeWork> cx(HomeWork homeWork);
	public int insert(HomeWork homeWork);
	public int update(HomeWork homeWork);
	public int delete(HomeWork homeWork);
}
