/*
INSERT INTO `kurs`.`user` (`Email`, `Password`, `FirstName`, `LastName`, `RoleId`) VALUES ('aaaaaaaaa', '1', 'A', 'B', 'R');

 */
package kurswork.sponsor;

import kurswork.*;
import java.sql.*;
import static oracle.jrockit.jfr.events.Bits.length;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import scripts.CountryDB;


public class SponsorEdit extends javax.swing.JFrame {

    private boolean checklog;
    boolean checkpas = false, checkname;
    
    CountryDB c = new CountryDB();
            
    public SponsorEdit() throws SQLException {
        super("Регистрация спонсора");
        
        try {
            c.testDatabase();
        } catch (SQLException ex) {
            Logger.getLogger(SponsorEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        getDataForSponsor();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainP = new javax.swing.JPanel();
        danwP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        headP = new javax.swing.JPanel();
        backB = new javax.swing.JButton();
        titleL = new javax.swing.JLabel();
        mailTF = new javax.swing.JTextField();
        pas1TF = new javax.swing.JTextField();
        loginL = new javax.swing.JLabel();
        passL = new javax.swing.JLabel();
        loginB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        badPassL = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        paragraphL = new javax.swing.JLabel();
        pas2TF = new javax.swing.JTextField();
        passL1 = new javax.swing.JLabel();
        passL2 = new javax.swing.JLabel();
        namesponsorTF = new javax.swing.JTextField();
        nameerrorL = new javax.swing.JLabel();
        paserrorL = new javax.swing.JLabel();
        emailerrorL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainP.setBackground(new java.awt.Color(253, 193, 0));
        mainP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        danwP.setBackground(new java.awt.Color(0, 144, 62));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 235, 235));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(scripts.Timer.rasnica());

        javax.swing.GroupLayout danwPLayout = new javax.swing.GroupLayout(danwP);
        danwP.setLayout(danwPLayout);
        danwPLayout.setHorizontalGroup(
            danwPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(danwPLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        danwPLayout.setVerticalGroup(
            danwPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(danwPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainP.add(danwP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 545, -1, -1));

        headP.setBackground(new java.awt.Color(0, 144, 62));

        backB.setBackground(new java.awt.Color(253, 193, 0));
        backB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        backB.setText("Назад");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        titleL.setBackground(new java.awt.Color(36, 29, 112));
        titleL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        titleL.setForeground(new java.awt.Color(235, 235, 235));
        titleL.setText("MARATHON SKILLS 2017");

        javax.swing.GroupLayout headPLayout = new javax.swing.GroupLayout(headP);
        headP.setLayout(headPLayout);
        headPLayout.setHorizontalGroup(
            headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(backB)
                .addGap(146, 146, 146)
                .addComponent(titleL)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        headPLayout.setVerticalGroup(
            headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backB)
                    .addComponent(titleL))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        mainP.add(headP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mailTF.setBackground(new java.awt.Color(0, 144, 62));
        mailTF.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        mailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTFActionPerformed(evt);
            }
        });
        mainP.add(mailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 205, -1));

        pas1TF.setBackground(new java.awt.Color(0, 144, 62));
        pas1TF.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        mainP.add(pas1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 170, -1));
        pas1TF.setToolTipText("<html><p>Требования к паролю:</p><p>•Минимум 6 символов</p><p>•Минимум 1 прописная буква</p><p>•Минимум 1 цифра•</p><p>По крайней мере один из следующих символов: ! @ # $ % ^</p></html>");

