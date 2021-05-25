<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>목록</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link rel='stylesheet' type='text/css' media='screen'
	href='${pageContext.request.contextPath}/resources/list.css'>
</head>
<body>
	<section class="wrap">
		<table>
			<thead>
				<tr>
					<th>idx</th>
					<th>이름</th>
					<th>중간고사점수</th>
					<th>기말고사점수</th>
					<th>생성일</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
			${list}
			</tbody>
		</table>
		<br></br>
		<button type="button" onclick="location.href='/project0521'">홈으로</button>
	</section>

</body>
</html>