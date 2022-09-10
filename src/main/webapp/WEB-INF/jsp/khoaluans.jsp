<%-- 
    Document   : khoaluan
    Created on : Sep 4, 2022, 11:04:57 AM
    Author     : TUN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1 class="text-center text-info">THỐNG KÊ KHÓA LUẬN</h1>

<c:url value="/khoaluans" var="action" />

<form method="post">
    
    <div class="form-floating mb-3 mt-3">
        <input class="form-control" path="name" id="name" placeholder="name" />
        <label for="name">Tên khóa luận</label>
    </div>

    <div class="form-floating mt-3 mb-3">
        <input class="form-control" path="price" id="name" placeholder="name"  />
        <label for="name">Sinh viên thực hiện</label>
        
    </div>
    
    <div class="form-floating mt-3 mb-3">
        <input class="form-control" path="price" id="name" placeholder="name"/>
        <label for="name">Giảng viên hướng dẫn</label>
    </div>
    <div class="form-group">
        <input type="submit" value="Thêm khóa luận" class="btn btn-danger"/>
        <input type="submit" value="Tìm khóa luận" class="btn btn-primary"/>
    </div>
</form>