        loginL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginL.setForeground(new java.awt.Color(80, 80, 80));
        loginL.setText("Электроная почта:");
        mainP.add(loginL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        passL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL.setForeground(new java.awt.Color(80, 80, 80));
        passL.setText("Пароль:");
        mainP.add(passL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        loginB.setBackground(new java.awt.Color(0, 144, 62));
        loginB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginB.setText("Зарегистрироваться");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });
        mainP.add(loginB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        cancelB.setBackground(new java.awt.Color(0, 144, 62));
        cancelB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        cancelB.setText("Отмена");
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });
        mainP.add(cancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 200, -1));

        badPassL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        badPassL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(badPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 190, 25));

        nameL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL.setForeground(new java.awt.Color(80, 80, 80));
        nameL.setText("Регистрация спонсора");
        mainP.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 89, -1, -1));

        paragraphL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        paragraphL.setForeground(new java.awt.Color(80, 80, 80));
        paragraphL.setText("<html><p align='center'>Пожалуйста, заполните всю информацию, чтобы зарегистрироваться </p><p align='center'>в качестве спонсора</p></html>");
        mainP.add(paragraphL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 139, -1, -1));

        pas2TF.setBackground(new java.awt.Color(0, 144, 62));
        pas2TF.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        mainP.add(pas2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 170, -1));
        pas2TF.setToolTipText("Повторите пароль");

        passL1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL1.setForeground(new java.awt.Color(80, 80, 80));
        passL1.setText("Повторите пароль:");
        mainP.add(passL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        passL2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL2.setForeground(new java.awt.Color(80, 80, 80));
        passL2.setText("Имя или наименование юридического лица:");
        mainP.add(passL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        namesponsorTF.setBackground(new java.awt.Color(0, 144, 62));
        namesponsorTF.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        mainP.add(namesponsorTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 170, -1));

        nameerrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        nameerrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(nameerrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 32, 21));

        paserrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        paserrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(paserrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 241, 32, 21));

        emailerrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        emailerrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(emailerrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 32, 21));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        new HomeF().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        new HomeF().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBActionPerformed

    private void mailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTFActionPerformed
        
    }//GEN-LAST:event_mailTFActionPerformed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
         //c от сокращения Connection
        String  pw1 = null, pw2, name = null, eMail = null;
        try {

            eMail = mailTF.getText();
            pw1 = pas1TF.getText();
            pw2 = pas2TF.getText();
            name = namesponsorTF.getText();

            

            try {
                Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Email FROM user where Email like '" + eMail + "';");
                rs.next();
                String str =rs.getString(1);
                rs.close();
                stmt.close();
                con.close();
                System.out.println("Такой Email уже существует");
                emailerrorL.setText("*");
                emailerrorL.setToolTipText("Такой Email уже используется");
                checklog = false;
            } catch (Exception e) {
                System.out.println("Совпадений нет");
                checklog = true;
            }

            if (length(pw1)>6){
                badPassL.setText("");
                String str2 = pw1.toLowerCase();
                checkpas = pw1.equals(str2);
                
                    if(checkpas == false){
                        badPassL.setText("");
                        paserrorL.setText("");
                        
                        if  (pw1.equals(pw2)){
                            checkpas = true;
                            paserrorL.setText("");
                        }else{
                               paserrorL.setText("*");
                        }
                        
                    }else{
                        badPassL.setText("Строчные буквы");
                    }
                    
            }else{
                badPassL.setText("Длина > 6");
            }
            
            
            if (length(name)==0) {
                checkname = false;
                nameerrorL.setText("*");
            } else{
                checkname = true;
                nameerrorL.setText("");
            }

        } catch(Exception e) {
            System.out.println("Пароль не тот");

        }
        if ((checklog == true) & (checkpas == true) & (checkname == true)) {      
            System.out.println(" " + eMail + " "+ name + " " + pw1);
        
            try {
                String updata = "INSERT INTO sponsorname (SponsorName, SponsorEmail, SponsorPass) VALUES ('" + name + "', '" + eMail + "', '" + pw1 + "');";
              
                    Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
                    Statement stmt = con.createStatement();
                        try{
                            stmt.executeUpdate(updata);
                  
                  
                        }catch(Exception e) {
                            e.printStackTrace();
                            System.out.println("Не добавило");
                        }
                        
                    stmt.close();
                    con.close();
                    System.out.println("Спонсор добавлен");
                  
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Ошибка");
                  
            }
        new SponsorLogin().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_loginBActionPerformed

    void getDataForSponsor(){
        try {
            Blob blob = null; // Создаём переменную BLOB в которую занесем данные из БД
            byte[] image1 = null; //Создаем массиф в который занесем байт код картинки
            
            String sql = "SELECT * FROM sponsorname WHERE SponsornameId like " + MainClass.emailS + ";";
            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            rs.next();
            
            mailTF.setText(rs.getString("SponsorEmail"));
            namesponsorTF.setText(rs.getString("SponsorName"));
            String logo = rs.getString(4);
            pas1TF.setText(rs.getString("SponsorPass"));
            pas2TF.setText(rs.getString("SponsorPass"));
        } catch (SQLException ex) {
            Logger.getLogger(SponsorEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
            
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SponsorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SponsorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SponsorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SponsorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SponsorEdit().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SponsorEdit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    javax.swing.JLabel badPassL;
    private javax.swing.JButton cancelB;
    private javax.swing.JPanel danwP;
    private javax.swing.JLabel emailerrorL;
    private javax.swing.JPanel headP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginB;
    private javax.swing.JLabel loginL;
    private javax.swing.JTextField mailTF;
    private javax.swing.JPanel mainP;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel nameerrorL;
    private javax.swing.JTextField namesponsorTF;
    private javax.swing.JLabel paragraphL;
    private javax.swing.JTextField pas1TF;
    private javax.swing.JTextField pas2TF;
    private javax.swing.JLabel paserrorL;
    private javax.swing.JLabel passL;
    private javax.swing.JLabel passL1;
    private javax.swing.JLabel passL2;
    private javax.swing.JLabel titleL;
    // End of variables declaration//GEN-END:variables
}
