/*
INSERT INTO `kurs`.`user` (`Email`, `Password`, `FirstName`, `LastName`, `RoleId`) VALUES ('aaaaaaaaa', '1', 'A', 'B', 'R');

 */
package admin;

import kurswork.*;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import static oracle.jrockit.jfr.events.Bits.length;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;
import kurswork.runner.MenuRunner;


/**
 *
 * @author user
 */
public class RegUser extends javax.swing.JFrame {

    private boolean checklog;
    boolean checkpas, checkname, checksurname;
    String s = null;
   
            
    public RegUser() {
        super("Регистрация");
        initComponents();
        getCountry();
        getRole();
        setLocationRelativeTo(null);
        
    }
    
    //Метод для подгонки загружаемого изображения под форму
        public ImageIcon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(ImageIcon.getWidth(), ImageIcon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    //Метод для заполнения выпадащего списка странами из БД
        private void getCountry() {
        Connection con;
        try {
            con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select distinct(CountryName) from country;");
            while (rs.next()) {
                String str = rs.getString("CountryName");
                countryCB.addItem(str);
            }
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }
        
        
                private void getRole() {
        Connection con;
        try {
            con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select RoleName from role;");
            while (rs.next()) {
                String str = rs.getString(1);
                roleCB.addItem(str);
            }
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }
    //Метод для сохранения картики в базе данных
        private void saveIcon() {
        try {
            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stmt = con.createStatement();
            String ID = null;
            ResultSet rs = stmt.executeQuery("select RunnerId from runner where Email = '" + MainClass.emailR + "'");
            rs.next();
            ID = rs.getString(1);
            rs.close();
            stmt.close();
            InputStream is = new FileInputStream(new File(s));
            String eMail = (String) MainClass.emailR;
            // PreparedStatement ps = con.prepareStatement("UPDATE runner SET Image='" + is +" WHERE RunnerId = '" + eMail + "';");
            PreparedStatement ps = con.prepareStatement("UPDATE runner SET `Image`=? WHERE `RunnerId`='" + ID + "';");
            ps.setBlob(1, is);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Inserted");
        } catch (Exception ex) {
            System.out.println("Картинка не сохранена");
            ex.printStackTrace();
        }        // TODO add your handling code here:

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
        passL3 = new javax.swing.JLabel();
        namerunTF = new javax.swing.JTextField();
        surnamerunTF = new javax.swing.JTextField();
        passL4 = new javax.swing.JLabel();
        nameerrorL = new javax.swing.JLabel();
        surnameerrorL = new javax.swing.JLabel();
        paserrorL = new javax.swing.JLabel();
        emailerrorL = new javax.swing.JLabel();
        genderCB = new javax.swing.JComboBox<>();
        countryCB = new javax.swing.JComboBox<>();
        MaskFormatter mf = null ;
        try
        {
            mf = new MaskFormatter("AAAA-AA-AA");
        } catch (ParseException e){e.printStackTrace();}
        drTF = new javax.swing.JFormattedTextField(mf);
        nameL1 = new javax.swing.JLabel();
        nameL2 = new javax.swing.JLabel();
        nameL3 = new javax.swing.JLabel();
        ImageIcon = new javax.swing.JLabel();
        chooserB = new javax.swing.JButton();
        loginL1 = new javax.swing.JLabel();
        roleCB = new javax.swing.JComboBox<>();

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

        mailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTFActionPerformed(evt);
            }
        });
        mainP.add(mailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 188, 205, -1));
        mainP.add(pas1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 215, 170, -1));
        pas1TF.setToolTipText("<html><p>Требования к паролю:</p><p>•Минимум 6 символов</p><p>•Минимум 1 прописная буква</p><p>•Минимум 1 цифра•</p><p>По крайней мере один из следующих символов: ! @ # $ % ^</p></html>");

        loginL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginL.setForeground(new java.awt.Color(80, 80, 80));
        loginL.setText("Электроная почта:");
        mainP.add(loginL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));

        passL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL.setForeground(new java.awt.Color(80, 80, 80));
        passL.setText("Пароль:");
        mainP.add(passL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 214, -1, -1));

        loginB.setBackground(new java.awt.Color(0, 144, 62));
        loginB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginB.setText("Зарегистрировать");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });
        mainP.add(loginB, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 435, -1, -1));

        cancelB.setBackground(new java.awt.Color(0, 144, 62));
        cancelB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        cancelB.setText("Отмена");
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });
        mainP.add(cancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 435, 200, -1));

        badPassL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        badPassL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(badPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 210, 190, 25));

        nameL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL.setForeground(new java.awt.Color(80, 80, 80));
        nameL.setText("Зарегистрировать пользователя");
        mainP.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        paragraphL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        paragraphL.setForeground(new java.awt.Color(80, 80, 80));
        paragraphL.setText("Заполните все поля для регистрации пользователя");
        mainP.add(paragraphL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        mainP.add(pas2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 242, 170, -1));
        pas2TF.setToolTipText("Повторите пароль");

        passL1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL1.setForeground(new java.awt.Color(80, 80, 80));
        passL1.setText("Повторите пароль:");
        mainP.add(passL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 241, -1, -1));

        passL2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL2.setForeground(new java.awt.Color(80, 80, 80));
        passL2.setText("Имя:");
        mainP.add(passL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 268, -1, -1));

        passL3.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL3.setForeground(new java.awt.Color(80, 80, 80));
        passL3.setText("Фамилия:");
        mainP.add(passL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 295, -1, -1));
        mainP.add(namerunTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 269, 170, -1));
        mainP.add(surnamerunTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 296, 170, -1));

        passL4.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL4.setForeground(new java.awt.Color(80, 80, 80));
        passL4.setText("Пол:");
        mainP.add(passL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 327, -1, -1));

        nameerrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        nameerrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(nameerrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 268, 32, 21));

        surnameerrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        surnameerrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(surnameerrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 295, 32, 21));

        paserrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        paserrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(paserrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 241, 32, 21));

        emailerrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        emailerrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(emailerrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 187, 32, 21));

        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Мужской", "Женский"}));
        genderCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCBActionPerformed(evt);
            }
        });
        mainP.add(genderCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 327, 90, -1));

        countryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryCBActionPerformed(evt);
            }
        });
        mainP.add(countryCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 150, -1));

        /*
        drTF.setText(null);
        */
        mainP.add(drTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 110, 31));

        nameL1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        nameL1.setForeground(new java.awt.Color(80, 80, 80));
        nameL1.setText("Страна:");
        mainP.add(nameL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        nameL2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        nameL2.setForeground(new java.awt.Color(80, 80, 80));
        nameL2.setText("Формат даты: гггг-мм-дд");
        mainP.add(nameL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        nameL3.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        nameL3.setForeground(new java.awt.Color(80, 80, 80));
        nameL3.setText("Дата рождения:");
        mainP.add(nameL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        ImageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/foto.jpg"))); // NOI18N
        mainP.add(ImageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 370, 210));

        chooserB.setBackground(new java.awt.Color(0, 144, 62));
        chooserB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        chooserB.setText("Обзор");
        chooserB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooserBActionPerformed(evt);
            }
        });
        mainP.add(chooserB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 330, -1));

        loginL1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginL1.setForeground(new java.awt.Color(80, 80, 80));
        loginL1.setText("Роль пользователя:");
        mainP.add(loginL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 30));

        roleCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        roleCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleCBActionPerformed(evt);
            }
        });
        mainP.add(roleCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 190, -1));

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
            new AdminUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        new AdminUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBActionPerformed

    private void mailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTFActionPerformed
        
    }//GEN-LAST:event_mailTFActionPerformed

    private void genderCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCBActionPerformed
        String a = (String) genderCB.getSelectedItem();//присваивает значение поля переменной
                // TODO add your handling code here:
    }//GEN-LAST:event_genderCBActionPerformed

    private void countryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryCBActionPerformed
        String a = (String) countryCB.getSelectedItem();//присваивает значение поля переменной
                // TODO add your handling code here:
    }//GEN-LAST:event_countryCBActionPerformed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
        String  pw1 = null, pw2, name = null, surname = null,eMail = null, gender = null, country = null, dr = null;
        try {

            eMail = mailTF.getText();
            country = (String) countryCB.getSelectedItem();
            gender = (String) genderCB.getSelectedItem();
            if (gender.equals("Мужской")){
            gender = "Male";
            }else{
            gender = "Female";
            }
            dr = drTF.getText();
            try {
                Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Email FROM user where Email like '" + eMail + "';");
                rs.next();
                String str =rs.getString(1);
                rs.close();
                stmt.close();
                con.close();
                JOptionPane.showMessageDialog(this, "Такой Email уже существует", "Ошибка", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Такой Email уже существует");
                emailerrorL.setText("*");
                checklog = false;
            } catch (Exception e) {
                System.out.println("Совпадений нет");
                checklog = true;
            }

            pw1 = pas1TF.getText();
            pw2 = pas2TF.getText();
            name = namerunTF.getText();
            surname = surnamerunTF.getText();
                    if (length(pw1)>=6){
                    badPassL.setText("");
                    String str2 = pw1.toLowerCase();
                    checkpas = pw1.equals(str2);
                    if(checkpas == false){
                        badPassL.setText("");
                        paserrorL.setText("");
                        if  (pw1.equals(pw2)){
                            checkpas =true;
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
            if (length(name)==0)
            {
                checkname = false;
                nameerrorL.setText("*");
            }
            else{
                checkname = true;
                nameerrorL.setText("");
            }
            if (length(surname) == 0){
                checksurname = false;
                surnameerrorL.setText("*");
            }else{
                checksurname = true;
                surnameerrorL.setText("");

            }

        } catch(Exception e) {
            System.out.println("Пароль не тот");
            //badPassL.setText("Неверный логин или пароль!!!");
        }
        if ((checklog == true) & (checkpas == true) & (checkname == true)& (checksurname == true)) {
           // genderL.setText("Зарегистрирован");
            System.out.println(" " + eMail + " "+ pw1 + " " + name + " " + surname + " "+ dr + " " + gender + " " + country);

        }
        if (checklog == true & checkpas == true & checkname == true & checksurname == true){
          try {
              
             
              
              
                  Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
                  Statement stmt = con.createStatement();
                  ResultSet rs = stmt.executeQuery("SELECT CountryCode FROM country where CountryName like '" + country + "';");
                    rs.next();
                    String str =rs.getString(1);
                    rs.close();
                    String roleN = (String) roleCB.getSelectedItem();
                    rs = stmt.executeQuery("select * from role where RoleName = '"+roleN+"'");
                    rs.next();
                    String roleID = rs.getString(1);
                    rs.close();
                    String insert2 = "INSERT INTO runner ( Email, Gender, DateOfBirth, CountryCode) VALUES ('" + eMail + "','" + gender + "', '" + dr + "', '" + str + "');";
                    String insert1 = "INSERT INTO user (Email, Password, FirstName, LastName, RoleId) VALUES ('" + eMail + "', '" + pw1 + "', '" + surname + "', '" + name + "', '"+roleID+"');";
                    stmt.executeUpdate(insert1);
                  try{
                  stmt.executeUpdate(insert2);
                  }catch(Exception e) {
                   e.printStackTrace();
                  System.out.println("Не добавило");
                  }
                  //ResultSet rs = stmt.executeQuery(insert);
                 // rs.close();
                  stmt.close();
                  con.close();
                  MainClass.emailR = eMail;
                  if (s!=null){saveIcon();}
                  System.out.println("Пользователь добавлен");
                  JOptionPane.showMessageDialog(this, "Пользователь успешно добавлен", "Успех", JOptionPane.INFORMATION_MESSAGE);
          new AdminUser().setVisible(true);
          
          this.dispose();
              } catch (Exception e) {
                  e.printStackTrace();
                  System.out.println("Ошибка");
                  
              }

         
    }
    }//GEN-LAST:event_loginBActionPerformed

    private void chooserBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooserBActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            ImageIcon.setIcon(ResizeImage(path));
            s = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Data");
            new MenuRunner().setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_chooserBActionPerformed

    private void roleCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleCBActionPerformed

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
            java.util.logging.Logger.getLogger(RegUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageIcon;
    private javax.swing.JButton backB;
    javax.swing.JLabel badPassL;
    private javax.swing.JButton cancelB;
    private javax.swing.JButton chooserB;
    private javax.swing.JComboBox<String> countryCB;
    private javax.swing.JPanel danwP;
    private javax.swing.JTextField drTF;
    private javax.swing.JLabel emailerrorL;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.JPanel headP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginB;
    private javax.swing.JLabel loginL;
    private javax.swing.JLabel loginL1;
    private javax.swing.JTextField mailTF;
    private javax.swing.JPanel mainP;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel nameL1;
    private javax.swing.JLabel nameL2;
    private javax.swing.JLabel nameL3;
    private javax.swing.JLabel nameerrorL;
    private javax.swing.JTextField namerunTF;
    private javax.swing.JLabel paragraphL;
    private javax.swing.JTextField pas1TF;
    private javax.swing.JTextField pas2TF;
    private javax.swing.JLabel paserrorL;
    private javax.swing.JLabel passL;
    private javax.swing.JLabel passL1;
    private javax.swing.JLabel passL2;
    private javax.swing.JLabel passL3;
    private javax.swing.JLabel passL4;
    private javax.swing.JComboBox<String> roleCB;
    private javax.swing.JLabel surnameerrorL;
    private javax.swing.JTextField surnamerunTF;
    private javax.swing.JLabel titleL;
    // End of variables declaration//GEN-END:variables
}
