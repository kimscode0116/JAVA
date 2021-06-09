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
	<header>
		<div class="logo-wrap">
			<img src="<spring:url value='/resources/logo1.png'/>"
				onclick="location.href='/project0608'">

			<!-- <a href="/project0607"><img src="logo1.png"></a> -->
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
	<!-- <div style="text-align: center;">
	<form action="list_Action" method="GET">
		이름 : <input type="text" name="userSearch" value="" /> 
		<input type="submit" value="검색" />
	</form> 
	</div> -->
	<section class="wrap">
		<table>
			<thead>
				<tr>
					<th>idx</th>
					<th>id</th>
					<th>pwd</th>
					<th>name</th>
					<th>birthday</th>
					<th>address</th>
					<th>created</th>
					<th>updated</th>
					<th>edit</th>
				</tr>
			</thead>
			<tbody>${list}
			</tbody>
		</table>
		<br />
		<div style="text-align: center;">
			<button type="button" onclick="location.href='/project0601'">홈으로</button>
		</div>
	</section>

</body>
</html>