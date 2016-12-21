package com.jero.motelmalltest.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jero.motelmalltest.po.user.User;

/**
 * @Description <操作用户数据表的接口;UserMapper.xml接口>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:57:33
 * @version   1.0
 */
public interface UserMapper {
	
	/**
	 * @Description <用户登录mapper接口>
	 * @param user(用户信息)
	 * @return List<User> list(登录用户信息)
	 */
	List<User> userLogin(User user);

	/**
	 * @Description <用户注册mapper接口>
	 * @param user(用户信息)
	 * @return Integer(影响的条数)
	 */
	Integer userRegister(User user);

	/**
	 * @Description <验证手机是否注册过>
	 * @param registerPhone(手机号)
	 * @return User(用户对象)
	 */
	User validatePhone(@Param("registerPhone")String registerPhone);

	
	/**
	 * @Description <根据用户账号获取账号信息>
	 * @param user(用户对象)
	 * @return List<User>(账户信息)
	 */
	List<User> validateLoginName(User user);

	
	/**
	 * @Description <重置密码>
	 * @param user(用户对象)
	 */
	Integer submitResetPassword(User user);
}
