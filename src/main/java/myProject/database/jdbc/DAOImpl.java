package myProject.database.jdbc;

import myProject.database.DBException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Camille on 28.03.2016.
 */
public class DAOImpl {

    /**
     * Some variables to get db connection parameters
     */
    private static final String DB_CONFIG_FILE = "database.properties";
    private String dbUrl = null;
    private String userName = null;
    private String password = null;

    /**
     * Constructor with 2 methods
     */
    public  DAOImpl() {
        registerJDBCDriver();
        InitDatabaseConnectionProperties();
    }


    /**
     * register driver.   (Thanks, Cap!)
     */
    private void registerJDBCDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Exciption while registering JDBC driver!");
            e.printStackTrace();
        }

    }

    private void InitDatabaseConnectionProperties() {
        Properties properties = new Properties();
        try {
            properties.load(DAOImpl.class.getClassLoader().getResourceAsStream(DB_CONFIG_FILE)); //???
            dbUrl = properties.getProperty("dbUrl");
            userName = properties.getProperty("userName");
            password =   properties.getProperty("password");
        } catch (IOException e) {
            System.out.println("Exciption while reading JDBC configuration from file = " + DB_CONFIG_FILE);
            e.printStackTrace();
        }
    }

    protected Connection getConnection() throws DBException{
        try {
            return DriverManager.getConnection(dbUrl,userName,password);
        } catch (SQLException e) {
            System.out.println("Exciption while getting connection to database");
            e.printStackTrace();
            throw new DBException(e);
        }
    }

    protected void closeConnection (Connection connection) throws DBException {
        try {
            if (connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Exciption while closing connection to database");
            e.printStackTrace();
            throw new DBException(e);
        }
    }
}
