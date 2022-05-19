<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>

  <h2>検索条件を入力してください</h2>
    <c:if test="${not empty msg}">
    <p>${msg}</p>
    <p>${id}</p>
    <p>${name}</p>
    <p>${price}</p>
  </c:if>
  <form action="LoginServlet" method="post">
    product_id <input type="number" name="id"><br>
    <button type="submit">クエリ送信</button>
  </form>
</body>
</html>