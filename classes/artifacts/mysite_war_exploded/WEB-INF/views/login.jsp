<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<jstl:set var="title" scope="request" value="Обо мне"/>
<jsp:include page="layouttop.jsp">
    <jsp:param name="activePage" value="login"/>
</jsp:include>
<div class="row">
    <div class="col-md-8 col-md-offset-2">
        <p> Войти </p>
        <form role="form" action="<spring:url value="/login"/>" method="POST">
            <div class="form-group">
                <input type="text" class="form-control" name="user" placeholder="Логин">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="password" placeholder="Пароль">
            </div>
            <jstl:if test="${param.error != null}">
                <p> Неправильные имя пользователя или пароль </p>
            </jstl:if>
            <button type="submit" class="btn btn-success">Войти</button>
            <sec:csrfInput/>
        </form>
    </div>
</div>
<jsp:include page="layoutbottom.jsp"/>

