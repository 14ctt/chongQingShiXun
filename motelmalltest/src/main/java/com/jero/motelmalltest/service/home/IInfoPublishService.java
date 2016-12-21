package com.jero.motelmalltest.service.home;

import java.util.List;

import com.jero.motelmalltest.po.home.InfoPublish;

/**
 * @Description <论坛发布业务层接口>
 * @author  郑启阳
 * @date  2016年5月26日 下午7:14:13
 * @version   1.0
 */
public interface IInfoPublishService {

	/**
	 * @Description <根据条件获取论坛发布数据>
	 * @return List<InfoPublish>
	 * @param infoType(信息类型)
	 */
	List<InfoPublish> infoPublishList(String infoType);


}
