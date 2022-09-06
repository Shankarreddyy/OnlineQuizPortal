package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;
	

	
	
	public String signIn(Login login) {
		Optional<Login> op = loginRepository.findById(login.getEmailid());
		if(op.isPresent() && login.getPassword().equals("Sp@1234")) {
			Login user = op.get();
			return "Admin logged in successfully";
		}else {
			return "Wrong credentials, Try again";
		}
	}
	
	
	public String updatePassword(Login login) {
		Optional<Login> op = loginRepository.findById(login.getEmailid());
		if(op.isPresent()) {
			Login user = op.get();
			user.setPassword(login.getPassword());
			loginRepository.saveAndFlush(user);
			return "Password updated successfully";
		}else {
			return "Password didn't update";
		}
	}
	
	

	public String signInUser(Login login) {
		Optional<Login> op = loginRepository.findById(login.getEmailid());
		if(op.isPresent() &&login.getTypeofuser().equals("participant")) {
			Login user = op.get();
			return "Hurray! You logged in successfully";
		}else {
			return "Wrong credentials, Please Try again";
		}
	}
	
	
	
	
	

}