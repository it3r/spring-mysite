<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" <c:if test="${param.activePage=='aboutMe'}"> class="active" </c:if>>
                    <a href="<spring:url value="/"/> ">Обо мне</a></li>
                <li role="presentation" <c:if test="${param.activePage=='aboutSite'}"> class="active" </c:if>>
                    <a href="<spring:url value="/aboutsite"/>">О сайте</a></li>
                <sec:authorize access="authenticated" var="authed"/>
                <c:choose>
                    <c:when test="${authed}">
                        <li role="presentation" <c:if test="${param.activePage=='messages'}"> class="active" </c:if>>
                            <a href="<spring:url value="/messages"/>">Письма</a></li>
                    </c:when>
                    <c:otherwise>
                        <li role="presentation" <c:if test="${param.activePage=='login'}"> class="active" </c:if>>
                            <a href="<spring:url value="/login"/>">Вход</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </nav>
        <h1 class="text-muted">Spring version</h1>
    </div>
</header>
