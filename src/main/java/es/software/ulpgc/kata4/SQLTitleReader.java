package es.software.ulpgc.kata4;

import java.util.ArrayList;
import java.util.List;

public class SQLTitleReader {
    public List<Title> read() {
        List<Title> titles = new ArrayList<Title>();
        Connection con = SQLiteConnection.connect();
    }
}
