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
    <script>
        const saveForm = () => {
            location.href = "/board/save";
        }
        const saveFileForm = () => {
            location.href = "/board/saveFile";
        }
        const findAll = () => {
            location.href = "/board/findAll";
        }
        // 이런식으로 사용하면 좋음.
        // 회원가입 : /member/save
        // 글쓰기 : /board/save
    </script>
</head>
<body>
    <h2>index.jsp</h2>
    <button class="btn btn-outline-success" onclick="saveForm()">글 작성</button>
    <button class="btn btn-outline-success" onclick="findAll()">글 목록</button>
    <button class="btn btn-outline-success" onclick="saveFileForm()">글 작성(파일첨부)</button

</body>
</html>
