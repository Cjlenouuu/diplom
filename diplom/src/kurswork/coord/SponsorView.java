
package kurswork.coord;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import kurswork.HomeF;
import kurswork.info.*;


public class SponsorView extends javax.swing.JFrame {
    
    int indexSort;
    String countCh, sumCh;
    SponsorTableModel stm = new SponsorTableModel();
    RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(stm);//класс сортировки

    
    public SponsorView() {
        super("Обзор спонсоров");
        
        try {
            stm.addData();
            System.out.println(stm.getValueAt(3, 0));  
        } catch (SQLException ex) {
            Logger.getLogger(SponsorView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CountCharity countC = new CountCharity();
        try {
            countCh ="" + countC.CountCh();
            sumCh = "$" + countC.SumCh();
        } catch (SQLException ex) {
            Logger.getLogger(SponsorView.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Лалака");
        }
        initComponents();
        setLocationRelativeTo(null);     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainP = new javax.swing.JPanel();
        headP = new javax.swing.JPanel();
        titelL = new javax.swing.JLabel();
        backB = new javax.swing.JButton();
        logoutB = new javax.swing.JButton();
        dawnP = new javax.swing.JPanel();
        timerL = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        carityL = new javax.swing.JLabel();
        countCarityL = new javax.swing.JLabel();
        sumAmountL = new javax.swing.JLabel();
        sumAmount = new javax.swing.JLabel();
        infoSlP = new javax.swing.JScrollPane();
        infoCharityT = new javax.swing.JTable();

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
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        logoutB.setBackground(new java.awt.Color(253, 193, 0));
        logoutB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        logoutB.setForeground(new java.awt.Color(80, 80, 80));
        logoutB.setText("Выйти");
        logoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        headPLayout.setVerticalGroup(
            headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titelL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        nameL.setText("Просмотр спонсоров");

        carityL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        carityL.setForeground(new java.awt.Color(80, 80, 80));
        carityL.setText("Блатотворительные организации:");

        countCarityL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        countCarityL.setForeground(new java.awt.Color(80, 80, 80));
        countCarityL.setText(countCh);

        sumAmountL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        sumAmountL.setForeground(new java.awt.Color(80, 80, 80));
        sumAmountL.setText("Всего спонсорских взносов:");

        sumAmount.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        sumAmount.setForeground(new java.awt.Color(80, 80, 80));
        sumAmount.setText(sumCh);

        infoCharityT.setBackground(new java.awt.Color(253, 193, 0));
        infoCharityT.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        infoCharityT.setForeground(new java.awt.Color(80, 80, 80));
        infoCharityT.setModel(stm);
        infoCharityT.setRowHeight(100);
        infoCharityT.setRowSorter(sorter);
        infoSlP.setViewportView(infoCharityT);

        javax.swing.GroupLayout mainPLayout = new javax.swing.GroupLayout(mainP);
        mainP.setLayout(mainPLayout);
        mainPLayout.setHorizontalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dawnP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPLayout.createSequentialGroup()
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(infoSlP, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sumAmountL)
                            .addComponent(carityL))
                        .addGap(18, 18, 18)
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countCarityL)
                            .addComponent(sumAmount)))
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(nameL)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        mainPLayout.setVerticalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPLayout.createSequentialGroup()
                .addComponent(headP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameL)
                .addGap(18, 18, 18)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carityL)
                    .addComponent(countCarityL))
                .addGap(18, 18, 18)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumAmountL)
                    .addComponent(sumAmount))
                .addGap(42, 42, 42)
                .addComponent(infoSlP, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
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

    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBActionPerformed
        new HomeF().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBActionPerformed
        
    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        new Coordinator().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBActionPerformed


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
            java.util.logging.Logger.getLogger(SponsorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SponsorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SponsorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SponsorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new SponsorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JLabel carityL;
    private javax.swing.JLabel countCarityL;
    private javax.swing.JPanel dawnP;
    private javax.swing.JPanel headP;
    private javax.swing.JTable infoCharityT;
    private javax.swing.JScrollPane infoSlP;
    private javax.swing.JButton logoutB;
    private javax.swing.JPanel mainP;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel sumAmount;
    private javax.swing.JLabel sumAmountL;
    private javax.swing.JLabel timerL;
    private javax.swing.JLabel titelL;
    // End of variables declaration//GEN-END:variables
}
