package com.jero.motelmalltest.mapper.home;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jero.motelmalltest.po.home.InfoPublish;

/**
 * @Description <操作信息发布表数据表的接口;InfoPublishMapper.xml接口>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:57:33
 * @version   1.0
 */
public interface InfoPublishMapper {

	
	/**
	 * @Description <根据条件获取论坛发布数据>
	 * @return List<InfoPublish>
	 * @param infoType(信息类型)
	 */
	List<InfoPublish> infoPublishList(@Param("infoType")String infoType);
	
}