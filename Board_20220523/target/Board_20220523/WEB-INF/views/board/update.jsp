<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-23
  Time: 오후 4:24
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
    <h2 class="display-4 fw-normal">update.jsp</h2>
    <div class="py-5 center">
        <form action="/board/update" method="post" name="updateForm">
            글번호<input class="form-control mb-2" type="text" name="id" value="${boardUpdate.id}" readonly>
            제목<input class="form-control mb-2" type="text" name="boardTitle" value="${boardUpdate.boardTitle}">
            비밀번호<input class="form-control mb-2" type="text" name="boardPassword" id="passwordConfirm">
            작성자<input class="form-control mb-2" type="text" name="boardWriter" value="${boardUpdate.boardWriter}" readonly>
<%--            <input class="form-control mb-2" type="text" name="boardContents"  value="${boardUpdate.boardContents}">--%>
            내용<br><textarea name="boardContents" cols="40" rows="10">${boardUpdate.boardContents}</textarea><br>
            <input class="btn btn-primary" type="button" onclick="boardUpdate()" value="정보수정">
        </form>
    </div>
</div>
</body>
<script>
    const boardUpdate = () => {
        // const passwordConfirm = document.querySelector("#passwordConfirm").value;
        const passwordConfirm = document.getElementById("passwordConfirm").value;
        const passwordDB = '${boardUpdate.boardPassword}';
        if (passwordConfirm == passwordDB) {
            updateForm.submit();
        } else {
            alert("비밀번호 불일치!!!!!");
        }

    }
</script>
</html>
