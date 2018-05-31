/*
Скрипт для фрейма Sponsor:
* выгрузкa даных о бегунах 
* добааление новой записи спонсора
*/
package scripts;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import kurswork.MainClass;





public class ConDB {
    
    
    
    public String[] runnersInfo = new String[5100], runnerName = new String[5100];
    public String[] charityName = new String[5100], runnerLast = new String[5100];
    public int[] registrationId = new int[5100];
    
    
    int i = 0;
    
    public static void main(String[] args) throws SQLException, IOException {
        ConDB m = new ConDB();
        //m.testDatabase();
        m.insert(1374, 2024, 50);
        System.out.println(m.runnersInfo[100]);
        
    }

//Выгрузка данных о бегуне
    public void testDatabase() throws SQLException {    
        try {
 
            
           
            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stmt = con.createStatement();  
            //Супер-Залупер запрос
            ResultSet rs = stmt.executeQuery("SELECT LastName, FirstName, CountryName, BibNumber, CharityName, registration.RegistrationId    \n" +
                                                 "FROM registration, runner, country, user, registrationevent, charity, event, marathon   \n" +
                                                 "where registration.runnerID=runner.runnerID and \n" +
                                                 "    runner.Email=user.Email and\n" +
                                                 "    runner.CountryCode=country.CountryCode and\n" +
                                                 "    registrationevent.RegistrationId=registration.RegistrationId and\n" + 
                                                 "    charity.CharityId = registration.CharityId\n" +
                                                 "    and registrationevent.EventId = event.EventId and event.MarathonId = marathon.MarathonId and YearHeld = '2018'\n" + //Это строка станет камнем преткновения для запроса 
                                                 "    group by FirstName, LastName,CountryName;");
                
                try{
                while (rs.next()) {
                    String str = rs.getString("LastName") + " " + rs.getString("FirstName") + " - " + rs.getString("BibNumber") + " (" + rs.getString("CountryName") + ")";    
                    runnersInfo[i] = str;
                    runnerName[i] = rs.getString("FirstName");
                    charityName[i] = rs.getString("CharityName");
                    registrationId[i] = rs.getInt("registration.RegistrationId");
                    i++;
                }    
               
                rs.close();
                stmt.close();
            con.close();
            System.out.println("#" + i);
            System.out.println(charityName[1]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("дичь");}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//добавление записи о спонсорстве, чтобы работало необходимо войти как спонсор в систему, если сразу открыть форму, 
    //номера спонсора не будет и запрос работать не будет
    public void insert(int regId, int sponsormameId, int amount) throws IOException{
        
        try {
            
            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stm = con.createStatement();
            stm.executeUpdate("INSERT INTO sponsorship (SponsornameId, RegistrationId, Amount) VALUES ('" + sponsormameId + "', '" + regId + "', '" + amount + "');");
            stm.close();
            con.close();
            System.out.println("Запись добавлена");
        } catch (SQLException ex) {
            Logger.getLogger(ConDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Запись не добавлена");
        }
    }
}
