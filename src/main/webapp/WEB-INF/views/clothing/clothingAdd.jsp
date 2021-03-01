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
<form:form method="post" modelAttribute="clothing">
    <table>
        <tbody>
        <tr>
            <td>Notice title</td>
            <td><form:input path="title"/></td>
        </tr>
        <tr>
            <td>Clothing brand</td>
            <td><form:input  path="brand"/></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><form:input path="price"/></td>
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
