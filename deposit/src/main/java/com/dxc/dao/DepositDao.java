package com.dxc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Deposit;


@Repository
public interface DepositDao extends JpaRepository<Deposit, Long> {
	List<Deposit> findByAccno(String accno);

}
