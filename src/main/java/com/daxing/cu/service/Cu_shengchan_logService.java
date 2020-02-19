package com.daxing.cu.service;

import org.springframework.stereotype.Service;
import com.daxing.cu.pojo.Cu_shengchan_log;
import com.daxing.cu.mapper.Cu_shengchan_logMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@Service
public class Cu_shengchan_logService{

	@Autowired
	Cu_shengchan_logMapper cu_shengchan_logMapper;

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