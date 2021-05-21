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
      <label> 수정할 학생의 이름 입력 :
        <input type="text" name="update_name" placeholder="이름" value="${student_name }"/>
      </label>
      <label> 새로운 중간고사 점수 입력 :
        <input type="number" name="update_mid" placeholder="중간고사 점수" value="${middleScore }" />
      </label>
      <label> 새로운 기말고사 점수 입력 :
        <input type="number" name="update_fin" placeholder="기말고사 점수" value="${finalScore }"/>
      </label>
      <input type="submit" value="입력 완료"/>
    </form>
  </section>
</body>

</html>
    