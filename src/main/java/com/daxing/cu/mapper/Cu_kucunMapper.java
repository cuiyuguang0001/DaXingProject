package com.daxing.cu.mapper;

import org.apache.ibatis.annotations.*;
import com.daxing.cu.pojo.Cu_kucun;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cu_kucunMapper{

	@Select("select id, name, util, num from cu_kucun")
	List<Cu_kucun> cu_kucunList(Map<String, Object> map);

	@Insert("insert into cu_kucun(name, util, num) values(#{name}, #{util}, #{num}")
	boolean cu_kucunAdd(Cu_kucun cu_kucun);

	@Update("update cu_kucun set name = #{name}, util = #{util}, num = #{num} where id = #{id}")
	boolean cu_kucunEdit(Cu_kucun cu_kucun);

	@Delete("delete from cu_kucun where id = #{id}")
	boolean cu_kucunDel(Cu_kucun cu_kucun);

}