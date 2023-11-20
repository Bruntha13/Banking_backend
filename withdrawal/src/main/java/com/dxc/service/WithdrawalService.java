package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.WithdrawalDao;

import com.dxc.model.Withdrawal;

@Service
public class WithdrawalService {
	
	@Autowired
    private WithdrawalDao withdrawalDao;

    
    public WithdrawalService(WithdrawalDao withdrawalDao) {
        this.withdrawalDao = withdrawalDao;
    }

    public List<Withdrawal> getAllWithdrawals() {
        return withdrawalDao.findAll();
    }

    public Withdrawal createWithdrawal(Withdrawal withdrawal) {
        return withdrawalDao.save(withdrawal);
    }
    
    public List<Withdrawal> getWithdrawals(String accno) {
        return withdrawalDao.findByAccno(accno);
    }
}



