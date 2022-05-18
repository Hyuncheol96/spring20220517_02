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
</head>
<body>
    <h2>save.jsp</h2>
    <form action="save1" method="get">
        <input type="text" name="계정(memberId)" placeholder="memberId"><br>
        <input type="text" name="비밀번호(memberPassword)" placeholder="memberPassword"><br>
        <input type="text" name="이름(memberName)" placeholder="memberName"><br>
        <input type="text" name="나이(memberAge)" placeholder="memberAge"><br>
        <input type="text" name="전화번호(memberPhone)" placeholder="memberphone"><br>
        <input type="submit" value="전송">
    </form>
</body>
</html>
