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
		<!-- 	<li>
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
		<header>
			<div>
				<h1>★환영합니다★</h1>
			</div>
		</header>
		<section class="data_insert">
			<form action="update_action" method="GET">
				<table width="100%">
					<tr>
						<input type="hidden" name="idx" value="${idx }" />
						<input type="hidden" name="pwd" value="${pwd }" />
						<input type="hidden" name="created" value="${created }" />
						
						<td>제목 수정</td>
						<td><input type="text" name="update_title" value="${title }"></td>
					</tr>

					<tr height="1" bgcolor="#dddddd">
						<td colspan="4"></td>
					</tr>

					<tr>
						<td>작성자</td>
						<td><input type="text" name="id" value="${id }"></td>
					</tr>

					<tr height="2" bgcolor="#dddddd">
						<td colspan="4"></td>
					</tr>
					<!-- 
					<tr>
						<td>비밀번호</td>
						<td><input type="password" name="pwd" placeholder="비밀번호" /></td>
					</tr>

					<tr height="2" bgcolor="#dddddd">
						<td colspan="4"></td>
					</tr> -->
					<tr>
						<td>내용</td>
						<td id="bottom"><textarea name="update_contents" cols="50"
								rows="30">
						${content}</textarea></td>
					</tr>

					<tr height="1" bgcolor="#dddddd">
						<td colspan="4"></td>
					</tr>

				</table>
				<input type="submit" value="글쓰기" class="submit_btn">
			</form>
		</section>
	</div>
</body>

</html>
