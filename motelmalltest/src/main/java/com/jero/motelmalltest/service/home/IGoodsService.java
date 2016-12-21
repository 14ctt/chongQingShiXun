package com.jero.motelmalltest.service.home;

import java.util.List;

import com.jero.motelmalltest.po.home.Goods;

/**
 * @Description <商品业务层接口>
 * @author  郑启阳
 * @date  2016年5月26日 下午4:35:08
 * @version   1.0
 */
public interface IGoodsService {

	/**
	 * @Description <根据类型商品查询信息>
	 * @return List<Goods>
	 * @throws Exception
	 * @param String className(类型)
	 */
	List<Goods> goodsList(String className);
	
	/**
	 * @Description <商品查询信息>
	 * @return List<Goods>
	 */
	List<Goods> goodsListAll();
	
}
