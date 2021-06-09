<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
<meta charset="utf-8">
<title>Main</title>
<meta name="viewport" content="width-device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/resources/insert.css">
<script>
$(document).on('click','#submit_button', function(event) {
	var pwd1 = $('input[name="new_pwd"]').val();
	var pwd2 = $('input[name="new_pwd_c2"]').val();
	if(pwd1 != pwd2) {
		alert("패스워드가 다릅니다.")
	} else {
		$('#update_form').submit();
	}
});
</script>

</head>

<body>
	<header>
		<div class="logo-wrap">
			<img src="<spring:url value='/resources/mainlogo.png'/>"
				onclick="location.href='/project0608'">
		</div>
	</header>
	<section class="wrap">
		<form action="update_action" method="GET">
			<input type="hidden" name="idx" value="${idx }" />
			<h3>
				<label> 새 비밀번호 </label> <input type="password" name="new_pwd"
					placeholder="아이디를 입력하세요" />
			</h3>
			<h3>
				<label> 새 비밀번호 확인</label> <input type="password" name="new_pwd_c2"
					placeholder="아이디를 입력하세요" />
			</h3>
			<h3>
				<label> 이름 </label> <input type="text" name="update_name"
					vaule="${original_Name }" />
			</h3>
			<h3>
				<label> 주소 </label> <input type="text" name="update_address"
					vaule="${original_address }" />
			</h3>
			<input type="submit" value="입력 완료" />
		</form>
	</section>
</body>

</html>
