<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<html>
<head>
    <title>${title}</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<spring:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/css/aboutMe.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/css/jumbotron-narrow.css"/>" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
<jsp:include page="header.jsp">
    <jsp:param name="activePage" value="${param.activePage}"/>
</jsp:include>