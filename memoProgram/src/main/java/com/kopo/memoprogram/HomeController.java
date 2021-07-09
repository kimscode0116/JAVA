package com.kopo.memoprogram;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {

		MemoDataBase db = new MemoDataBase();
		boolean isSuccess = db.creatdDB();
		if (isSuccess) {
			model.addAttribute("m1", "Complete");

		} else {
			model.addAttribute("m1", "DB ERROR");
		}
		return "message";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		//테이블이 있는지 확인해야함
		MemoDataBase db = new MemoDataBase();
		Memo memo = new Memo("1","1");

		boolean isSuccess = db.insertDb();
		return "insert";
	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.POST)
	public String insertAction(HttpServletRequest request, Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String inputTitle = request.getParameter("title");
		String inputContents = request.getParameter("contents");
		String userId = request.getParameter("id");
		String userpwd = request.getParameter("pwd");

		MemoDataBase db = new MemoDataBase();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String now = sdf.format(Calendar.getInstance().getTime());

		// 첫번째created 시간을 불러오는 메소드 추가
		Memo memo = new Memo(inputTitle, inputContents, now, now, userId, userpwd);
		boolean isSuccess = db.insertDb(memo);
		if (isSuccess) {
			model.addAttribute("m1", "posting complete");
		} else {
			model.addAttribute("m1", "posting error");
		}
		return "message";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectData(Locale locale, Model model) {

		MemoDataBase db = new MemoDataBase();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
//		try {
//			boolean isLogin = (Boolean) session.getAttribute("is_login");
//
//			if (isLogin) {
//				UserDB db = new UserDB();
//				String htmlString = db.selectData();
//				model.addAttribute("list", htmlString);
//				return "list";
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

	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updatedata(Locale locale, Model model, @RequestParam("idx") int idx) {

		MemoDataBase db = new MemoDataBase();
		Memo selectMemo = db.detailsData(idx);
		if (selectMemo != null) {
			model.addAttribute("idx", selectMemo.idx);
		}
		return "update_check";
	}

	@RequestMapping(value = "/check_action", method = RequestMethod.GET)
	public String updatecheck(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("check") String check) {

		MemoDataBase db = new MemoDataBase();
		Memo selectMemo = db.detailsData(idx);

		if (selectMemo != null && check.equals(selectMemo.pwd)) {
			model.addAttribute("idx", selectMemo.idx);
			model.addAttribute("title", selectMemo.title);
			model.addAttribute("content", selectMemo.content);
			model.addAttribute("created", selectMemo.created);
			model.addAttribute("id", selectMemo.id);
			model.addAttribute("pwd", selectMemo.pwd);
			return "update";
		} else {
			model.addAttribute("m1", "Passwords do not match");
			return "message";
		}
	}

	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("update_title") String upTitle, @RequestParam("update_contents") String upContents,
			@RequestParam("created") String created, @RequestParam("id") String id, @RequestParam("pwd") String pwd) {

		MemoDataBase db = new MemoDataBase();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String update_time = sdf.format(Calendar.getInstance().getTime());

		Memo memo = new Memo(idx, upTitle, upContents, created, update_time, id, pwd);
		boolean selectMemo = db.updateData(memo);
		if (selectMemo) {
			model.addAttribute("m1", "update complete");
			return "message";
		} else {
			model.addAttribute("m1", "update error");
			return "message";
		}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteTable(Locale locale, Model model, @RequestParam("idx") int idx) {

		MemoDataBase db = new MemoDataBase();
		Memo selectMemo = db.detailsData(idx);
		boolean deletMemoData = false;

		if (selectMemo != null) {
			deletMemoData = db.deleteData(idx);
			if (deletMemoData) {
				model.addAttribute("m1", "delete complete");
			} else {
				model.addAttribute("m1", "delete error");
			}
		}
		else {
			model.addAttribute("m1", "no data here");
		}
		return "message";
	}
}
