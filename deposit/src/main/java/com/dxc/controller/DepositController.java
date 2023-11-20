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

import com.dxc.model.Deposit;
import com.dxc.service.DepositService;


@RestController
@RequestMapping
@CrossOrigin(origins="http://localhost:4200")
public class DepositController {
	
	@Autowired
	private  DepositService depositService;

    
//    public DepositController(DepositService depositService) {
//        this.depositService = depositService;
//    }

    @GetMapping("/deposits")
    public List<Deposit> getAllDeposits() {
        return depositService.getAllDeposits();
    }
    
    @GetMapping("/deposits/{accno}")
    public List<Deposit> getDeposits(@PathVariable String accno) {
        return depositService.getDeposits(accno);
    }

    @PostMapping("/deposits")
    public Deposit createDeposit(@RequestBody Deposit deposit) {
    	System.out.println(deposit.toString());
        return depositService.createDeposit(deposit);
    }
}
