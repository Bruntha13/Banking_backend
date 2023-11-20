package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dxc.model.Withdrawal;
import com.dxc.service.WithdrawalService;


@RestController
@RequestMapping
@CrossOrigin(origins="http://localhost:4200")
public class WithdrawalController {
	@Autowired
    private  WithdrawalService withdrawalService;

//    
//    public WithdrawalController(WithdrawalService withdrawalService) {
//        this.withdrawalService = withdrawalService;
//    }

    @GetMapping("/withdrawal")
    public List<Withdrawal> getAllWithdrawals() {
        return withdrawalService.getAllWithdrawals();
    }
    
    @GetMapping("/withdrawal/{accno}")
    public List<Withdrawal> getPayments(@PathVariable String accno) {
      
        return withdrawalService.getWithdrawals(accno);
   
    }

    @PostMapping("/withdrawal")
    public Withdrawal createWithdrawal(@RequestBody Withdrawal withdrawal) {
    	System.out.println(withdrawal.toString());
        return withdrawalService.createWithdrawal(withdrawal);
    }
}
