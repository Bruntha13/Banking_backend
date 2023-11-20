package com.dxc.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGD_PAYMENT")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pymntid;
	private String benfName;
    private String benfaccountNumber;
    private String accno;
    private double amount;
    private Date date;
	public Payment() {
		super();
	}
	public Payment(int pymntid, String benfName, String benfaccountNumber, String accno, double amount, Date date) {
		super();
		this.pymntid = pymntid;
		this.benfName = benfName;
		this.benfaccountNumber = benfaccountNumber;
		this.accno = accno;
		this.amount = amount;
		this.date = date;
	}
	public int getPymntid() {
		return pymntid;
	}
	public void setPymntid(int pymntid) {
		this.pymntid = pymntid;
	}
	public String getBenfName() {
		return benfName;
	}
	public void setBenfName(String benfName) {
		this.benfName = benfName;
	}
	public String getBenfaccountNumber() {
		return benfaccountNumber;
	}
	public void setBenfaccountNumber(String benfaccountNumber) {
		this.benfaccountNumber = benfaccountNumber;
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
		return "Payment [pymntid=" + pymntid + ", benfName=" + benfName + ", benfaccountNumber=" + benfaccountNumber
				+ ", accno=" + accno + ", amount=" + amount + ", date=" + date + "]";
	}
    
    

}