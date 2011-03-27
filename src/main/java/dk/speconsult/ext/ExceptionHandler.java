package dk.speconsult.ext;

import activejdbc.Base;
import net.sourceforge.stripes.exception.DefaultExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 21-03-11
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionHandler extends DefaultExceptionHandler {


    public void catchAllAndRollBack(Throwable thr, HttpServletRequest request, HttpServletResponse response) {

        System.err.println("Exception caught. Rolling back and closing connection!");
        thr.printStackTrace();

        try {
            if (!Base.connection().isClosed()) {
                Base.rollbackTransaction();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
