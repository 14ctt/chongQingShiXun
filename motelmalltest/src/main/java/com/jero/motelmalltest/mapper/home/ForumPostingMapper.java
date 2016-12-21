package com.jero.motelmalltest.mapper.home;

import java.util.List;

import com.jero.motelmalltest.po.home.ForumPosting;

/**
 * @Description <操作论坛发布表数据表的接口;ForumPostingMapper.xml接口>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:57:33
 * @version   1.0
 */
public interface ForumPostingMapper {

	/**
	 * @Description <查询论坛发布表>
	 * @return List<ForumPosting>
	 */
	List<ForumPosting> forumPostingList();
	
}