package com.uoko.framework.uokoframeworkstarter.controller;

import com.uoko.framework.uokoframeworkstarter.model.User;
import com.uoko.framework.uokoframeworkstarter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzp on 2018/4/23.
 */
@Controller
@RequestMapping("/management")
public class HelloController {

	@Autowired
	HelloService helloService;

	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public Map<String, Object> HelloWorld(String name,String phone) {
		Map<String,Object> map = new HashMap<>();
		User slect = helloService.slect(name, phone);
		map.put("data", slect);
		return map;
	}
}
