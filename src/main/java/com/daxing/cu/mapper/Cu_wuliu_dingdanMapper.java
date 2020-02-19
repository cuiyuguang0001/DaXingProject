package com.daxing.cu.mapper;

import org.apache.ibatis.annotations.*;
import com.daxing.cu.pojo.Cu_wuliu_dingdan;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cu_wuliu_dingdanMapper{

	@Select("select id, name, util, dateline, num, money, status from cu_wuliu_dingdan")
	List<Cu_wuliu_dingdan> cu_wuliu_dingdanList(Map<String, Object> map);

	@Insert("insert into cu_wuliu_dingdan(name, util, dateline, num, money, status) values(#{name}, #{util}, #{dateline}, #{num}, #{money}, #{status}"))
	boolean cu_wuliu_dingdanAdd(Cu_wuliu_dingdan cu_wuliu_dingdan);

	@Update("update cu_wuliu_dingdan set name = #{name}, util = #{util}, dateline = #{dateline}, num = #{num}, money = #{money}, status = #{status} where id = #{id}")
	boolean cu_wuliu_dingdanEdit(Cu_wuliu_dingdan cu_wuliu_dingdan);

	@Delete("delete from cu_wuliu_dingdan where id = #{id}")
	boolean cu_wuliu_dingdanDel(Cu_wuliu_dingdan cu_wuliu_dingdan);

}