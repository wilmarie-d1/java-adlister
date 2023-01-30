<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<%@include file="profile.jsp"%>


<c:choose>
    <c:when test="${param.username == null && param.password == null}">

    </c:when>
<c:when test="${param.username.equals('admin') && param.password.equals('password')}">
    <% response.sendRedirect("profile.jsp");%>
</c:when>
<c:otherwise>
    <c:if test="${!param.username.equals('admin') && !param.password.equals('password')}">
        <% response.sendRedirect("login.jsp");%>
    </c:if>
</c:otherwise>
</c:choose>
</body>

</html>