<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 3:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save 페이지</title>
    <style>
        input {
            display: block;
        }
    </style>
</head>
<body>
    <h2>save.jsp</h2>
    <form action="save" method="post"><br>
        <input type="text" name="memberId" placeholder="계정(memberId)"><br>
        <input type="password" name="memberPassword" placeholder="비밀번호(memberPassword)"><br>
        <input type="text" name="memberName" placeholder="이름(memberName)"><br>
        <input type="text" name="memberAge" placeholder="나이(memberAge)"><br>
        <input type="text" name="memberPhone" placeholder="전화번호(memberPhone)"><br>
        <input type="submit" value="전송">
        <button>버튼tag가입</button>
        <input type="button" value="button타입">
    </form>
</body>
</html>
