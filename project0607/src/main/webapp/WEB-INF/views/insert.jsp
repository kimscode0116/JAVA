<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>  
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Main</title>
    <meta name="viewport" content="width-device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/insert.css">>
  </head>
  <body>
  	<header>
		<div class="logo-wrap">
		<img src="<spring:url value='/resources/logo1.png'/>" 
		onclick="location.href='/project0607'">
		
      <!-- <a href="/project0607"><img src="logo1.png"></a> -->
    </div>
    <div class="instagram-wrap">
      <a href="https://www.instagram.com/kkeehhh/" target='_blank'>
		<img src="<spring:url value='/resources/instagram_logo.png'/>" >
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
  </ul>
  <hr width="70%">
</nav>
  <section class="background">
    <header>
    <div>
      <h1>sign-up</h1>
    </div>
  </header>
  <section class="wrap">
    <form action="insert_action" method="GET">
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
     </h3><br><br>
      <input type="submit" value="입력 완료"/><br>
    </form>
  </section>
</section>

</body>

</html>

    