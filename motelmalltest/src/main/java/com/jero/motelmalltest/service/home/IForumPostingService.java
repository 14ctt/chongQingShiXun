package com.jero.motelmalltest.service.home;

import java.util.List;

import com.jero.motelmalltest.po.home.ForumPosting;

/**
 * @Description <类描述>
 * @author  郑启阳
 * @date  2016年5月26日 下午8:23:07
 * @version   1.0
 */
public interface IForumPostingService {

	/**
	 * @Description <查询论坛发布表>
	 * @return List<ForumPosting>
	 */
	List<ForumPosting> forumPostingList();

}
