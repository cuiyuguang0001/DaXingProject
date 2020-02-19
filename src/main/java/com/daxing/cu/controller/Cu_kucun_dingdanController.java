package com.daxing.cu.controller;

import org.springframework.web.bind.annotation.*;
import com.daxing.cu.pojo.Cu_kucun_dingdan;
import com.daxing.cu.service.Cu_kucun_dingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("cu_kucun_dingdan")
public class Cu_kucun_dingdanController{

	@Autowired
	Cu_kucun_dingdanService cu_kucun_dingdanService;

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