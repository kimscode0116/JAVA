<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<meta name="viewport" content="width-device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/resources/main.css">
</head>
<body>
  <section class="wrap">
    <form action="insert_action" method="GET">
      <h3>
      <label> 이름 </label>
      <span>
        <input type="text" name="name" placeholder="name" />
      </span>
      </h3>
      <h3>
      <label> 나이 </label>
      <span>
        <input type="text" name="age" placeholder="age" />
      </span>
      </h3>
      <h3>
      <label> 성별 </label>
      <span>
        <input type="text" name="gender" placeholder="여자/남자 중 선택" />
      </span>
      </h3>
      <h3>
      <label> 아파트 </label>
      <span>
      <h4>${aptName}</h4>
        <input type="text" name="aptName" placeholder="아파트입력" />
      </span>
      </h3>
      <input type="submit" value="입력 완료"/>
    </form>
  </section>
	
</body>
</html>
