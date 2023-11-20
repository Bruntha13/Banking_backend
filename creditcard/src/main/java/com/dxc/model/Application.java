package com.dxc.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*create table REGD_APPL(
applid int primary key auto_increment,
cardname varchar(50) not null,
username varchar(50) not null,
accno varchar(50) not null,
email varchar(50) not null,
contactno long not null,
address varchar(80) not null,
status varchar(50) not null,
);*/

@Entity
@Table(name="REGD_APPL")
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int applid;
	public String cardname;
	public String username;
	public String accno;
	private String email;
	private long contactno;
	private String address;
	private String status;
	public Application() {
		super();
	}
	public Application(int applid, String cardname, String username, String accno, String email, long contactno,
			String address, String status) {
		super();
		this.applid = applid;
		this.cardname = cardname;
		this.username = username;
		this.accno = accno;
		this.email = email;
		this.contactno = contactno;
		this.address = address;
		this.status = status;
	}
	public int getApplid() {
		return applid;
	}
	public void setApplid(int applid) {
		this.applid = applid;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "application [applid=" + applid + ", cardname=" + cardname + ", username=" + username + ", accno="
				+ accno + ", email=" + email + ", contactno=" + contactno + ", address=" + address + ", status="
				+ status + "]";
	}
	
	
}
