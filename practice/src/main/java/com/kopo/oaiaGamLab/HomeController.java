package com.kopo.oaiaGamLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// 이부분 로그인시, 유저로그인, 관리자로그인 창 다르게
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(HttpServletRequest request, Locale locale, Model model) {
		HttpSession session = request.getSession();

		Boolean is_login = (Boolean) session.getAttribute("is_login");
		String login_id = (String) session.getAttribute("login_id");

		if (is_login == null) {
			model.addAttribute("userOradmin", "<a href=\"login\">로그인</a> <a href=\"signup\">회원가입</a>");
			model.addAttribute("gameCheck1", "location.href='/oaiaGameLab/game_NoScore'");
			model.addAttribute("gameCheck2", "location.href='/oaiaGameLab/game_NoScore_space'");
			return "main";
		} else if (login_id.length() == 9 && login_id.split("_")[0].equals("admin")) {
			model.addAttribute("userOradmin",
					"<a href=\"logout\">관리자 로그아웃</a>  <a href=\"admininfo_pwd\">관리자 정보 수정</a> <a href=\"userList\">회원목록 조회</a>");
			model.addAttribute("gameCheck1", "location.href='/oaiaGameLab/game_adminScore'");
			model.addAttribute("gameCheck2", "location.href='/oaiaGameLab/game_adminScore_space'");

			model.addAttribute("m1", login_id + "님의 관리자모드");
			return "main";
		} else
			model.addAttribute("userOradmin", "<a href=\"logout\">로그아웃</a><a href=\"myinfo_pwd\">개인정보수정</a>\n");
		model.addAttribute("gameCheck1", "location.href='/oaiaGameLab/game_userScore'");
		model.addAttribute("gameCheck2", "location.href='/oaiaGameLab/game_userScore_space'");

		return "main";
	}

	@RequestMapping(value = "/createDB", method = RequestMethod.GET)
	public String createTable(HttpServletRequest request, Locale locale, Model model) {
		AdminDB db = new AdminDB();
		HttpSession session = request.getSession();

		Boolean is_login = (Boolean) session.getAttribute("is_login");
		String login_id = (String) session.getAttribute("login_id");

		boolean isSuccess = db.createDB();
		if (isSuccess) {
			model.addAttribute("m1", "Complete");
		} else {
			model.addAttribute("m1", "Already exist");
		}

		if (is_login == null) {
			model.addAttribute("userOradmin", "<a href=\"login\">로그인</a> <a href=\"signup\">회원가입</a>");
		} else if (login_id.length() == 9 && login_id.split("_")[0].equals("admin")) {
			model.addAttribute("userOradmin",
					"<a href=\"logout\">관리자 로그아웃</a>  <a href=\"admininfo_pwd\">관리자 정보 수정</a> <a href=\"userList\">회원목록 조회</a>");
		} else
			model.addAttribute("userOradmin", "<a href=\"logout\">로그아웃</a><a href=\"myinfo_pwd\">개인정보수정</a>\n");
		return "message";
	}


	// 게임실행
	// 랭킹 페이지
	@RequestMapping(value = "/ranking", method = RequestMethod.GET)
	public String ranking(HttpServletRequest request, Locale locale, Model model) {

		HttpSession session = request.getSession();
		GameDB db = new GameDB();
		String ranking123 = db.rank123Data();
		String htmlString = db.rankData();

		Boolean is_login = (Boolean) session.getAttribute("is_login");
		String login_id = (String) session.getAttribute("login_id");

		if (is_login == null) {
			model.addAttribute("userOradmin", "<a href=\"login\">로그인</a> <a href=\"signup\">회원가입</a>");
			model.addAttribute("ranking123", ranking123);
			model.addAttribute("rankList", htmlString);
			return "ranking";
		} else if (login_id.length() == 9 && login_id.split("_")[0].equals("admin")) {
			model.addAttribute("userOradmin",
					"<a href=\"logout\">관리자 로그아웃</a>  <a href=\"admininfo_pwd\">관리자 정보 수정</a> <a href=\"userList\">회원목록 조회</a>");
			model.addAttribute("m1", login_id + "님의 관리자모드");
			model.addAttribute("ranking123", ranking123);
			model.addAttribute("rankList", htmlString);
			return "ranking";
		} else
			model.addAttribute("userOradmin", "<a href=\"logout\">로그아웃</a><a href=\"myinfo_pwd\">개인정보수정</a>\n");
		model.addAttribute("ranking123", ranking123);
		model.addAttribute("rankList", htmlString);
		return "ranking";
	}

	// contactus부분
	@RequestMapping(value = "/contactus", method = RequestMethod.GET)
	public String contactus(HttpServletRequest request, Locale locale, Model model) {
		HttpSession session = request.getSession();

		Boolean is_login = (Boolean) session.getAttribute("is_login");
		String login_id = (String) session.getAttribute("login_id");

		if (is_login == null) {
			model.addAttribute("userOradmin", "<a href=\"login\">로그인</a> <a href=\"signup\">회원가입</a>");
			return "contactus";
		} else if (login_id.length() == 9 && login_id.split("_")[0].equals("admin")) {
			model.addAttribute("userOradmin",
					"<a href=\"logout\">관리자 로그아웃</a>  <a href=\"admininfo_pwd\">관리자 정보 수정</a> <a href=\"userList\">회원목록 조회</a>");
			return "contactus";
		} else
			model.addAttribute("userOradmin", "<a href=\"logout\">로그아웃</a><a href=\"myinfo_pwd\">개인정보수정</a>\n");
		return "contactus";
	}

	// contactus부분
	@RequestMapping(value = "/Aboutus", method = RequestMethod.GET)
	public String Aboutus(HttpServletRequest request, Locale locale, Model model) {
		HttpSession session = request.getSession();

		Boolean is_login = (Boolean) session.getAttribute("is_login");
		String login_id = (String) session.getAttribute("login_id");

		if (is_login == null) {
			model.addAttribute("userOradmin", "<a href=\"login\">로그인</a> <a href=\"signup\">회원가입</a>");
			return "Aboutus";
		} else if (login_id.length() == 9 && login_id.split("_")[0].equals("admin")) {
			model.addAttribute("userOradmin",
					"<a href=\"logout\">관리자 로그아웃</a>  <a href=\"admininfo_pwd\">관리자 정보 수정</a> <a href=\"userList\">회원목록 조회</a>");
			return "Aboutus";
		} else
			model.addAttribute("userOradmin", "<a href=\"logout\">로그아웃</a><a href=\"myinfo_pwd\">개인정보수정</a>\n");
		return "Aboutus";
	}
}
