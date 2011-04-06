package dk.speconsult.web

import net.sourceforge.stripes.action.DefaultHandler
import net.sourceforge.stripes.action.Resolution
import dk.speconsult.model.User
import net.sourceforge.stripes.validation.ValidateNestedProperties
import net.sourceforge.stripes.validation.Validate

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 26-03-11
 * Time: 22:33
 * To change this template use File | Settings | File Templates.
 */
class StartActionBean extends BaseActionBean {

    @ValidateNestedProperties([
            @Validate(on=["register"], field="userName", required=true),
            @Validate(on=["register"], field="password", required=true)
    ])
    User user

    @Validate(on=["register"], required=true)
    String confirmPassword


    @DefaultHandler
    public Resolution start() {
        forward(START_JSP)
    }

    public Resolution showRegister() {
        forward(REGISTER_JSP)
    }

    public Resolution register() {
        user.setParent(getCompany())
        user.saveIt()
        forward(LOGIN_JSP)
    }

}
