<%--
  Created by IntelliJ IDEA.
  User: Grzesiek
  Date: 2018-10-06
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<jsp:include page="/tweets_jsp/menu.jsp">
    <jsp:param name="activeTab" value=""></jsp:param>
</jsp:include>

<h2>${h2Text}</h2>

    <div class="alert alert-success">
        <strong>Success!</strong> ${msg}.
    </div>

</div>

</body>
</html>
