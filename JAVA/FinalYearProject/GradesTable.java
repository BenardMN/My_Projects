package FinalYearProject;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GradesTable extends javax.swing.JFrame{
    //NEW gradesTable form
    public GradesTable(){
        initComponents();
        show_Student_Details();
    }
    public Connection createConnection(){
        Connection conn = null;
        //try to connect to steudentsdb database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studentsdb";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (Exception e) {
            //prints error if not connected
            e.printStackTrace();
            return null;
        }
    }
    
}
