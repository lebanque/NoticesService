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
<a href='<c:url value="/admin/localization/add"/>'>Add new localization</a></td>
<br>
<br>
<table>
    <thead>
    <th>Nr</th>
    <th>Localization</th>
    </thead>
    <tbody>
    <c:forEach items="${localization}" var="localization" varStatus="loop">
        <tr>
            <td><c:out value="${loop.count}"/></td>
            <td><c:out value="${localization.name}"/></td>
            <td><a href='<c:url value="/admin/brand/delete/${localization.id}"/>'>Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
