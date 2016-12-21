package com.jero.motelmalltest.common.utils;

import java.util.Random;

import javax.servlet.http.HttpSession;

import com.jero.motelmalltest.po.user.User;


/**
 * @Description <类描述>
 * @author  郑启阳
 * @date  2016年5月25日 下午2:31:06
 * @version   1.0
 */
public class CheckCode {
	
	/**
	 * @Description <获取验证码然后给手机发送验证码>
	 * @param session(session保存的值)
	 * @param registerPhone(手机号)
	 * @throws Exception(调用手机短信接口的时候的异常)
	 */
	public static void getCheckCode(HttpSession session,String registerPhone) throws Exception {
		String[] checkCodes = {"0","1","2","3","4","5","6","7","8","9"};
		String checkCode = "";
		Random random = new Random();  
		for (int i = 0;i<6;i++) {
			String str = checkCodes[random.nextInt(checkCodes.length)];  
			checkCode += str;
		}
		//调用接口，给registerPhone这个手机号发送checkCode
		session.setAttribute("checkCode",checkCode);
		session.setAttribute("registerPhone",registerPhone);
//		session.setMaxInactiveInterval(60);
	}
	/**
	 * @Description <验证手机和验证码>
	 * @param session
	 * @param user(用户信息)
	 * @param checkCode(用户输入的验证码)
	 * @return Boolean isValidateSuccess(手机和验证码是否正确)
	 * @throws Exception(空指针异常)
	 */
	public static boolean getIsValidateSuccess(HttpSession session, User user, String checkCode) throws Exception{
		boolean isValidateSuccess = true;
		if(!user.getRegisterPhone().equals(session.getAttribute("registerPhone"))){
			isValidateSuccess = false;
		}else if(!checkCode.equals(session.getAttribute("checkCode"))){
			isValidateSuccess = false;
		}
		return isValidateSuccess;
	}
}
