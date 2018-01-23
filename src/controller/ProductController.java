package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;

@Controller
public class ProductController {
	@RequestMapping("/addProduct")
	public ModelAndView add(Product aaaa) throws Exception {
		ModelAndView mav = new ModelAndView("showProduct");
		//add()方法的【参数类型】会自动转小驼峰并加入到 ModelAndView 中作为 addObject() 的【第一个参数】，相当于 addObject("theFirstParam", product);
		//综上：addObject 里第一个参数是根据 add() 的参数类型自动转成小驼峰命名，第二个参数是 add() 的参数名。

		return mav;
	}
}
