package com.daxing.cu.service;

import org.springframework.stereotype.Service;
import com.daxing.cu.pojo.Cu_wuliu_dingdan;
import com.daxing.cu.mapper.Cu_wuliu_dingdanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@Service
public class Cu_wuliu_dingdanService{

	@Autowired
	Cu_wuliu_dingdanMapper cu_wuliu_dingdanMapper;

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