<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-render name="/WEB-INF/jsp/template/vctemplate.jsp" pageTitle="Using A Layout">
    <stripes:layout-component name="content">

        <table id="datatable" width="100%">
            <c:forEach items="${actionBean.employees}" var="employee">
                <tr>
                    <td>${employee.firstName}&nbsp;${employee.lastName}</td>
                </tr>
            </c:forEach>
        </table>

    </stripes:layout-component>
</stripes:layout-render>
