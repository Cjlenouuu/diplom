//Форма для редактирования данных бегуна
package kurswork.runner;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import static oracle.jrockit.jfr.events.Bits.length;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;
import kurswork.HomeF;
import kurswork.MainClass;
import kurswork.runner.MenuRunner;
import scripts.CountryDB;

/**
 *
 * @author user
 */
public class EditRunner extends javax.swing.JFrame {

    String s;
    private boolean checklog;
    boolean checkpas, checkname, checksurname;
 

    public ImageIcon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(ImageIcon.getWidth(), ImageIcon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    public EditRunner() {
        super("Редактирование");
        getDataFromBase();
        initComponents();
        {
            getCountry();
            getDataFromBase();
        }
        setLocationRelativeTo(null);

    }

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
            Logger.getLogger(EditRunner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getDataFromBase() {
        try {
            Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stmt = con.createStatement();
            String FName, LName, RunnerId, Gender, DOB, Country;
            Blob blob = null;
            byte[] image1 = null;
            ResultSet rs = stmt.executeQuery("select * from runner where Email = '" + MainClass.emailR + "'");
            rs.next();
            RunnerId = rs.getString(1);
            Gender = rs.getString(3);
            DOB = rs.getString(4);
            Country = rs.getString(5);
            blob = rs.getBlob(6);
            drTF.setText(DOB);
            try {
                image1 = blob.getBytes(1, (int) blob.length());
                ImageIcon image = new ImageIcon(image1);
                ImageIcon.setIcon(image);
            } catch (Exception ex) {
                System.out.print("Ошибка с картинкой");
                ImageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/foto.png")));
            }
            rs.close();
            rs = stmt.executeQuery("select * from user where Email = '" + MainClass.emailR + "'");
            rs.next();
            String Pass1 = rs.getString(2);
            FName = rs.getString(3);
            LName = rs.getString(4);
            rs.close();
            stmt.close();
            con.close();
            pas2TF.setText(Pass1);
            pas1TF.setText(Pass1);
            surnamerunTF.setText(FName);
            namerunTF.setText(LName);
            getSelectedItem(Country);
        } catch (Exception ex) {
            System.err.println(ex);
            System.out.println("тут?");
        }
        //response.setContentType("image/gif");
        //ImageIcon.setIcon(Image);
    }

    private void getSelectedItem(String Country) {
        Connection con;
        try {
            con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from country where CountryCode = '" + Country + "'");
            rs.next();
            String CName = rs.getString(2);
            Object O = null;
            O = CName;
            countryCB.setSelectedItem(O);
        } catch (SQLException ex) {
            System.out.println("тут1?");
            Logger.getLogger(EditRunner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            PreparedStatement ps = con.prepareStatement("UPDATE `kurs`.`runner` SET `Image`=? WHERE `RunnerId`='" + ID + "';");
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("kurs?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        genderQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT g FROM Gender g");
        genderList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : genderQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        mainP = new javax.swing.JPanel();
        danwP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        headP = new javax.swing.JPanel();
        backB = new javax.swing.JButton();
        titleL = new javax.swing.JLabel();
        logoutB = new javax.swing.JButton();
        loginL = new javax.swing.JLabel();
        passL = new javax.swing.JLabel();
        loginB = new javax.swing.JButton();
        chooserB = new javax.swing.JButton();
        nameL = new javax.swing.JLabel();
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
        passL5 = new javax.swing.JLabel();
        loginL1 = new javax.swing.JLabel();
        passL6 = new javax.swing.JLabel();
        passL7 = new javax.swing.JLabel();
        passL8 = new javax.swing.JLabel();
        cancelB1 = new javax.swing.JButton();
        ImageIcon = new javax.swing.JLabel();
        pas1TF = new javax.swing.JPasswordField();
        pas2TF = new javax.swing.JPasswordField();

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

        mainP.add(danwP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, -1, -1));

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

        logoutB.setBackground(new java.awt.Color(253, 193, 0));
        logoutB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        logoutB.setText("Выход");
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
                .addGap(35, 35, 35)
                .addComponent(backB)
                .addGap(146, 146, 146)
                .addComponent(titleL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(logoutB)
                .addGap(24, 24, 24))
        );
        headPLayout.setVerticalGroup(
            headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(headPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backB)
                    .addComponent(titleL)
                    .addComponent(logoutB))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        mainP.add(headP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        loginL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginL.setForeground(new java.awt.Color(80, 80, 80));
        loginL.setText("Электроная почта:");
        mainP.add(loginL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        passL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL.setForeground(new java.awt.Color(80, 80, 80));
        passL.setText("Пароль:");
        mainP.add(passL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        loginB.setBackground(new java.awt.Color(0, 144, 62));
        loginB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginB.setText("Сохранить");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });
        mainP.add(loginB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        chooserB.setBackground(new java.awt.Color(0, 144, 62));
        chooserB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        chooserB.setText("Обзор");
        chooserB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooserBActionPerformed(evt);
            }
        });
        mainP.add(chooserB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 370, -1));

        nameL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL.setForeground(new java.awt.Color(80, 80, 80));
        nameL.setText("Редактирование профиля");
        mainP.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 89, -1, -1));

        passL1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL1.setForeground(new java.awt.Color(80, 80, 80));
        passL1.setText("Повторите пароль:");
        mainP.add(passL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 427, -1, -1));

        passL2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL2.setForeground(new java.awt.Color(80, 80, 80));
        passL2.setText("Имя:");
        mainP.add(passL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        passL3.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL3.setForeground(new java.awt.Color(80, 80, 80));
        passL3.setText("Фамилия:");
        mainP.add(passL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));
        mainP.add(namerunTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 170, -1));
        mainP.add(surnamerunTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 170, -1));

        passL4.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL4.setForeground(new java.awt.Color(80, 80, 80));
        passL4.setText("Пол:");
        mainP.add(passL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        nameerrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        nameerrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(nameerrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 268, 32, 21));

        surnameerrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        surnameerrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(surnameerrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 278, 32, 21));

        paserrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        paserrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(paserrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 241, 32, 21));

        emailerrorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        emailerrorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(emailerrorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 187, 32, 21));

        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Мужской", "Женский"}));
        genderCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCBActionPerformed(evt);
            }
        });
        mainP.add(genderCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, -1));

        countryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        countryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryCBActionPerformed(evt);
            }
        });
        mainP.add(countryCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, -1));

        /*
        drTF.setText(null);
        */
        mainP.add(drTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 374, 100, 31));

        nameL1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        nameL1.setForeground(new java.awt.Color(80, 80, 80));
        nameL1.setText("Формат даты: гггг-мм-дд");
        mainP.add(nameL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 335, -1, 33));

        passL5.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL5.setForeground(new java.awt.Color(80, 80, 80));
        passL5.setText("Страна:");
        mainP.add(passL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        loginL1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        loginL1.setForeground(new java.awt.Color(80, 80, 80));
        loginL1.setText((String) MainClass.emailR);
        mainP.add(loginL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        passL6.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL6.setForeground(new java.awt.Color(80, 80, 80));
        passL6.setText("Смена пароля:");
        mainP.add(passL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        passL7.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL7.setForeground(new java.awt.Color(80, 80, 80));
        passL7.setText("Оставьте эти поля пустыми,");
        mainP.add(passL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        passL8.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        passL8.setForeground(new java.awt.Color(80, 80, 80));
        passL8.setText("если не хотите изменять пароль. ");
        mainP.add(passL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        cancelB1.setBackground(new java.awt.Color(0, 144, 62));
        cancelB1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        cancelB1.setText("Отмена");
        cancelB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelB1ActionPerformed(evt);
            }
        });
        mainP.add(cancelB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 200, -1));

        ImageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/materials/icon/foto.jpg"))); // NOI18N
        mainP.add(ImageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 370, 190));
        mainP.add(pas1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 170, -1));
        mainP.add(pas2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 170, -1));

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
        new MenuRunner().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBActionPerformed

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

    private void genderCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCBActionPerformed
        String a = (String) genderCB.getSelectedItem();//присваивает значение поля переменной
    }//GEN-LAST:event_genderCBActionPerformed

    private void countryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryCBActionPerformed
        String a = (String) countryCB.getSelectedItem();//присваивает значение поля переменной
    }//GEN-LAST:event_countryCBActionPerformed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
        String pw1 = null, pw2, name = null, surname = null, eMail = (String) MainClass.emailR, gender = null, country = null, dr = null;
        if (s != null) {
            saveIcon();
        }
        try {
            country = (String) countryCB.getSelectedItem();
            gender = (String) genderCB.getSelectedItem();
            if (gender.equals("Мужской")) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            dr = drTF.getText();
           
            pw1 = pas1TF.getText();
            pw2 = pas2TF.getText();
            name = namerunTF.getText();
            surname = surnamerunTF.getText();
            if (length(pw1) > 6) {
                String str2 = pw1.toLowerCase();
                checkpas = pw1.equals(str2);
                if (checkpas == false) {
                    paserrorL.setText("");
                    if (pw1.equals(pw2)) {
                        checkpas = true;
                        paserrorL.setText("");
                    } else {
                        paserrorL.setText("*");
                    }
                } else {
                }
            } else {
            }
            if (length(name) == 0) {
                checkname = false;
                nameerrorL.setText("*");
            } else {
                checkname = true;
                nameerrorL.setText("");
            }
            if (length(surname) == 0) {
                checksurname = false;
                surnameerrorL.setText("*");
            } else {
                checksurname = true;
                surnameerrorL.setText("");
            }

        } catch (Exception e) {
            System.out.println("Пароль не тот");
        }
        if ((checkpas == true) & (checkname == true) & (checksurname == true)) {
            System.out.println(" " + eMail + " " + pw1 + " " + name + " " + surname + " " + dr + " " + gender + " " + country);
        }
        if (checkpas == true & checkname == true & checksurname == true) {
            try {
                
                String insert1 = "UPDATE user SET Password = '" + pw1 + "', FirstName = '" + surname + "', LastName = '" + name + "' WHERE Email = '" + eMail + "';";
                Connection con = DriverManager.getConnection(MainClass.URL, MainClass.USER, MainClass.PASS);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT CountryCode FROM country where CountryName like '" + country + "';");
                rs.next();
                String str = rs.getString(1);
                rs.close();
                ResultSet rr = stmt.executeQuery("SELECT runnerID FROM runner where Email like '" + eMail + "';");
                rr.next();
                String ID = rr.getString(1);
                System.out.println(ID);
                String insert2 = "UPDATE runner SET Email='" + eMail + "',Gender = '" + gender + "', DateOfBirth = '" + dr + "', CountryCode= '" + str + "' WHERE RunnerId = '" + ID + "';";
                try {
                    stmt.executeUpdate(insert1);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Ошибка1");
                }
                try {
                    stmt.executeUpdate(insert2);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Ошибка2");
                }
                stmt.close();
                con.close();
                System.out.println("Обновлено");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Ошибка");
            }
            JOptionPane.showMessageDialog(this, "Изменения сохранены успешно, вы будете перенаправлены в главное меню", "Успешное сохранение данных", JOptionPane.INFORMATION_MESSAGE);
            new MenuRunner().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_loginBActionPerformed

    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBActionPerformed
        new HomeF().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBActionPerformed

    private void cancelB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelB1ActionPerformed
        new MenuRunner().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelB1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EditRunner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageIcon;
    private javax.swing.JButton backB;
    private javax.swing.JButton cancelB1;
    private javax.swing.JButton chooserB;
    private javax.swing.JComboBox<String> countryCB;
    private javax.swing.JPanel danwP;
    private javax.swing.JTextField drTF;
    private javax.swing.JLabel emailerrorL;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JComboBox<String> genderCB;
    private java.util.List<kurswork.Gender> genderList;
    private javax.persistence.Query genderQuery;
    private javax.swing.JPanel headP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginB;
    private javax.swing.JLabel loginL;
    private javax.swing.JLabel loginL1;
    private javax.swing.JButton logoutB;
    private javax.swing.JPanel mainP;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel nameL1;
    private javax.swing.JLabel nameerrorL;
    private javax.swing.JTextField namerunTF;
    private javax.swing.JPasswordField pas1TF;
    private javax.swing.JPasswordField pas2TF;
    private javax.swing.JLabel paserrorL;
    private javax.swing.JLabel passL;
    private javax.swing.JLabel passL1;
    private javax.swing.JLabel passL2;
    private javax.swing.JLabel passL3;
    private javax.swing.JLabel passL4;
    private javax.swing.JLabel passL5;
    private javax.swing.JLabel passL6;
    private javax.swing.JLabel passL7;
    private javax.swing.JLabel passL8;
    private javax.swing.JLabel surnameerrorL;
    private javax.swing.JTextField surnamerunTF;
    private javax.swing.JLabel titleL;
    // End of variables declaration//GEN-END:variables
}
