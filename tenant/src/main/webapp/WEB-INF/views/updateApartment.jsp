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
    <form action="upApartment_action" method="GET">
        	<input type="hidden" name="idx" value="${idx }" />
    
      <h3>
      <label> 아파트이름 </label>
      <span>
        <input type="text" name="aptName" placeholder="${aptName }" />
      </span>
      </h3>
      <h3>
      <input type="submit" value="입력 완료"/>
    </form>
  </section>
	
</body>
</html>
