<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>EstatesNotices</title>
    <%@ include file="../headersFooters/header.jsp" %>
</head>
<body>
<h3>Estates noices</h3>
<br>
<div>
    <a href='<c:url value="/estates/add"/>'>Add new notice</a> 
</div>
<br>
<br>
<div class="body">
    <dbody>
        <c:forEach items="${estates}" var="estates" varStatus="loop">
            <div class="notice">
                <div class="row"><c:out value="${loop.count})"/></div>
                <div class="row"><c:out value="${estates.title}"/></div>
                <div class="row"><c:out value="Estate localization: ${estates.localization}"/></div>
                <div class="row"><c:out value="Price: ${estates.price} PLN."/></div>
                <br>
                <div class="row"><c:out value="${estates.description}"/></div>
                <br>
                <div class="row"><c:out value="Contact info: ${estates.contact}"/></div>
                <div class="row"><c:out value="Added: ${estates.created}"/></div>
                <br>
                <a href='<c:url value="/estates/edit/${estates.id}"/>'>Edit</a> 
                <a href='<c:url value="/estates/delete/${estates.id}"/>'>Delete</a></td>
                <br>
                <br>

            </div>
        </c:forEach>
    </dbody>
</div>

</body>
</html>
