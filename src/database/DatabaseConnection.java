/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Acer
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:contacts.db";
public static Connection getConnection() throws SQLException {
return DriverManager.getConnection(URL);
}
}
