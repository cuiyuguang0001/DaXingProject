package com.daxing.cu.mapper;

import org.apache.ibatis.annotations.*;
import com.daxing.cu.pojo.Cu_shengchan_log;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cu_shengchan_logMapper{

	@Select("select id, text, dateline, sid from cu_shengchan_log")
	List<Cu_shengchan_log> cu_shengchan_logList(Map<String, Object> map);

	@Insert("insert into cu_shengchan_log(text, dateline, sid) values(#{text}, #{dateline}, #{sid}"))
	boolean cu_shengchan_logAdd(Cu_shengchan_log cu_shengchan_log);

	@Update("update cu_shengchan_log set text = #{text}, dateline = #{dateline}, sid = #{sid} where id = #{id}")
	boolean cu_shengchan_logEdit(Cu_shengchan_log cu_shengchan_log);

	@Delete("delete from cu_shengchan_log where id = #{id}")
	boolean cu_shengchan_logDel(Cu_shengchan_log cu_shengchan_log);

}