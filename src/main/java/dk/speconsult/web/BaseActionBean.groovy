package dk.speconsult.web;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext
import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.action.ForwardResolution
import net.sourceforge.stripes.action.RedirectResolution;

/**
 * Created by IntelliJ IDEA.
 * User: S�ren Pedersen
 * Date: 18-03-11
 * Time: 21:34
 * To change this template use File | Settings | File Templates.
 */
public class BaseActionBean implements ActionBean {

    protected static final String EMPLOYEE_LIST_JSP = "/WEB-INF/jsp/employee/employeeList.jsp"
    protected static final String EMPLOYEE_CREATE_JSP = "/WEB-INF/jsp/employee/createemployee.jsp"

    ActionBeanContext context;
    String lastUrl;

    String selectedTopMenu;
    String selectedLeftMenu;

    Map<String, String> topMenu = [administrationTopMenu: "dk.speconsult.web.employee.ListEmployeesActionBean",
            vacationTopMenu: "dk.speconsult.web.LoginActionBean",
            settingsTopMenu: "dk.speconsult.web.LoginActionBean"]

    Map<String, String> adminMenu = [listEmployees: "dk.speconsult.web.employee.ListEmployeesActionBean",
            createEmployee: "dk.speconsult.web.employee.ProcessEmployeeBean",
            editEmployee: "dk.speconsult.web.employee.ProcessEmployeeBean",
            deleteEmployee: "dk.speconsult.web.employee.ProcessEmployeeBean"]

    Map<String, String> vacationMenu = [showVacationPlan: "dk.speconsult.web.employee.ListEmployeesActionBean",
            createNewVacationPlan: "dk.speconsult.web.LoginActionBean"]

    Map<String, String> settingsMenu = [listHolidays: "dk.speconsult.web.LoginActionBean"]


    @Override
    public void setContext(ActionBeanContext actionBeanContext) {
        this.context = actionBeanContext;
    }

    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    public Resolution forward(String uri) {
        return new ForwardResolution(uri)
    }

    public Resolution redirect(Class clazz) {
        return new RedirectResolution(clazz)
    }

    public Map getCurrentLeftMenu() {
         if(selectedTopMenu == 'vacationTopMenu') {
            return vacationMenu
        } else if(selectedTopMenu == 'settingsTopMenu') {
            return settingsMenu
        } else {
            return adminMenu
        }
    }

}
