package cn.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dev")
public class DevController {
	
	@RequestMapping("/first_display")
	public String ss() {
	return "dev/d_b_display";	
	}
	

	@RequestMapping("/maintenance")
	public String maintenance() {
	return "dev/dev_app_maintenance";	
	}
	
	@RequestMapping("/add")
	public String add() {
	return "dev/app_add";	
	}
	
	@RequestMapping("/modify")
	public String modify() {
	return "dev/modify_app";	
	}
	@RequestMapping("/add_version")
	public String add_version() {
	return "dev/add_version";	
	}
	
	@RequestMapping("/modify_version")
	public String modify_version() {
	return "dev/modify_version";	
	}
	
}
