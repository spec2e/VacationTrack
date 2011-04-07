<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<s:layout-render name="/WEB-INF/jsp/template/vclogintemplate.jsp" pageTitle="Using A Layout">
    <s:layout-component name="content">

        <s:form beanclass="dk.speconsult.web.LoginActionBean">
            <table>
                <tbody>
                <tr>
                    <td class="right">
                        <s:label for="user.userName"/>
                    </td>
                    <td class="left">
                        <s:text name="user.userName"/>
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <s:label for="user.password"/>
                    </td>
                    <td class="left">
                        <s:password name="user.password"/>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td class="left"><s:submit name="login" value="login"/></td>
                </tr>
                </tbody>
            </table>
        </s:form>

    </s:layout-component>
</s:layout-render>
