package dk.speconsult.ext;

import activejdbc.Base;
import net.sourceforge.stripes.exception.DefaultExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

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

        try {
            if (!Base.connection().isClosed()) {
                Base.rollbackTransaction();
                Base.close();
            }
        } catch (Throwable e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
