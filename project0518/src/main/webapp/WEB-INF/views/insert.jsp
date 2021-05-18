<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <meta charset="utf-8">
  <title>Main</title>
  <meta name="viewport" content="width-device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/insert.css">
</head>

<body>
  <section class="wrap">
    <form action="insert_action" method="get">
      <label> 이름 입력 :
        <input type="text" name="student_name" placeholder="이름" />
      </label>
      <label> 점수 입력 :
        <input type="number" name="score" placeholder="점수" />
      </label>
      <input type="submit" value="입력 완료"/>
    </form>
  </section>
</body>

</html>
    