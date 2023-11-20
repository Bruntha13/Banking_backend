package com.dxc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.dxc.model.Withdrawal;



@Repository
public interface WithdrawalDao extends JpaRepository<Withdrawal, Long> {
	List<Withdrawal> findByAccno(String accno);
}

