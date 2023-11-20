package com.dxc.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.exception.IncorrectPinException;
import com.dxc.exception.UserExistsException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.User;
import com.dxc.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepository;
	
	@Override
	public User registerUser(User user) throws UserExistsException {
		final boolean existById = this.userRepository.existsById(user.getUserid());
		if(existById) {
			throw new UserExistsException("User Already Exists");
		}
		return this.userRepository.save(user);
	}

	@Override
	public User authenticateUser(String username, String accno, String loginpin)
			throws UserNotFoundException, IncorrectPinException {
		final Optional<User> optionalUser = this.userRepository.findByUsernameAndAccnoAndLoginpin(username, accno, loginpin);
		
		if(optionalUser.isEmpty()) {
			throw new UserNotFoundException("User Not Found");
		}
		return optionalUser.get();
	}

	@Override
	public List<User> getUserByAccno(String accno) throws UserNotFoundException {
		
		List<User> UserNew= userRepository.findByAccno(accno);
		
		if(UserNew.isEmpty()) {
			throw new UserNotFoundException("User Not Found");
		}
		else
			return UserNew;
	}
	
	
	

}
