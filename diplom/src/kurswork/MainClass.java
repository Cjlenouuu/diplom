package kurswork;

import java.awt.Color;
import java.awt.Font;


public class MainClass {

    public static String emailR; //email бегуна можно привести к строкам
    public static int emailS; //email спонсора можно привести к строкам
    public static String runner;
    public static String sum;
    public static Color greenColor = new java.awt.Color(0, 144, 62);
    public static Color yellowColor = new java.awt.Color(253, 193, 0);
    public static Font fontB = new java.awt.Font("Century Gothic", 3, 14);
    
    public static  String USER = "root";
    public static  String URL = "jdbc:mysql://kab401-10:3306/kurs";//домашнее подключение localhost:3306/dip
    public static  String PASS = "root";//Пароль для подключения
    
    
    
    
    


    public String view;
    public double height;
    public double weight;
    public double age;
    public String emailU = null;
    
    public static void main(String[] args) {
        
        
        
        new HomeF().setVisible(true);
        
    }  
}
