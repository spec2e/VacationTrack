package dk.speconsult.web;

import net.sourceforge.stripes.action.Resolution
import dk.speconsult.web.BaseActionBean;

/**
 * Created by IntelliJ IDEA.
 * User: Søren Pedersen
 * Date: 18-03-11
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public class LoginBean extends BaseActionBean {

    public Resolution showLogin() {
        forward("./")
    }

}
