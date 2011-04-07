package dk.speconsult.web.employee;

import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.action.DefaultHandler
import dk.speconsult.web.BaseActionBean
import dk.speconsult.model.Employee
import dk.speconsult.model.Company
import net.sourceforge.stripes.validation.Validate
import net.sourceforge.stripes.validation.ValidateNestedProperties

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 26-03-11
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
public class ProcessEmployeeBean extends BaseActionBean {

    @ValidateNestedProperties([
            @Validate(field="firstName", required=true, on=["editEmployee", "createEmployee"])
    ])
    Employee employee

    int id

    @DefaultHandler
    public Resolution showEmployee() {
        if (id > 0) {
            employee = Employee.findFirst("id=${id} and company_id=${company.id}")
            forward(EMPLOYEE_EDIT_JSP)
        } else {
            forward(EMPLOYEE_CREATE_JSP)
        }
    }

    public Resolution editEmployee() {
        Company company = getCompany()
        List<Employee> emps = Employee.find("id=${id} and company_id=${company.id}").include(Company.class)
        Employee toUpdate = emps[0]
        toUpdate.copyFrom(employee)
        toUpdate.saveIt()
        redirect(ListEmployeesActionBean.class)
    }

    public Resolution createEmployee() {
        Company company = getCompany()
        employee.setParent(company)
        employee.saveIt()
        redirect(ListEmployeesActionBean.class)
    }

    public Resolution deleteEmployee() {
        Company company = getCompany()
        List<Employee> emps = Employee.find("id=${id} and company_id=${company.id}")
        Employee toUpdate = emps[0]
        toUpdate.delete()
        redirect(ListEmployeesActionBean.class)
    }

}
