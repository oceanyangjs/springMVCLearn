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
		//add()�����ġ��������͡����Զ�תС�շ岢���뵽 ModelAndView ����Ϊ addObject() �ġ���һ�����������൱�� addObject("theFirstParam", product);
		//���ϣ�addObject ���һ�������Ǹ��� add() �Ĳ��������Զ�ת��С�շ��������ڶ��������� add() �Ĳ�������

		return mav;
	}
}
