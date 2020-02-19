package com.daxing.cu.pojo;

public class Cu_kucun_dingdan{

	private int id;
	//名字
	private String name;
	//单位
	private String util;
	//时间戳
	private int dateline;
	//个数
	private int num;
	//0进货 1出货
	private int type;
	//0未审核 1已通过 2已拒绝
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

	public String getUtil(){
		return util;
	}

	public void setUtil(String util){
		this.util=util;
	}

	public int getDateline(){
		return dateline;
	}

	public void setDateline(int dateline){
		this.dateline=dateline;
	}

	public int getNum(){
		return num;
	}

	public void setNum(int num){
		this.num=num;
	}

	public int getType(){
		return type;
	}

	public void setType(int type){
		this.type=type;
	}

	public int getStatus(){
		return status;
	}

	public void setStatus(int status){
		this.status=status;
	}

}