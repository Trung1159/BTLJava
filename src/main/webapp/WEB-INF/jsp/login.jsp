<%-- 
    Document   : login
    Created on : Aug 30, 2022, 11:26:38 PM
    Author     : TUN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-danger">SIGN IN</h1>
<c:url value="/login" var="action" />

<form method="post" action="${action}" >
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" class="form-control"/>
    </div>
    <div class="form-group">
        <input type="submit" value="Login" class="btn btn-danger"/>
    </div>
</form>
