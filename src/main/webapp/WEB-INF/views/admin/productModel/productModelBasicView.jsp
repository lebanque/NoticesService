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
<a href='<c:url value="/admin/productModel/add"/>'>Add new model</a></td>
<br>
<br>
<table>
    <thead>
    <th>Nr</th>
    <th>Model</th>
    </thead>
    <tbody>
    <c:forEach items="${model}" var="model" varStatus="loop">
        <tr>
            <td><c:out value="${loop.count}"/></td>
            <td><c:out value="${productmodel.model}"/></td>
            <td><a href='<c:url value="/admin/model/delete/${productmodel.id}"/>'>Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
