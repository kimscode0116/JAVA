package com.kopo.tenant;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

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
	public String mainMethod(Locale locale, Model model) {
		return "main";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {
		tenantDB db = new tenantDB();
		boolean isSuccess = db.creatdDB();
		if (isSuccess) {
			model.addAttribute("m1", "테이블이 생성되었습니다.");
		} else {
			model.addAttribute("m1", "DB오류.");
		}
		return "message";
	}

	@RequestMapping(value = "/newTenant", method = RequestMethod.GET)
	public String newTenant(Locale locale, Model model) {
		
		tenantDB db =  new tenantDB();
		String apartinfo = db.selectAPTnoTag();
		if(apartinfo != null) {
			model.addAttribute("aptName", apartinfo);
			return "insert";
		}
		model.addAttribute("aptName", "no apt here");
		return "insert";
	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertTenant(HttpServletRequest request, Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String inputName = request.getParameter("name");
		String stringAge = request.getParameter("age");
		int inputAge = Integer.parseInt(stringAge);
		String inputgender = request.getParameter("gender");
		
		//해당 부분에 aptName으로 쿼리를 실행시켜 아파트 idx를 가지고 오는 쿼리 작성예정
		//시간 부족하여 3-1까지만 제출하겠습니다 !
//		String aptName = request.getParameter("aptName");

		tenantDB db = new tenantDB();
		Tenant tenant = new Tenant(inputName, inputAge, inputgender);
		boolean isSuccess = db.insertDb(tenant);
		if (isSuccess) {
			model.addAttribute("m1", "신규 입주자 등록 완료");
		} else {
			model.addAttribute("m1", "등록 에러");
		}
		return "message";
	}

	@RequestMapping(value = "/tenantList", method = RequestMethod.GET)
	public String selectData(Locale locale, Model model) {

		tenantDB db = new tenantDB();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateMethod(Locale locale, Model model, @RequestParam("idx") int userIdx) {

		tenantDB db =  new tenantDB();
		Tenant resultData=db.detailsData(userIdx);
		if(resultData != null) {
			model.addAttribute("idx", resultData.idx);
			model.addAttribute("name", resultData.name);
			model.addAttribute("age", resultData.age);
			model.addAttribute("gender", resultData.gender);
			return "update";
		}
		model.addAttribute("m1", "error");
		return "message";
	}
	
	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("name") String upName, @RequestParam("age") int upAge,
			@RequestParam("gender") String upGender) {

		tenantDB db =  new tenantDB();
		Tenant tenant = new Tenant(idx, upName, upAge, upGender);		
		boolean isSuccess = db.updateData(tenant);
		
		if (isSuccess) {
			model.addAttribute("m1", "업데이트 완료");
			return "message";
		} else {
			model.addAttribute("m1", "update error");
			return "message";
		}
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteTable(Locale locale, Model model, @RequestParam("idx") int idx) {

		tenantDB db =  new tenantDB();
		Tenant selectTenant = db.detailsData(idx);
		boolean deleteTenantData = false;

		if (selectTenant != null) {
			deleteTenantData = db.deleteData(idx);
			
			if (deleteTenantData) {
				model.addAttribute("m1", "delete complete");
			} else {
				model.addAttribute("m1", "delete error");
			}
		} else {
			model.addAttribute("m1", "no data here");
		}
		return "message";
	}

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String tenantInfoData(Locale locale, Model model) {

		tenantDB db = new tenantDB();
		String tenantInfo = db.tenantInfoData();
		model.addAttribute("list", tenantInfo);
		return "infoList";
	}
	@RequestMapping(value = "/newApartment", method = RequestMethod.GET)
	public String newApartment(Locale locale, Model model) {
		return "insertApartment";
	}
	@RequestMapping(value = "/addApartment_action", method = RequestMethod.GET)
	public String addApartmentMethod(HttpServletRequest request, Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String aprtmentName = request.getParameter("aprtmentName");

		tenantDB db = new tenantDB();
		
		Apartment apt = new Apartment(aprtmentName);
		
		boolean isSuccess = db.insertAPT(apt);
		if (isSuccess) {
			model.addAttribute("m1", "아파트정보 등록완료");
		} else {
			model.addAttribute("m1", "등록 에러");
		}
		return "message";
	}
	
	@RequestMapping(value = "/apartmentList", method = RequestMethod.GET)
	public String selectAptMethod(Locale locale, Model model) {

		tenantDB db = new tenantDB();
		String htmlString = db.selectAPTData();
		model.addAttribute("m1", htmlString);
		return "message";
	}
	
	@RequestMapping(value = "/updateApt", method = RequestMethod.GET)
	public String updateApt(Locale locale, Model model, @RequestParam("idx") int idx) {

		tenantDB db = new tenantDB();
		Apartment aptInfo = db.aptDetailsData(idx);
		
		if(aptInfo != null) {
			model.addAttribute("idx", aptInfo.idx);
			model.addAttribute("aptName", aptInfo.aptName);
			return "updateApartment";
		}
		model.addAttribute("m1", "error");
		return "message";
	}
	
	@RequestMapping(value = "/upApartment_action", method = RequestMethod.GET)
	public String updateAptAction(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("aptName") String aptName) {

		tenantDB db =  new tenantDB();
		Apartment apt = new Apartment(idx, aptName);		
		boolean isSuccess = db.updateAptData(apt);
		
		if (isSuccess) {
			model.addAttribute("m1", "아파트 업데이트 완료");
			return "message";
		} else {
			model.addAttribute("m1", "update error");
			return "message";
		}
	}
	
	@RequestMapping(value = "/deleteApt", method = RequestMethod.GET)
	public String deleteAptData(Locale locale, Model model, @RequestParam("idx") int idx) {

		tenantDB db =  new tenantDB();
		Apartment aptInfo = db.aptDetailsData(idx);
		boolean deleteAptData = false;

		if (aptInfo != null) {
			deleteAptData = db.deleteAPTData(idx);
			
			if (deleteAptData) {
				model.addAttribute("m1", "아파트정보 삭제완료");
			} else {
				model.addAttribute("m1", "delete error");
			}
		} else {
			model.addAttribute("m1", "no data here");
		}
		return "message";
	}
}
