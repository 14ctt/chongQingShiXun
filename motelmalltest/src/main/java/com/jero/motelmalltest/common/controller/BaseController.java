package com.jero.motelmalltest.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.RowBounds;
/**
 * @Description <公共的Controller，获取登录名，登录用户，IP等信息>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:51:42
 * @version   1.0
 */
public class BaseController {
	/**
	 * 获取客户端请求IP地址
	 * @param request
	 * @return
	 */
	public String getRequestIP(HttpServletRequest request) {
		String ipAddress = request.getHeader("x-forwarded-for");
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getRemoteAddr();
		}
		return ipAddress;
	}

	public RowBounds getRowBounds(Integer page, Integer rows) {
		if (page == null || rows == null) {
			return new RowBounds(0, 15);
		}
		if (page < 1)
			page = 1;
		if (rows < 1)
			rows = 15;
		return new RowBounds((page - 1) * rows, page * rows);
	}
}
