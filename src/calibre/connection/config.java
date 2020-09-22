package Calibre.connection;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Curtin ID : 20205021
 *
 * @author : Tavish Dilmin Perera Dawatage
 * @version : 3.0
 */
//Connection with the SQLite Database
//Obtaiined from SQLITE Tutorial, https://www.sqlitetutorial.net/sqlite-java/sqlite-jdbc-driver/
//(accessed 10 April 2020)
public class config {

    Connection conn = null;

    public static Connection connectDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:data/calibre.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection Ok");

            return conn;

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
