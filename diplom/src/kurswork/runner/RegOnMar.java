/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurswork.runner;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import kurswork.MainClass;
import kurswork.Reg;
import scripts.CharityDB;


public class RegOnMar extends javax.swing.JFrame {
 
int sum = 0 ;
boolean error = false;
public static String charityNum;
   // public static int sum;
    /**
     * 
     * Creates new form Wablon
     */
    public RegOnMar() {
        super("Регистрация");
        initComponents();{
        getCharity();
        }
        setLocationRelativeTo(null);
    }
    private void getCharity()
    {
         try {
                Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select CharityName from charity;");
                while (rs.next()) {
                    String str = rs.getString("CharityName");    
                    charityCB.addItem(str);
                }
                rs.close();
                stmt.close();
            con.close();
           
        } catch (Exception e) {
            e.printStackTrace();
             System.out.println("?");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        mainP = new javax.swing.JPanel();
        headP = new javax.swing.JPanel();
        titelL = new javax.swing.JLabel();
        backB = new javax.swing.JButton();
        dawnP = new javax.swing.JPanel();
        timerL = new javax.swing.JLabel();
        sumL = new javax.swing.JLabel();
        titelL2 = new javax.swing.JLabel();
        titelL3 = new javax.swing.JLabel();
        titelL4 = new javax.swing.JLabel();
        complaRB = new javax.swing.JRadioButton();
        complbRB = new javax.swing.JRadioButton();
        complcRB = new javax.swing.JRadioButton();
        fullmCB = new javax.swing.JCheckBox();
        halfmCB = new javax.swing.JCheckBox();
        smallmCB = new javax.swing.JCheckBox();
        titelL5 = new javax.swing.JLabel();
        regB = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        titelL6 = new javax.swing.JLabel();
        titelL7 = new javax.swing.JLabel();
        titelL8 = new javax.swing.JLabel();
        charityCB = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        mainP.setBackground(new java.awt.Color(253, 193, 0));
        mainP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headP.setBackground(new java.awt.Color(0, 144, 62));

        titelL.setBackground(new java.awt.Color(36, 29, 112));
        titelL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        titelL.setForeground(new java.awt.Color(235, 235, 235));
        titelL.setText("MARATHON SKILLS 2017");

        backB.setBackground(new java.awt.Color(253, 193, 0));
        backB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        backB.setForeground(new java.awt.Color(80, 80, 80));
        backB.setText("Назад");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headPLayout = new javax.swing.GroupLayout(headP);
        headP.setLayout(headPLayout);
        headPLayout.setHorizontalGroup(
            headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(titelL)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        headPLayout.setVerticalGroup(
            headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titelL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        mainP.add(headP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dawnP.setBackground(new java.awt.Color(0, 144, 62));

        timerL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        timerL.setForeground(new java.awt.Color(235, 235, 235));
        timerL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerL.setText(scripts.Timer.rasnica());

        javax.swing.GroupLayout dawnPLayout = new javax.swing.GroupLayout(dawnP);
        dawnP.setLayout(dawnPLayout);
        dawnPLayout.setHorizontalGroup(
            dawnPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dawnPLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(timerL, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        dawnPLayout.setVerticalGroup(
            dawnPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dawnPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timerL, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainP.add(dawnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, -1, -1));

        sumL.setBackground(new java.awt.Color(36, 29, 112));
        sumL.setFont(new java.awt.Font("Century Gothic", 1, 64)); // NOI18N
        sumL.setForeground(new java.awt.Color(80, 80, 80));
        sumL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainP.add(sumL, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 310, 80));

        titelL2.setBackground(new java.awt.Color(36, 29, 112));
        titelL2.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        titelL2.setForeground(new java.awt.Color(80, 80, 80));
        titelL2.setText("<html><p>Пожалуйста, заполните всю информацию,</p> чтобы зарегистрироваться на Skills Marathon 2018,</p><p> проводимом в Вятских Полянах, Russia.</p><p> С вами свяжутся после регистрации для уточнения оплаты</p><p> и другой информации.</p></html>");
        mainP.add(titelL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 127, 650, 120));

        titelL3.setBackground(new java.awt.Color(36, 29, 112));
        titelL3.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        titelL3.setForeground(new java.awt.Color(80, 80, 80));
        titelL3.setText("Сумма взноса:");
        mainP.add(titelL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        titelL4.setBackground(new java.awt.Color(36, 29, 112));
        titelL4.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        titelL4.setForeground(new java.awt.Color(80, 80, 80));
        titelL4.setText("Варианты комплектов:");
        mainP.add(titelL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        complaRB.setBackground(new java.awt.Color(253, 193, 0));
        complaRB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        complaRB.setForeground(new java.awt.Color(80, 80, 80));
        complaRB.setText("<html><p>Вариант А($0): Номер бегуна + </p><p>RFID браслет.</p></html>");
        complaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaRBActionPerformed(evt);
            }
        });
        mainP.add(complaRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        complbRB.setBackground(new java.awt.Color(253, 193, 0));
        complbRB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        complbRB.setForeground(new java.awt.Color(80, 80, 80));
        complbRB.setText("<html><p>Вариант B($20): Вариант А +</p><p>бейсболка + бутылка воды.</p></html>");
        complbRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complbRBActionPerformed(evt);
            }
        });
        mainP.add(complbRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        complcRB.setBackground(new java.awt.Color(253, 193, 0));
        complcRB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        complcRB.setForeground(new java.awt.Color(80, 80, 80));
        complcRB.setText("<HTML><p>Вариант С($45): Вариант B + </p><p>футболка + сувенирный пакет.</p></html>");
        complcRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complcRBActionPerformed(evt);
            }
        });
        mainP.add(complcRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        fullmCB.setBackground(new java.awt.Color(253, 193, 0));
        fullmCB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fullmCB.setForeground(new java.awt.Color(80, 80, 80));
        fullmCB.setText("42 km Полный марафон ($145$) ");
        fullmCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullmCBActionPerformed(evt);
            }
        });
        mainP.add(fullmCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        halfmCB.setBackground(new java.awt.Color(253, 193, 0));
        halfmCB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        halfmCB.setForeground(new java.awt.Color(80, 80, 80));
        halfmCB.setText("21 km Полумарафон ($75$)");
        halfmCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfmCBActionPerformed(evt);
            }
        });
        mainP.add(halfmCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        smallmCB.setBackground(new java.awt.Color(253, 193, 0));
        smallmCB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        smallmCB.setForeground(new java.awt.Color(80, 80, 80));
        smallmCB.setText("5 km Малая дистанция ($20$)");
        smallmCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallmCBActionPerformed(evt);
            }
        });
        mainP.add(smallmCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        titelL5.setBackground(new java.awt.Color(36, 29, 112));
        titelL5.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        titelL5.setForeground(new java.awt.Color(80, 80, 80));
        titelL5.setText("Регистрация на марафон");
        mainP.add(titelL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 88, -1, 35));

        regB.setBackground(new java.awt.Color(0, 144, 62));
        regB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        regB.setForeground(new java.awt.Color(235, 235, 235));
        regB.setText("Регистрация");
        regB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBActionPerformed(evt);
            }
        });
        mainP.add(regB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 144, 62));
        jButton2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(235, 235, 235));
        jButton2.setText("Отмена");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mainP.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 110, 30));

        titelL6.setBackground(new java.awt.Color(36, 29, 112));
        titelL6.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        titelL6.setForeground(new java.awt.Color(80, 80, 80));
        titelL6.setText("Регистрационный взнос");
        mainP.add(titelL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, 35));

        titelL7.setBackground(new java.awt.Color(36, 29, 112));
        titelL7.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        titelL7.setForeground(new java.awt.Color(80, 80, 80));
        titelL7.setText("Виды марафона:");
        mainP.add(titelL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 264, -1, -1));

        titelL8.setBackground(new java.awt.Color(36, 29, 112));
        titelL8.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        titelL8.setForeground(new java.awt.Color(80, 80, 80));
        titelL8.setText("Взнос:");
        mainP.add(titelL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        charityCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charityCBActionPerformed(evt);
            }
        });
        mainP.add(charityCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 170, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/вопрос.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        mainP.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 436, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
ButtonGroup group = new ButtonGroup();
    private void complaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaRBActionPerformed
        if (complaRB.isSelected()) {
    sum = 0;
    } else {if (complbRB.isSelected()){
        sum = 20;
    } else {if (complcRB.isSelected())
            {sum = 45;} else error = true;}};
 if (fullmCB.isSelected()){sum = sum + 145;
        };
if (halfmCB.isSelected()){sum = sum + 75;
        };
if (smallmCB.isSelected()){sum = sum + 20;
        };       
sumL.setText("$" +sum);        group.add(complaRB);
    }//GEN-LAST:event_complaRBActionPerformed

    private void complbRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complbRBActionPerformed
        if (complaRB.isSelected()) {
    sum = 0;
    } else {if (complbRB.isSelected()){
        sum = 20;
    } else {if (complcRB.isSelected())
            {sum = 45;} else error = true;}};
 if (fullmCB.isSelected()){sum = sum + 145;
        };
