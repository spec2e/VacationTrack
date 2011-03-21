package dk.speconsult.web;

import net.sourceforge.stripes.action.Resolution
import dk.speconsult.web.BaseActionBean
import net.sourceforge.stripes.action.DefaultHandler
import net.sourceforge.stripes.action.UrlBinding
import activejdbc.Base
import dk.speconsult.model.Employee
import dk.speconsult.model.Company;

/**
 * Created by IntelliJ IDEA.
 * User: Soren Pedersen
 * Date: 18-03-11
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
@UrlBinding("/login.action")
public class LoginBean extends BaseActionBean {

    @DefaultHandler
    public Resolution showLogin() {

        Employee e = new Employee()
        e.set("firstname", "John")
        e.set("lastname", "Doe")
        Company company = Company.createIt("company", "Maersk")
        e.setParent(company)
        e.saveIt()

        if(true) {
            throw new Exception("ROLL BACK!!!!");
        }

        forward("/WEB-INF/jsp/login.jsp")
    }

}
