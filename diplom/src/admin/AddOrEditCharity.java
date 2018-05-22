//добавить или редактировать ыпвапвпвпввыап
package admin;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import kurswork.HomeF;
import kurswork.MainClass;
import kurswork.info.*;


public class AddOrEditCharity extends javax.swing.JFrame {

    boolean edit = false;
    int charityID;
    String s = null;
    
    public AddOrEditCharity(String nameCharity) throws SQLException {
        
        super("Добаление/Редактирование");
        
        System.out.println(nameCharity);
        initComponents();
        {if (nameCharity != null) { //Проверка на то что должна форма: редактировать или добавлять 
            nameL.setText("Редактирование благотварительной организации");
            try{
            getDataForCharity(nameCharity);//
            edit = true;
            }catch(Exception ex){System.out.print(ex);}
        } else {
            nameL.setText("Добавить благотварительную организацию");
        }}
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
        nameCharityTF = new javax.swing.JTextField();
        nameCharityL = new javax.swing.JLabel();
        descCharityL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descCharityTA = new javax.swing.JTextArea();
        logoCharityL = new javax.swing.JLabel();
        logoCharityTF = new javax.swing.JTextField();
        loadLogoCharityB = new javax.swing.JButton();
        logoImageL = new javax.swing.JLabel();
        leftL = new javax.swing.JLabel();
        leftL1 = new javax.swing.JLabel();
        saveB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();

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
                .addGap(53, 53, 53))
        );
        headPLayout.setVerticalGroup(
            headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headPLayout.createSequentialGroup()
                        .addGroup(headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titelL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
        nameL.setText("Редактирование благотворительной организации");

        nameCharityTF.setBackground(new java.awt.Color(253, 193, 0));
        nameCharityTF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nameCharityTF.setForeground(new java.awt.Color(80, 80, 80));

        nameCharityL.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nameCharityL.setForeground(new java.awt.Color(80, 80, 80));
        nameCharityL.setText("Наименование:");

        descCharityL.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descCharityL.setForeground(new java.awt.Color(80, 80, 80));
        descCharityL.setText("Описание:");

        descCharityTA.setBackground(new java.awt.Color(253, 193, 0));
        descCharityTA.setColumns(20);
        descCharityTA.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descCharityTA.setForeground(new java.awt.Color(80, 80, 80));
        descCharityTA.setLineWrap(true);
        descCharityTA.setRows(5);
        descCharityTA.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descCharityTA);

        logoCharityL.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        logoCharityL.setForeground(new java.awt.Color(80, 80, 80));
        logoCharityL.setText("Логотип файл:");

        logoCharityTF.setBackground(new java.awt.Color(253, 193, 0));
        logoCharityTF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        logoCharityTF.setForeground(new java.awt.Color(80, 80, 80));

        loadLogoCharityB.setBackground(new java.awt.Color(0, 144, 62));
        loadLogoCharityB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loadLogoCharityB.setForeground(new java.awt.Color(80, 80, 80));
        loadLogoCharityB.setText("Загрузить");
        loadLogoCharityB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadLogoCharityBActionPerformed(evt);
            }
        });

        leftL.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        leftL.setForeground(new java.awt.Color(80, 80, 80));
        leftL.setText("Оставте поле \"Логотип файла\" пустым");

        leftL1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        leftL1.setForeground(new java.awt.Color(80, 80, 80));
        leftL1.setText("если вы не хотите загружать логотип");

        saveB.setBackground(new java.awt.Color(0, 144, 62));
        saveB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        saveB.setForeground(new java.awt.Color(80, 80, 80));
        saveB.setText("Сохранить");
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
            }
        });

        cancelB.setBackground(new java.awt.Color(0, 144, 62));
        cancelB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cancelB.setForeground(new java.awt.Color(80, 80, 80));
        cancelB.setText("Отмена");
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPLayout = new javax.swing.GroupLayout(mainP);
        mainP.setLayout(mainPLayout);
        mainPLayout.setHorizontalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dawnP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameL)
                .addGap(95, 95, 95))
            .addGroup(mainPLayout.createSequentialGroup()
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(descCharityL)
                            .addComponent(nameCharityL)
                            .addComponent(nameCharityTF))
                        .addGap(78, 78, 78)
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoCharityL)
                            .addComponent(logoImageL, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leftL)
                            .addComponent(leftL1)
                            .addGroup(mainPLayout.createSequentialGroup()
                                .addComponent(logoCharityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loadLogoCharityB))))
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(saveB)
                        .addGap(65, 65, 65)
                        .addComponent(cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPLayout.setVerticalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPLayout.createSequentialGroup()
                .addComponent(headP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(nameL)
                .addGap(32, 32, 32)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameCharityL)
                    .addComponent(leftL))
                .addGap(10, 10, 10)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addComponent(nameCharityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descCharityL))
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addComponent(leftL1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoCharityL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logoCharityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadLogoCharityB))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoImageL, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveB)
                    .addComponent(cancelB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        new MenegeCharity().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBActionPerformed

    private void loadLogoCharityBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadLogoCharityBActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.jpg, *.jpg, *.gif, *.png", "jpg", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int res = fileChooser.showDialog(null, "Открыть файл");
        if (res == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath(); // Передаем строке путь до файла
            logoCharityTF.setText(path);
            System.out.println(path);
            s = path;
            logoImageL.setIcon(ResizeImage(path));
        }
        
    }//GEN-LAST:event_loadLogoCharityBActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        new MenegeCharity().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBActionPerformed

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBActionPerformed
        //Медот для сохранения изменения
        try {
            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stm = con.createStatement();
            ResultSet rs;// = stm.executeQuery(sql);
            String sql;
            String chrityName = nameCharityTF.getText();
            String chrityDesc = descCharityTA.getText();
            String chrityLogo = logoCharityTF.getText();
            
            
            
            if (edit == true) { //Проверка: что необходимо сделать редактировать или добавить, если истина, то редактирование 
                //Редактирование
                sql = "UPDATE `charity` SET `CharityName` = '" + chrityName 
                        + "', `CharityDescription` = `" + chrityDesc + "`,`CharityLogo` = `" + chrityLogo 
                        + "`,`CharityLogoFile` = ? WHERE `charity`.`CharityId` = " + charityID + ";";//Пока не ясно как вставлять переметр ))))
                try {
                InputStream file = new FileInputStream(new File(s));
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setBlob(1,  file);
                pstm.executeUpdate();
                } catch (Exception e) {
                    System.err.println(e);
                    System.out.println("djn");
                }
            } else { //иначе идет добавление
                sql = "INSERT INTO `charity` (`CharityName`, `CharityDescription`, `CharityLogo`, `CharityLogoFile`) VALUES "
                        + "('" + chrityName + "',  '" + chrityDesc + "',  '" + chrityLogo + "', ?);";
                PreparedStatement pstm = con.prepareStatement(sql);
                //pstm.setBlob(3, is);
                stm.executeUpdate(sql);
            }
            
            //PreparedStatement pstm = con.prepareStatement(sql);
            //pstm.setBlob(3, is);
            
        } catch (SQLException ex) {
            Logger.getLogger(AddOrEditCharity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBActionPerformed

    

    //Метод берет данные из БД и выводит их на форму
    void getDataForCharity(String nameCharity) throws SQLException {
        Blob blob = null; // Создаём переменную BLOB в которую занесем данные из БД
        byte[] image1 = null; //Создаем массиф в который занесем байт код картинки
        
        String sql = "SELECT * FROM `charity` WHERE CharityName like '" + nameCharity + "';";
        Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        rs.next();
        
        descCharityTA.setText(rs.getString(3));
        nameCharityTF.setText(rs.getString(2));
        String logo = rs.getString(4);
        charityID = rs.getInt(1);
        logoCharityTF.setText(logo);
       
        blob = rs.getBlob(5); //Получаем данные блоб из таблици 
        
            image1 = blob.getBytes(1, (int) blob.length()); //Делаем байт код и заносим в массив
            ImageIcon image = new ImageIcon(image1); //Присваиваем выбранный массиф иконке 
            logoImageL.setIcon(image); //выводим иконку на метку
            
    }
    
    public ImageIcon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(logoImageL.getWidth(), logoImageL.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        
        return image;
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
            java.util.logging.Logger.getLogger(AddOrEditCharity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrEditCharity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrEditCharity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrEditCharity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddOrEditCharity(null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddOrEditCharity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JButton cancelB;
    private javax.swing.JPanel dawnP;
    private javax.swing.JLabel descCharityL;
    private javax.swing.JTextArea descCharityTA;
    private javax.swing.JPanel headP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel leftL;
    private javax.swing.JLabel leftL1;
    private javax.swing.JButton loadLogoCharityB;
    private javax.swing.JLabel logoCharityL;
    private javax.swing.JTextField logoCharityTF;
    private javax.swing.JLabel logoImageL;
    private javax.swing.JButton logoutB;
    private javax.swing.JPanel mainP;
    private javax.swing.JLabel nameCharityL;
    private javax.swing.JTextField nameCharityTF;
    private javax.swing.JLabel nameL;
    private javax.swing.JButton saveB;
    private javax.swing.JLabel timerL;
    private javax.swing.JLabel titelL;
    // End of variables declaration//GEN-END:variables
}
