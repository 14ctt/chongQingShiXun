package com.jero.motelmalltest.service.impl.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jero.motelmalltest.mapper.home.GoodsMapper;
import com.jero.motelmalltest.po.home.Goods;
import com.jero.motelmalltest.service.home.IGoodsService;

/**
 * @Description <实现商品业务层接口>
 * @author  郑启阳
 * @date  2016年5月26日 下午4:36:40
 * @version   1.0
 */
@Service
public class GoodsService implements IGoodsService{
	
	@Autowired//依赖注入
	private GoodsMapper goodsMapper;

	
	/**
	 * @Override IGoodsService<实现这个接口的goodsClassList方法>
	 * @Description 根据类型商品查询信息
	 * @return List<Goods>
	 * @param String className(类型)	
	 */
	@Transactional
	public List<Goods> goodsList(String className) {
		return goodsMapper.goodsList(className);
	}
	
	/**
	 * @Override IGoodsService<实现这个接口的goodsListAll方法>
	 * @Description 商品查询信息
	 * @return List<Goods>
	 */
	@Transactional
	public List<Goods> goodsListAll(){
		return goodsMapper.goodsListAll();
	}
}
