package com.jero.motelmalltest.service.impl.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jero.motelmalltest.mapper.home.PhoneUpdateMapper;
import com.jero.motelmalltest.po.home.Phone;
import com.jero.motelmalltest.service.home.IPhoneUpdateService;
/**
 * 
 * @author Administrator
 *
 */
@Service
public class PhoneUpdateService implements IPhoneUpdateService{

	@Autowired
	private PhoneUpdateMapper goodsMapper;

	
	
	@Transactional
	@Override
	public int upDate(Phone phone) {
	
		return goodsMapper.upDate(phone);
	}

}
