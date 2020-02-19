package com.daxing.cu.pojo;

public class Cu_gongchang{

	private int id;
	//产物名称
	private String name;
	//0无工作 1生产中 2不可使用
	private int status;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public int getStatus(){
		return status;
	}

	public void setStatus(int status){
		this.status=status;
	}

}