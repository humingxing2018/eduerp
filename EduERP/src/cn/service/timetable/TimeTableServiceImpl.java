package cn.service.timetable;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.timetable.TimeTableMapper;
import cn.pojo.TimeTable;
@Service
public class TimeTableServiceImpl implements TimeTableService {
    @Resource
    private TimeTableMapper timeTableMapper;
	public TimeTableMapper getTimeTableMapper() {
		return timeTableMapper;
	}
	public void setTimeTableMapper(TimeTableMapper timeTableMapper) {
		this.timeTableMapper = timeTableMapper;
	}

	@Override
	public List<TimeTable> findAll() {
		return timeTableMapper.findAll();
	}

}
