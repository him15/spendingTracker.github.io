package Db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
        public static Connection c;
        public static Statement st;
        static{
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false","root","incapp");
            st=c.createStatement();
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       }
    
        }
    
}
