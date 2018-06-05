package com.iursp.mapper;

import org.springframework.stereotype.Repository;

import com.iursp.domain.model.User;

@Repository
public interface UserMapper {

	void queryAllUsers(User user);

}
