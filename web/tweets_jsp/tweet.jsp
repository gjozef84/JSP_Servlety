<%--
  Created by IntelliJ IDEA.
  User: Grzesiek
  Date: 2018-10-06
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Tweet</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <jsp:include page="/tweets_jsp/menu.jsp"></jsp:include>

    <h2>Tweet edit form</h2>
    <form class="form-horizontal" action="/tweet/addTweet" method="POST">

        <div class="form-group">
            <label class="control-label col-sm-2">Id: ${tweetModel.id}</label>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="title">Title:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="title" placeholder="Enter title" name="title" value="${tweetModel.title}">
            </div>
        </div>

        <%--<div class="form-group">
            <label class="control-label col-sm-2" for="author">Author:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="author" placeholder="Enter author" name="author" value="${tweetModel.author}">
            </div>
        </div>--%>

        <div class="form-group">
            <label class="control-label col-sm-2" for="message">Message:</label>
            <div class="col-sm-10">
                <input type="textarea" cols="30" rows="10" class="form-control" id="message" placeholder="Enter tweet" name="message" value="${tweetModel.body}">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="data">Create data:</label>
            <div class="col-sm-10">
                <input type="date" class="form-control" id="data" placeholder="Enter data" name="data" value="${tweetModel.createdDate}">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label><input type="checkbox" name="remember"> Remember me</label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Save</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
