<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-render name="/WEB-INF/jsp/template/vctemplate.jsp" pageTitle="Using A Layout">
    <stripes:layout-component name="content">

        <s:form beanclass="dk.speconsult.web.employee.ProcessEmployeeBean">
            <s:label for="employee.firstName"/>
            <%@ include file="employeefields.jspf"%>
            <s:submit name="editEmployee" value="editEmployee"/>
        </s:form>

    </stripes:layout-component>
</stripes:layout-render>