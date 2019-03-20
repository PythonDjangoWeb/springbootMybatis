package com.cwh.springbootMybatis.web.user.entity;

public class User {
	
	private int id;
	
	private int userid;
	
	private String openid;
	
	private String username;
	
	private String userhead;
	
	private String regtime;
	
	private String mobile;
	
	private String realname;
	
	private String deletestatus;

	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public User(int id, int userid, String openid, String username,
			String userhead, String regtime, String mobile, String realname,
			String deletestatus) {
		super();
		this.id = id;
		this.userid = userid;
		this.openid = openid;
		this.username = username;
		this.userhead = userhead;
		this.regtime = regtime;
		this.mobile = mobile;
		this.realname = realname;
		this.deletestatus = deletestatus;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserhead() {
		return userhead;
	}

	public void setUserhead(String userhead) {
		this.userhead = userhead;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getDeletestatus() {
		return deletestatus;
	}

	public void setDeletestatus(String deletestatus) {
		this.deletestatus = deletestatus;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userid=" + userid + ", openid=" + openid
				+ ", username=" + username + ", userhead=" + userhead
				+ ", regtime=" + regtime + ", mobile=" + mobile + ", realname="
				+ realname + ", deletestatus=" + deletestatus + "]";
	}
	
	
}