if (halfmCB.isSelected()){sum = sum + 75;
        };
if (smallmCB.isSelected()){sum = sum + 20;
        };       
sumL.setText("$" +sum);         group.add(complbRB);
    }//GEN-LAST:event_complbRBActionPerformed

    private void complcRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complcRBActionPerformed
        if (complaRB.isSelected()) {
    sum = 0;
    } else {if (complbRB.isSelected()){
        sum = 20;
    } else {if (complcRB.isSelected())
            {sum = 45;} else error = true;}};
 if (fullmCB.isSelected()){sum = sum + 145;
        };
if (halfmCB.isSelected()){sum = sum + 75;
        };
if (smallmCB.isSelected()){sum = sum + 20;
        };       
sumL.setText("$" +sum);
group.add(complcRB);
    }//GEN-LAST:event_complcRBActionPerformed

    private void regBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBActionPerformed
        String runnerID = null;
        String complect = null;
        error=false;
        Boolean error1=false;
        
        if (complaRB.isSelected()) {
    complect = "A";
    } else {if (complbRB.isSelected()){
        complect = "B";
    } else {if (complcRB.isSelected())
            {complect = "C";}else{JOptionPane.showMessageDialog(this, "Вы не выбрали комплект формы", "Предупреждение", JOptionPane.WARNING_MESSAGE);}}};
        System.out.println(complect);
        System.out.println(complect);
        System.out.println(complect);
        if (complaRB.isSelected()) {
    sum = 0;
    } else {if (complbRB.isSelected()){
        sum = 20;
    } else {if (complcRB.isSelected())
            {sum = 45;} else error = true;}};
 if (fullmCB.isSelected()){sum = sum + 145;
        };
