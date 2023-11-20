package com.dxc.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Payment;
import com.dxc.service.PaymentService;




@RestController
@RequestMapping
@CrossOrigin(origins="http://localhost:4200")
public class PaymentController {
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    @GetMapping("/payments/{sendersAccNum}")
//    public List<Payment> getAllPayments(@PathVariable String sendersAccNum) {      
//        return paymentService.getAllPayments(sendersAccNum);
//    }
    
    @GetMapping("/payments/{accno}")
    public List<Payment> getPayments(@PathVariable String accno) {
      
        return paymentService.getPayments(accno);
   
    }

    @PostMapping("/payments")
    public Payment createPayment(@RequestBody Payment payment) {
    	System.out.println(payment.toString());
        return paymentService.createPayment(payment);
    }
    
    
}
