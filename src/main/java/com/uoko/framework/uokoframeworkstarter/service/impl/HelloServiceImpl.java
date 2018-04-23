package com.uoko.framework.uokoframeworkstarter.service.impl;

import com.uoko.framework.uokoframeworkstarter.mapper.UserMapper;
import com.uoko.framework.uokoframeworkstarter.model.User;
import com.uoko.framework.uokoframeworkstarter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by PVer on 2018/4/23.
 */
@Service
public class HelloServiceImpl implements HelloService{

	@Autowired
	UserMapper userMapper;

	@Override
	public User slect(String name, String phone) {
		User user = userMapper.getUser(name, phone);
		return user;
	}
}
