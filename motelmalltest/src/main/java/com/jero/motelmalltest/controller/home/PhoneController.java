package com.jero.motelmalltest.controller.home;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jero.motelmalltest.po.home.Phone;
import com.jero.motelmalltest.po.home.text;
import com.jero.motelmalltest.service.home.IGoodsService;
import com.jero.motelmalltest.service.home.IPhoneService;
import com.jero.motelmalltest.service.home.IPhoneUpdateService;


/**
 * @Description <获取首页信息>
 * @author  郑启阳
 * @date  2016年5月26日 下午6:28:53
 * @version   1.0
 */
@Controller
@RequestMapping(value = "/home")
public class PhoneController {
	
	
	@Autowired
	IPhoneService phoneservice;
	
	@Autowired
	private IGoodsService goodsService;
	
	@Autowired
	private IPhoneUpdateService phoneupdateService;
	
	/**
	 * 
	 * @param phone
	 * @return
	 */
	@RequestMapping(value = "/goods/getPhone.do")
	public ModelAndView getPhone(Phone phone){	
		
		int in= phoneservice.up(phone);
		if(in>0){
			System.out.println("插入成功！");
		}else{
			System.out.println("插入失败！");
		}
		return new ModelAndView("redirect:homeShow.do");
	
	}
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/goods/show.do")	
	public ModelAndView show(){
		
		ModelAndView mod = new ModelAndView();
		mod.setViewName("home/insertPhone");
		return mod;
		
	}
	/**
	 * 
	 * @param response
	 * @param request
	 * @param t
	 * @return
	 */
	@RequestMapping(value = "/goods/homeShow.do")
	public ModelAndView homeShow(HttpServletResponse response,HttpServletRequest request,text t){
		//String className = "越野车";
		List<text> list = goodsService.goodsList(t);
		ModelAndView md = new ModelAndView();
		md.setViewName("home/home");
		md.addObject("list", list);
		return md;
//		ModelResult
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/goods/gotoSelect.do")
	public ModelAndView gotoAdd(){
		
		ModelAndView md = new ModelAndView();
		md.setViewName("home/selectPhone");
		return md;
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
		//List<Goods> list = goodsService.goodsList(className);
		//JsonUtil.printByJSON(response,list);
	}
	
	
	@RequestMapping(value = "/goods/update.do")
	public ModelAndView update(Phone phone){
		
		int res = phoneupdateService.upDate(phone);
		if(res>0){			
		}
		return new ModelAndView("redirect:show.do");
	}
	@RequestMapping(value = "/goods/updateshow.do")
	public ModelAndView updateshow(){
		ModelAndView md = new ModelAndView();
		md.setViewName("home/Update");
		return md;
	}
	

}
