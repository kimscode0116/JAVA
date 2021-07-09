<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width-device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/resources/main.css">

</head>
<body>
	<section class="wrap">
		<table>
			<caption text-align="left">
			</caption>
			<colgroup>
				<col width="20%" />
				<col width="10%" />
				<col width="20%" />
				<col width="20%" />
			</colgroup>
			<thead>
				<tr>
					<th>입주자 전체 인원</th>
					<th>평균 나이</th>
					<th>여자 비율</th>
					<th>남자 비율</th>
					
				</tr>
			</thead>
			<tbody>${list}
			</tbody>
		</table>
	</section>
</body>
</html>