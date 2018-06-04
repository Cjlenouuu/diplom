/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurswork.coord.runners;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import kurswork.coord.SponsorView;
import kurswork.info.*;


public class ManagmentRuner extends javax.swing.JFrame {

    ManagerTableModel mtm = new ManagerTableModel();
    //RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(mtm);
    final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(mtm);
    String filter;
    
    public ManagmentRuner() {
        super("Управление бегунами");
        
        try {
            mtm.addData();
            //System.out.println(mtm.getValueAt(3, 0));  
        } catch (SQLException ex) {
            Logger.getLogger(SponsorView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        mainP = new javax.swing.JPanel();
        headP = new javax.swing.JPanel();
        titelL = new javax.swing.JLabel();
        backB = new javax.swing.JButton();
        logoutL = new javax.swing.JButton();
        dawnP = new javax.swing.JPanel();
        timerL = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        filtrL = new javax.swing.JLabel();
        outLoadL = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        statuL = new javax.swing.JLabel();
        distanceL = new javax.swing.JLabel();
        statusCB = new javax.swing.JComboBox<>();
        distanceCB = new javax.swing.JComboBox<>();
        refreshB = new javax.swing.JButton();
        infoRunnerSP = new javax.swing.JScrollPane();
        infoRunnerT = new javax.swing.JTable();
        countRunL = new javax.swing.JLabel();
        countRunWriteL = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        mainP.setBackground(new java.awt.Color(253, 193, 0));

        headP.setBackground(new java.awt.Color(0, 144, 62));

        titelL.setBackground(new java.awt.Color(36, 29, 112));
        titelL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        titelL.setForeground(new java.awt.Color(235, 235, 235));
        titelL.setText("MARATHON SKILLS 2017");

        backB.setBackground(new java.awt.Color(253, 193, 0));
        backB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        backB.setForeground(new java.awt.Color(80, 80, 80));
        backB.setText("Назад");

        logoutL.setBackground(new java.awt.Color(253, 193, 0));
        logoutL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        logoutL.setForeground(new java.awt.Color(80, 80, 80));
        logoutL.setText("Выйти");

        javax.swing.GroupLayout headPLayout = new javax.swing.GroupLayout(headP);
        headP.setLayout(headPLayout);
        headPLayout.setHorizontalGroup(
            headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(titelL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutL, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        headPLayout.setVerticalGroup(
            headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titelL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

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

        nameL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL.setForeground(new java.awt.Color(80, 80, 80));
        nameL.setText("Управление бегунами");

        filtrL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        filtrL.setForeground(new java.awt.Color(80, 80, 80));
        filtrL.setText("Фильтрация");

        outLoadL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        outLoadL.setForeground(new java.awt.Color(80, 80, 80));
        outLoadL.setText("Выгрузка");

        jButton2.setBackground(new java.awt.Color(0, 144, 62));
        jButton2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(80, 80, 80));
        jButton2.setText("<html><center><p>Детальная информация</p><p>(CSV)</p></center></hyml>");

        jButton3.setBackground(new java.awt.Color(0, 144, 62));
        jButton3.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(80, 80, 80));
        jButton3.setText("E-mail список");

        statuL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        statuL.setForeground(new java.awt.Color(80, 80, 80));
        statuL.setText("Статус:");

        distanceL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        distanceL.setForeground(new java.awt.Color(80, 80, 80));
        distanceL.setText("Дистанция:");

        statusCB.setBackground(new java.awt.Color(0, 144, 62));
        statusCB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        statusCB.setForeground(new java.awt.Color(80, 80, 80));
        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Зарегистрирован", "Оплата потверждена", "Комплект формы", "Item 4" }));

        distanceCB.setBackground(new java.awt.Color(0, 144, 62));
        distanceCB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        distanceCB.setForeground(new java.awt.Color(80, 80, 80));
        distanceCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "42km Полный марафон", "21km Полумарафон", "5km Малая дистанция"}));

        refreshB.setBackground(new java.awt.Color(0, 144, 62));
        refreshB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        refreshB.setForeground(new java.awt.Color(80, 80, 80));
        refreshB.setText("Обновить");
        refreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBActionPerformed(evt);
            }
        });

        infoRunnerT.setModel(mtm);
        infoRunnerT.setRowSorter(sorter);
        infoRunnerSP.setViewportView(infoRunnerT);

        countRunL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        countRunL.setForeground(new java.awt.Color(80, 80, 80));
        countRunL.setText("Всего бегунов:");

        countRunWriteL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        countRunWriteL.setForeground(new java.awt.Color(80, 80, 80));
        countRunWriteL.setText("" + mtm.getRowCount());

        javax.swing.GroupLayout mainPLayout = new javax.swing.GroupLayout(mainP);
        mainP.setLayout(mainPLayout);
        mainPLayout.setHorizontalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dawnP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameL)
                .addGap(260, 260, 260))
            .addGroup(mainPLayout.createSequentialGroup()
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(filtrL))
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(distanceL)
                            .addComponent(statuL))
                        .addGap(18, 18, 18)
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statusCB, 0, 181, Short.MAX_VALUE)
                            .addComponent(distanceCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPLayout.createSequentialGroup()
                        .addComponent(outLoadL)
                        .addGap(55, 55, 55)))
                .addGap(128, 128, 128))
            .addGroup(mainPLayout.createSequentialGroup()
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(countRunL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countRunWriteL, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(infoRunnerSP, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPLayout.setVerticalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPLayout.createSequentialGroup()
                .addComponent(headP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameL)
                .addGap(23, 23, 23)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtrL)
                    .addComponent(outLoadL))
                .addGap(18, 18, 18)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statuL)
                            .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(distanceL)
                            .addComponent(distanceCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(refreshB)))
                .addGap(18, 18, 18)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countRunL)
                    .addComponent(countRunWriteL, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(infoRunnerSP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dawnP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void refreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBActionPerformed
        
        switch (statusCB.getSelectedIndex()) {
            case 0: sorter.setRowFilter(RowFilter.regexFilter("Registered")); break;
            case 1: sorter.setRowFilter(RowFilter.regexFilter("Payment Confirmed")); break;
            case 2: sorter.setRowFilter(RowFilter.regexFilter("Race Kit Sent")); break;
            case 3: sorter.setRowFilter(RowFilter.regexFilter("Race Attended")); break;
        }
        
        switch (distanceCB.getSelectedIndex()) {
            case 0: sorter.setRowFilter(RowFilter.regexFilter("Full Marathon")); break;
            case 1: sorter.setRowFilter(RowFilter.regexFilter("Half Marathon")); break;
            case 2: sorter.setRowFilter(RowFilter.regexFilter("5km Fun Run")); break;
        }
        
    }//GEN-LAST:event_refreshBActionPerformed

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
            java.util.logging.Logger.getLogger(ManagmentRuner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagmentRuner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagmentRuner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagmentRuner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagmentRuner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JLabel countRunL;
    private javax.swing.JLabel countRunWriteL;
    private javax.swing.JPanel dawnP;
    private javax.swing.JComboBox<String> distanceCB;
    private javax.swing.JLabel distanceL;
    private javax.swing.JLabel filtrL;
    private javax.swing.JPanel headP;
    private javax.swing.JScrollPane infoRunnerSP;
    private javax.swing.JTable infoRunnerT;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JButton logoutL;
    private javax.swing.JPanel mainP;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel outLoadL;
    private javax.swing.JButton refreshB;
    private javax.swing.JLabel statuL;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JLabel timerL;
    private javax.swing.JLabel titelL;
    // End of variables declaration//GEN-END:variables
}
