package com.jero.motelmalltest.service.impl.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jero.motelmalltest.mapper.home.ForumPostingMapper;
import com.jero.motelmalltest.po.home.ForumPosting;
import com.jero.motelmalltest.service.home.IForumPostingService;

/**
 * @Description <类描述>
 * @author  郑启阳
 * @date  2016年5月26日 下午8:23:25
 * @version   1.0
 */
@Service
public class ForumPostingService implements IForumPostingService{

	@Autowired
	private ForumPostingMapper forumPostingMapper;
	
	/**
	 * @Override IForumPostingService<实现这个接口的forumPostingList方法>
	 * @Description <查询论坛发布表>
	 * @return List<ForumPosting>
	 */
	@Transactional
	public List<ForumPosting> forumPostingList() {
		return forumPostingMapper.forumPostingList();
	}
	
}
