package com.dxc.model;
import javax.persistence.*;

/*create table REGD_USERS(
userid int primary key auto_increment,
username varchar(50) not null,
accno varchar(50) not null,
email varchar(50) not null,
contactno long not null,
loginpin varchar(10) not null,
);*/

@Entity
@Table(name="REGD_USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int userid;
	public String username;
	public String accno;
	private String email;
	private long contactno;
	private String loginpin;
	private double balance;
	
	public User() {
		super();
	}
	
	public User(int userid, String username, String accno, String email, long contactno, String loginpin,double balance) {
		super();
		this.userid = userid;
		this.username = username;
		this.accno = accno;
		this.email = email;
		this.contactno = contactno;
		this.loginpin = loginpin;
		this.balance=balance;
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getLoginpin() {
		return loginpin;
	}
	public void setLoginpin(String loginpin) {
		this.loginpin = loginpin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", accno=" + accno + ", email=" + email
				+ ", contactno=" + contactno + ", loginpin=" + loginpin + ", balance=" + balance + "]";
	}
	
	

}
