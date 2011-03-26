<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-definition>
    <html>
    <head>
        <link rel="stylesheet" type="text/css" href="/WEB-INF/css/layout.css">
        <script type="text/javascript" src="/WEB-INF/js/jquery-1.5.1.min.js"></script>
    </head>

    <body>

    <div id="app">

        <div id="header">
            <stripes:layout-component name="header">
                <jsp:include page="header.jsp"/>
            </stripes:layout-component>
        </div>

        <div id="body">

            <div id="content">
                <stripes:layout-component name="content"/>
            </div>

        </div>

        <div id="footer">
            <stripes:layout-component name="footer">
                <jsp:include page="footer.jsp"/>
            </stripes:layout-component>
        </div>

    </div>

    </body>

    </html>

</stripes:layout-definition>