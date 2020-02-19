package com.daxing.cu.service;

import org.springframework.stereotype.Service;
import com.daxing.cu.pojo.Cu_shengchan_dingdan;
import com.daxing.cu.mapper.Cu_shengchan_dingdanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@Service
public class Cu_shengchan_dingdanService{

	@Autowired
	Cu_shengchan_dingdanMapper cu_shengchan_dingdanMapper;

	public Map<String, Object> cu_shengchan_dingdanList(Cu_shengchan_dingdan cu_shengchan_dingdan){
		return null;
	}

	public Map<String, Object> cu_shengchan_dingdanAdd(Cu_shengchan_dingdan cu_shengchan_dingdan){
		return null;
	}

	public Map<String, Object> cu_shengchan_dingdanEdit(Cu_shengchan_dingdan cu_shengchan_dingdan){
		return null;
	}

	public Map<String, Object> cu_shengchan_dingdanDel(Cu_shengchan_dingdan cu_shengchan_dingdan){
		return null;
	}

}