<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:layout-definition>
    <html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/layout.css">
        <script type="text/javascript"
                src="${pageContext.request.contextPath}/resources/js/jquery-1.5.1.min.js"></script>


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
                <c:forEach items="${actionBean.topMenu}" var="menu">
                    <li>
                        <s:link id="${menu.key}" beanclass="${menu.value}">
                            ${menu.key}
                            <s:param name="selectedTopMenu" value="${menu.key}"/>
                            <s:param name="selectedLeftMenu" value=""/>
                        </s:link>
                    </li>
                </c:forEach>
            </ul>
        </div>

        <div id="body">

            <div id="leftmenu">
                <div id="administration">
                    <ul>
                        <c:forEach items="${actionBean.adminMenu}" var="menu">
                            <li>
                                <s:link id="${menu.key}" beanclass="${menu.value}">
                                    ${menu.key}
                                    <s:param name="selectedLeftMenu" value="${menu.key}"/>
                                </s:link>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
                <div id="vacation" style="display:none">
                    <ul>
                        <c:forEach items="${actionBean.vacationMenu}" var="menu">
                            <li>
                                <s:link id="${menu.key}" beanclass="${menu.value}">
                                    ${menu.key}
                                    <s:param name="selectedLeftMenu" value="${menu.key}"/>
                                </s:link>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
                <div id="settings" style="display:none">
                    <ul>
                        <c:forEach items="${actionBean.settingsMenu}" var="menu">
                            <li>
                                <s:link id="${menu.key}" beanclass="${menu.value}">
                                    ${menu.key}
                                    <s:param name="selectedLeftMenu" value="${menu.key}"/>
                                </s:link>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>

            <div id="content">
                <stripes:layout-component name="content">

                </stripes:layout-component>
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