package com.dxc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.dxc.model.Transaction;

//import jakarta.transaction.Transactional;

@Repository
//@Transactional
public interface TransactionDao extends JpaRepository<Transaction, Integer> {

}