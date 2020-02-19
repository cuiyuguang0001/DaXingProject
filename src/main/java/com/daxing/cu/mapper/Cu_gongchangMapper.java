package com.daxing.cu.mapper;

import org.apache.ibatis.annotations.*;
import com.daxing.cu.pojo.Cu_gongchang;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cu_gongchangMapper{

	@Select("select id, name, status from cu_gongchang")
	List<Cu_gongchang> cu_gongchangList(Map<String, Object> map);

	@Insert("insert into cu_gongchang(name, status) values(#{name}, #{status}"))
	boolean cu_gongchangAdd(Cu_gongchang cu_gongchang);

	@Update("update cu_gongchang set name = #{name}, status = #{status} where id = #{id}")
	boolean cu_gongchangEdit(Cu_gongchang cu_gongchang);

	@Delete("delete from cu_gongchang where id = #{id}")
	boolean cu_gongchangDel(Cu_gongchang cu_gongchang);

}