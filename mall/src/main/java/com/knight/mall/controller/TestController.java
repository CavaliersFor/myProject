package com.knight.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/test")
public class TestController extends BaseController{
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("name", "张三");
		return "test/index";
	}
}
