package com.dxc.model;
import javax.persistence.*;

/*create table REGD_TRANS(
transactionId int primary key auto_increment,
accountNumber varchar(50) not null,
type enum('WITHDRAW','DEPOSIT','CHECK_BALANCE','TRANSFER')
transactionAmount int not null
);*/

@Entity
@Table(name="REGD_TRANS")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionid;
	private String accno;
	private String type;
	private double transactionamount;
	public Transaction() {
		super();
	}
	public Transaction(String accno, String type, double transactionamount) {
		super();
		this.transactionid = transactionid;
		this.accno = accno;
		this.type = type;
		this.transactionamount = transactionamount;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getTransactionamount() {
		return transactionamount;
	}
	public void setTransactionamount(double transactionamount) {
		this.transactionamount = transactionamount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionid=" + transactionid + ", accno=" + accno + ", type=" + type
				+ ", transactionamount=" + transactionamount + "]";
	}
	
}
