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
<form:form method="post" modelAttribute="localization">
    <table>
        <tbody>
        <tr>
            <td>New localization</td>
            <td><form:input path="name"/></td>
        </tr>
        </tbody>
    </table>
    <br>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
