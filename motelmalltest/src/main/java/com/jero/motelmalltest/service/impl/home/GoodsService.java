package com.jero.motelmalltest.service.impl.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jero.motelmalltest.mapper.home.GoodsMapper;
import com.jero.motelmalltest.po.home.Phone;
import com.jero.motelmalltest.service.home.IGoodsService;

/**
 * 
 * @author Administrator
 *
 */
@Service
public class GoodsService implements IGoodsService {
	@Autowired
	private GoodsMapper goodsMapper;

	/**
 * 
 */
	@Transactional
	@Override
	public List<Phone> goodsList(Phone t) {
		// TODO Auto-generated method stub
		return goodsMapper.goodsList(t);
	}

	@Transactional
	@Override
	public List<Phone> goodsText(Phone t) {
		// TODO Auto-generated method stub
		return goodsMapper.goodsText(t);
	}

	@Transactional
	@Override
	public List<Phone> goodsLis(Phone t) {
		// TODO Auto-generated method stub
		return goodsMapper.goodsLis(t);
	}

}
