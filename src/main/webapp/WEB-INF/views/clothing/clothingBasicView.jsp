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
<h3>Clothing noices</h3>
<br>
<div>
    <a href='<c:url value="/clothing/add"/>'>Add new notice</a> 
</div>
<br>
<br>
<div class="body">
    <dbody>
        <c:forEach items="${clothing}" var="clothing" varStatus="loop">
            <div class="notice">
                <div class="row"><c:out value="${loop.count})"/></div>
                <div class="row"><c:out value="${clothing.title}"/></div>
                <div class="row"><c:out value="Clothing brand: ${clothing.brand}"/></div>
                <div class="row"><c:out value="Price: ${clothing.price} PLN."/></div>
                <br>
                <div class="row"><c:out value="${clothing.description}"/></div>
                <br>
                <div class="row"><c:out value="Contact info: ${clothing.contact}"/></div>
                <div class="row"><c:out value="Added: ${clothing.created}"/></div>
                <br>
                <a href='<c:url value="/clothing/edit/${clothing.id}"/>'>Edit</a> 
                <a href='<c:url value="/clothing/delete/${clothing.id}"/>'>Delete</a></td>
                <br>
                <br>

            </div>
        </c:forEach>
    </dbody>
</div>
</body>
</html>
