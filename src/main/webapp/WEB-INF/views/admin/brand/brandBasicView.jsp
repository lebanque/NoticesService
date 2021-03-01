<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>AutomotiveNotices</title>
    <%@ include file="../../headersFooters/header.jsp" %>
</head>
<body>
<br>
<br>
<a href='<c:url value="/admin/brand/add"/>'>Add new brand</a></td>
<br>
<br>
<table>
    <thead>
    <th>Nr</th>
    <th>Brand</th>
    </thead>
    <tbody>
    <c:forEach items="${brand}" var="brand" varStatus="loop">
        <tr>
            <td><c:out value="${loop.count}"/></td>
            <td><c:out value="${brand.brand}"/></td>
            <td><a href='<c:url value="/admin/brand/delete/${brand.id}"/>'>Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
