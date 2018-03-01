package cn.service.homework;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.homework.HomeWorkDao;
import cn.pojo.HomeWork;
import cn.pojo.User;
@Service
public class HomeWorkServiceImpl implements HomeWorkService{
	@Resource
	private HomeWorkDao homeWorkDao;
	
	@Override
	public List<HomeWork> cx(HomeWork homeWork) {
		return homeWorkDao.findBy(homeWork);
	}

	@Override
	public int insert(HomeWork homeWork) {
		return homeWorkDao.insert(homeWork);
	}


	@Override
	public int update(HomeWork homeWork) {
		return homeWorkDao.update(homeWork);
	}

	@Override
	public int delete(HomeWork homeWork) {
		return homeWorkDao.delete(homeWork);
	}


}
