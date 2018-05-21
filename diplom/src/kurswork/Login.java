/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurswork;

import admin.MenuAdmin;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import kurswork.coord.Coordinator;
import kurswork.runner.MenuRunner;

/**
 *
 * @author user
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        super("Вход в систему");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        loginTF = new javax.swing.JTextField();
        loginL = new javax.swing.JLabel();
        passL = new javax.swing.JLabel();
        loginB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        badPassL = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        paragraphL = new javax.swing.JLabel();
        passWordTF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainP.setBackground(new java.awt.Color(253, 193, 0));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        danwPLayout.setVerticalGroup(
            danwPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(danwPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                .addGap(158, 158, 158)
                .addComponent(titleL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        loginTF.setBackground(new java.awt.Color(0, 144, 62));
        loginTF.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N

        loginL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        loginL.setForeground(new java.awt.Color(80, 80, 80));
        loginL.setText("Электроная почта");

        passL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        passL.setForeground(new java.awt.Color(80, 80, 80));
        passL.setText("Пароль");

        loginB.setBackground(new java.awt.Color(0, 144, 62));
        loginB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginB.setText("Войти");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });

        cancelB.setBackground(new java.awt.Color(0, 144, 62));
        cancelB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        cancelB.setText("Отмена");
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });

        badPassL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        badPassL.setForeground(new java.awt.Color(255, 0, 0));

        nameL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL.setForeground(new java.awt.Color(80, 80, 80));
        nameL.setText("Форма авторизации");

        paragraphL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        paragraphL.setForeground(new java.awt.Color(80, 80, 80));
        paragraphL.setText("<html><p align='center'>Пожалуйста, авторизуйтесь в системе, используя ваш адрес e-mail</p><p align='center'>и пароль</p></html>");

        passWordTF.setBackground(new java.awt.Color(0, 144, 62));
        passWordTF.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N

        javax.swing.GroupLayout mainPLayout = new javax.swing.GroupLayout(mainP);
        mainP.setLayout(mainPLayout);
        mainPLayout.setHorizontalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(danwP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginL)
                    .addComponent(passL))
                .addGap(103, 103, 103)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginTF, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(passWordTF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPLayout.createSequentialGroup()
                .addGap(0, 218, Short.MAX_VALUE)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paragraphL, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPLayout.createSequentialGroup()
                        .addComponent(nameL)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPLayout.createSequentialGroup()
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(badPassL, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPLayout.createSequentialGroup()
                                .addComponent(loginB)
                                .addGap(126, 126, 126)
                                .addComponent(cancelB)))
                        .addGap(248, 248, 248))))
        );
        mainPLayout.setVerticalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPLayout.createSequentialGroup()
                .addComponent(headP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paragraphL)
                .addGap(64, 64, 64)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginL)
                    .addComponent(loginTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passL)
                    .addComponent(passWordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(badPassL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginB)
                    .addComponent(cancelB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(danwP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
                
        try {     
          String  pw,eMail;
          eMail = loginTF.getText();
          pw = passWordTF.getText();
          String Query = "SELECT Email, Password, RoleId FROM user where Email like '" + eMail + "' and Password like '" + pw + "';";
             
            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(Query);
                rs.next();
                String email = rs.getString(1);
                String passWord = rs.getString(2);
                String roleId = rs.getString(3);
                System.out.println(email);
                System.out.println(passWord);
                System.out.println(roleId);
                
            switch (roleId) {
                case "C":{
                    new Coordinator().setVisible(true);
                    this.dispose();
                    break;
                }
                case "R": {
                    new MenuRunner().setVisible(true);
                    MainClass.emailR = eMail;
                    this.dispose();
                    break;
                }
                
                
                case "A":{
                    new MenuAdmin().setVisible(true);
                    MainClass.emailR = eMail;
                    this.dispose();
                    break;
                }
            }    
                
        } catch(Exception e) {
          System.out.println("Пароль не тот");
          badPassL.setText("Неверный логин или пароль!!!");
        }
    }//GEN-LAST:event_loginBActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    javax.swing.JLabel badPassL;
    private javax.swing.JButton cancelB;
    private javax.swing.JPanel danwP;
    private javax.swing.JPanel headP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginB;
    private javax.swing.JLabel loginL;
    private javax.swing.JTextField loginTF;
    private javax.swing.JPanel mainP;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel paragraphL;
    private javax.swing.JLabel passL;
    private javax.swing.JPasswordField passWordTF;
    private javax.swing.JLabel titleL;
    // End of variables declaration//GEN-END:variables
}
