<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<jstl:set var="title" scope="request" value="Обо мне"/>
<jsp:include page="layouttop.jsp">
    <jsp:param name="activePage" value="aboutMe"/>
</jsp:include>
<div class="row marketing">
    <div class="col-lg-8 col-md-offset-2">
        <p>${aboutMeInfo}</p>
    </div>
</div>
<div class="row">
    <div class="col-md-8">
        <p> Обратная связь </p>
        <form role="form" action="<spring:url value="/contactme"/>" method="POST">
            <div class="form-group">
                <input type="text" class="form-control" name="e-mail" placeholder="e-mail / кто вы">
            </div>
            <div class="form-group">
                <label for="message-body">Ваше сообщение:</label>
                <textarea class="form-control" rows="5" name="message-body" id="message-body"></textarea>
            </div>
            <button type="submit" class="btn btn-success">Отправить</button>
            <sec:csrfInput/>
        </form>
    </div>
</div>
<jsp:include page="layoutbottom.jsp"/>

