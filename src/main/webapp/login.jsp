<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>
<div>
  <form action="LoginServlet" method="post">
    <c:choose>
    <c:when test="${password eq ''&&id eq ''}">
     <div>ID: <input type="text" name="id">IDは必須です</div>
    <div>PASS: <input type="password" name="password">passwordは必須です</div>
    <div><button type="submit">送信</button></div>
    </c:when>
    <c:when test="${id eq ''}">
     <div>ID: <input type="text" name="id">IDは必須です</div>
    <div>PASS: <input type="password" name="password"></div>
    <div><button type="submit">送信</button></div>
    </c:when>
    <c:when test="${password eq ''}">
     <div>ID: <input type="text" name="id"></div>
    <div>PASS: <input type="password" name="password">passwordは必須です</div>
    <div><button type="submit">送信</button></div>
    </c:when>
    <c:when test="${(id eq axiz && password eq axizuser)||(id eq technocore && password eq techno-pass)}">
     <div>ID: <input type="text" name="id"></div>
    <div>PASS: <input type="password" name="password"></div>
    <div><button type="submit">送信</button></div>
    </c:when>
    <c:when test="${!(id eq axiz) && !(password eq axizuser)}">
     <h3>passwordまたはIDが間違えています</h3>
     <div>ID: <input type="text" name="id"></div>
    <div>PASS: <input type="password" name="password"></div>
    <div><button type="submit">送信</button></div>
    </c:when>
<!-- <c:when test="${!(id eq technocore) && !(password eq techno-pass)}">
     <h3>passwordまたはIDが間違えています</h3>
     <div>ID: <input type="text" name="id"></div>
    <div>PASS: <input type="password" name="password"></div>
    <div><button type="submit">送信</button></div>
    </c:when>
    -->
    <c:otherwise>
     <div>ID: <input type="text" name="id"></div>
    <div>PASS: <input type="password" name="password"></div>
    <div><button type="submit">送信</button></div>
    </c:otherwise>
  </c:choose>

  </form>
</div>
</body>
</html>