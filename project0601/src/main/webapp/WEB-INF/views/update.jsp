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
      <input type="hidden" name="idx" value="${idx }"/>    
      <label> new id :
        <input type="text" name="update_id" placeholder="id" value="${update_id }"/>
      </label>
      <label> new pwd :
        <input type="text" name="update_pwd" placeholder="pwd" value="${update_pwd }" />
      </label>
      <label> new name :
        <input type="text" name="update_name" placeholder="name" value="${update_name }"/>
      </label>
       <label> new birthday :
        <input type="text" name="update_birthday" placeholder="birthday" value="${update_birthday }"/>
      </label>
       <label> new address :
        <input type="text" name="update_address" placeholder="address" value="${update_address }"/>
      </label>
      <input type="submit" value="입력 완료"/>
    </form>
    <button type="button" onclick="location.href='/project0601'">홈으로</button>
  </section>
</body>

</html>
    