package com.daxing.cu.controller;

import org.springframework.web.bind.annotation.*;
import com.daxing.cu.pojo.Cu_shengchan_log;
import com.daxing.cu.service.Cu_shengchan_logService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("cu_shengchan_log")
public class Cu_shengchan_logController{

	@Autowired
	Cu_shengchan_logService cu_shengchan_logService;

	public Map<String, Object> cu_shengchan_logList(Cu_shengchan_log cu_shengchan_log){
		return null;
	}

	public Map<String, Object> cu_shengchan_logAdd(Cu_shengchan_log cu_shengchan_log){
		return null;
	}

	public Map<String, Object> cu_shengchan_logEdit(Cu_shengchan_log cu_shengchan_log){
		return null;
	}

	public Map<String, Object> cu_shengchan_logDel(Cu_shengchan_log cu_shengchan_log){
		return null;
	}

}