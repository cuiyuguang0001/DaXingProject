package com.daxing.cu.controller;

import org.springframework.web.bind.annotation.*;
import com.daxing.cu.pojo.Cu_wuliu_dingdan;
import com.daxing.cu.service.Cu_wuliu_dingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("cu_wuliu_dingdan")
public class Cu_wuliu_dingdanController{

	@Autowired
	Cu_wuliu_dingdanService cu_wuliu_dingdanService;

	public Map<String, Object> cu_wuliu_dingdanList(Cu_wuliu_dingdan cu_wuliu_dingdan){
		return null;
	}

	public Map<String, Object> cu_wuliu_dingdanAdd(Cu_wuliu_dingdan cu_wuliu_dingdan){
		return null;
	}

	public Map<String, Object> cu_wuliu_dingdanEdit(Cu_wuliu_dingdan cu_wuliu_dingdan){
		return null;
	}

	public Map<String, Object> cu_wuliu_dingdanDel(Cu_wuliu_dingdan cu_wuliu_dingdan){
		return null;
	}

}