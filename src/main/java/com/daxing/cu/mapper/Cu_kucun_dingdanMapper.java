package com.daxing.cu.mapper;

import org.apache.ibatis.annotations.*;
import com.daxing.cu.pojo.Cu_kucun_dingdan;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cu_kucun_dingdanMapper{

	@Select("select id, name, util, dateline, num, type, status from cu_kucun_dingdan")
	List<Cu_kucun_dingdan> cu_kucun_dingdanList(Map<String, Object> map);

	@Insert("insert into cu_kucun_dingdan(name, util, dateline, num, type, status) values(#{name}, #{util}, #{dateline}, #{num}, #{type}, #{status}")
	boolean cu_kucun_dingdanAdd(Cu_kucun_dingdan cu_kucun_dingdan);

	@Update("update cu_kucun_dingdan set name = #{name}, util = #{util}, dateline = #{dateline}, num = #{num}, type = #{type}, status = #{status} where id = #{id}")
	boolean cu_kucun_dingdanEdit(Cu_kucun_dingdan cu_kucun_dingdan);

	@Delete("delete from cu_kucun_dingdan where id = #{id}")
	boolean cu_kucun_dingdanDel(Cu_kucun_dingdan cu_kucun_dingdan);

}