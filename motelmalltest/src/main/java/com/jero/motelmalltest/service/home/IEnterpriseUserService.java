package com.jero.motelmalltest.service.home;

import java.util.List;

import com.jero.motelmalltest.po.home.EnterpriseUser;

/**
 * @Description <类描述>
 * @author  郑启阳
 * @date  2016年5月26日 下午8:54:10
 * @version   1.0
 */
public interface IEnterpriseUserService {

	
	/**
	 * @Description <查询商家>
	 * @return List<EnterpriseUser>
	 */
	List<EnterpriseUser> enterpriseUserList();

}
