/*
Скрипт для выгрузки даных о 
*/
package scripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import kurswork.MainClass;




public class ConDB {
    public String[] runnersInfo = new String[5100], runnerName = new String[5100];
    public String[] sponsor = new String[5100], runnerLast = new String[5100];
    int i = 0;
    
    public static void main(String[] args) throws SQLException {
        ConDB m = new ConDB();
        m.testDatabase();
        System.out.println(m.runnersInfo[100]);
        
    }
 
    public void testDatabase() throws SQLException {    
        try {
        Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
                Statement stmt = con.createStatement();
                
                ResultSet rs = stmt.executeQuery("SELECT LastName, FirstName, CountryName, BibNumber, CharityName   \n" +
                                                 "FROM registration, runner, country, user, registrationevent, charity    \n" +
                                                 "where registration.runnerID=runner.runnerID and \n" +
                                                 "    runner.Email=user.Email and\n" +
                                                 "    runner.CountryCode=country.CountryCode and\n" +
                                                 "    registrationevent.RegistrationId=registration.RegistrationId and\n" + 
                                                 "    charity.CharityId = registration.CharityId\n" +
                                                 "    group by FirstName, LastName,CountryName;");
                
                try{
                while (rs.next()) {
                    String str = rs.getString("LastName") + " " + rs.getString("FirstName") + " - " + rs.getString("BibNumber") + " (" + rs.getString("CountryName") + ")";    
                    runnersInfo[i] = str;
                    runnerName[i] = rs.getString("FirstName");
                    sponsor[i] = rs.getString("CharityName");
                    i++;
                }    
               
                rs.close();
                stmt.close();
            con.close();
            System.out.println("#" + i);
            System.out.println(sponsor[1]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("дичь");
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
