package dk.speconsult.web.employee;

import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.action.DefaultHandler
import dk.speconsult.web.BaseActionBean
import dk.speconsult.model.Employee
import dk.speconsult.model.Company

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 26-03-11
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
class ProcessEmployeeBean extends BaseActionBean {

    Employee employee

    int id

    @DefaultHandler
    public Resolution showEmployee() {
        if (id > 0) {
            employee = Employee.findById(id)
            forward(EMPLOYEE_EDIT_JSP)
        } else {
            forward(EMPLOYEE_CREATE_JSP)
        }
    }

    public Resolution editEmployee() {
        Company company = getContext().getCompany();
        List<Employee> emps = Employee.find("id=${id} and company_id=${company.id}").include(Company.class)
        Employee toUpdate = emps[0]
        toUpdate.copyFrom(employee)
        toUpdate.saveIt()
        redirect(ListEmployeesActionBean.class)
    }

    public Resolution createEmployee() {
        Company company = getContext().getCompany();
        employee.setParent(company)
        employee.saveIt()
        redirect(ListEmployeesActionBean.class)
    }

    public Resolution deleteEmployee() {
        Company company = getContext().getCompany();
        List<Employee> emps = Employee.find("id=${id} and company_id=${company.id}")
        Employee toUpdate = emps[0]
        toUpdate.delete()
        redirect(ListEmployeesActionBean.class)
    }

}