<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:bundle basename="i18n.messages">
    <html>
    <head>
        <title><fmt:message key="title"/></title>
    </head>
    <body>
    <div>
        <form action="${pageContext.request.contextPath}/Controller" method="post">
            <p><fmt:message key="index.hello"/></p>

            <p><textarea name="text" rows="30" cols="30">
                    <%--<%@include file="WEB-INF/1.txt" %>--%>
            </textarea></p>

            <p><input type="submit" value="<fmt:message key="index.submit"/>"/></p>
        </form>
    </div>
    </body>
    </html>
</fmt:bundle>