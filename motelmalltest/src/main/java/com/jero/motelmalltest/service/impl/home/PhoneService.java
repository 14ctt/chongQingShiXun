package com.jero.motelmalltest.service.impl.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jero.motelmalltest.mapper.home.PhoneMapper;
import com.jero.motelmalltest.po.home.Phone;
import com.jero.motelmalltest.service.home.IPhoneService;

@Service
public class PhoneService implements IPhoneService {
	@Autowired
	private PhoneMapper phoneMapper;

	@Override
	public int up(Phone phone) {
		// TODO Auto-generated method stub
		return phoneMapper.up(phone);
	}

}
