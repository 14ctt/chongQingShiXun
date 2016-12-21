package com.jero.motelmalltest.mapper.home;

import java.util.List;

import com.jero.motelmalltest.po.home.EnterpriseUser;

/**
 * @Description <操作企业用户数据表的接口;EnterpriseUserMapper.xml接口>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:57:33
 * @version   1.0
 */
public interface EnterpriseUserMapper {

	
	/**
	 * @Description <查询商家>
	 * @return List<EnterpriseUser>
	 */
	List<EnterpriseUser> enterpriseUserList();
	
}