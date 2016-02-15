<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<jstl:set var="title" scope="request" value="Обо мне"/>
<jsp:include page="layouttop.jsp">
    <jsp:param name="activePage" value="messages"/>
</jsp:include>
<div class="row">
    <div class="col-md-8 col-md-offset-2">
        <p> Сообщения </p>
    </div>
</div>
<jsp:include page="layoutbottom.jsp"/>

