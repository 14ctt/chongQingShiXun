package com.jero.motelmalltest.controller.home;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jero.motelmalltest.common.utils.JsonObjectUtil;
import com.jero.motelmalltest.common.utils.JsonUtil;
import com.jero.motelmalltest.po.home.EnterpriseUser;
import com.jero.motelmalltest.po.home.ForumPosting;
import com.jero.motelmalltest.po.home.Goods;
import com.jero.motelmalltest.po.home.InfoPublish;
import com.jero.motelmalltest.po.home.text;
import com.jero.motelmalltest.service.home.IEnterpriseUserService;
import com.jero.motelmalltest.service.home.IForumPostingService;
import com.jero.motelmalltest.service.home.IGoodsService;
import com.jero.motelmalltest.service.home.IInfoPublishService;


/**
 * @Description <获取首页信息>
 * @author  郑启阳
 * @date  2016年5月26日 下午6:28:53
 * @version   1.0
 */
@Controller
//@RequestMapping(value = "/home")
public class HomeController {
//	private Logger log = Logger.getLogger(getClass());
//	
//	@Autowired
//	private IGoodsService goodsService;
//	@Autowired
//	private IInfoPublishService infoPublishService;
//	@Autowired
//	private IForumPostingService forumPostingService;
//	@Autowired
//	private IEnterpriseUserService enterpriseUserService;
	
	/**
	 * @Description <查询首页的所有信息>
	 * @return ModelAndView
	 * @param response
	 * @param request
	 */
//	@RequestMapping(value = "/goods/homeShow.do")
//	public ModelAndView homeShow(HttpServletResponse response,HttpServletRequest request,text t){
//		//String className = "越野车";
//		List<text> list = goodsService.goodsList(t);
//		ModelAndView md = new ModelAndView();
//		md.setViewName("home/home");
//		md.addObject("list", list);
//		return md;
////		ModelResult
//	}
//	
//	
//	@RequestMapping(value = "/goods/gotoAdd.do")
//	public ModelAndView gotoAdd(){
//		
//		ModelAndView md = new ModelAndView();
//		md.setViewName("home/selectPhone");
//		return md;
////		ModelResult
//	}
//	
//	/**
//	 * @Description <根据首页左侧类型查看商品信息>
//	 * @return ModelAndView
//	 * @param response
//	 * @param request
//	 */
//	@RequestMapping(value = "/goods/showGoods.do")
//	public void showGoods(HttpServletResponse response,HttpServletRequest request,String className){
		//List<Goods> list = goodsService.goodsList(className);
		//JsonUtil.printByJSON(response,list);
//	}
	
	
	
}
