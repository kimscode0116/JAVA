<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<meta name="viewport" content="width-device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/resources/main.css">
</head>
<body>
	<form>
		<ul class="top_menu">
			<li><a href="create"><p>테이블생성</p></a></li>
			<li><a href="newTenant"><p>입주자등록</p></a></li>
			<li><a href="tenantList"><p>입주자목록</p></a></li>
			<li><a href="info"><p>입주자통계</p></a></li>
			<li><a href="newApartment"><p>새로운아파트등록</p></a></li>
			<li><a href="apartmentList"><p>아파트 목록보기</p></a></li>
		</ul>
	</form>

</body>
</html>
