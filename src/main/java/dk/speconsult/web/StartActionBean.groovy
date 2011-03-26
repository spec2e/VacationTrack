package dk.speconsult.web

import net.sourceforge.stripes.action.DefaultHandler
import net.sourceforge.stripes.action.Resolution

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 26-03-11
 * Time: 22:33
 * To change this template use File | Settings | File Templates.
 */
class StartActionBean extends BaseActionBean {

    @DefaultHandler
    public Resolution start() {
        forward("/WEB-INF/jsp/start.jsp")
    }
}
