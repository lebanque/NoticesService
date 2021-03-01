<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>ElectronicsNotices</title>
    <%@ include file="../headersFooters/header.jsp" %>
</head>
<body>
<h3>Electronics</h3>
<br>
<div>
    <a href='<c:url value="/electronics/add"/>'>Add new notice</a> 
</div>
<br>
<br>
<div class="body">
    <dbody>
        <c:forEach items="${electronics}" var="electronics" varStatus="loop">
            <div class="notice">
                <div class="row"><c:out value="${loop.count})"/></div>
                <div class="row"><c:out value="${electronics.title}"/></div>
                <div class="row"><c:out value="Electronics brand: ${electronics.brand}"/></div>
                <div class="row"><c:out value="Electronics model: ${electronics.model}"/></div>
                <div class="row"><c:out value="Price: ${electronics.price} PLN."/></div>
                <br>
                <div class="row"><c:out value="${electronics.description}"/></div>
                <br>
                <div class="row"><c:out value="Contact info: ${electronics.contact}"/></div>
                <div class="row"><c:out value="Added: ${electronics.created}"/></div>
                <br>
                <a href='<c:url value="/electronics/edit/${electronics.id}"/>'>Edit</a> 
                <a href='<c:url value="/electronics/delete/${electronics.id}"/>'>Delete</a></td>
                <br>
                <br>

            </div>
        </c:forEach>
    </dbody>
</div>

</body>
</html>
