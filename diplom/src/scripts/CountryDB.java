
package scripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import kurswork.MainClass;




public class CountryDB {
    public String[] country = new String[93];
    int i = 0;
    
    public static void main(String[] args) throws SQLException {
        CountryDB m = new CountryDB();
        m.testDatabase();
        System.out.println(m.country[92]);
        
    }
 
    public void testDatabase() throws SQLException {    
        try {
 
                Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
           
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select distinct(CountryName) from country;");
                while (rs.next()) {
                    String str = rs.getString("CountryName");    
                    country[i] = str;
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
