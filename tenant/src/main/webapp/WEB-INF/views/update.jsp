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
    <form action="update_action" method="GET">
    	<input type="hidden" name="idx" value="${idx }" />
    
      <h3>
      <label> 이름 </label>
      <span>
        <input type="text" name="name" value="${name }" />
      </span>
      </h3>
      <h3>
      <label> 나이 </label>
      <span>
        <input type="text" name="age" value="${age }" />
      </span>
      </h3>
      <h3>
      <label> 성별 </label>
      <span>
        <input type="text" name="gender" value="${gender }" />
      </span>
      </h3>
      <input type="submit" value="수정 완료"/>
    </form>
  </section>
	
</body>
</html>
