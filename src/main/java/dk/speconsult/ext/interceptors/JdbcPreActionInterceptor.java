package dk.speconsult.ext.interceptors;

import activejdbc.Base;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.ExecutionContext;
import net.sourceforge.stripes.controller.Interceptor;
import net.sourceforge.stripes.controller.Intercepts;
import net.sourceforge.stripes.controller.LifecycleStage;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 21-03-11
 * Time: 21:03
 * To change this template use File | Settings | File Templates.
 */
@Intercepts(LifecycleStage.RequestInit)
public class JdbcPreActionInterceptor implements Interceptor {
    public Resolution intercept(ExecutionContext context) throws Exception {
        context.getActionBeanContext().getRequest().setCharacterEncoding("UTF-8");
        Base.open("java:comp/env/jdbc/vacationrecord");
        Base.connection().setAutoCommit(false);
        return context.proceed();
    }
}
