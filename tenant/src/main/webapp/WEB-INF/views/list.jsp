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
				<a> LIST</a>
			</caption>
			<colgroup>
				<col width="6%" />
				<col width="25%" />
				<col width="40%" />
				<col width="30%" />
				<col width="16%" />
			</colgroup>
			<thead>
				<tr>
					<th>no</th>
					<th>이름</th>
					<th>나이</th>
					<th>성별</th>
				</tr>
			</thead>
			<tbody>${list}
			</tbody>
		</table>
	</section>
</body>
</html>