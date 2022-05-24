<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-23
  Time: 오전 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="../layout/header.jsp" flush="false"></jsp:include>
<div class="container">
    <h2 class="display-4 fw-normal">글작성 페이지</h2>
    <div class="py-5 text-center">
    <form action="/board/save" method="post">
        <input class="form-control mb-2" type="text" name="boardWriter" placeholder="작성자"><br>
        <input class="form-control mb-2" type="text" name="boardTitle" placeholder="제목"><br>
        <input class="form-control mb-2" type="text" name="boardPassword" placeholder="비밀번호"><br>
        <textarea class="form-control" name="boardContents" cols="10" rows="5"></textarea>
        <input class="btn btn-primary" type="submit" value="작성">
    </form>
    </div>
</div>
</body>
</html>
