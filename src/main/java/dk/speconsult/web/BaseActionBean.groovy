package dk.speconsult.web;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext
import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.action.ForwardResolution
import net.sourceforge.stripes.action.RedirectResolution;

/**
 * Created by IntelliJ IDEA.
 * User: S�ren Pedersen
 * Date: 18-03-11
 * Time: 21:34
 * To change this template use File | Settings | File Templates.
 */
public class BaseActionBean implements ActionBean {

    private ActionBeanContext context;
    String lastUrl;

    @Override
    public void setContext(ActionBeanContext actionBeanContext) {
        this.context = actionBeanContext;
    }

    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    public Resolution forward(String uri) {
        return new ForwardResolution(uri)
    }

    public Resolution redirect(String uri) {
        return new RedirectResolution(uri)
    }

}
