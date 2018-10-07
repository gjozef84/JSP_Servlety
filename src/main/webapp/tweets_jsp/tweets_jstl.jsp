<%--
  Created by IntelliJ IDEA.
  User: Grzesiek
  Date: 2018-10-06
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  <%--niezbedne do dzialania jstl--%>

<html>
<head>
    <title>List of tweets</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <jsp:include page="/tweets_jsp/menu.jsp">
        <jsp:param name="activeTab" value="tweets"></jsp:param>
    </jsp:include>

        <h2>List of tweets:</h2>

        <table class="table">
            <thead>
            <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Author</th>
                <th>Message</th>
                <th>Create date</th>
                <th></th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${tweetsModel}" var="tweet">
                <tr class="active">
                    <td>${tweet.id}</td>
                    <td>${tweet.title}</td>
                    <td>${tweet.author}</td>
                    <td>${tweet.body}</td>
                    <td>${tweet.createdDate}</td>
                    <td><a href="/tweet?id=${tweet.id}">View</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>

</body>
</html>
