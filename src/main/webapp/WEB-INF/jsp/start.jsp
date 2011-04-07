<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<s:layout-render name="/WEB-INF/jsp/template/vclogintemplate.jsp">
    <s:layout-component name="content">
        <h1>This is the start page!</h1>
        <s:link beanclass="dk.speconsult.web.StartActionBean" event="showRegister">Registrer ny bruger</s:link>
        <s:link beanclass="dk.speconsult.web.LoginActionBean" event="showLogin">Log ind</s:link>
    </s:layout-component>
</s:layout-render>