if (halfmCB.isSelected()){sum = sum + 75;
        };
if (smallmCB.isSelected()){sum = sum + 20;
        };       
sumL.setText("$" +sum);
if ((fullmCB.isSelected())||(halfmCB.isSelected())||(smallmCB.isSelected())){error1 = false;}
else{error1 = true;JOptionPane.showMessageDialog(this, "Вы не выбрали дистанции для марафона", "Предупреждение", JOptionPane.WARNING_MESSAGE);}
if ((error == false)&&(error1==false)) {            

    

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
    String date = dateFormat.format(new Date());
    String vremya = "";
    try {
        Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from runner where email = '"+MainClass.emailR+"'");
        rs.next();
        runnerID= rs.getString(1);
        rs.close();
        String charity = (String) charityCB.getSelectedItem();
        rs = stmt.executeQuery("select * from charity where CharityName = '"+charity+"'");
        rs.next();
        charity = rs.getString(1);
        rs.close();
        String insert1 = "INSERT INTO registration (RunnerId,RegistrationDateTime, RaceKitOptionId, RegistrationStatusId, Cost, CharityId, SponsorshipTarget) "
              + "VALUES ('"+runnerID+"', '"+date+"', '"+complect+"', '1', '0.00', '"+charity+"', '0');";
        stmt.execute(insert1);
        rs = stmt.executeQuery("select * from registration where RegistrationDateTime = '"+date+"'");
        rs.next();
        String regID = rs.getString(1);
        rs.close();
        if (fullmCB.isSelected())
        {
            stmt.execute("INSERT INTO registrationevent (RegistrationId, EventId, BibNumber) VALUES ('"+regID+"', '18_8FM', '1');");
        }
        if (halfmCB.isSelected())
        {
            stmt.execute("INSERT INTO registrationevent (RegistrationId, EventId, BibNumber) VALUES ('"+regID+"', '18_8HM', '1');");
        }
         if (smallmCB.isSelected())
        {
            stmt.execute("INSERT INTO registrationevent (RegistrationId, EventId, BibNumber) VALUES ('"+regID+"', '18_8FR', '1');");
        }
        stmt.close();
        JOptionPane.showMessageDialog(this, "Вы успешно зарегистрированы", "Успех", JOptionPane.INFORMATION_MESSAGE);
        new MenuRunner().setVisible(true);
        this.dispose();
    } catch (SQLException ex) {
        Logger.getLogger(RegOnMar.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "При регистрации на событие произошла ошибка, пожалуйста, свяжитесь с администратором для устранения неполадок", "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
}    
     
                /*INSERT INTO `kurs`.`registration` (`RunnerId`, `RegistrationDateTime`, `RaceKitOptionId`, `RegistrationStatusId`, `Cost`, `CharityId`, `SponsorshipTarget`) 
VALUES ('5192', '2017-10-09 09:31:22', 'C', '1', '20.00', '11', '100');*/
    }//GEN-LAST:event_regBActionPerformed

    private void charityCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charityCBActionPerformed
        String a = (String) charityCB.getSelectedItem();//присваивает значение поля переменной
    }//GEN-LAST:event_charityCBActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
