package dk.speconsult.ext;

import dk.speconsult.model.Employee;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 21-03-11
 * Time: 21:56
 * To change this template use File | Settings | File Templates.
 */
public class VacationTrackActionBeanContext extends ActionBeanContext {

    public Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
