package com.knight.mall.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	
	@RequestMapping(value = "/index")
	public String index(Model model,HttpServletRequest request, HttpServletResponse response) {
		
		String requestUrl = request.getScheme() // 当前链接使用的协议
				+ "://" + request.getServerName()// 服务器地址
				+ ":" + request.getServerPort() // 端口号
				+ request.getContextPath();
		
		model.addAttribute("name", "张三");
		model.addAttribute("appUrl", requestUrl);
		return "test/index";
	}
}
