<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-definition>
    <html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/layout.css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.5.1.min.js"></script>
    </head>

    <body>

    <div id="app">
        <div id="header">
            <stripes:layout-component name="header">
                <jsp:include page="header.jsp"/>
            </stripes:layout-component>
        </div>

        <div id="topmenu">
            <ul>
                <li><a href="#">Personale</a></li>
                <li><a href="#">Ferie</a></li>
                <li><a href="#">Indstillinger</a></li>
            </ul>
        </div>

        <div id="body">

            <div id="leftmenu">
                <ul>
                    <li><a href="#">Opret medarbejder</a></li>
                    <li><a href="#">Ret medarbejder</a></li>
                    <li><a href="#">Slet medarbejder</a></li>
                </ul>
            </div>

            <div id="content">
                <stripes:layout-component name="content">

                </stripes:layout-component>
            </div>

        </div>

    </div>

    <div id="footer">
        <stripes:layout-component name="footer">

        </stripes:layout-component>
    </div>

    </body>

    </html>


</stripes:layout-definition>