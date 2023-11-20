package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.DepositDao;

import com.dxc.model.Deposit;



@Service
public class DepositService {
	
	@Autowired
    private  DepositDao depositDao;

 
    public DepositService(DepositDao depositDao) {
        this.depositDao = depositDao;
    }

    public List<Deposit> getAllDeposits() {
        return depositDao.findAll();
    }

    public Deposit createDeposit(Deposit deposit) {
        return depositDao.save(deposit);
    }
    
    public List<Deposit> getDeposits(String accno) {
        return depositDao.findByAccno(accno);
    }
    
    
}