new MenuRunner().setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       charityNum = (String) charityCB.getSelectedItem();
        System.out.println(charityNum);
   
            new SponsorInfo().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new MenuRunner().setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fullmCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullmCBActionPerformed
        if (complaRB.isSelected()) {
    sum = 0;
    } else {if (complbRB.isSelected()){
        sum = 20;
    } else {if (complcRB.isSelected())
            {sum = 45;} else error = true;}};
 if (fullmCB.isSelected()){sum = sum + 145;
        };
if (halfmCB.isSelected()){sum = sum + 75;
        };
if (smallmCB.isSelected()){sum = sum + 20;
        };       
sumL.setText("$" +sum);        // TODO add your handling code here:
    }//GEN-LAST:event_fullmCBActionPerformed

    private void halfmCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfmCBActionPerformed
        if (complaRB.isSelected()) {
    sum = 0;
    } else {if (complbRB.isSelected()){
        sum = 20;
    } else {if (complcRB.isSelected())
            {sum = 45;} else error = true;}};
 if (fullmCB.isSelected()){sum = sum + 145;
        };
if (halfmCB.isSelected()){sum = sum + 75;
        };
if (smallmCB.isSelected()){sum = sum + 20;
        };       
sumL.setText("$" +sum);        // TODO add your handling code here:
    }//GEN-LAST:event_halfmCBActionPerformed

    private void smallmCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallmCBActionPerformed
        if (complaRB.isSelected()) {
    sum = 0;
    } else {if (complbRB.isSelected()){
        sum = 20;
    } else {if (complcRB.isSelected())
            {sum = 45;} else error = true;}};
 if (fullmCB.isSelected()){sum = sum + 145;
        };
if (halfmCB.isSelected()){sum = sum + 75;
        };
if (smallmCB.isSelected()){sum = sum + 20;
        };       
sumL.setText("$" +sum);        // TODO add your handling code here:
    }//GEN-LAST:event_smallmCBActionPerformed


    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegOnMar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegOnMar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegOnMar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegOnMar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegOnMar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> charityCB;
    private javax.swing.JRadioButton complaRB;
    private javax.swing.JRadioButton complbRB;
    private javax.swing.JRadioButton complcRB;
    private javax.swing.JPanel dawnP;
    private javax.swing.JCheckBox fullmCB;
    private javax.swing.JCheckBox halfmCB;
    private javax.swing.JPanel headP;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel mainP;
    private javax.swing.JButton regB;
    private javax.swing.JCheckBox smallmCB;
    private javax.swing.JLabel sumL;
    private javax.swing.JLabel timerL;
    private javax.swing.JLabel titelL;
    private javax.swing.JLabel titelL2;
    private javax.swing.JLabel titelL3;
    private javax.swing.JLabel titelL4;
    private javax.swing.JLabel titelL5;
    private javax.swing.JLabel titelL6;
    private javax.swing.JLabel titelL7;
    private javax.swing.JLabel titelL8;
    // End of variables declaration//GEN-END:variables
}
