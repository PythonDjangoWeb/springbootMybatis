package com.cwh.springbootMybatis.web.good.entity;

import java.io.Serializable;

public class Good implements Serializable{

	
	private int id;

	private String goodName_s;

	private String goodColor;

	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Good(int id, String goodName_s, String goodColor) {
		super();
		this.id = id;
		this.goodName_s = goodName_s;
		this.goodColor = goodColor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodName_s() {
		return goodName_s;
	}

	public void setGoodName_s(String goodName_s) {
		this.goodName_s = goodName_s;
	}

	public String getGoodColor() {
		return goodColor;
	}

	public void setGoodColor(String goodColor) {
		this.goodColor = goodColor;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", goodName_s=" + goodName_s
				+ ", goodColor=" + goodColor + "]";
	}

}
