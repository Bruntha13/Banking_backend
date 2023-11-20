package com.dxc.dao;
import java.util.*;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Application;


@Repository
public interface ApplDAO extends JpaRepository<Application, Integer> {
//	Optional<Plans> findByPlanid(int planid);
	List<Application> findByApplid(int applid);
	

}
