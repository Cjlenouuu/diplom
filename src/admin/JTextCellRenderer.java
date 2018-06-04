/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
//Для то что бы в таблице текст авто переносился на следующею строку
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;


public class JTextCellRenderer extends JTextArea implements TableCellRenderer{
    private static final long serialVersionUID = 1L;
    public JTextCellRenderer()
    {
        super();
        setLineWrap(true);
        setWrapStyleWord(true);
    }
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object arg1, boolean isSelected, boolean hasFocus, int row, int column)
    {
        String data = (String) arg1.toString();
            int lineWidth = this.getFontMetrics(this.getFont()).stringWidth(data);
            int lineHeight = this.getFontMetrics(this.getFont()).getHeight();
            int rowWidth = table.getCellRect(row, column, true).width;
          
            int newRowHeight = (int) ((lineWidth / rowWidth) * (lineHeight)) + lineHeight * 10;
            
            if (table.getRowHeight(row) != newRowHeight) {
                table.setRowHeight(row, newRowHeight);
            }
            this.setText(data);
            return this;
    }
}

//public class JTextCellRenderer extends JTextArea
//implements TableCellRenderer
//{
  //  private static final long serialVersionUID = 1L;
   // public JTextCellRenderer()
    //{
      //  super();
       // setLineWrap(true);
        //setWrapStyleWord(true);
    //}
   
