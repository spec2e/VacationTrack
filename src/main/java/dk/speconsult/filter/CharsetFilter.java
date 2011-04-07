package dk.speconsult.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 07-04-11
 * Time: 21:48
 * To change this template use File | Settings | File Templates.
 */
public class CharsetFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
