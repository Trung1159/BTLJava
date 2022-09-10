<%-- 
    Document   : header
    Created on : Aug 30, 2022, 11:27:39 PM
    Author     : TUN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "sec" uri = "http://www.springframework.org/security/tags" %>

<div class="container">
    <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand text-info  fa-solid far fa-bookmark" href="<c:url value="/"/>">QLKLTN</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse  d-flex justify-content-center" id="mynavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link text-info" href="<c:url value="/admin/hoidong"/>">HỘI ĐỒNG</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-info" href="<c:url value="/khoaluans"/>">KHÓA LUẬN</a>
                    </li>

                    <c:if test="${pageContext.request.userPrincipal.name == null}">
                        <li class="nav-item">
                            <a class="nav-link text-success" 
                               href="<c:url value="/login"/>">
                                <i class="fa-solid fa-user" ></i>SIGN IN</a>
                        </li>

                    </c:if>
                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                        <li class="nav-item">
                            <a class="nav-link text-danger" 
                               href="<c:url value="/logout"/>">
                                <i class="fa-sharp fa-solid fa-lock"></i>SIGN OUT</a>
                        </li>     
                    </c:if>

                </ul>

            </div>
            <form class="d-flex">
                <input class="form-control me-2" type="text" placeholder="Search">
                <button class="btn btn-warning" type="button">Search</button>
            </form>
        </div>

    </nav>
</div>
