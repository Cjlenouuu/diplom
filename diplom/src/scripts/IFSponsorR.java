/*
Скрипт для выгрузки даных спонсорской организации и спонсоров, которые спонсировали данного бегуна. 
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

public class IFSponsorR {
    
    public String charity = new String();//спонсорсакая организация
    public String description = new String();//описаник к спонсорсакой организации
    public String[] sponsor = new String[50];//непосредственно спонсор
    public String[] amount = new String[50];//пожертвование спонсора
    int i = 0;
    
            
    public static void main(String[] args) throws IOException {
        IFSponsorR m = new IFSponsorR();
        //System.out.println(m.countDB("a.adkin@dayrep.net"));
        m.loadingDB("a.adkin@dayrep.net");
        //System.out.println(m.sponsor[1]);
        
    }
      public int countDB1(String emailRunner) {
        int cDB = 0;
         try {
        Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
             
            Statement stmt = con.createStatement();
                
            ResultSet rs = stmt.executeQuery("select SponsorName \n" +
                                                "from sponsorname,runner, charity, registration, sponsorship\n" +
                                                "where runner.RunnerId = registration.RunnerId and\n" +
                                                "    registration.CharityId = charity.CharityId and\n" +
                                                "    sponsorship.RegistrationId = registration.RegistrationId and\n" +
                                                "    Email like '" + emailRunner + "';");
    
   try{     
                rs.first();
                cDB = rs.getInt(1);
                rs.close();
                stmt.close();
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cDB;
    }
      
      
      
      
  public int countDB(String emailRunner) {
        int cDB = 0;
         try {
        Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
             
            Statement stmt = con.createStatement();
                
            ResultSet rs = stmt.executeQuery("select count(SponsorName)\n" +
                                                "from runner, charity, registration, sponsorship\n" +
                                                "where runner.RunnerId = registration.RunnerId and\n" +
                                                "    registration.CharityId = charity.CharityId and\n" +
                                                "    sponsorship.RegistrationId = registration.RegistrationId and\n" +
                                                "    Email like '" + emailRunner + "';");
    
   try{     
                rs.first();
                cDB = rs.getInt(1);
                rs.close();
                stmt.close();
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cDB;
    }
   
    public void loadingDB(String emailRunner) throws IOException {
        
    try {
 
            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
             
            Statement stmt = con.createStatement();
                
            ResultSet rs = stmt.executeQuery("select CharityName, SponsorName, Amount, CharityDescription\n" +
                                                "from runner, charity, registration, sponsorship\n" +
                                                "where runner.RunnerId = registration.RunnerId and\n" +
                                                "    registration.CharityId = charity.CharityId and\n" +
                                                "    sponsorship.RegistrationId = registration.RegistrationId and\n" +
                                                "    Email like '" + emailRunner + "';");
                
                try{
                    
                while (rs.next()) {
                    sponsor[i] = rs.getString("SponsorName");
                    amount[i] = rs.getString("Amount");
                    System.out.print(sponsor[i]);
                    System.out.println(" " + amount[i]);
                    i++;
                }    
                rs.first();
                charity = rs.getString("CharityName");
                description = rs.getString("CharityDescription");
                
                rs.close();
                stmt.close();
            con.close();
            System.out.println("#" + i);
            System.out.println(charity);
            System.out.println(description);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("дичь");
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
