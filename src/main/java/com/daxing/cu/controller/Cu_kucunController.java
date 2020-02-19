package com.daxing.cu.controller;

import org.springframework.web.bind.annotation.*;
import com.daxing.cu.pojo.Cu_kucun;
import com.daxing.cu.service.Cu_kucunService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("cu_kucun")
public class Cu_kucunController{

	@Autowired
	Cu_kucunService cu_kucunService;

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