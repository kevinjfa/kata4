package es.software.ulpgc.kata4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLTitleReader {
    public List<Title> read() {
        List<Title> titles = new ArrayList<Title>();
        Connection con = SQLiteConnection.connect();
        if (con != null) {
            String query = "SELECT * FROM Titles;";
            try {
                con.createStatement();
                ResultSet rs = con.createStatement().executeQuery(query);
                while(rs.next()) {
                    String title = rs.getString("Title");
                    String id = rs.getString("ID");
                    String type = rs.getString("Type");
                    Title t = new Title(id, Title.TitleType.valueOf(type), title);
                    titles.add(t);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return titles;
    }
}
