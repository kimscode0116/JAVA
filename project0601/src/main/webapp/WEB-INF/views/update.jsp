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
</head>

<body>
	<header>
		<div class="logo-wrap">
			<img src="<spring:url value='/resources/mainlogo.png'/>"
				onclick="location.href='/project0601'">
		</div>
	</header>
	<section class="wrap">

		<form action="update_action" method="GET">
			<h3>
				<label> 기존 아이디 </label> <input type="text" name="update_id" placeholder="아이디를 입력하세요" />
			</h3>
			<h3>
				<label> 기존 비밀번호 </label> <input type="password" name="update_pwd" placeholder="비밀번호를 입력하세요" />
			</h3>
			<h3>
				<label> 기존 비밀번호 </label> <input type="password" name="update_pwd" placeholder="비밀번호를 입력하세요" />
			</h3>
			
			<input type="submit" value="입력 완료" />
		</form>
	</section>
</body>

</html>
