package dk.speconsult.web;

import net.sourceforge.stripes.action.Resolution
import dk.speconsult.web.BaseActionBean
import net.sourceforge.stripes.action.DefaultHandler
import net.sourceforge.stripes.action.UrlBinding
import activejdbc.Base
import dk.speconsult.model.Employee
import dk.speconsult.model.Company
import net.sourceforge.stripes.validation.Validate
import net.sourceforge.stripes.action.StrictBinding;

/**
 * Created by IntelliJ IDEA.
 * User: Soren Pedersen
 * Date: 18-03-11
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
@UrlBinding("/login.action")
public class LoginActionBean extends BaseActionBean {

    @StrictBinding(allow = ["login"])
    @Validate(required = true, on=["login"] )
    private String userName;

    @StrictBinding(allow = ["login"])
    @Validate(required = true, on=["login"] )
    private String password;

    @DefaultHandler
    public Resolution showLogin() {


        forward("/WEB-INF/jsp/login.jsp")
    }

    public Resolution login() {

        Employee e = new Employee()
        e.set("firstname", "John")
        e.set("lastname", "Doe")
        Company company = Company.createIt("company", "Maersk")
        e.setParent(company)
        e.saveIt()


    }

}
