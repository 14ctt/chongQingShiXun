package com.jero.motelmalltest.service.impl.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jero.motelmalltest.mapper.home.EnterpriseUserMapper;
import com.jero.motelmalltest.po.home.EnterpriseUser;
import com.jero.motelmalltest.service.home.IEnterpriseUserService;

/**
 * @Description <类描述>
 * @author  郑启阳
 * @date  2016年5月26日 下午8:54:20
 * @version   1.0
 */
@Service
public class EnterpriseUserService implements IEnterpriseUserService{

	@Autowired
	private EnterpriseUserMapper enterpriseUserMapper;
	
	/**
	 * @Override IEnterpriseUserService<实现这个接口的enterpriseUserList方法>
	 * @Description <查询商家>
	 * @return List<EnterpriseUser>
	 */
	@Transactional
	public List<EnterpriseUser> enterpriseUserList() {
		return enterpriseUserMapper.enterpriseUserList();
	}

}
