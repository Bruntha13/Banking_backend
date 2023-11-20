package com.dxc.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.dxc.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsernameAndAccnoAndLoginpin(String username,String accno,String loginpin);

	User findByAccno(String accno);


}
