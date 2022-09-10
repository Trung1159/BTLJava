<%-- 
    Document   : register
    Created on : Sep 3, 2022, 3:37:54 PM
    Author     : TUN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-danger">SIGN UP</h1>
<c:if test="${errMsg != null}">
    <div class="alert alert danger">
        ${errMsg}
    </div>
</c:if>
<c:url value="/register" var="action" />
 
<form:form method="post" action="${action}" modelAttribute="user">
    <div class="form-group">
        <label for="name">Name</label>
        <form:input type="text" id="name" path="name" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <form:input type="email" id="email" path="email" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="username">Username</label>
        <form:input type="text" id="username" path="username" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <form:input type="password" id="password" path="password" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="confirm-password">Confirm Password</label>
        <form:input type="password" id="confirm-password" path="confirmPassword" class="form-control"/>
    </div>
    <div class="form-group">
        <input type="submit" value="Register" class="btn btn-danger"/>
    </div>
</form:form>
