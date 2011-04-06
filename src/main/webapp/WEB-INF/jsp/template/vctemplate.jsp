<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
                <c:forEach items="${actionBean.topMenu}" var="menu" varStatus="status">
                    <c:if test="${menu.key == actionBean.selectedTopMenu or (empty actionBean.selectedTopMenu && status.count == 1)}">
                        <c:set var="class" value="selected"/>
                    </c:if>
                    <li>
                        <s:link id="${menu.key}" beanclass="${menu.value}" class="${class}">
                            <fmt:message key="${menu.key}"/>
                            <s:param name="selectedTopMenu" value="${menu.key}"/>
                            <s:param name="selectedLeftMenu" value=""/>
                        </s:link>
                    </li>
                    <c:remove var="class"/>
                </c:forEach>
            </ul>
        </div>

        <div id="body">
            <div id="leftmenu">
                <c:set var="leftmenu" value="${actionBean.currentLeftMenu}" />
                <ul>
                    <c:forEach items="${leftmenu}" var="menu" varStatus="status">
                        <c:if test="${menu.key == actionBean.selectedLeftMenu or (empty actionBean.selectedLeftMenu && status.count == 1)}">
                            <c:set var="class" value="selected"/>
                        </c:if>
                        <li>
                            <s:link id="${menu.key}" beanclass="${menu.value}" class="${class}">
                                <fmt:message key="${menu.key}"/>
                                <s:param name="selectedLeftMenu" value="${menu}"/>
                            </s:link>
                        </li>
                        <c:remove var="class"/>
                    </c:forEach>
                </ul>
            </div>

            <div id="content">
                <s:errors/>
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