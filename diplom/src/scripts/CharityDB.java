
package scripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import kurswork.MainClass;




public class CharityDB {
    public String[] charity = new String[14];
    int i = 0;
    
    public static void main(String[] args) throws SQLException {
        CharityDB m = new CharityDB();
        m.testDatabase();
        System.out.println(m.charity[13]);
        
    }
 
    public void testDatabase() throws SQLException {    
        try {
 Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select CharityName from charity;");
                while (rs.next()) {
                    String str = rs.getString("CharityName");    
                    charity[i] = str;
                    i++; 
                }
                rs.close();
                stmt.close();
            con.close();
            System.out.println("#" + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
