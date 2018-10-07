<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Grzesiek
  Date: 2018-10-06
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Tweeter app</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="/">Home</a></li>

            <%--<li <c:if test="${param.activeTab == 'tweets'}"> class="active"></c:if>>
                <a href="/tweets">All Tweets</a>
            </li>--%>

            <c:choose>
            <c:when test="${param.activeTab == 'tweets'}">
            <li class="active">
                </c:when>
                <c:otherwise>
            <li>
                </c:otherwise>
                </c:choose>
                <a href="/tweets">All tweets</a>
            </li>

            <%--<li <c:if test="${param.activeTab == 'tweet'}"> class="active"></c:if>>
                <a href="/tweet">Tweet Page</a>
            </li>--%>


            <c:choose>
            <c:when test="${param.activeTab == 'tweet'}">
            <li class="active">
                </c:when>
                <c:otherwise>
            <li>
                </c:otherwise>
                    </c:choose>
                <a href="/tweet/create">Add tweet</a>
            </li>



        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </ul>
    </div>
</nav>
