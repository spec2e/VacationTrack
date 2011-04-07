<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>

<s:layout-render name="/WEB-INF/jsp/template/vctemplate.jsp" pageTitle="Using A Layout">
    <s:layout-component name="content">

        <table id="datatable" width="100%">
            <c:forEach items="${actionBean.employees}" var="employee">
                <tr>
                    <td><s:link beanclass="dk.speconsult.web.vacation.ListVacationBean" addSourcePage="true">${employee.firstName}&nbsp;${employee.lastName}</s:link></td>
                    <td>
                        <s:link beanclass="dk.speconsult.web.employee.ProcessEmployeeBean" event="showEmployee">
                            <s:param name="id" value="${employee.id}"/>
                            Ret
                        </s:link>&nbsp;|&nbsp;
                        <s:link beanclass="dk.speconsult.web.employee.ProcessEmployeeBean" event="deleteEmployee">
                            <s:param name="id" value="${employee.id}"/>
                            Slet
                        </s:link>
                    </td>

                </tr>
            </c:forEach>
        </table>

    </s:layout-component>
</s:layout-render>
