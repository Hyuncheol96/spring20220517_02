<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-19
  Time: 오후 1:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <style>
        .container {
            max-width: 500px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2 class="display-4 fw-normal">save.jsp</h2>
    <div class="py-5 text-center">

        <form action="/save" method="post">
            <input class="form-control mb-2" type="text" name="memberId" placeholder="아이디">
            <input class="form-control mb-2" type="password" name="memberPassword" placeholder="비밀번호">
            <input class="form-control mb-2" type="text" name="memberName" placeholder="이름">
            <input class="form-control mb-2" type="text" name="memberAge" placeholder="나이">
            <input class="form-control mb-2" type="text" name="memberPhone" placeholder="전화번호">
            <input class="btn btn-primary" type="submit" value="회원가입">
            <button>버튼tag가입</button>
            <input type="button" value="button타입">
        </form>
    </div>
</div>
</body>
</html>
