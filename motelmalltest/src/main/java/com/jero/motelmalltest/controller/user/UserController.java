package com.jero.motelmalltest.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jero.motelmalltest.common.model.ModelResult;
import com.jero.motelmalltest.common.utils.CheckCode;
import com.jero.motelmalltest.common.utils.ImagesCode;
import com.jero.motelmalltest.common.utils.IpUtil;
import com.jero.motelmalltest.common.utils.JsonUtil;
import com.jero.motelmalltest.common.utils.MD5Util;
import com.jero.motelmalltest.po.user.User;
import com.jero.motelmalltest.service.user.IUserService;

import java.util.*;

/**
 * @Description <用户的操作；如：登录、获取验证码等>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:51:42
 * @version   1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController{
	private Logger log = Logger.getLogger(getClass());
	
	@Autowired
	private IUserService userService;
	
	
	/**
	 * @Description <用户登录>
	 * @param user(用户信息)
	 * @return List<User> list(登录用户信息)
	 */
	@RequestMapping(value = "/userLogin.do")
	public void userLogin(HttpServletResponse response,HttpServletRequest request,User user) {
		ModelResult mr = new ModelResult();
		try {
			//进行md5加密
			user.setPassword(MD5Util.getMD5(user.getPassword()));
			List<User> list = userService.userLogin(user);
			if(list != null && list.size() > 0){
				mr.setSuccess(true);
				mr.setObj(list);
			}else{
				mr.setErrorMsg("账户不存在");
				mr.setSuccess(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("用户登录异常" + e);
			mr.setErrorMsg("登录异常");
			mr.setSuccess(false);
		}
		JsonUtil.printByJSON(response,mr);
	}
	
	/**
	 * @Description <注册的时候获取验证码>
	 * @param response
	 * @param request
	 * @param session
	 * @param user(用户信息)
	 */
	@RequestMapping(value = "/sendCheckCode.do")
	public void sendCheckCode(HttpServletResponse response,HttpServletRequest request,HttpSession session,User user) {
		ModelResult mr = new ModelResult();
		boolean isValidatePhone = validatePhone(user.getRegisterPhone());
		try {
			//判断是否注册过
			if(isValidatePhone){
				mr.setSuccess(false);
				mr.setErrorMsg("此用户已经注册");
				JsonUtil.printByJSON(response,mr);
				return;
			}
			CheckCode.getCheckCode(session,user.getRegisterPhone());
			mr.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("用户获取验证码异常" + e);
			mr.setSuccess(false);
			mr.setErrorMsg("获取验证码异常");
		}
		JsonUtil.printByJSON(response,mr);
	}
	
	/**
	 * @Description <用户注册>
	 * @param response
	 * @param request
	 * @param session
	 * @param user(用户信息)
	 * @param checkCode(用户输入的验证码)
	 */
	@RequestMapping(value = "/userRegister.do")
	public void userRegister(HttpServletResponse response,HttpServletRequest request,HttpSession session,User user,String checkCode) {
		ModelResult mr = new ModelResult();
		try {
			boolean isValidatePhone = validatePhone(user.getRegisterPhone());
			if(isValidatePhone){
				mr.setSuccess(false);
				mr.setErrorMsg("此用户已经注册");
				JsonUtil.printByJSON(response,mr);
				return;
			}
			boolean isValidateSuccess = CheckCode.getIsValidateSuccess(session,user,checkCode);
			//判断是否验证成功
			if(!isValidateSuccess){
				mr.setSuccess(false);
				mr.setErrorMsg("验证码或者手机号与第一次不一致");
				JsonUtil.printByJSON(response,mr);
				return;
			}
			//获取客户端请求IP地址
			user.setVisitIp(IpUtil.getRequestIP(request));
			user.setPassword(MD5Util.getMD5(user.getPassword()));
			Integer res = userService.userRegister(user);
			if(res>0){
				mr.setSuccess(true);
				mr.setErrorMsg("注册成功");
			}else{
				mr.setSuccess(false);
				mr.setErrorMsg("注册失败");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("用户注册异常" + e);
			mr.setSuccess(false);
			mr.setErrorMsg("注册异常");
		}
		JsonUtil.printByJSON(response,mr);
	}

	/**
	 * @Description <验证手机是否注册过>
	 * @param registerPhone(手机号)
	 * @return boolean isValidatePhone(是否注册过)
	 */
	
	public boolean validatePhone(String registerPhone){
		User user = userService.validatePhone(registerPhone);
		boolean isValidatePhone = false;
		if(user != null && !"".equals(user)){
			isValidatePhone = true;
		}
		return isValidatePhone;
	}
	/**
	 * @Description <获取图片验证码>
	 * @return 返回值
	 * @throws Exception(获取图片验证码异常)
	 * @param response
	 * @param request
	 * @param session
	 */
	@RequestMapping(value = "/getImagesCode.do")
	public ModelAndView getImagesCode(HttpServletResponse response,HttpServletRequest request,HttpSession session) {
		try {
			ImagesCode.getImagesCode(response,request,session);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("获取图片验证码异常"+e);
		}
		return new ModelAndView("确认账户页面");
	}
	
	/**
	 * @Description <验证图片码和账户，然后向手机或者邮箱发送验证码>
	 * @return 返回值
	 * @throws Exception
	 * @param response
	 * @param request
	 * @param session
	 * @param imagesCode(图片验证码)
	 * @param user
	 */
	@RequestMapping(value = "/validateLoginName.do")
	public void validateLoginName(HttpServletResponse response,HttpServletRequest request,HttpSession session,String imagesCode,User user){
		List<User> userList = userService.validateLoginName(user);
		ModelResult mr = new ModelResult();
		if(userList != null && userList.size() > 0){
			if(ImagesCode.validateImagesCode(session,imagesCode)){
				mr.setErrorMsg("验证码不对");
				mr.setSuccess(false);
				JsonUtil.printByJSON(response,mr);
				return;
			}
			try {
				CheckCode.getCheckCode(session,(userList.get(0).getRegisterPhone()));
				mr.setSuccess(true);
			} catch (Exception e) {
				e.printStackTrace();
				log.error("用户获取验证码异常" + e);
				mr.setSuccess(false);
				mr.setErrorMsg("获取验证码异常");
			}
		}else{
			mr.setErrorMsg("账号不存在");
			mr.setSuccess(false);
		}
		JsonUtil.printByJSON(response,mr);
	}
	
	/**
	 * @Description <跳转安全验证页面>
	 * @return 返回值
	 * @throws Exception
	 * @return
	 */
	@RequestMapping(value = "/SecurityVerification.do")
	public ModelAndView SecurityVerification(){
		return new ModelAndView("安全验证页面");
	}
	
	/**
	 * @Description <忘记密码的获取验证码>
	 * @param response
	 * @param request
	 * @param session
	 */
	@RequestMapping(value = "/forgetPasswordCheckCode.do")
	public void forgetPasswordCheckCode(HttpServletResponse response,HttpServletRequest request,HttpSession session) {
		ModelResult mr = new ModelResult();
		try {
			CheckCode.getCheckCode(session,session.getAttribute("registerPhone").toString());
			mr.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("用户获取验证码异常" + e);
			mr.setSuccess(false);
			mr.setErrorMsg("获取验证码异常");
		}
		JsonUtil.printByJSON(response,mr);
	}
	
	/**
	 * @Description <验证忘记密码的验证码>
	 * @return 返回值
	 * @throws Exception
	 * @param response
	 * @param request
	 * @param session
	 * @param checkCode(验证码)
	 */
	@RequestMapping(value = "/submitCheckCode.do")
	public void SumbitCheckCode(HttpServletResponse response,HttpServletRequest request,HttpSession session,String checkCode) {
		ModelResult mr = new ModelResult();
		if(!session.getAttribute("checkCode").equals(checkCode)){
			mr.setSuccess(false);
			mr.setErrorMsg("验证码不一致");
			JsonUtil.printByJSON(response,mr);
			return;
		}
		mr.setSuccess(true);
		JsonUtil.printByJSON(response,mr);
	}
	
	/**
	 * @Description <跳转重置密码页面>
	 * @return 返回值
	 * @throws Exception
	 * @return
	 */
	@RequestMapping(value = "/resetPassword.do")
	public ModelAndView resetPassword(){
		return new ModelAndView("重置密码页面");
	}
	
	/**
	 * 
	 * @Description <重置密码>
	 * @throws Exception
	 * @param response
	 * @param request
	 * @param session
	 * @param user
	 */
	@RequestMapping(value = "/submitResetPassword.do")
	public void submitResetPassword(HttpServletResponse response,HttpServletRequest request,HttpSession session,User user){
		ModelResult mr = new ModelResult();
		try {
			user.setPassword(MD5Util.getMD5(user.getPassword()));
			user.setRegisterPhone(session.getAttribute("registerPhone").toString());
			Integer res = userService.submitResetPassword(user);
			if(res == 0){
				mr.setErrorMsg("重置密码失败");
				mr.setSuccess(false);
				JsonUtil.printByJSON(response,mr);
				return;
			}
			mr.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("重置密码异常" + e);
			mr.setSuccess(false);
			mr.setErrorMsg("重置密码异常");
		}
		JsonUtil.printByJSON(response,mr);
	}
	
	/**
	 * @Description <跳转重置密码成功页面>
	 * @return 返回值
	 * @throws Exception
	 * @return
	 */
	@RequestMapping(value = "/resetPasswordSuccess.do")
	public ModelAndView resetPasswordSuccess(){
		return new ModelAndView("重置密码成功页面");
	}
	
}
