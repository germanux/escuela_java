/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinensia.modelo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sinensia.modelo.User;

/**
 *
 * @author alumno
 */
public class UserDAO_DerbyDB implements IUserDAO {

    private static final String CONEX_DB = "jdbc:derby://localhost:1527/db_users";
    private static final String USER_DB = "root";
    private static final String PSSWD_DB = "1234";
    
    public UserDAO_DerbyDB() {
        // Cargamos el driver de Derby DB. Está basado en JDBC,
        // Una implementación de ODBC para Java
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            Logger.getLogger(UserDAO_DerbyDB.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    @Override
    public User create(User user) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(CONEX_DB, USER_DB, PSSWD_DB);
            String sqlQuery = "INSERT INTO users (email, password, name, age) VALUES ("
                    + " '" + user.getEmail() 
                    + "', '" + user.getPassword()
                    + "', '" + user.getName()
                    + "', " + user.getAge() + ")";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sqlQuery);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO_DerbyDB.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return null;
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
