
package kurswork.coord;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import kurswork.MainClass;

//public void setRowHeight(int rowHeight)

public class SponsorTableModel extends AbstractTableModel{
    
    int columnRow = getRowCount();
    
    private int columnCount = 3;
    private ArrayList<String []> dataArrayList;
    public String[] logo = new String[columnRow],
             name = new String[columnRow], 
             summ = new String[columnRow];
    
    public SponsorTableModel() {
        dataArrayList = new ArrayList<String []>();
        int i;
        for (i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    } 
    
    @Override
    public int getRowCount() {  //возвращает кол-во строк
        int columnRow = 0;
        try {
        columnRow = getCount();//вызывает метод получения строк
        } catch (SQLException ex) {
            Logger.getLogger(SponsorTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return columnRow;
    }

    @Override
    public int getColumnCount() { //возвращает кол-во колонок
        return columnCount;
    }
    //Укозание заголовков столбцов 
    @Override
    public String getColumnName (int columnIndex) {
        switch (columnIndex) {
            case 0: return "Logo";
            case 1: return "Name";
            case 2: return "Summa";                
        } 
        return "";
    }

    //Описываю тип данных столбцов
    @Override
    public Class<?> getColumnClass(int column) {
        switch (column) {
            case 0: return Icon.class;
            default: return String.class;
        }
    }
    
    //Заполняет таблицу
    @Override
    public Object getValueAt(int row, int column) { //возвращает значение определённой ячейки таблици по номеру строки и столбца
        
        switch (column) {
                case 0: return new ImageIcon("src/materials/charityLogo/" + logo[row]);
                case 1: return new String(name[row]);
                case 2: return new String(summ[row]);//src\materials\charityLogo
            }
            return "Не определена";
    }
    
    //Набирает записи в таблицу из БД
    public void addData() throws SQLException { 
        int i = 0;
        
        Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select CharityLogo, CharityName, sum(Amount) \n" +
                "from charity, registration, sponsorship\n" +
                "where charity.CharityId = registration.CharityId and\n" +
                "	registration.RegistrationId = sponsorship.RegistrationId\n" +
                "group by CharityName\n" +
                "order by CharityLogo;");
        
        
        while (rs.next()) {
            logo[i] = rs.getString("CharityLogo");
            name[i] = rs.getString("CharityName");
            summ[i] = rs.getString("sum(Amount)");
            i++;            
        }
        rs.close();st.close();con.close();
    }
    
    public int getCount() throws SQLException { 
        Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select count(CharityName) from charity;");
        
        rs.next();
        
        String columnRS = rs.getString(1);
        int columnRow = Integer.parseInt(columnRS); 
        rs.close();st.close();con.close();
        return columnRow ;
    }
}
