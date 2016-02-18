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
        <table class="table">
            <thead>
                <tr>
                    <th>Отправитель</th>
                    <th>Сообщение</th>
                </tr>
            </thead>
            <tbody>
                <jstl:forEach items="${mesMap}" var="mes">
                    <tr>
                        <td>${mes.key}</td>
                        <td>${mes.value}</td>
                    </tr>
                </jstl:forEach>
            </tbody>
        </table>
    </div>
</div>
<jsp:include page="layoutbottom.jsp"/>

