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
@RequestMapping(value = "/home")
public class HomeController {
	private Logger log = Logger.getLogger(getClass());
	
	@Autowired
	private IGoodsService goodsService;
	@Autowired
	private IInfoPublishService infoPublishService;
	@Autowired
	private IForumPostingService forumPostingService;
	@Autowired
	private IEnterpriseUserService enterpriseUserService;
	
	/**
	 * @Description <查询首页的所有信息>
	 * @return ModelAndView
	 * @param response
	 * @param request
	 */
	@RequestMapping(value = "/goods/homeShow.do")
	public ModelAndView homeShow(HttpServletResponse response,HttpServletRequest request,String className){
		//String className = "越野车";
		List<Goods> list = goodsService.goodsList(className);
		String jsonList = JsonObjectUtil.printByJSON(list);
		String classNameQ = "头盔";
		List<Goods> listQ = goodsService.goodsList(classNameQ);
		List<Goods> listAll = goodsService.goodsListAll();
		System.out.println(list);
		String infoType = "行业之声";
		String infoType1 = "金融政策";
		String infoType2 = "主题活动";
		String infoType3 = "新品上市";
		String infoType4 = "未来源流";
		String infoType5 = "专题报道";
		List<InfoPublish> listInfoPublish = infoPublishService.infoPublishList(infoType);
		List<InfoPublish> listInfoPublish1 = infoPublishService.infoPublishList(infoType1);
		List<InfoPublish> listInfoPublish2 = infoPublishService.infoPublishList(infoType2);
		List<InfoPublish> listInfoPublish3 = infoPublishService.infoPublishList(infoType3);
		List<InfoPublish> listInfoPublish4 = infoPublishService.infoPublishList(infoType4);
		List<InfoPublish> listInfoPublish5 = infoPublishService.infoPublishList(infoType5);
		
		List<ForumPosting> listForumPosting = forumPostingService.forumPostingList();
		
		List<EnterpriseUser> listEnterpriseUser = enterpriseUserService.enterpriseUserList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home/home");
		modelAndView.addObject("jsonList",jsonList);
		modelAndView.addObject("listQ",listQ);
		modelAndView.addObject("listAll",listAll);
		modelAndView.addObject("listInfoPublish",listInfoPublish);
		modelAndView.addObject("listInfoPublish1",listInfoPublish1);
		modelAndView.addObject("listInfoPublish2",listInfoPublish2);
		modelAndView.addObject("listInfoPublish3",listInfoPublish3);
		modelAndView.addObject("listInfoPublish4",listInfoPublish4);
		modelAndView.addObject("listInfoPublish5",listInfoPublish5);
		modelAndView.addObject("listForumPosting",listForumPosting);
		modelAndView.addObject("listEnterpriseUser",listEnterpriseUser);
		return modelAndView;
//		ModelResult
	}
	
	/**
	 * @Description <根据首页左侧类型查看商品信息>
	 * @return ModelAndView
	 * @param response
	 * @param request
	 */
	@RequestMapping(value = "/goods/showGoods.do")
	public void showGoods(HttpServletResponse response,HttpServletRequest request,String className){
		List<Goods> list = goodsService.goodsList(className);
		JsonUtil.printByJSON(response,list);
	}
	
	
	
}
