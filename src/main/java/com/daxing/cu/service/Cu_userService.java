package com.daxing.cu.service;

import org.springframework.stereotype.Service;
import com.daxing.cu.pojo.Cu_user;
import com.daxing.cu.mapper.Cu_userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@Service
public class Cu_userService{

	@Autowired
	Cu_userMapper cu_userMapper;

	public Map<String, Object> cu_userList(Cu_user cu_user){
		return null;
	}

	public Map<String, Object> cu_userAdd(Cu_user cu_user){
		return null;
	}

	public Map<String, Object> cu_userEdit(Cu_user cu_user){
		return null;
	}

	public Map<String, Object> cu_userDel(Cu_user cu_user){
		return null;
	}

}