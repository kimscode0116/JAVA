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
>
</head>
<body>
	<header>
		<div class="logo-wrap">
			<img src="<spring:url value='/resources/logo1.png'/>"
				onclick="location.href='/project0608'">
		</div>
		<div class="instagram-wrap">
			<a href="https://www.instagram.com/kkeehhh/" target='_blank'> <img
				src="<spring:url value='/resources/instagram_logo.png'/>">
			</a>
		</div>
	</header>
	<nav>
		<hr width="70%">
		<ul>
			<li>
				<div class="menu">
					<a href="login">LOGIN</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="insert">SIGNUP</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="update">EDIT PROFILE</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="list">LIST</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="create">CREATE</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="update2">비밀번호변경</a>
				</div>
			</li>
		</ul>
		<hr width="70%">
	</nav>
	<section class="login_wrap">
		<form action="login_action" method="GET">
			<h3>
				<label> 아이디 </label> <input type="text" name="id" id="id"
					placeholder="아이디를 입력하세요" />
			</h3>
			<h3>
				<label> 비밀번호 </label> <input type="password" name="pwd" id="pwd"
					placeholder="비밀번호를 입력하세요" />
			</h3>
			<input type="submit" value="입력 완료" />
		</form>
	</section>
</body>

</html>
