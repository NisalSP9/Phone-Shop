package com.phone_shop.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NisalSP9
 */
public class DBConnection {

    private static DBConnection dbConnection;
    private final Connection conn;
    private final String user;
    private final String password;
    private final String url;

    private DBConnection() throws SQLException, ClassNotFoundException {

        url = "jdbc:mysql://localhost/phone_shop";

        user = "root";

        password = "ep1137";

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {

        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }

        return dbConnection;
    }

    public Connection getConnection() {
        return conn;
    }
}
