package com.jero.motelmalltest.service.impl.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jero.motelmalltest.mapper.home.InfoPublishMapper;
import com.jero.motelmalltest.po.home.InfoPublish;
import com.jero.motelmalltest.service.home.IInfoPublishService;

/**
 * @Description <实现论坛发布业务层接口>
 * @author  郑启阳
 * @date  2016年5月26日 下午7:14:26
 * @version   1.0
 */
@Service
public class InfoPublishService implements IInfoPublishService{

	@Autowired
	private InfoPublishMapper infoPublishMapper;
	
	
	/**
	 * @Override IInfoPublishService<实现这个接口的infoPublishList方法>
	 * @Description <根据条件获取论坛发布数据>
	 * @return List<InfoPublish>
	 * @param infoType(信息类型)
	 */
	@Transactional
	public List<InfoPublish> infoPublishList(String infoType) {
		return infoPublishMapper.infoPublishList(infoType);
	}

}
