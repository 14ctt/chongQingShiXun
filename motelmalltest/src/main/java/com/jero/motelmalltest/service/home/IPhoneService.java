package com.jero.motelmalltest.service.home;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import com.jero.motelmalltest.mapper.home.GoodsMapper;
import com.jero.motelmalltest.po.home.Phone;

 public interface IPhoneService {
	 /**
	  * 
	  * @param phone
	  * @return
	  */
	int up(Phone phone);
	
}
