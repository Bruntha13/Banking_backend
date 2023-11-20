package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dxc.dao.TransactionDao;
import com.dxc.dao.UserRepo;
import com.dxc.model.Transaction;
import com.dxc.model.TransactionType;
import com.dxc.model.User;

@Service
public class TransactionService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UserRepo userDao;
	
	@Autowired
	private TransactionDao transactionDao;
	
	boolean flag;
	double ExBal;
	Transaction trx;
	double amount;
	
	public boolean deposit(String accountNumber, double amount){
		User user = userDao.findByAccno(accountNumber);
		if(user!=null)
		{
			ExBal = user.getBalance();
			user.setBalance(ExBal+amount);
			System.out.println(user.getBalance());
			trx = new Transaction(accountNumber,"DEPOSIT",amount);
			transactionDao.save(trx);
			flag=true;
		}
		else {
			flag=false;
		}
		return flag;	
	}
	
	
	public boolean withdraw(String accountNumber, double amount){
		User user = userDao.findByAccno(accountNumber);
		if(user!=null)
		{
			ExBal = user.getBalance();
			user.setBalance(ExBal-amount);
			System.out.println(user.getBalance());
			trx = new Transaction(accountNumber,"WITHDRAW",amount);
			transactionDao.save(trx);
			flag=true;
		}
		else {
			flag=false;
		}
		return flag;	
	}
	
	public boolean transferAmount(String accountNumber, double amount){
		User user = userDao.findByAccno(accountNumber);
		if(user!=null)
		{
			ExBal = user.getBalance();
			user.setBalance(ExBal-amount);
			System.out.println(user.getBalance());
			trx = new Transaction(accountNumber,"TRANSFER",amount);
			transactionDao.save(trx);
			flag=true;
		}
		else {
			flag=false;
		}
		return flag;	
	}
	
	public double checkBalance(String accountNumber){
		User user = userDao.findByAccno(accountNumber);
		if(user!=null){
			ExBal= user.getBalance();
			trx = new Transaction(accountNumber, "CHECK_BALANCE", 0);
			transactionDao.save(trx);
			amount= ExBal;
		}
		else {
			amount=0;	
		}
		return amount;
		
	}
}
