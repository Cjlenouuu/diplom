
package kurswork;

import kurswork.runner.RunnerW;
import kurswork.sponsor.Sponsor;


public class HomeF extends javax.swing.JFrame {

    
    public HomeF() {
        super("Главный экран");
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sponsorWinB = new javax.swing.JButton();
        infoB = new javax.swing.JButton();
        loginB = new javax.swing.JButton();
        runnerWinB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(253, 193, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 144, 62));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 235, 235));
        jLabel1.setText("MARATHON SKILLS 2017");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 235, 235));
        jLabel2.setText("ВЯТСКИЕ ПОЛЯНЫ");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 235, 235));
        jLabel3.setText("1 ИЮЛЯ 2017");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(194, 194, 194))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 144, 62));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 235, 235));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(scripts.Timer.rasnica());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 543, 800, -1));

        sponsorWinB.setBackground(new java.awt.Color(0, 144, 62));
        sponsorWinB.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        sponsorWinB.setForeground(new java.awt.Color(235, 235, 235));
        sponsorWinB.setText("Я хочу стать спонсором");
        sponsorWinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sponsorWinBActionPerformed(evt);
            }
        });
        jPanel1.add(sponsorWinB, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 324, 344, 69));

        infoB.setBackground(new java.awt.Color(0, 144, 62));
        infoB.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        infoB.setForeground(new java.awt.Color(235, 235, 235));
        infoB.setText("Я хочу узнать больше о событии");
        infoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBActionPerformed(evt);
            }
        });
        jPanel1.add(infoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 411, 344, 69));

        loginB.setBackground(new java.awt.Color(0, 144, 62));
        loginB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginB.setForeground(new java.awt.Color(235, 235, 235));
        loginB.setText("Login");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });
        jPanel1.add(loginB, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 496, -1, -1));

        runnerWinB1.setBackground(new java.awt.Color(0, 144, 62));
        runnerWinB1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        runnerWinB1.setForeground(new java.awt.Color(235, 235, 235));
        runnerWinB1.setText("Я хочу стать бегуном");
        runnerWinB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runnerWinB1ActionPerformed(evt);
            }
        });
        jPanel1.add(runnerWinB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 237, 344, 69));

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

    private void sponsorWinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sponsorWinBActionPerformed
        new Sponsor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sponsorWinBActionPerformed

    private void infoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBActionPerformed
        new kurswork.info.InfoMenu().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_infoBActionPerformed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginBActionPerformed

    private void runnerWinB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runnerWinB1ActionPerformed
        new RunnerW().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_runnerWinB1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton infoB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginB;
    private javax.swing.JButton runnerWinB1;
    private javax.swing.JButton sponsorWinB;
    // End of variables declaration//GEN-END:variables
}
