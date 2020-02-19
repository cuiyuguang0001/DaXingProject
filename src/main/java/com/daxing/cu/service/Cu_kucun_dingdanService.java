package com.daxing.cu.service;

import org.springframework.stereotype.Service;
import com.daxing.cu.pojo.Cu_kucun_dingdan;
import com.daxing.cu.mapper.Cu_kucun_dingdanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@Service
public class Cu_kucun_dingdanService{

	@Autowired
	Cu_kucun_dingdanMapper cu_kucun_dingdanMapper;

	public Map<String, Object> cu_kucun_dingdanList(Cu_kucun_dingdan cu_kucun_dingdan){
		return null;
	}

	public Map<String, Object> cu_kucun_dingdanAdd(Cu_kucun_dingdan cu_kucun_dingdan){
		return null;
	}

	public Map<String, Object> cu_kucun_dingdanEdit(Cu_kucun_dingdan cu_kucun_dingdan){
		return null;
	}

	public Map<String, Object> cu_kucun_dingdanDel(Cu_kucun_dingdan cu_kucun_dingdan){
		return null;
	}

}