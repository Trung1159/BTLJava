<%-- 
    Document   : hoidong
    Created on : Sep 4, 2022, 12:19:38 PM
    Author     : TUN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-info">THỐNG KÊ HỘI ĐỒNG</h1>
<c:url value="/admin/hoidong" var="action" />


<div class="row">
    <div class="col-md-10 col-xs-20">
        <table class="table">
            <tr>
                <th>Id</th>
                <th>Tên khóa luận</th>
                <th>Ngày thực hiện</th>
                <th>Giảng viên </th>
                <th>Vai trò</th>
            </tr>
            <c:forEach items="${khoaluans}" var="k">
                <tr>
                    <td>${k.id}</td>
                    <td>${k.title}</td>
                    <td>${k.date}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>