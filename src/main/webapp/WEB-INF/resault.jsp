<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fmt:bundle basename="i18n.messages">
    <html>
    <head>
        <title></title>
    </head>
    <body>
    <div style="width:800px;">

        <h3><fmt:message key="index.hello"/></h3>

        <p>
                ${param.text}
        </p>
    </div>
    </body>
    </html>
</fmt:bundle>