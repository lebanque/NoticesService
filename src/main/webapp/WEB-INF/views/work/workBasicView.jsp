<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>WorkNotices</title>
    <%@ include file="../headersFooters/header.jsp" %>
</head>
<body>
<h3>Services noices</h3>
<br>
<div>
    <a href='<c:url value="/work/add"/>'>Add new notice</a> 
</div>
<br>
<br>
<div class="body">
    <dbody>
        <c:forEach items="${work}" var="work" varStatus="loop">
            <div class="notice">
                <div class="row"><c:out value="${loop.count})"/></div>
                <div class="row"><c:out value="${work.title}"/></div>
                <br>
                <div class="row"><c:out value="${work.description}"/></div>
                <br>
                <div class="row"><c:out value="Contact info: ${work.contact}"/></div>
                <div class="row"><c:out value="Added: ${work.created}"/></div>
                <br>
                <a href='<c:url value="/work/edit/${work.id}"/>'>Edit</a> 
                <a href='<c:url value="/work/delete/${work.id}"/>'>Delete</a></td>
                <br>
                <br>

            </div>
        </c:forEach>
    </dbody>
</div>
</body>
</html>
