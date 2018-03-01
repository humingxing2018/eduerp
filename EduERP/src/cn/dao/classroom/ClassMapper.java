package cn.dao.classroom;



import java.util.List;

import cn.dao.CommonDao;
import cn.pojo.ClassRoom;

//Ôø³¿ºÀ	2018Äê2ÔÂ3ÈÕ11:38:01
public interface ClassMapper extends CommonDao<ClassRoom>{
	public List<ClassRoom> findPage(ClassRoom classroom);
}
