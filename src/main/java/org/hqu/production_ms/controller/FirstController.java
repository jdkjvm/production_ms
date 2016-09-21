package org.hqu.production_ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FirstController {
	
	//系统首页
	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		
		return "login.jsp";
	}
	
	//欢迎页面
	@RequestMapping("/home")
	public String welcome(Model model)throws Exception{
		
		return "home.jsp";
		
	}
}	
