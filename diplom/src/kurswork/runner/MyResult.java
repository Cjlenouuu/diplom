/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurswork.runner;

import admin.MenegeCharity;
import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import kurswork.MainClass;
import org.eclipse.persistence.tools.schemaframework.DefaultTableGenerator;

/**
 *
 * @author user
 */
public class MyResult extends javax.swing.JFrame {

    /**
     * Creates new form Wablon
     */
    public MyResult() {
        super("Мои спонсоры");
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel dtm = getData();
        sponsorT.setModel(dtm);
        sponsorT.setEnabled(false);
        sponsorT.setFont(MainClass.fontB);
        getDataCharity();
    }
    
        public ImageIcon ResizeImage(ImageIcon image1) {
        ImageIcon MyImage = image1;
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(iconL.getWidth(), iconL.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
        private void getDataCharity() {
        
        String query = "select CharityName, CharityDescription, CharityLogoFile from charity, registration, runner "
                + "where runner.RunnerId = registration.RunnerId and registration.CharityId = charity.CharityId and "
                + "Email = '"+MainClass.emailR+"'";
        Blob blob = null; // Создаём переменную BLOB в которую занесем данные из БД
        byte[] image1 = null; //Создаем массиф в который занесем байт код картинки
        
        try {
            Connection con = DriverManager.getConnection(MainClass.URL,MainClass.USER, MainClass.PASS);
            Statement stmt =con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {  
                String name = rs.getString(1);//Берем из БД название
                nameL.setText(name);
                String desc = rs.getString(2);
                descCharityTA.setText(desc);
                blob = rs.getBlob(3); //Получаем данные блоб из таблици 
                ImageIcon image = null;
                try{
                image1 = blob.getBytes(1, (int) blob.length()); //Делаем байт код и заносим в массив
                image = new ImageIcon(image1);
                iconL.setIcon(ResizeImage(image));
                }catch(Exception ex){System.err.println(ex);}
                 //Присваиваем выбранный массиф иконке 
                           
               
            }
        rs.close();stmt.close();con.close();
     
        } catch (SQLException ex) {
            Logger.getLogger(MyResult.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("лалка");
        }
        
      
    }
    
    
    
    
    private DefaultTableModel getData()
    {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Имя спонсора");
        dtm.addColumn("Сумма");

        
        try {

            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("SELECT Sponsorname, Amount FROM sponsorname, sponsorship, registration, runner, user  \n" +
"where registration.RunnerID=runner.RunnerID and \n" +
"sponsorship.RegistrationId =registration.RegistrationId and\n" +
" sponsorname.SponsornameId = sponsorship.SponsornameId and user.Email = runner.Email and\n" +
" user.Email = '"+MainClass.emailR+"'\n" +
" group by Amount");
            while(rs.next()){
            dtm.addRow(new Object[]{rs.getString(1), rs.getString(2)});}
            return dtm;
         }catch(Exception ex){System.err.print(ex);}
        return null;
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
        mainP = new javax.swing.JPanel();
        headP = new javax.swing.JPanel();
        titelL = new javax.swing.JLabel();
        backB = new javax.swing.JButton();
        dawnP = new javax.swing.JPanel();
        timerL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sponsorT = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        iconL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descCharityTA = new javax.swing.JTextArea();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        mainP.add(headP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 828, -1));

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

        mainP.add(dawnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 554, 828, -1));

        sponsorT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(sponsorT);

        mainP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 209, 290, 294));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 29, 112));
        jLabel2.setText("В таблице показаны имена ");
        mainP.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 137, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 29, 112));
        jLabel3.setText(" спонсоров и суммы их взносов");
        mainP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 171, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 29, 112));
        jLabel4.setText("Благотварительная организация,");
        mainP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 122, 302, 34));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 29, 112));
        jLabel5.setText("которую вы представляете:");
        mainP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 171, -1, -1));

        nameL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        nameL.setForeground(new java.awt.Color(36, 29, 112));
        mainP.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 209, 317, 33));

        iconL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        iconL.setForeground(new java.awt.Color(36, 29, 112));
        mainP.add(iconL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 225, 245));

        descCharityTA.setEditable(false);
        descCharityTA.setFont(MainClass.fontB);
        descCharityTA.setColumns(20);
        descCharityTA.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        descCharityTA.setLineWrap(true);
        descCharityTA.setRows(5);
        descCharityTA.setText("Описание выбранной благотварительной организации\n");
        descCharityTA.setWrapStyleWord(true);
        jScrollPane2.setViewportView(descCharityTA);

        mainP.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 209, 250, 294));

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

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
new MenuRunner().setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backBActionPerformed

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
            java.util.logging.Logger.getLogger(MyResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JPanel dawnP;
    private javax.swing.JTextArea descCharityTA;
    private javax.swing.JPanel headP;
    private javax.swing.JLabel iconL;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainP;
    private javax.swing.JLabel nameL;
    private javax.swing.JTable sponsorT;
    private javax.swing.JLabel timerL;
    private javax.swing.JLabel titelL;
    // End of variables declaration//GEN-END:variables
}
