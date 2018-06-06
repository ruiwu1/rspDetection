package com.iursp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.iursp.domain.model.User;

@Mapper
public interface UserMapper {

	List<User> queryAllUsers(User user);

}
