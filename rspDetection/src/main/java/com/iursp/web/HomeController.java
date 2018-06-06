package com.iursp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iursp.conf.aop.LoggerManage;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController{

	@RequestMapping("/index")
	@LoggerManage(description="首页")
	public String index(ModelMap map) {
		logger.info("跳转到首页");
		map.addAttribute("host", "http://www.google.com");
		return "index";
	}
	
	@RequestMapping(value="/Jump/{Route}/{userId}")
	@LoggerManage(description="/路径/用户")
	public String toUserAdmin(ModelMap map,@PathVariable("Route") String Route,
			@PathVariable("userId") long userId) {
		logger.info("跳转到用户管理界面Route="+Route+"userId="+userId);
		return "error";
	}

}