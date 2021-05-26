package com.kopo.project0521;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {

		userDB db = new userDB();
		db.createTable();
		model.addAttribute("m1", "학생 테이블이 생성되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertToTable(Locale locale, Model model) {
		return "insert";
	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertmethod(Locale locale, Model model, @RequestParam("student_name") String name,
			@RequestParam("midScore") String smidScore, @RequestParam("finScore") String sfinScore) {

		double stuInputMidScore = Double.parseDouble(smidScore);
		double stuInputFinScore = Double.parseDouble(sfinScore);

		userDB db = new userDB();
		db.insertData(name, stuInputMidScore, stuInputFinScore);
		model.addAttribute("m1", "데이터가 입력되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectData(Locale locale, Model model) {

		userDB db = new userDB();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateTable(Locale locale, Model model, @RequestParam("idx") int idx) {

		userDB db = new userDB();
		Student selectStudent = db.detailsData(idx);

		if (selectStudent != null) {
			model.addAttribute("idx", selectStudent.idx);
			model.addAttribute("student_name", selectStudent.name);
			model.addAttribute("middleScore", selectStudent.middleExam);
			model.addAttribute("finalScore", selectStudent.finalExam);
			model.addAttribute("time", selectStudent.time);
		}
		return "update";
	}

	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("update_name") String upName, @RequestParam("update_mid") String upMidScore,
			@RequestParam("update_fin") String upFinScore) {
		userDB db = new userDB();

		double stuInputMidScore = Double.parseDouble(upMidScore);
		double stuInputFinScore = Double.parseDouble(upFinScore);

		db.updateData(idx, upName, stuInputMidScore, stuInputFinScore);

		model.addAttribute("m2", "학생 정보가 수정되었습니다.");
		return "message";
	}

}
