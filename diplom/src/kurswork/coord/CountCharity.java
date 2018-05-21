
package kurswork.coord;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import kurswork.MainClass;


public class CountCharity {
    
    int ConCh(String query) throws SQLException{ //Метод получения числовых данных из БД Если вносить сам запрос в вызов метода
        int returnCh = 0;
        
            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            returnCh = rs.getInt(1);
            
        
        return returnCh;
    }
    //Два метода которые вызывают метод с верху и вносят необходимый запрос 
    int SumCh() throws SQLException {
        int sumCh = ConCh("SELECT sum(Amount) FROM sponsorship;");
        return sumCh;
    }
    
    int CountCh() throws SQLException{
        int countCh = ConCh("SELECT count(CharityId) FROM charity;");
        return countCh;
    }
    
    
}
