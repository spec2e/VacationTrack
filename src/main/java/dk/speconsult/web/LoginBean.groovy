package dk.speconsult.web;

import net.sourceforge.stripes.action.Resolution
import dk.speconsult.web.BaseActionBean
import net.sourceforge.stripes.action.DefaultHandler
import net.sourceforge.stripes.action.UrlBinding
import activejdbc.Base
import dk.speconsult.model.Employee
import dk.speconsult.model.Company;

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

        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/vacationrecord", "root", "qq");
        Base.connection().setAutoCommit(false);

        try {
            Employee e = new Employee()
            e.set("firstname", "John")
            e.set("lastname", "Doe")
            Company company = Company.createIt("company", "Maersk")
            e.setParent(company)
            e.saveIt()
            Base.commitTransaction();
        }catch(Throwable thr) {
            thr.printStackTrace()
            throw thr
            Base.rollbackTransaction()
        } finally {
            Base.close();
        }
        forward("/WEB-INF/jsp/login.jsp")
    }

}
