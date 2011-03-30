<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-render name="/WEB-INF/jsp/template/vctemplate.jsp" pageTitle="Using A Layout">
    <stripes:layout-component name="content">

        <s:form beanclass="dk.speconsult.web.employee.ProcessEmployeeBean">
            <table>
                <tbody>
                <tr>
                    <td>
                        <s:label for="employee.firstName"/>
                        <s:text name="employee.firstName"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:label for="employee.lastName"/>
                        <s:text name="employee.lastName"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:label for="employee.employeeId"/>
                        <s:text name="employee.employeeId"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:label for="employee.administrator"/>
                        <s:text name="employee.administrator"/>
                    </td>
                </tr>
                </tbody>
                <s:hidden name="employee.id" value="${actionBean.employee.id}" />
            </table>

            <s:submit name="createEmployee" value="createEmployee"/>
        </s:form>

    </stripes:layout-component>
</stripes:layout-render>