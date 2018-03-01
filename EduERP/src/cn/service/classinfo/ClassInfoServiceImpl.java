package cn.service.classinfo;
/**
 * 刘森奇2018.2.3
 */
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import java.util.List;
import javax.annotation.Resource;
import cn.dao.classinfo.ClassInfoMapper;
import cn.pojo.ClassInfo;
@Service
public class ClassInfoServiceImpl implements ClassInfoService {

	@Resource
	public ClassInfoMapper classinfoMapper;
	@Override
	public List<ClassInfo> findBy(ClassInfo classinfo) {
		return classinfoMapper.findBy(classinfo);
	}

	@Override
	public int insert(ClassInfo classinfo) {
		// TODO Auto-generated method stub
		return classinfoMapper.insert(classinfo);
	}

	@Override
	public int update(ClassInfo classinfo) {
		// TODO Auto-generated method stub
		return classinfoMapper.update(classinfo);
	}

	@Override
	public int delete(ClassInfo classinfo) {
		// TODO Auto-generated method stub
		return classinfoMapper.delete(classinfo);
	}

}
