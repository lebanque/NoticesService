<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Service Notices</title>
    <%@ include file="../headersFooters/header.jsp" %>
</head>
<body>
<form:form method="post" modelAttribute="services">
    <table>
        <tbody>
        <tr>
            <td>Notice title</td>
            <td><form:input path="title"/>/></td>
        </tr>
        <tr>
            <td>Notice description</td>
            <td><form:input path="description"/></td>
        </tr>
        <tr>
            <td>Contact</td>
            <td><form:input path="contact"/></td>
        </tr>
        </tbody>
    </table>
    <br>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
