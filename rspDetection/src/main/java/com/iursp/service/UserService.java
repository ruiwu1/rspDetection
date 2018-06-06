package com.iursp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iursp.domain.model.User;
import com.iursp.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public void queryAllUsers(User user) {
		System.out.println("测试");
		List<User> list = userMapper.queryAllUsers(user);
		System.out.println(list.toString());
	}
	
	
}
