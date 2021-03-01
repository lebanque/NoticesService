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
<br>
<br>
<a href='<c:url value="../admin/brand/add"/>'>brands</a> 
<br>
<a href='<c:url value="../admin/localization/add"/>'>localizations</a> 
</body>
</html>
