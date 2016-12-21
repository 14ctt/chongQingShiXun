package com.jero.motelmalltest.service.impl.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jero.motelmalltest.mapper.home.PhoneDeleteMapper;
import com.jero.motelmalltest.po.home.Phone;
import com.jero.motelmalltest.service.home.IPhoneDeleteService;

@Service
public class PhoneDeleteService implements IPhoneDeleteService {

	@Autowired
	// 依赖注入
	private PhoneDeleteMapper phoneDateleMapper;

	@Transactional
	public int delete(Phone phone) {
		// TODO Auto-generated method stub
		return phoneDateleMapper.delete(phone);
	}

}
