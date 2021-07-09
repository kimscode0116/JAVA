<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- 상단taglib 부분 spring 이미지 사용시 필요 -->
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
<meta charset="utf-8">
<title>Main</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/resources/insert.css">

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
					<a href="read">list</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="update">Edit Memo</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="delete">Delete Memo</a>
				</div>
			</li>
			<li>
				<div class="menu">
					<a href="create">Create Table</a>
				</div>
			</li>
		</ul>
	</nav>
	<div class="main_bottom">
		<header>
			<div>
				<a>게시물 작성 비밀번호를 입력하세요</a>
			</div>
		</header>
		<section class="data_insert">
			<form action="check_action" method="GET">
			
			<input type='hidden' name='idx' value="${idx }" />
			<input type='password' id='pw' 
			name='check' placeholder='비밀번호를 입력하세요'/> 
			</br>
			<input type='submit' value='확인' class='submit_btn'>
			</form>
		</section>
	</div>
</body>

</html>
