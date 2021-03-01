<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>AutomotiveNotices</title>
    <%@ include file="../headersFooters/header.jsp" %>
</head>
<body>
<h3>Automotive noices</h3>
<br>
<div>
    <a href='<c:url value="/automotive/add"/>'>Add new notice</a> 
</div>
<br>
<br>
<div class="body">
    <dbody>
    <c:forEach items="${automotive}" var="automotive" varStatus="loop">
        <div class="notice">
            <div class="row"><c:out value="${loop.count})"/></div>
            <div class="row"><c:out value="${automotive.title}"/></div>
            <div class="row"><c:out value="Vehicle brand: ${automotive.brand}"/></div>
            <div class="row"><c:out value="Vehicle model: ${automotive.model}"/></div>
            <div class="row"><c:out value="Price: ${automotive.price} PLN."/></div>
            <br>
            <div class="row"><c:out value="${automotive.description}"/></div>
            <br>
            <div class="row"><c:out value="Contact info: ${automotive.contact}"/></div>
            <div class="row"><c:out value="Added: ${automotive.created}"/></div>
            <br>
            <a href='<c:url value="/automotive/edit/${automotive.id}"/>'>Edit</a> 
            <a href='<c:url value="/automotive/delete/${automotive.id}"/>'>Delete</a></td>
            <br>
            <br>

        </div>
    </c:forEach>
    </dbody>
</div>
</body>
</html>
