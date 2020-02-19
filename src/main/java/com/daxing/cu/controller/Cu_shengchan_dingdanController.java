package com.daxing.cu.controller;

import org.springframework.web.bind.annotation.*;
import com.daxing.cu.pojo.Cu_shengchan_dingdan;
import com.daxing.cu.service.Cu_shengchan_dingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("cu_shengchan_dingdan")
public class Cu_shengchan_dingdanController{

	@Autowired
	Cu_shengchan_dingdanService cu_shengchan_dingdanService;

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