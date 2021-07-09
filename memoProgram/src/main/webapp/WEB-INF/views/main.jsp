<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- 상단taglib 부분 spring 이미지 사용시 필요 -->
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
<meta charset="utf-8">
<title>Main</title>
<meta name="viewport" content="width-device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/resources/main.css">

<!--Spring/html 사용시 아래 부분 삭제후 상단 주석 해제 -->
<!-- <link rel="stylesheet" href="main.css"> -->
<!-- spring/html 사용시 상기 부분 삭제 후 상단 주속 해 -->
</head>

<body>
	<header>
		<div class="header-wrap">
			<a href="/memoprogram">MemoKit</a>
		</div>
	</header>

	<nav>
		<ul>
			<li>
				<div class="menu">
					<a href="insert">New Memo</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="list">list</a>
				</div>
			</li>
			<!-- <li>
				<div class="menu">
					<a href="update">Edit Memo</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="delete">Delete Memo</a>
				</div>
			</li> -->
			<li>
				<div class="menu">
					<a href="create">Create Table</a>
				</div>
			</li>
		</ul>
	</nav>
	<div class="main_bottom">
	<h1>WELCOME</h1></br>
	<h1>YOUR</h1></br>
	<h1>MEMOKIT</h1></br>
	</div>
</body>
</html>
