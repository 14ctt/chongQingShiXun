package com.jero.motelmalltest.service.user;

import java.util.List;

import com.jero.motelmalltest.po.user.User;

/**
 * @Description <用户业务层接口；如：登录等接口>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:54:09
 * @version   1.0
 */
public interface IUserService {
	
	/**
	 * @Description <用户登录>
	 * @param user(用户信息)
	 * @return List<User> list(登录用户信息)
	 */
	List<User> userLogin(User user);

	/**
	 * @Description <用户注册>
	 * @param user(用户信息)
	 * @return Integer(影响的条数)
	 */
	Integer userRegister(User user);

	/**
	 * @Description <验证手机是否注册过>
	 * @param registerPhone(手机号)
	 * @return User(用户对象)
	 */
	User validatePhone(String registerPhone);

	
	/**
	 * @Description <根据用户账号获取账号信息>
	 * @param user(用户对象)
	 * @return List<User>(账户信息)
	 */
	List<User> validateLoginName(User user);

	
	/**
	 * @Description <重置密码>
	 * @return 返回值
	 * @throws Exception
	 * @param user(用户对象)
	 * @return
	 */
	Integer submitResetPassword(User user);
	
}
