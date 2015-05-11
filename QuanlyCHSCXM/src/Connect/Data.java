package Connect;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;


public class Data {
    private static Connection conn=null;
    public static Connection getConnection()
    {
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/demoqlchscxm", "root", "doduy1993");
           // JOptionPane.showConfirmDialog(null, "Đã sẵn sàng","Thông Báo",1);
            return conn;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ket noi khong thanh cong", "Thong Bao", 2);
            return null;
        }
    }
}
