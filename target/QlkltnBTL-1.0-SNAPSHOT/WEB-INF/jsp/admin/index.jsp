<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
  <div class="row">
    <div class="col-md-3 bg-dark text-light">
      <ul class="list-group py-2">
        <li class="list-group-item"><a class="nav-link" href="<c:url value="/admin/user-manager" />">Quản lý tài khoản</a></li>
        <li class="list-group-item">A second item</li>
        <li class="list-group-item">A third item</li>
        <li class="list-group-item">A fourth item</li>
        <li class="list-group-item">And a fifth one</li>
      </ul>
    </div>
    <div class="col-md-9">
      <table class="table">
        <thead>
          <tr>
            <th scope="col">STT</th>
            <th scope="col">Tên</th>
            <th scope="col">Quyền</th>
          </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <th scope="row">${user.id}</th>
                    <td>${user.username}</td>
                    <td>
                        <select id="select${user.id}" class="form-select" aria-label="Default select example">
                            <c:forEach items="${roles}" var="role">
                                <option value="${role}" <c:if test="${user.userRole == role}">selected</c:if>>${role}</option>
                            </c:forEach>
                        </select>
                        <script>
                            $(document).ready(function(){
                                $("#select${user.id}").change(function(){
                                    fetch('<c:url value="/api/update-userrole" />', {
                                        method:"put",
                                        body: JSON.stringify({
                                            "role" : this.value,
                                            "id" : ${user.id}
                                        }),
                                        headers: {
                                            "Content-Type": "application/json"
                                        }
                                    
                                    }).then(function (res){
                                        console.info(res);
                                        return res.json();
                                    }).then(function (data){
                                        console.info(data);
                                    });
                                });
                            });
                        </script>
                    </td>
                </tr>
                
            </c:forEach>
            
        </tbody>
      </table>
    </div>
  </div>
</div>
