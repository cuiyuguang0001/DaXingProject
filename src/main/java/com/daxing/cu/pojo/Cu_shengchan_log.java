package com.daxing.cu.pojo;

public class Cu_shengchan_log{

	private int id;
	//日志内容
	private String text;
	//日志创建时间
	private String dateline;
	//shengchan_dingdan的id
	private String sid;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

	public String getText(){
		return text;
	}

	public void setText(String text){
		this.text=text;
	}

	public String getDateline(){
		return dateline;
	}

	public void setDateline(String dateline){
		this.dateline=dateline;
	}

	public String getSid(){
		return sid;
	}

	public void setSid(String sid){
		this.sid=sid;
	}

}