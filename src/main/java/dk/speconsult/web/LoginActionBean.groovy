package dk.speconsult.web;


import dk.speconsult.model.User
import net.sourceforge.stripes.action.DefaultHandler
import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.validation.SimpleError
import net.sourceforge.stripes.validation.Validate
import net.sourceforge.stripes.validation.ValidateNestedProperties

public class LoginActionBean extends BaseActionBean {


    @ValidateNestedProperties([
    @Validate(on = ["register"], field = "userName", required = true),
    @Validate(on = ["register"], field = "password", required = true)
    ])
    User user

    private String loginUrl;

    @DefaultHandler
    public Resolution showLogin() {
        forward(LOGIN_JSP)
    }

    public Resolution login() {

        User foundUser = User.findFirst("userName='${user.userName}' and password='${user.password}'");
        getContext().setUser(foundUser)
        if (!foundUser) {
            getContext().getValidationErrors().add("user.userName", new SimpleError("Kunne ikke finde brugernavn/password kombination"))
            forward(LOGIN_JSP)
        } else {
            redirect(dk.speconsult.web.employee.ListEmployeesActionBean.class)
        }
    }

}
