<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>목록</title>
    <meta name="viewport" content="width-device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/list.css">
  </head>
  <body>
    <section class="wrap">
        <table>
          <thead>
            <tr>
              <th>idx</th><th>이름</th><th>점수</th><th>생성</th>
            </tr>
          </thead>
							${message }
        </table>
    </section>
  </body>
</html>
    