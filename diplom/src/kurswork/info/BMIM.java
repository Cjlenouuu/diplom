/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurswork.info;

import javax.swing.UIManager;
import kurswork.MainClass;

public class BMIM extends javax.swing.JFrame {

    String view = new MainClass().view;
    double height = new MainClass().height;
    double weight = new MainClass().weight;
    public BMIM() {
                super("BMI калькулятор");
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        resultnameL = new javax.swing.JLabel();
        ResultIconL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        heightTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        weightTF = new javax.swing.JTextField();
        resultL = new javax.swing.JLabel();
        resultB = new javax.swing.JButton();
        nameL1 = new javax.swing.JLabel();
        femaleB = new javax.swing.JButton();
        maleB = new javax.swing.JButton();
        manP = new javax.swing.JPanel();
        womanP = new javax.swing.JPanel();
        nameL2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(253, 193, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 144, 62));

        jLabel1.setBackground(new java.awt.Color(36, 29, 112));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 235, 235));
        jLabel1.setText("MARATHON SKILLS 2017");

        jButton1.setBackground(new java.awt.Color(253, 193, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(80, 80, 80));
        jButton1.setText("Назад");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 802, -1));

        jPanel4.setBackground(new java.awt.Color(0, 144, 62));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 235, 235));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(scripts.Timer.rasnica());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 802, -1));

        resultnameL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        resultnameL.setForeground(new java.awt.Color(80, 80, 80));
        resultnameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultnameL.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(resultnameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 210, 60));

        ResultIconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/bmi-healthy-icon.png"))); // NOI18N
        jPanel2.add(ResultIconL, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(80, 80, 80));
        jLabel5.setText("Рост:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 376, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 80, 80));
        jLabel6.setText("Вес:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 419, -1, -1));

        heightTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTFActionPerformed(evt);
            }
        });
        jPanel2.add(heightTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 381, 54, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 80, 80));
        jLabel7.setText("см");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 376, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(80, 80, 80));
        jLabel8.setText("кг");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 419, -1, -1));

        weightTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTFActionPerformed(evt);
            }
        });
        jPanel2.add(weightTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 424, 54, -1));

        resultL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        resultL.setForeground(new java.awt.Color(80, 80, 80));
        resultL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultL.setToolTipText("");
        jPanel2.add(resultL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 120, 40));

        resultB.setBackground(new java.awt.Color(0, 144, 62));
        resultB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        resultB.setForeground(new java.awt.Color(80, 80, 80));
        resultB.setText("Рассчитать");
        resultB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultBActionPerformed(evt);
            }
        });
        jPanel2.add(resultB, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 476, -1, -1));

        nameL1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        nameL1.setForeground(new java.awt.Color(80, 80, 80));
        nameL1.setText("BMI обозначает индекс массы тела");
        jPanel2.add(nameL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 139, -1, -1));

        femaleB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/female-icon.png"))); // NOI18N
        femaleB.setText("Женский");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroup1, org.jdesktop.beansbinding.ELProperty.create("${selection.selected}"), femaleB, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        femaleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleBActionPerformed(evt);
            }
        });
        jPanel2.add(femaleB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 140, -1));

        maleB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/male-icon.png"))); // NOI18N
        maleB.setText("Мужской");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroup1, org.jdesktop.beansbinding.ELProperty.create("${selection.selected}"), maleB, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        maleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleBActionPerformed(evt);
            }
        });
        jPanel2.add(maleB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 199, 140, 120));

        manP.setBackground(new java.awt.Color(36, 29, 112));

        javax.swing.GroupLayout manPLayout = new javax.swing.GroupLayout(manP);
        manP.setLayout(manPLayout);
        manPLayout.setHorizontalGroup(
            manPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        manPLayout.setVerticalGroup(
            manPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel2.add(manP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 160, 140));

        womanP.setBackground(new java.awt.Color(36, 29, 112));

        javax.swing.GroupLayout womanPLayout = new javax.swing.GroupLayout(womanP);
        womanP.setLayout(womanPLayout);
        womanPLayout.setHorizontalGroup(
            womanPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        womanPLayout.setVerticalGroup(
            womanPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel2.add(womanP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));
        womanP.setVisible(false);

        nameL2.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL2.setForeground(new java.awt.Color(80, 80, 80));
        nameL2.setText("BMI КАЛЬКУЛЯТОР");
        jPanel2.add(nameL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 102, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleBActionPerformed
        manP.setVisible(true);
        womanP.setVisible(false);
    }//GEN-LAST:event_maleBActionPerformed

    private void heightTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTFActionPerformed
        view =heightTF.getText();
        height = Integer.parseInt(view);
        view = null;
    }//GEN-LAST:event_heightTFActionPerformed

    private void weightTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTFActionPerformed
        view =weightTF.getText();
        weight = Integer.parseInt(view);
        view = null;
    }//GEN-LAST:event_weightTFActionPerformed

    private void resultBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultBActionPerformed
        view =heightTF.getText();
        height = Integer.parseInt(view);
        view = null;
        view =weightTF.getText();
        weight = Integer.parseInt(view);
        view = null;
        double bmi = weight / ((height/100)*(height/100));
        resultL.setText(String.format("%(.2f", bmi));// TODO add your handling code here:
        view = null;
        int switchVariable = 0;
        
        if( bmi <=18.5) switchVariable = 0;
            else if( bmi>=18.5 && bmi <=24.9) switchVariable = 1;
            else if( bmi>24.9 && bmi <=29.9) switchVariable = 2; 
            else if( bmi>29.9) switchVariable = 3; 
        switch (switchVariable) 
        { 
            case 0: ResultIconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/bmi-underweight-icon.png")));resultnameL.setText("Недостаточный вес"); break;
            case 1: ResultIconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/bmi-healthy-icon.png")));resultnameL.setText("Здоровый"); break;
            case 2: ResultIconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/bmi-overweight-icon.png")));resultnameL.setText("Излишний вес"); break;
            case 3: ResultIconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/bmi-obese-icon.png")));resultnameL.setText("Ожирение"); break;
            default: System.out.println("other"); break;     
        }
    }//GEN-LAST:event_resultBActionPerformed

    private void femaleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleBActionPerformed
        womanP.setVisible(true);
        manP.setVisible(false);
    }//GEN-LAST:event_femaleBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new kurswork.info.InfoMenu().setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BMIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMIM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ResultIconL;
    private javax.swing.ButtonGroup buttonGroup1;
    javax.swing.JButton femaleB;
    private javax.swing.JTextField heightTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton maleB;
    private javax.swing.JPanel manP;
    private javax.swing.JLabel nameL1;
    private javax.swing.JLabel nameL2;
    private javax.swing.JButton resultB;
    private javax.swing.JLabel resultL;
    private javax.swing.JLabel resultnameL;
    private javax.swing.JTextField weightTF;
    private javax.swing.JPanel womanP;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
