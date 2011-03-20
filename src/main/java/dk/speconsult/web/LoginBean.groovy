package dk.speconsult.web;

import net.sourceforge.stripes.action.Resolution
import dk.speconsult.web.BaseActionBean
import net.sourceforge.stripes.action.DefaultHandler
import net.sourceforge.stripes.action.UrlBinding;

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
        forward("/WEB-INF/login.jsp")
    }

}
