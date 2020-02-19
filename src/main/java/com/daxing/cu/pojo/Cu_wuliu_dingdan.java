package com.daxing.cu.pojo;

public class Cu_wuliu_dingdan{

	private int id;
	//送货名称
	private int name;
	//单位
	private int util;
	//时间戳
	private int dateline;
	//个数
	private int num;
	//总价
	private int money;
	//0未审核 1通过 2拒绝
	private int status;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

	public int getName(){
		return name;
	}

	public void setName(int name){
		this.name=name;
	}

	public int getUtil(){
		return util;
	}

	public void setUtil(int util){
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

	public int getMoney(){
		return money;
	}

	public void setMoney(int money){
		this.money=money;
	}

	public int getStatus(){
		return status;
	}

	public void setStatus(int status){
		this.status=status;
	}

}