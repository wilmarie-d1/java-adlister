<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<form action="login.jsp" method="post">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username">
    <label for="password">Password:</label>
    <input type="password" name="password" id="password">
    <button type="submit">Submit</button>

</form>
<%@include file="./profile.jsp"%>

<c:choose>
    <c:when test="${param.username == null && param.password == null}">

    </c:when>
<c:when test="${param.username.equals('admin') && param.password.equals('password')}">
    <% response.sendRedirect("profile.jsp");%>
    <h1>Welcome in Friend</h1>
</c:when>
<c:otherwise>
    <c:if test="${!param.username.equals('admin') && !param.password.equals('password')}">
        <% response.sendRedirect("login.jsp");%>
    </c:if>
</c:otherwise>
</c:choose>
</body>

</html>