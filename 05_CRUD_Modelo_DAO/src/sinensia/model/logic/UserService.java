/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinensia.model.logic;

import java.sql.SQLException;
import java.util.List;
import sinensia.modelo.User;
import sinensia.modelo.persistence.IUserDAO;
import sinensia.modelo.persistence.UserDAO_DerbyDB;

/**
 *
 * @author alumno
 */
public class UserService {
    
    IUserDAO daoUsers;
    
    public UserService(IUserDAO daoUsers) {
        this.daoUsers = daoUsers;
    }

    public User create(String email, String password, String name, int edad) throws SQLException {
        User u = null;
        if (email != null && password != null && name != null) {
            if (email.length() > 3
                    && !password.equals("")
                    && !name.equals("")
                    && edad > 0) {

                u = new User(email, password, name, edad);
                u = daoUsers.create(u);
            }            
        }
        return u;
    }
    public List<User> getAll() throws SQLException {
        return daoUsers.getAll();
    }
    public boolean remove(int id)throws SQLException {
        return daoUsers.remove(id);
    }
}
