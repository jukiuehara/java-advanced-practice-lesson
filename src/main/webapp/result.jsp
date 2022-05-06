<%@ page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%
  //必要な処理を記述してください。

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題1(発展)</title>
<style>
body {
    border: solid 2px #000080;
    padding: 5px;
}

.result {
    background: #fffacd;
    display: inline-block;
    margin: 5px;
    padding: 10px;
}

a.button {
    background-color: #ddeeff;
    border: 1px solid #ccc;
    padding: 5px;
    cursor: pointer;
}
</style>
</head>
<body>

  <h1>Java応用 - 演習問題1(発展)</h1>

  <h2>登録結果</h2>


  <div class="result">
    <h3>実行結果</h3>
    <p><%=%></p>
  </div>
  <p>

    <span>現在の登録ユーザー</span><br>

    <%
               	String userId = request.getParameter("userId");
            	String userName = request.getParameter("userName");
            	String ag = request.getParameter("age");
            	int age = Integer.parseInt(ag);
            	User user = new User(userId,userName,age); 
            	
            	User[] users = new User[5];
            	

    
        // 現在のユーザー情報を表示
        for (User tempUser : users) {
            if (tempUser != null) {
            	users.user(user);

                // ユーザー情報を取得
                // todo:
                // 現在は変数のみ定義している。
                // Userクラスの情報取得用メソッドを呼んだ値をセットするように修正。
                String msg = "";

                // ユーザー情報表示
                 out.println(user.returnUserInfo());
                out.println("<br>");
            }
        }
    %>
  </p>

  <form action="input.jsp">
    <button type="submit" name="btn" value="back">戻る</button>
    <button type="submit" name="btn" value="reset">リセット</button>
  </form>
</body>
</html>