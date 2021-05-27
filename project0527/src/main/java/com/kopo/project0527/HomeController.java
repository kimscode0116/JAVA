package com.kopo.project0527;

import java.util.Arrays;
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

	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {

		userDB db = new userDB();
		db.createTable();
		model.addAttribute("m1", "직원 목록이 시작되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertToTable(Locale locale, Model model) {
		return "insert";
	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertmethod(Locale locale, Model model, 
			@RequestParam("name") String name,
			@RequestParam("gender") String ursGender, 
			@RequestParam("address") String ursAddress, 
			@RequestParam("department") String ursDepartment) {

		userDB db = new userDB();
		db.insertData(name, ursGender, ursAddress, ursDepartment);
		model.addAttribute("m1", "직원정보가 입력되었습니다.");
		return "message";
	}

//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	public String selectData(Locale locale, Model model) {
//
//		userDB db = new userDB();
//		String htmlString = db.selectData();
//		model.addAttribute("list", htmlString);
//		return "list";
//	}
//	, @RequestParam("userSearch") String name
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectData(Locale locale, Model model) {
		return "list";
	}
	
	@RequestMapping(value = "/list_Action", method = RequestMethod.GET)
	public String listAction(Locale locale, Model model, 
			@RequestParam("userSearch") String name) {

		String usrName = "%"+name+"%";	
		userDB db = new userDB();
		String htmlString = db.searchData(usrName);
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateTable(Locale locale, Model model, @RequestParam("idx") int idx) {

		userDB db = new userDB();
		Employee selectEmployee = db.detailsData(idx);
		if (selectEmployee != null) {
			model.addAttribute("idx", selectEmployee.idx);
			model.addAttribute("update_name", selectEmployee.name);
			model.addAttribute("update_gender", selectEmployee.gender);
			model.addAttribute("update_address", selectEmployee.address);
			model.addAttribute("update_department", selectEmployee.department);
		}
		return "update";
	}

	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, 
			@RequestParam("idx") int idx,
			@RequestParam("update_name") String upName, 
			@RequestParam("update_gender") String upgender,
			@RequestParam("update_address") String upAddress, 
			@RequestParam("update_department") String upDepartment) {
		
		userDB db = new userDB();		
		db.updateData(idx, upName, upgender, upAddress, upDepartment);

		model.addAttribute("m2", "학생 정보가 수정되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteTable(Locale locale, Model model, @RequestParam("idx") int idx) {

		userDB db = new userDB();
		Employee selectEmployee = db.detailsData(idx);
		if (selectEmployee != null) {
			db.deleteData(idx);
		}
		model.addAttribute("m3", "학생 정보가 삭제되었습니다.");
		return "message";
	}

}
