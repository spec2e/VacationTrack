package dk.speconsult.web

import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.action.DefaultHandler
import dk.speconsult.model.Employee
import dk.speconsult.model.Company
import activejdbc.Base

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 26-03-11
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
class ListEmployeesActionBean extends BaseActionBean {

    List<Employee> employees;

    @DefaultHandler
    public Resolution listEmployees() {
        employees = Employee.findAll().include(Company.class);
        forward("/WEB-INF/jsp/employeeList.jsp")
    }


}
