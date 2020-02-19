package com.daxing.cu.mapper;

import org.apache.ibatis.annotations.*;
import com.daxing.cu.pojo.Cu_job;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cu_jobMapper{

	@Select("select id, name, list from cu_job")
	List<Cu_job> cu_jobList(Map<String, Object> map);

	@Insert("insert into cu_job(name, list) values(#{name}, #{list}"))
	boolean cu_jobAdd(Cu_job cu_job);

	@Update("update cu_job set name = #{name}, list = #{list} where id = #{id}")
	boolean cu_jobEdit(Cu_job cu_job);

	@Delete("delete from cu_job where id = #{id}")
	boolean cu_jobDel(Cu_job cu_job);

}