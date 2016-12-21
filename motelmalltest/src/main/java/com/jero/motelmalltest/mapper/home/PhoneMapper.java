package com.jero.motelmalltest.mapper.home;



import org.apache.ibatis.annotations.Param;

import com.jero.motelmalltest.po.home.Phone;

public interface PhoneMapper {
	/**
	 * 
	 * @param phone
	 * @return int
	 */
int up(Phone phone);
}
