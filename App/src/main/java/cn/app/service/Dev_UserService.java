package cn.app.service;

import cn.app.pojo.Dev_User;

public interface Dev_UserService {

	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	public Dev_User login(String devCode,String devPassword);
	
}
