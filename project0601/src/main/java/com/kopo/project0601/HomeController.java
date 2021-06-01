package com.kopo.project0601;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

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
			model.addAttribute("m1", "로그인 페이지로 이동해주세요.");

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
	public String insertAction(Locale locale, Model model, 
			@RequestParam("id") String id,
			@RequestParam("pwd") String pwd, 
			@RequestParam("name") String name, 
			@RequestParam("birthday") String birthday,
			@RequestParam("address") String address) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());
		People people = new People(id, pwd, name, birthday, address, now, now);
		UserDB db = new UserDB();
		boolean isSuccess = db.insertDb(people);
		model.addAttribute("m1", "로그인 정보가 입력되었습니다.");
		return "message";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectData(Locale locale, Model model) {

		UserDB db = new UserDB();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateTable(Locale locale, Model model, @RequestParam("idx") int idx) {
		UserDB db = new UserDB();
		People selectPeople = db.detailsData(idx);
		if (selectPeople != null) {
			model.addAttribute("idx", selectPeople.idx);
			model.addAttribute("update_id", selectPeople.id);
			model.addAttribute("update_pwd", selectPeople.pwd);
			model.addAttribute("update_name", selectPeople.name);
			model.addAttribute("update_birthday", selectPeople.birthday);
			model.addAttribute("update_address", selectPeople.address);
		}
		return "update";
	}
	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, 
			@RequestParam("idx") int idx,
			@RequestParam("update_id") String upId, 
			@RequestParam("update_pwd") String upPwd,
			@RequestParam("update_name") String upName, 
			@RequestParam("update_birthday") String upBirthday, 
			@RequestParam("update_address") String upAddress) {
		UserDB db = new UserDB();
		
		People selectPeople = db.detailsData(idx);
		String firstCreatedTime = selectPeople.created;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());
		
		People people = new People(idx, upId, upPwd, upName, upBirthday, upAddress,firstCreatedTime, now);
		boolean isSuccess = db.updateData(people);
		if(isSuccess) {
		model.addAttribute("m2", "학생 정보가 수정되었습니다.");
		}
		else model.addAttribute("m2", "DB ERROR");
		return "message";
	}
	
}
