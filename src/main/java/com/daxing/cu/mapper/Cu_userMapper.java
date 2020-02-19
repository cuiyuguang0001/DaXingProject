package com.daxing.cu.mapper;

import org.apache.ibatis.annotations.*;
import com.daxing.cu.pojo.Cu_user;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cu_userMapper{

	@Select("select id, username, password from cu_user where username = #{username}")
	List<Cu_user> cu_userList(Map<String, Object> map);

	@Insert("insert into cu_user(username, password) values(#{username}, #{password}")
	boolean cu_userAdd(Cu_user cu_user);

	@Update("update cu_user set username = #{username}, password = #{password} where id = #{id}")
	boolean cu_userEdit(Cu_user cu_user);

	@Delete("delete from cu_user where id = #{id}")
	boolean cu_userDel(Cu_user cu_user);

}