package es.software.ulpgc.kata4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {
    private static final String url = "jdbc:sqlite:C:/Users/kevin/Ingeniería informática/Tercero/IS2/SQLite/kata4";
    public static Connection connect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
