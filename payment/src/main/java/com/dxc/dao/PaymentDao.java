package com.dxc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Payment;



@Repository
public interface PaymentDao extends JpaRepository<Payment, String> {

	List<Payment> findAllByBenfaccountNumber(String benfaccountNumber);
	
	List<Payment> findByAccno(String accno);

}