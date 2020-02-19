package com.daxing.cu.mapper;

import org.apache.ibatis.annotations.*;
import com.daxing.cu.pojo.Cu_shengchan_dingdan;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cu_shengchan_dingdanMapper{

	@Select("select id, name, gongchang, people, num, submit_num, util, dateline, submit_dateline from cu_shengchan_dingdan")
	List<Cu_shengchan_dingdan> cu_shengchan_dingdanList(Map<String, Object> map);

	@Insert("insert into cu_shengchan_dingdan(name, gongchang, people, num, submit_num, util, dateline, submit_dateline) values(#{name}, #{gongchang}, #{people}, #{num}, #{submit_num}, #{util}, #{dateline}, #{submit_dateline}")
	boolean cu_shengchan_dingdanAdd(Cu_shengchan_dingdan cu_shengchan_dingdan);

	@Update("update cu_shengchan_dingdan set name = #{name}, gongchang = #{gongchang}, people = #{people}, num = #{num}, submit_num = #{submit_num}, util = #{util}, dateline = #{dateline}, submit_dateline = #{submit_dateline} where id = #{id}")
	boolean cu_shengchan_dingdanEdit(Cu_shengchan_dingdan cu_shengchan_dingdan);

	@Delete("delete from cu_shengchan_dingdan where id = #{id}")
	boolean cu_shengchan_dingdanDel(Cu_shengchan_dingdan cu_shengchan_dingdan);

}