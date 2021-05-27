<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <meta charset="utf-8">
  <title>update</title>
  <meta name="viewport" content="width-device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/update.css">
</head>

<body>
  <section class="wrap">
    <form action="update_action">
      <input type="text" name="idx" value="${idx }"/>    
      <label> 수정할 직원의 이름 :
        <input type="text" name="update_name" placeholder="이름" value="${update_name }"/>
      </label>
      <label> 새로운 성별 :
        <input type="text" name="update_gender" placeholder="성별" value="${update_gender }" />
      </label>
      <label> 새로운 주소 :
        <input type="text" name="update_address" placeholder="주소" value="${update_address }"/>
      </label>
       <label> 새로운 소속부서 :
        <input type="text" name="update_department" placeholder="부서명" value="${update_department }"/>
      </label>
      <input type="submit" value="입력 완료"/>
    </form>
    <button type="button" onclick="location.href='/project0527'">홈으로</button>
  </section>
</body>

</html>
    