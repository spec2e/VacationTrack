<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>

<s:layout-render name="/WEB-INF/jsp/template/vctemplate.jsp" pageTitle="Using A Layout">
    <s:layout-component name="content">

        <s:form beanclass="dk.speconsult.web.employee.ProcessEmployeeBean">
            <%@ include file="employeefields.jspf"%>
            <s:submit name="createEmployee" value="createEmployee"/>
        </s:form>

    </s:layout-component>
</s:layout-render>