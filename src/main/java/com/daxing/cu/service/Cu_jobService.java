package com.daxing.cu.service;

import org.springframework.stereotype.Service;
import com.daxing.cu.pojo.Cu_job;
import com.daxing.cu.mapper.Cu_jobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@Service
public class Cu_jobService{

	@Autowired
	Cu_jobMapper cu_jobMapper;

	public Map<String, Object> cu_jobList(Cu_job cu_job){
		return null;
	}

	public Map<String, Object> cu_jobAdd(Cu_job cu_job){
		return null;
	}

	public Map<String, Object> cu_jobEdit(Cu_job cu_job){
		return null;
	}

	public Map<String, Object> cu_jobDel(Cu_job cu_job){
		return null;
	}

}