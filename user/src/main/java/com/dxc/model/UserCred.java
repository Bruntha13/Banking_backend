package com.dxc.model;

public class UserCred {

	public String username;
	public String accno;
	private String loginpin;
	public UserCred() {
		super();
	}
	public UserCred(String username, String accno, String loginpin) {
		super();
		this.username = username;
		this.accno = accno;
		this.loginpin = loginpin;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getLoginpin() {
		return loginpin;
	}
	public void setLoginpin(String loginpin) {
		this.loginpin = loginpin;
	}
	@Override
	public String toString() {
		return "UserCred [username=" + username + ", accno=" + accno + ", loginpin=" + loginpin + "]";
	}
	
	
}
