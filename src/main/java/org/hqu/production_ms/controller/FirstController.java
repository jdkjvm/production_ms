package org.hqu.production_ms.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.hqu.production_ms.domain.ActiveUser;


@Controller
public class FirstController {
	
	//系统首页
	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		
		/*//从shiro的session中取activeUser
		Subject subject = SecurityUtils.getSubject();
		//取身份信息
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		//通过model传到页面
		model.addAttribute("activeUser", activeUser);*/
		
		return "login.jsp";
	}
	
	//欢迎页面
	@RequestMapping("/home")
	public String welcome(Model model)throws Exception{
		
		return "home.jsp";
		
	}
}	
