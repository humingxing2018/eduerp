package cn.dao.classroom;



import java.util.List;

import cn.dao.CommonDao;
import cn.pojo.ClassRoom;

//������	2018��2��3��11:38:01
public interface ClassMapper extends CommonDao<ClassRoom>{
	public List<ClassRoom> findPage(ClassRoom classroom);
}
