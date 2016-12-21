package com.jero.motelmalltest.mapper.home;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jero.motelmalltest.po.home.Goods;
/**
 * @Description <操作商品表数据表的接口;GoodsMapper.xml接口>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:57:33
 * @version   1.0
 */
public interface GoodsMapper {

	/**
	 * @Description <根据类型商品查询信息>
	 * @return List<Goods>
	 * @param String className(类型)	
	 */
	List<Goods> goodsList(@Param("className")String className);
	
	/**
	 * @Description <商品查询信息>
	 * @return List<Goods>
	 */
	List<Goods> goodsListAll();
}