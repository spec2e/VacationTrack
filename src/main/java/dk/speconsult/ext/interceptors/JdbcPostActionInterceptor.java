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
 * Time: 21:07
 * To change this template use File | Settings | File Templates.
 */
@Intercepts(LifecycleStage.RequestComplete)
public class JdbcPostActionInterceptor implements Interceptor {

    public Resolution intercept(ExecutionContext context) throws Exception {

        Base.commitTransaction();
        Base.close();
        return context.proceed();
    }
}
