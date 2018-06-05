package com.iursp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iursp.domain.model.User;
import com.iursp.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public void queryAllUsers(User user) {
		
		userMapper.queryAllUsers(user);
	}
	
	
}
