package com.daxing.cu.service;

import org.springframework.stereotype.Service;
import com.daxing.cu.pojo.Cu_kucun;
import com.daxing.cu.mapper.Cu_kucunMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@Service
public class Cu_kucunService{

	@Autowired
	Cu_kucunMapper cu_kucunMapper;

	public Map<String, Object> cu_kucunList(Cu_kucun cu_kucun){
		return null;
	}

	public Map<String, Object> cu_kucunAdd(Cu_kucun cu_kucun){
		return null;
	}

	public Map<String, Object> cu_kucunEdit(Cu_kucun cu_kucun){
		return null;
	}

	public Map<String, Object> cu_kucunDel(Cu_kucun cu_kucun){
		return null;
	}

}