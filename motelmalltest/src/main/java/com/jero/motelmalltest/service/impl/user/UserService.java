package com.jero.motelmalltest.service.impl.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jero.motelmalltest.mapper.user.UserMapper;
import com.jero.motelmalltest.po.user.User;
import com.jero.motelmalltest.service.user.IUserService;

/**
 * @Description <实现用户业务层接口；如：登录等接口>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:55:28
 * @version   1.0
 */
@Service
public class UserService implements IUserService{
	
	@Autowired
	private UserMapper userMapper;
	
	
	/**
	 * @Override IUserService(实现这个接口的userLogin方法)
	 * @Description <用户登录>
	 * @param user(用户信息)
	 * @return List<User> list(登录用户信息)
	 */
	@Transactional
	public List<User> userLogin(User user) {
		return userMapper.userLogin(user);
	}

	/**
	 * @Override IUserService(实现这个接口的userRegister方法)
	 * @Description <用户注册>
	 * @param user(用户信息)
	 * @return Integer(影响的条数)
	 */
	@Transactional
	public Integer userRegister(User user) {
		return userMapper.userRegister(user);
	}

	
	/**
	 * @Override IUserService(实现这个接口的validatePhone方法)
	 * @Description <验证手机是否注册过>
	 * @param registerPhone(手机号)
	 * @return User(用户对象)
	 */
	@Transactional
	public User validatePhone(String registerPhone) {
		return userMapper.validatePhone(registerPhone);
	}
	
	/**
	 * @Override IUserService(实现这个接口的validateLoginName方法)
	 * @Description <根据用户账号获取账号信息>
	 * @param user(用户对象)
	 * @return List<User>(账户信息)
	 */
	@Transactional
	public List<User> validateLoginName(User user) {
		return userMapper.validateLoginName(user);
	}

	
	/**
	 * @Override IUserService(实现这个接口的submitResetPassword方法)
	 * @Description <重置密码>
	 * @param user(用户对象)
	 */
	@Transactional
	public Integer submitResetPassword(User user) {
		return userMapper.submitResetPassword(user);
	}


}
