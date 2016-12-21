package com.jero.motelmalltest.controller.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jero.motelmalltest.po.home.Phone;
import com.jero.motelmalltest.service.home.IPhoneDeleteService;

@Controller
@RequestMapping(value = "/home")
public class PhoneController {
	@Autowired
	private IPhoneDeleteService iPhoneDeleteService;

	@RequestMapping(value = "/goods/delete.do")
	public ModelAndView delete(Phone phone) {
		// ModelAndView modelAndView=new ModelAndView();
		iPhoneDeleteService.delete(phone);
		// modelAndView.setViewName(viewName);
		return new ModelAndView("redirect:homeShow.do");
		// return modelAndView;
	}

	@RequestMapping(value = "/goods/deleteshow.do")
	public ModelAndView deleteshow() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home/delete");
		return modelAndView;

	}

}
