<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<jstl:set var="title" scope="request" value="Обо мне"/>
<jsp:include page="layouttop.jsp">
    <jsp:param name="activePage" value="contact"/>
</jsp:include>
<div class="row marketing">
    <div class="col-lg-8 col-md-offset-2">
        <h1>Ваше сообщение отправлено</h1>
    </div>
</div>
<jsp:include page="layoutbottom.jsp"/>

