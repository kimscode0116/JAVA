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
//		DBCommon<Student> db = new DBCommon<Student>("C:/tomcat/Student0521.db", "student");
//		db.createTable(new Student());
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
//		int stuInputMidScore = Integer.parseInt(smidScore);
//		int stuInputFinScore = Integer.parseInt(sfinScore);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String now = sdf.format(Calendar.getInstance().getTime());
//		DBCommon<Student> db = new DBCommon<Student>("C:/tomcat/Student0521.db", "student");
//		db.insertData(new Student(name, stuInputMidScore, stuInputFinScore, now));

		double stuInputMidScore = Double.parseDouble(smidScore);
		double stuInputFinScore = Double.parseDouble(sfinScore);

		userDB db = new userDB();
		db.insertData(name, stuInputMidScore, stuInputFinScore);
		model.addAttribute("m1", "데이터가 입력되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectData(Locale locale, Model model) {

//		DBCommon<Student> db = new DBCommon<Student>("C:/tomcat/Student0521.db", "student");
//		ArrayList<Student> student = db.selectArrayList(new Student());

//		String htmlString = "";
//		for (int i = 0; i < student.size(); i++) {
//			htmlString = htmlString + "<tr>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).idx;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).name;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).middleExam;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).finalExam;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).time;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + "<a href = 'update?idx=" + student.get(i).idx + "'>수정</a>";
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + "<a href = 'delete?idx=" + student.get(i).idx + "'>삭제</a>";
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "</tr>";
//		}
		userDB db = new userDB();
		
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateTable(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<Student> db = new DBCommon<Student>("C:/tomcat/Student0521.db", "student");
		Student selectStudent = db.detailsData(new Student(), idx);
		
//		userDB db = new userDB();
//		String selectStudent = db.updateDetailsData(idx);
		
		if (selectStudent != null) {
			model.addAttribute("idx", selectStudent);
			model.addAttribute("student_name", selectStudent.name);
			model.addAttribute("middleScore", selectStudent.middleExam);
			model.addAttribute("finalScore", selectStudent.finalExam);
		}
		return "update";
	}

	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("update_name") String upName, @RequestParam("update_mid") String upMidScore,
			@RequestParam("update_fin") String upFinScore) {
		int newMidScore = Integer.parseInt(upMidScore);
		int newFinScore = Integer.parseInt(upFinScore);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());

		DBCommon<Student> db = new DBCommon<Student>("C:/tomcat/Student0521.db", "student");
		db.updateData(new Student(idx, upName, newMidScore, newFinScore, now));
		model.addAttribute("m2", "학생 정보가 수정되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteTable(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<Student> db = new DBCommon<Student>("C:/tomcat/Student0521.db", "student");
		Student selectStudent = db.detailsData(new Student(), idx);

		if (selectStudent != null) {
			db.deleteData(selectStudent);
		}
		model.addAttribute("m3", "학생 정보가 삭제되었습니다.");
		return "message";
	}
}
