package com.daxing.cu.controller;

import org.springframework.web.bind.annotation.*;
import com.daxing.cu.pojo.Cu_user;
import com.daxing.cu.service.Cu_userService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("cu_user")
public class Cu_userController{

	@Autowired
	Cu_userService cu_userService;

	@PostMapping("login")
	public Map<String, Object> cu_userList(Cu_user cu_user){
		return cu_userService.cu_userList(cu_user);
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