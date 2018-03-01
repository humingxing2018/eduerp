package cn.service.job;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.job.JobMapper;
import cn.pojo.Job;
@Service
public class JobServiceImpl implements JobService {

	@Resource
	public JobMapper jobMapper;
	@Override
	public List<Job> findBy(Job job) {
		// TODO Auto-generated method stub
		return jobMapper.findBy(job);
	}

	@Override
	public int insert(Job job) {
		// TODO Auto-generated method stub
		return jobMapper.insert(job);
	}

	@Override
	public int update(Job job) {
		// TODO Auto-generated method stub
		return jobMapper.update(job);
	}

	@Override
	public int delete(Job job) {
		// TODO Auto-generated method stub
		return jobMapper.delete(job);
	}

}
