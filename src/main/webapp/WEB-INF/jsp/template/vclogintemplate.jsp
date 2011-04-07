<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<s:layout-definition>
    <html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/layout.css">
        <script type="text/javascript"
                src="${pageContext.request.contextPath}/resources/js/jquery-1.5.1.min.js"></script>


    </head>

    <body>

    <div id="app">
        <div id="header">
            <s:layout-component name="header">
                <jsp:include page="header.jsp"/>
            </s:layout-component>
        </div>

        <div id="topmenu">
            <ul>
                <li><s:link beanclass="dk.speconsult.web.LoginActionBean">Log ind</s:link></li>
            </ul>
        </div>

        <div id="body">

            <div id="content" class="nomenu">
                <s:errors/>
                <s:layout-component name="content">

                </s:layout-component>
            </div>

        </div>


        <div id="footer">
            <s:layout-component name="footer">
                <jsp:include page="footer.jsp"/>
            </s:layout-component>
        </div>

    </div>


    </body>

    </html>


</s:layout-definition>