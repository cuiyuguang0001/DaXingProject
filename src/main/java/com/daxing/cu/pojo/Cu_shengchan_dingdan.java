package com.daxing.cu.pojo;

public class Cu_shengchan_dingdan{

	private int id;
	//生产物名称
	private String name;
	//负责工厂
	private String gongchang;
	//负责人
	private String people;
	//预计生产数量
	private String num;
	//实际生产数量
	private String submit_num;
	//单位
	private String util;
	//订单创建时间戳
	private int dateline;
	//生产完成时间戳
	private int submit_dateline;

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

	public String getGongchang(){
		return gongchang;
	}

	public void setGongchang(String gongchang){
		this.gongchang=gongchang;
	}

	public String getPeople(){
		return people;
	}

	public void setPeople(String people){
		this.people=people;
	}

	public String getNum(){
		return num;
	}

	public void setNum(String num){
		this.num=num;
	}

	public String getSubmit_num(){
		return submit_num;
	}

	public void setSubmit_num(String submit_num){
		this.submit_num=submit_num;
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

	public int getSubmit_dateline(){
		return submit_dateline;
	}

	public void setSubmit_dateline(int submit_dateline){
		this.submit_dateline=submit_dateline;
	}

}