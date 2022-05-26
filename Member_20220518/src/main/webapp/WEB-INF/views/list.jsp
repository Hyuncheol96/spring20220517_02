<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-19
  Time: 오후 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h2>list.jsp</h2>
<div class="container">
    <table class="table">
        <tr>
            <th>id</th>
            <th>memberId</th>
            <th>memberPassword</th>
            <th>memberName</th>
            <th>memberAge</th>
            <th>memberPhone</th>
            <th>조회</th>
            <th>삭제</th>
            <th>ajax 조회</th>
        </tr>
        <c:forEach items="${memberList}" var="member"> <%-- var = 돌릴방법 변수 설정 --%>
            <tr>
                <td>${member.id}</td>
                <td>${member.memberId}</td>
                <td>${member.memberPassword}</td>
                <td>${member.memberName}</td>
                <td>${member.memberAge}</td>
                <td>${member.memberPhone}</td>
                <td><a href="/detail?id=${member.id}">조회</a></td>
                <td><a href="/delete?id=${member.id}">삭제</a></td>
                <td><button class="btn btn-outline-info" onclick="detailByAjax('${member.id}')">조회</button></td>
                    <%-- 클릭한 회원의 정보를 DB에서 가져와서 detail.jsp에 출력 --%>
            </tr>
        </c:forEach>
    </table>

    <div id="detail">

    </div>
</div>
</body>
<script>
    const detailByAjax = (id) => {
        console.log(id);
        const detail = document.getElementById("detail");
        $.ajax({
            type: "get", // http request method
            url: "detail-ajax", // 요청주소(컨트롤러 주소값)
            data: {"id": id}, // 전송하는 파라미터
            dataType: "json", // 리턴받을 데이터 형식
            success: function (result) {
                let output = "<table class='table'>";
                output += "<tr>" +
                    "<th>id</th> <th>memberId</th> <th>memberPassword</th> <th>memberName</th>" +
                    "<th>memberAge</th> <th>memberPhone</th> " +
                    "</tr>";
                output += "<tr>";
                output += "<td>" + result.id                  + "</td>";
                output += "<td>" + result.memberId            + "</td>";
                output += "<td>" + result.memberPassword      + "</td>";
                output += "<td>" + result.memberName          + "</td>";
                output += "<td>" + result.memberAge           + "</td>";
                output += "<td>" + result.memberPhone         + "</td>";
                output += "</tr>";
                output += "</table>";

                detail.innerHTML = output;
            },
            error: function () {
                alert("오타체크");
            }
        });

    }
</script>
</html>
