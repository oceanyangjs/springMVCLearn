package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class UploadController {
	@RequestMapping("/uploadImage")
	public ModelAndView upload(HttpServletRequest request,HttpServletResponse response) {
		
	}
}
