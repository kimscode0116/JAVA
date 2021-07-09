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
	href="${pageContext.request.contextPath}/resources/list.css">
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
		<section class="wrap">
			<table>
				<caption text-align="left"><a>LIST</a></caption>
				<colgroup>
					<col width="6%" />
					<col width="15%" />
					<col width="30%" />
					<col width="10%" />
					<col width="10%" />
					<col width="10%" />
					<col width="7%" />
					<col width="7%" />
				</colgroup>
				<thead>
					<tr>
						<th>no</th>
						<th>제목</th>
						<th>내용</th>
						<th>작성일시</th>
						<th>수정일시</th>
						<th>작성자</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>${list}${list2}
				</tbody>
			</table>
			<button type="button" onClick="location.href='insert'">글쓰기</button>
		</section>
	</div>
</body>

</html>
