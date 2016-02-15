<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<jsp:include page="layouttop.jsp">
    <jsp:param name="activePage" value="aboutSite"/>
</jsp:include>
<div class="row marketing">
    <div class="col-lg-8 col-md-offset-2">
        <jstl:forEach items="${techMap}" var="item">
            <p> ${item.key} : ${item.value}</p>
        </jstl:forEach>
    </div>
</div>
<jsp:include page="layoutbottom.jsp"/>

