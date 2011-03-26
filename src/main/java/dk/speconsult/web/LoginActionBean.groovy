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

public class LoginActionBean extends BaseActionBean {

    @Validate(required = true, on = ["login"])
    private String userName;

    @Validate(required = true, on = ["login"])
    private String password;

    private String loginUrl;

    @DefaultHandler
    public Resolution showLogin() {


        forward("/WEB-INF/jsp/login.jsp")
    }

    public Resolution login() {

        if (loginUrl) {
            redirect(loginUrl)
        } else {
            Employee e = new Employee()
            e.set("firstname", "John")
            e.set("lastname", "Doe")
            Company company = Company.createIt("company", "Maersk")
            e.setParent(company)
            e.saveIt()
            forward("/WEB-INF/jsp/login.jsp")

        }


    }

}
