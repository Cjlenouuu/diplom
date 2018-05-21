package kurswork;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainClass {

    public static String emailR; //email бегуна можно привести к строкам
    public static String runner;
    public static String sum;
    
    public static final String USER = "root";
    public static final String URL = "jdbc:mysql://localhost:3306/dip";//домашнее подключение localhost:3306/dip
    public static final String PASS = "";//дома без пароля


    public String view;
    public double height;
    public double weight;
    public double age;
    public String emailU = null;
    
    public static void main(String[] args) {
        
        
        
        new HomeF().setVisible(true);
        
    }  
}
