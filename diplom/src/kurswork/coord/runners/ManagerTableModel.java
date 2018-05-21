
package kurswork.coord.runners;

import kurswork.coord.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import kurswork.MainClass;



public class ManagerTableModel extends AbstractTableModel{

    private int columnCount = 6;
    private ArrayList<String []> dataArrayList;
    int size;
    
    public ManagerTableModel() {
        dataArrayList = new ArrayList<String []>();
        int i;
        for (i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }      
    } 
    
    @Override
    public int getRowCount() {  //возвращает кол-во строк 
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() { //возвращает кол-во колонок
        return columnCount;
    }
    
    @Override
    public String getColumnName (int columnIndex) {
        switch (columnIndex) {
            case 0: return "Имя";
            case 1: return "Фамилия";
            case 2: return "E-mail";                
            case 3: return "Статус";                            
            case 4: return "";                            
            case 5: return "Дист";                            
        } 
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { //возвращает значение определённой ячейки таблици по номеру строки и столбца
        String []rows = dataArrayList.get(rowIndex);
        size = dataArrayList.size();
        return rows[columnIndex];
    }
    
    public void addData(String []row) {
        String []rowTable = new String[getColumnCount()];
        rowTable = row;
        dataArrayList.add(rowTable);
    }
    
    public void addData() throws SQLException { //Присваиваем методу строку по которой сортируем
        Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select user.Email, FirstName, LastName, RegistrationStatus, EventTypeName\n" +
                "from runner, registration, registrationstatus, user, registrationevent, event, eventtype\n" +
                "where user.Email = runner.Email and\n" +
                "runner.RunnerId = registration.RunnerId and\n" +
                "registration.RegistrationStatusId = registrationstatus.RegistrationStatusId and\n" +
                "registrationevent.RegistrationId = registration.RunnerId and \n" +
                "event.EventId = registrationevent.EventId and\n" +
                "eventtype.EventTypeId = event.EventTypeId;");
        while (rs.next()) {
            String []row = {
                rs.getString("user.Email"),
                rs.getString("FirstName"),
                rs.getString("LastName"),
                rs.getString("RegistrationStatus"),
                "",
                rs.getString("EventTypeName")
            };
            addData(row);
            //System.out.println(rs.getString("LastName"));
        }
    }
}
