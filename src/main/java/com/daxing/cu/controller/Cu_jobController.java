package com.daxing.cu.controller;

import org.springframework.web.bind.annotation.*;
import com.daxing.cu.pojo.Cu_job;
import com.daxing.cu.service.Cu_jobService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("cu_job")
public class Cu_jobController{

	@Autowired
	Cu_jobService cu_jobService;

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