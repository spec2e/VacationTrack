package dk.speconsult.model;

import activejdbc.Model;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 06-04-11
 * Time: 21:14
 * To change this template use File | Settings | File Templates.
 */
public class User extends Model {

    public int getUserId() {
        return getInteger("id");
    }

    public String getUserName() {
        return getString("userName");
    }

    public void setUserName(String userName) {
        set("userName", userName);
    }

    public String getPassword() {
        return getString("password");
    }

    public void setPassword(String password) {
        set("password", password);
    }
}
