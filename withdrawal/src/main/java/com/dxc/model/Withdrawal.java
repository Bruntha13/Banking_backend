package com.dxc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*create table REGD_WITHDRAWAL(
withdrawalid int primary key auto_increment,
accno varchar(50) not null,
amount double not null,
date date not null
);*/

@Entity
@Table(name="REGD_WITHDRAWAL")
public class  Withdrawal{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int withdrawalid;
    private String accno;
    private double amount;
    private Date date;
	public Withdrawal() {
		super();
	}
	public Withdrawal(int withdrawalid, String accno, double amount, Date date) {
		super();
		this.withdrawalid = withdrawalid;
		this.accno = accno;
		this.amount = amount;
		this.date = date;
	}
	
	public int getWithdrawalid() {
		return withdrawalid;
	}
	public void setWithdrawalid(int withdrawalid) {
		this.withdrawalid = withdrawalid;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Withdrawal [withdrawalid=" + withdrawalid + ", accno=" + accno + ", amount=" + amount + ", date=" + date
				+ "]";
	}
    
    
}