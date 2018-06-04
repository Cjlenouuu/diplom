/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scripts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Timer {

    static String str;
    
    
     
    public static void main(String[] args) {
        rasnica();
    }
    public static String rasnica() {
        int pex = 0;
        String dateStr = null;

        try {
            // создаем формат, в котором будем парсить дату
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
                     
            Date date1 = new Date();  
            
            Date date2 = dateFormat.parse("01.07.2018 08:00");
 
            long milliseconds = date2.getTime() - date1.getTime();
            //System.out.println("\nРазница между датами в миллисекундах: " + milliseconds);
 
            // 1000 миллисекунд = 1 секунда
            int seconds = (int) (milliseconds / (1000));
            //System.out.println("Разница между датами в секундах: " + seconds);
 
            // 60 000 миллисекунд = 60 секунд = 1 минута
            int minutes = (int) (milliseconds / (60 * 1000));
            //System.out.println("Разница между датами в минутах: " + minutes);
 
            // 3 600 секунд = 60 минут = 1 час
            int hours = (int) (milliseconds / (60 * 60 * 1000));
            //System.out.println("Разница между датами в часах: " + hours);
 
            // 24 часа = 1 440 минут = 1 день
            int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
            //System.out.println("Разница между датами в днях: " + days);
            
            byte years = (byte) (days / 365);
            //System.out.println("Разница между датами в годах: " + years);
 
            int days1 = (int) (days - years * 365);
            //System.out.println("Разница между датами в днях: " + days1);
        
            int hours1 = (int) (hours - (years * 365 + days1)*24);
            //System.out.println("Разница между датами в часах: " + hours1);
            
            int minutes1 = (int) (minutes - ((years * 365 + days1) * 24 + hours1) * 60 );
            //System.out.println("Разница между датами в минутах: " + minutes1);
            
            int seconds1 = (int) (seconds - (((years * 365 + days1) * 24 + hours1) * 60 + minutes1) * 60);
            
            System.out.println("До конкурса " + days1 + " дней, " + hours1 + ":" + minutes1 + ":" + seconds1);
            String str = "До начала " +  days1 + " дней, " + hours1 + ":" + minutes1 + ":" + seconds1;
            dateStr = str;

       } catch (Exception e) {}

        return dateStr;
    }
}
