package com.daxing.cu.service;

import com.daxing.cu.commonUtil.MapUtil;
import com.daxing.cu.commonUtil.PageUtil;
import com.daxing.cu.constant.Constant;
import org.springframework.stereotype.Service;
import com.daxing.cu.pojo.Cu_user;
import com.daxing.cu.mapper.Cu_userMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Cu_userService{

	@Autowired
	Cu_userMapper cu_userMapper;

	public Map<String, Object> cu_userList(Cu_user cu_user){
		Map<String ,Object> map = new HashMap<>();
		PageUtil p = new PageUtil(cu_user.getPage(), cu_user.getLimit());
		map.put("page", p);
		map.put("username", cu_user.getUsername());
		List<Cu_user> users = cu_userMapper.cu_userList(map);
		if(users.size() > 0)
		{
			return MapUtil.requestMap(users,
					p.getCount(),
					Constant.SUCCESS_LOGIN,
					Constant.SUCCESS);
		}
		return MapUtil.requestMap(users,
				p.getCount(),
				Constant.NOT_SUCCESS_LOGIN,
				Constant.NOT_SUCCESS);
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