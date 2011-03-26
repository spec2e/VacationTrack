package dk.speconsult.ext.interceptors

import dk.speconsult.ext.VacationTrackActionBeanContext
import dk.speconsult.web.BaseActionBean
import dk.speconsult.web.LoginActionBean
import net.sourceforge.stripes.action.ActionBean
import net.sourceforge.stripes.action.RedirectResolution
import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.controller.ExecutionContext
import net.sourceforge.stripes.controller.Interceptor

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 21-03-11
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 */
public class LoginInterceptor implements Interceptor {

    private static final ArrayList<Class<? extends BaseActionBean >> ALLOW = [LoginActionBean.class]

    public Resolution intercept(ExecutionContext execContext) throws Exception {

        Resolution resolution = execContext.proceed();

        VacationTrackActionBeanContext ctx = (VacationTrackActionBeanContext) execContext.getActionBeanContext();

        BaseActionBean actionBean = (BaseActionBean) execContext.getActionBean();

        Class cls = actionBean.getClass();

        if (ctx.getEmployee() == null && !ALLOW.contains(cls)) {

            resolution = new RedirectResolution(LoginActionBean.class);

            if (ctx.getRequest().getMethod().equalsIgnoreCase("GET")) {
                ((RedirectResolution) resolution).addParameter("loginUrl", actionBean.lastUrl);
            }
        }

        return resolution;
    }
}