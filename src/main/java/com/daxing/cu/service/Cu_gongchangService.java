package com.daxing.cu.service;

import org.springframework.stereotype.Service;
import com.daxing.cu.pojo.Cu_gongchang;
import com.daxing.cu.mapper.Cu_gongchangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@Service
public class Cu_gongchangService{

	@Autowired
	Cu_gongchangMapper cu_gongchangMapper;

	public Map<String, Object> cu_gongchangList(Cu_gongchang cu_gongchang){
		return null;
	}

	public Map<String, Object> cu_gongchangAdd(Cu_gongchang cu_gongchang){
		return null;
	}

	public Map<String, Object> cu_gongchangEdit(Cu_gongchang cu_gongchang){
		return null;
	}

	public Map<String, Object> cu_gongchangDel(Cu_gongchang cu_gongchang){
		return null;
	}

}