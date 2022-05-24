<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-23
  Time: 오전 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/jquery.js"></script>
    <style>
        .container {
            max-width: 1000px;
        }
    </style>
</head>
<body>
<jsp:include page="../layout/header.jsp" flush="false"></jsp:include>
<div class="container">
        <table class="table">
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
<%--                <th>비밀번호</th>--%>
                <th>작성시간</th>
                <th>작성시간(fmt적용)</th>
                <th>조회수</th>
<%--                <th>조회</th>--%>
<%--                <th>삭제</th>--%>
            </tr>
            <c:forEach items="${boardList}" var="board">
                <tr>
                    <td>${board.id}</td>
<%--                    <td><a href="${board.boardTitle}/board/update?boardTitle=${board.boardTitle}"></a>제목클릭하면 상세조회 화면 나오게 (보내는 파라미터는 id값)</td>--%>
                    <td><a href="/board/detail?id=${board.id}">${board.boardTitle}</a></td>
                    <td>${board.boardWriter}</td>
<%--                    <td>${board.boardPassword}</td>--%>
<%--                    <td>${board.boardContents}</td>--%>
                    <td>${board.boardCreatedDate}</td>
                    <td><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${board.boardCreatedDate}"></fmt:formatDate></td>  <%-- 초 까지만 나옴. --%>
                    <td>${board.boardHits}</td>
<%--                    <td><a href="/detail?id=${board.id}">조회</a></td>--%>
<%--                    <td><a href="/detail?id=${board.id}">삭제</a></td>--%>
                </tr>
            </c:forEach>
        </table>
</div>
</body>
</html>
