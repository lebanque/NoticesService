<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>ServicesNotices</title>
    <%@ include file="../headersFooters/header.jsp" %>
</head>
<body>
<h3>Services noices</h3>
<br>
<div>
    <a href='<c:url value="/services/add"/>'>Add new notice</a> 
</div>
<br>
<br>
<div class="body">
    <dbody>
        <c:forEach items="${services}" var="services" varStatus="loop">
            <div class="notice">
                <div class="row"><c:out value="${loop.count})"/></div>
                <div class="row"><c:out value="${services.title}"/></div>
                <br>
                <div class="row"><c:out value="${services.description}"/></div>
                <br>
                <div class="row"><c:out value="Contact info: ${services.contact}"/></div>
                <div class="row"><c:out value="Added: ${services.created}"/></div>
                <br>
                <a href='<c:url value="/services/edit/${services.id}"/>'>Edit</a> 
                <a href='<c:url value="/services/delete/${services.id}"/>'>Delete</a></td>
                <br>
                <br>

            </div>
        </c:forEach>
    </dbody>
</div>
</body>
</html>
