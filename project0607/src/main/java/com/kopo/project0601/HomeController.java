package com.kopo.project0601;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {

		UserDB db = new UserDB();
		boolean isSuccess = db.creatdDB();
		if (isSuccess) {
			model.addAttribute("m1", "테이블이 생성되었습니다.");

		} else {
			model.addAttribute("m1", "DB ERROR");
		}
		return "message";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		return "insert";
	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(HttpServletRequest request, Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String address = request.getParameter("address");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());
		People people = new People(id, pwd, name, birthday, address, now, now);
		UserDB db = new UserDB();
		boolean isSuccess = db.insertDb(people);
		if (isSuccess == true) {
			model.addAttribute("m1", "로그인 정보가 입력되었습니다.");
		} else if (isSuccess == false) {
			model.addAttribute("m1", "중복된 id가 존재합니다.");
		}
		return "message";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectData(HttpServletRequest request, Locale locale, Model model ) {
		HttpSession session = request.getSession();
		try {
			boolean isLogin = (Boolean) session.getAttribute("is_login");

			if (isLogin) {
				UserDB db = new UserDB();
				String htmlString = db.selectData();
				model.addAttribute("list", htmlString);
				return "list";

			} else {
				model.addAttribute("m1", "로그인이 필요합니다");
				return "message";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("m1", "로그인 에러");
			return "message";
		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginMethod(Locale locale, Model model) {
		return "login";
	}

	@RequestMapping(value = "/login_action", method = RequestMethod.GET)
	public String loginAction(HttpServletRequest request, Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		People people = new People(id, pwd);
		UserDB db = new UserDB();
		boolean isSuccess = db.loginDB(people);
		
		if (isSuccess) {
			HttpSession session = request.getSession();
			HttpSession session2 = request.getSession();

			session.setAttribute("is_login", true);
			session.setAttribute("loin_id", id);
			session.setAttribute("loin_pwd", pwd);

			
			return "redirect:/";
		}
		System.out.println("오류");
		return "redirect:/login";
	}

//	@RequestMapping(value = "/update", method = RequestMethod.GET)
//	public String updateTable(Locale locale, Model model, @RequestParam("idx") int idx) {
//		UserDB db = new UserDB();
//		People selectPeople = db.detailsData(idx);
//		if (selectPeople != null) {
//			model.addAttribute("idx", selectPeople.idx);
//			model.addAttribute("update_id", selectPeople.id);
//			model.addAttribute("update_pwd", selectPeople.pwd);
//			model.addAttribute("update_name", selectPeople.name);
//			model.addAttribute("update_birthday", selectPeople.birthday);
//			model.addAttribute("update_address", selectPeople.address);
//		}
//		return "update";
//	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateTable(HttpServletRequest request, Locale locale, Model model) {
		HttpSession session = request.getSession();
		try {
			boolean isLogin = (Boolean) session.getAttribute("is_login");
//			String id = (Stirng) session.getAttribute("login_id");

			if (isLogin) {			
				return "update";
			} else {
				model.addAttribute("m1", "로그인이 필요합니다");
				return "message";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("m1", "로그인 에러");
			return "message";
		}
	}

//
//	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
//	public String updateAction(HttpServletRequest request, Locale locale, Model model, @RequestParam("id") String id ) {
//		HttpSession session2 = request.getSession();
//		try {
//			String isLogin = (String) session2.getAttribute(id);
//
//			if (isLogin != null) {
//				UserDB db = new UserDB();
//				People selectPeople = db.detailsData(id);
//				String firstCreatedTime = selectPeople.created;
//
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				String now = sdf.format(Calendar.getInstance().getTime());
//		
//				People people = new People(idx, upId, upPwd, upName, upBirthday, upAddress, firstCreatedTime, now);
//				boolean isSuccess = db.updateData(people);
//				if (isSuccess) {
//					model.addAttribute("m2", "학생 정보가 수정되었습니다.");
//				} else
//					model.addAttribute("m2", "DB ERROR");
//				return "message";
//
//
//			} else {
//				model.addAttribute("m1", "로그인이 필요합니다");
//				return "message";
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			model.addAttribute("m1", "로그인 에러");
//			return "message";
//		}
//	}

}
