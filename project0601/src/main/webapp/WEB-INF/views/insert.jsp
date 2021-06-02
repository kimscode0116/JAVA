<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <meta charset="utf-8">
  <title>Main</title>
  <meta name="viewport" content="width-device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/insert.css">
</head>

<body>
   <header>
    <div class="logo-wrap">
				<img src="<spring:url value='/resources/mainlogo.png'/>"  onclick="location.href='/project0601'">
			</div>
  </header>
  <section class="wrap">
    <form action="insert_action" method="get">
      <h3>
      <label> 아이디 </label>
      <span>
        <input type="text" name="id" placeholder="UserID" />
      </span>
      </h3>
      <h3>
      <label> 비밀번호 </label>
      <span>
        <input type="password" name="pwd" placeholder="UserPwd" />
      </span>
      </h3>
      <h3>
      <label> 이름 </label>
      <span>
        <input type="text" name="name" placeholder="NAME" />
      </span>
      </h3>
      <h3>
       <label> 생년월일 </label>
      <span>
        <input type="date" name="birthday" placeholder="BIRTHDAY" />
      </span>
    </h3>
    <h3>
       <label> 주소 </label>
       <span>
         <input type="text" name="address" placeholder="ADDRESS" />
       </span>
     </h3>
      <input type="submit" value="입력 완료"/>
    </form>
  </section>
</body>

</html>
    