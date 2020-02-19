package com.daxing.cu.controller;

import org.springframework.web.bind.annotation.*;
import com.daxing.cu.pojo.Cu_gongchang;
import com.daxing.cu.service.Cu_gongchangService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("cu_gongchang")
public class Cu_gongchangController{

	@Autowired
	Cu_gongchangService cu_gongchangService;

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