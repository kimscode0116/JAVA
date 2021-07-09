package com.apartment.tenant;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainMethod(Locale locale, Model model) {
		return "main";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {
		tenantDB db =  new tenantDB();
		boolean isSuccess = db.creatdDB();
		if(isSuccess) {
			model.addAttribute("m1","테이블이 생성되었습니다.");
		}
		else {
			model.addAttribute("m1","DB오류.");
		}
		return "message";
	}
	
	
	@RequestMapping(value = "/newTenant", method = RequestMethod.GET)
	public String newTenant(Locale locale, Model model) {
		return "insert";
	}
	
	@RequestMapping(value = "/newTenant", method = RequestMethod.GET)
	public String insertTenant(HttpServletRequest request,Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String inputName = request.getParameter("name");
		String stringAge = request.getParameter("age");
		int inputAge = Integer.parseInt(stringAge);
		String inputgender = request.getParameter("gender");
		
		tenantDB db =  new tenantDB();
		Tenant tenant = new Tenant(inputName, inputAge, inputgender);
		boolean isSuccess = db.insertDb(tenant);
		if(isSuccess) {
			model.addAttribute("m1","신규 입주자 등록 완료");
		}
		else {
			model.addAttribute("m1","등록 에러");
		}
		return "message";
	}
	
	
}
