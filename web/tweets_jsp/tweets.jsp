<%@ page import="com.myTwitter.dto.TweetDto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Grzesiek
  Date: 2018-09-30
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of tweets</title>
</head>
<body>


<h2>List of tweets:</h2>
<%
    List<TweetDto> tweets = (List<TweetDto>) request.getAttribute("tweetsModel");
    if (tweets != null) {
%>
<ul>
    <%
        for (TweetDto tweetDto : tweets) {
    %>
    <li><b>Tweet id <%=tweetDto.getId()%></b><br> Tweet title <%=tweetDto.getTitle()%> Tweet author <%=tweetDto.getAuthor()%> Tweet msg=<%=tweetDto.getBody()%></li>
    <%
        }
    %>

</ul>
<%
    }
%>

</body>
</html>
