/*Суть формы - в заполнении таблицы "Sponsorship".
В "запросе" добавляем поле RegistrationId по таблице Registration и сортируем по марафону 2017 таблица Marathon
и через это поле спонсируем*/

package kurswork.sponsor;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import scripts.ConDB;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import kurswork.HomeF;
import kurswork.MainClass;
import static oracle.jrockit.jfr.events.Bits.length;


public class Sponsor extends JFrame {
        int money=0,money1=0;
        String red;
        String[] charaty = new String[5100];
        ConDB r = new ConDB();
        
        
    
    public Sponsor() {
        super("Спонор бегуна");
            try {
                r.testDatabase();
                charaty = r.sponsor;
            } catch (SQLException ex) {
                Logger.getLogger(Sponsor.class.getName()).log(Level.SEVERE, null, ex);
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
        dawnP = new javax.swing.JPanel();
        timerL = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        nameL1 = new javax.swing.JLabel();
        nameL2 = new javax.swing.JLabel();
        nameL3 = new javax.swing.JLabel();
        moneyL = new javax.swing.JLabel();
        moneyTF = new javax.swing.JTextField();
        errorL = new javax.swing.JLabel();
        minusB = new javax.swing.JButton();
        plusB = new javax.swing.JButton();
        runInfoCB = new javax.swing.JComboBox<>();
        runnerL = new javax.swing.JLabel();
        yourNameL = new javax.swing.JLabel();
        sponsorNameTF = new javax.swing.JTextField();
        cardL = new javax.swing.JLabel();
        cardTF = new javax.swing.JTextField();
        numerCardL = new javax.swing.JLabel();
        MaskFormatter mf = null;
        try{
            mf = new MaskFormatter("################");
        } catch (ParseException e) {e.printStackTrace();}
        numerCardTF = new javax.swing.JFormattedTextField(mf);
        timeL = new javax.swing.JLabel();
        cvcL = new javax.swing.JLabel();
        MaskFormatter mf3 = null;
        try {
            mf3 = new MaskFormatter("###");
        } catch (ParseException e) {e.printStackTrace();}
        cvcTF = new javax.swing.JFormattedTextField(mf3);
        MaskFormatter mf1 = null;
        try {
            mf1 = new MaskFormatter("##");
        } catch (ParseException e) {e.printStackTrace();}
        monthTF = new javax.swing.JFormattedTextField(mf1);
        toPayB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        errorL1 = new javax.swing.JLabel();
        errorL2 = new javax.swing.JLabel();
        errorL3 = new javax.swing.JLabel();
        errorL4 = new javax.swing.JLabel();
        errorL5 = new javax.swing.JLabel();
        MaskFormatter mf2 = null;
        try{
            mf2 = new MaskFormatter("####");
        } catch (ParseException e) {e.printStackTrace();}
        yearTF = new javax.swing.JFormattedTextField(mf2);
        charityL = new javax.swing.JLabel();
        nameL4 = new javax.swing.JLabel();

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

        mainP.add(headP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

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

        mainP.add(dawnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 546, 800, -1));

        nameL.setBackground(new java.awt.Color(36, 29, 112));
        nameL.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL.setForeground(new java.awt.Color(80, 80, 80));
        nameL.setText("Спонсор бегуна");
        mainP.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 88, -1, 32));

        nameL1.setBackground(new java.awt.Color(36, 29, 112));
        nameL1.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL1.setForeground(new java.awt.Color(80, 80, 80));
        nameL1.setText("Информация о спонсоре");
        mainP.add(nameL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 168, -1, -1));

        nameL2.setBackground(new java.awt.Color(36, 29, 112));
        nameL2.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL2.setForeground(new java.awt.Color(80, 80, 80));
        nameL2.setText("организация бегуна");
        mainP.add(nameL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        nameL3.setBackground(new java.awt.Color(36, 29, 112));
        nameL3.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL3.setForeground(new java.awt.Color(80, 80, 80));
        nameL3.setText("Сумма пожертвования");
        mainP.add(nameL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 275, -1, -1));

        moneyL.setBackground(new java.awt.Color(36, 29, 112));
        moneyL.setFont(new java.awt.Font("Century Gothic", 3, 86)); // NOI18N
        moneyL.setForeground(new java.awt.Color(80, 80, 80));
        moneyL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneyL.setText("$");
        mainP.add(moneyL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 317, 270, 89));

        moneyTF.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        moneyTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        moneyTF.setText("0");
        moneyTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                moneyTFFocusLost(evt);
            }
        });
        moneyTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moneyTFMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                moneyTFMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moneyTFMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                moneyTFMouseReleased(evt);
            }
        });
        moneyTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyTFActionPerformed(evt);
            }
        });
        mainP.add(moneyTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 427, 94, -1));

        errorL.setBackground(new java.awt.Color(36, 29, 112));
        errorL.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        errorL.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(errorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 464, 293, 21));

        minusB.setBackground(new java.awt.Color(0, 144, 62));
        minusB.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        minusB.setForeground(new java.awt.Color(235, 235, 235));
        minusB.setText("-");
        minusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBActionPerformed(evt);
            }
        });
        mainP.add(minusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 419, 53, -1));

        plusB.setBackground(new java.awt.Color(0, 144, 62));
        plusB.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        plusB.setForeground(new java.awt.Color(235, 235, 235));
        plusB.setText("+");
        plusB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plusBMouseExited(evt);
            }
        });
        plusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBActionPerformed(evt);
            }
        });
        mainP.add(plusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 419, 59, -1));

        runInfoCB.setBackground(new java.awt.Color(0, 144, 62));
        runInfoCB.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        runInfoCB.setForeground(new java.awt.Color(235, 235, 235));
        runInfoCB.setModel(new javax.swing.DefaultComboBoxModel<>(r.runnersInfo));
        runInfoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runInfoCBActionPerformed(evt);
            }
        });
        mainP.add(runInfoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 267, 288, -1));

        runnerL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        runnerL.setForeground(new java.awt.Color(80, 80, 80));
        runnerL.setText("Бегун:");
        mainP.add(runnerL, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 266, -1, -1));

        yourNameL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        yourNameL.setForeground(new java.awt.Color(80, 80, 80));
        yourNameL.setText("Ваше имя:");
        mainP.add(yourNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 226, -1, -1));

        sponsorNameTF.setBackground(new java.awt.Color(0, 144, 62));
        sponsorNameTF.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        sponsorNameTF.setForeground(new java.awt.Color(235, 235, 235));
        mainP.add(sponsorNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 223, 262, -1));

        cardL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        cardL.setForeground(new java.awt.Color(80, 80, 80));
        cardL.setText("Карта:");
        mainP.add(cardL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 318, -1, -1));

        cardTF.setBackground(new java.awt.Color(0, 144, 62));
        cardTF.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        cardTF.setForeground(new java.awt.Color(235, 235, 235));
        cardTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardTFActionPerformed(evt);
            }
        });
        mainP.add(cardTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 315, 264, -1));

        numerCardL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        numerCardL.setForeground(new java.awt.Color(80, 80, 80));
        numerCardL.setText("Номер карты#:");
        mainP.add(numerCardL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, -1, -1));

        numerCardTF.setBackground(new java.awt.Color(0, 144, 62));
        numerCardTF.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        numerCardTF.setForeground(new java.awt.Color(235, 235, 235));
        mainP.add(numerCardTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 362, 264, -1));

        timeL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        timeL.setForeground(new java.awt.Color(80, 80, 80));
        timeL.setText("Срок действия:");
        mainP.add(timeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 412, -1, -1));

        cvcL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        cvcL.setForeground(new java.awt.Color(80, 80, 80));
        cvcL.setText("CVC:");
        mainP.add(cvcL, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 459, -1, -1));

        cvcTF.setBackground(new java.awt.Color(0, 144, 62));
        cvcTF.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        cvcTF.setForeground(new java.awt.Color(235, 235, 235));
        mainP.add(cvcTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 456, 51, -1));

        monthTF.setBackground(new java.awt.Color(0, 144, 62));
        monthTF.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        monthTF.setForeground(new java.awt.Color(235, 235, 235));
        mainP.add(monthTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 409, 40, -1));

        toPayB.setBackground(new java.awt.Color(0, 144, 62));
        toPayB.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        toPayB.setForeground(new java.awt.Color(235, 235, 235));
        toPayB.setText("Заплатить");
        toPayB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPayBActionPerformed(evt);
            }
        });
        mainP.add(toPayB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 494, -1, -1));

        cancelB.setBackground(new java.awt.Color(0, 144, 62));
        cancelB.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        cancelB.setForeground(new java.awt.Color(235, 235, 235));
        cancelB.setText("Отмена");
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });
        mainP.add(cancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 494, -1, -1));

        errorL1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        errorL1.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(errorL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 20, 20));

        errorL2.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        errorL2.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(errorL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 20, 20));

        errorL3.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        errorL3.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(errorL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 20, 20));

        errorL4.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        errorL4.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(errorL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 20, 20));

        errorL5.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        errorL5.setForeground(new java.awt.Color(255, 0, 0));
        mainP.add(errorL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 20, 20));

        yearTF.setBackground(new java.awt.Color(0, 144, 62));
        yearTF.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        yearTF.setForeground(new java.awt.Color(235, 235, 235));
        mainP.add(yearTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 60, -1));

        charityL.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        charityL.setForeground(new java.awt.Color(0, 144, 62));
        mainP.add(charityL, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 224, 240, 20));

        nameL4.setBackground(new java.awt.Color(36, 29, 112));
        nameL4.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        nameL4.setForeground(new java.awt.Color(80, 80, 80));
        nameL4.setText("Благотворительная");
        mainP.add(nameL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

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

    private void moneyTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyTFActionPerformed
red = moneyTF.getText();  
money1= Integer.parseInt(red);
if (money1<0) {
errorL.setText("Значение не может быть меньше 0");
}else{
money=money1;
errorL.setText(""+money);
moneyL.setText(""+money);
}
    }//GEN-LAST:event_moneyTFActionPerformed

    private void minusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBActionPerformed
red = moneyTF.getText();
money1 = Integer.parseInt(red);
money1-=10;
if (money1<0) {
errorL.setText("Значение не может быть меньше 0");
}else{
money=money1;
errorL.setText("");
moneyL.setText(""+money);
moneyTF.setText(""+money);
}
    }//GEN-LAST:event_minusBActionPerformed

    private void plusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBActionPerformed
red = moneyTF.getText();
money1 = Integer.parseInt(red);
if (money1 >= 0) {
money1+=10;
money=money1;
errorL.setText("");
moneyL.setText(""+money);
moneyTF.setText(""+money);
} else {
    money1+=10;
    money=money1;
    errorL.setText("");
    moneyL.setText(""+money);
    moneyTF.setText(""+money);
    errorL.setText("Значение не может быть меньше 0");}
    }//GEN-LAST:event_plusBActionPerformed

    private void plusBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusBMouseExited
      
    }//GEN-LAST:event_plusBMouseExited

    private void moneyTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moneyTFMouseClicked
        
    }//GEN-LAST:event_moneyTFMouseClicked

    private void moneyTFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moneyTFMouseExited
    red = moneyTF.getText();
    money1 = Integer.parseInt(red);
    
    if (money1 >= 0) {
    money=money1;
    errorL.setText("");
    moneyL.setText(""+money);
    moneyTF.setText(""+money);
    } else errorL.setText("Значение не может быть меньше 0");
    }//GEN-LAST:event_moneyTFMouseExited

    private void moneyTFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moneyTFMousePressed
        
    }//GEN-LAST:event_moneyTFMousePressed

    private void moneyTFMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moneyTFMouseReleased
        
    }//GEN-LAST:event_moneyTFMouseReleased

    private void moneyTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_moneyTFFocusLost
        
    }//GEN-LAST:event_moneyTFFocusLost

    private void runInfoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runInfoCBActionPerformed
        int numRunner = (Integer) runInfoCB.getSelectedIndex();    
        charityL.setText(charaty[numRunner]);
    }//GEN-LAST:event_runInfoCBActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        new HomeF().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        new HomeF().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBActionPerformed

    private void toPayBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toPayBActionPerformed
        int mon = 0, y = 0, cvcI = 0;
        long numCardI = 0; 
        
        boolean go1 = false, go2 = false, go3 = false, go4 = false, go5 = false; 
        
        String name = sponsorNameTF.getText();
        String card = cardTF.getText();
        String numerCard = numerCardTF.getText();
        String month = monthTF.getText();
        String year = yearTF.getText();
        String cvc = cvcTF.getText();
        MainClass.runner = (String) runInfoCB.getSelectedItem();
        MainClass.sum = moneyTF.getText();
        int runner = (Integer) runInfoCB.getSelectedIndex(); 
        
        try {
        numCardI = Long.parseLong(numerCard);
        } catch (Exception e) {System.out.println("error card");} 
        try {
            cvcI = Integer.parseInt(cvc);
        } catch (Exception e) {System.out.println("error cvc");}    
        try {
            mon = Integer.parseInt(month);
            y = Integer.parseInt(year);
        } catch (Exception e) {System.out.println("error month or year");}
        
        if (length(name) > 0) {errorL1.setText(""); go1 = true;} else {errorL1.setText("*"); go1 = false;}
        if (length(card) > 0) {errorL2.setText(""); go2 = true;} else {errorL2.setText("*"); go2 = false;}
        
        if (y == 2017)  { 
        if ((7 < mon) & (mon < 13))  {errorL4.setText(""); go3 = true;}      
            } else {
        if ((0 < mon) & (mon < 13))  {errorL4.setText(""); go3 = true;} else {errorL4.setText("*"); go3 = false;}
        if (y > 2017)  {errorL4.setText(""); go3 = true;} else {errorL4.setText("*"); go3 = false;}}
        if (numCardI > 0) {errorL3.setText(""); go4 = true;} else {errorL3.setText("*"); go4 = false;}
        if (cvcI > 0) {errorL5.setText(""); go5 = true;} else {errorL5.setText("*"); go5 = false;}
        
        
           
        if ((go1 == true) & (go2 == true) & (go3 == true) & (go4 == true) & (go5 == true)) {
            new Thanks().setVisible(true);this.dispose();
        }
        
    }//GEN-LAST:event_toPayBActionPerformed

    private void cardTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardTFActionPerformed

    
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(Sponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                new Sponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JButton cancelB;
    private javax.swing.JLabel cardL;
    private javax.swing.JTextField cardTF;
    private javax.swing.JLabel charityL;
    private javax.swing.JLabel cvcL;
    private javax.swing.JTextField cvcTF;
    private javax.swing.JPanel dawnP;
    private javax.swing.JLabel errorL;
    private javax.swing.JLabel errorL1;
    private javax.swing.JLabel errorL2;
    private javax.swing.JLabel errorL3;
    private javax.swing.JLabel errorL4;
    private javax.swing.JLabel errorL5;
    private javax.swing.JPanel headP;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel mainP;
    private javax.swing.JButton minusB;
    private javax.swing.JLabel moneyL;
    private javax.swing.JTextField moneyTF;
    private javax.swing.JTextField monthTF;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel nameL1;
    private javax.swing.JLabel nameL2;
    private javax.swing.JLabel nameL3;
    private javax.swing.JLabel nameL4;
    private javax.swing.JLabel numerCardL;
    private javax.swing.JTextField numerCardTF;
    private javax.swing.JButton plusB;
    private javax.swing.JComboBox<String> runInfoCB;
    private javax.swing.JLabel runnerL;
    private javax.swing.JTextField sponsorNameTF;
    private javax.swing.JLabel timeL;
    private javax.swing.JLabel timerL;
    private javax.swing.JLabel titelL;
    private javax.swing.JButton toPayB;
    private javax.swing.JTextField yearTF;
    private javax.swing.JLabel yourNameL;
    // End of variables declaration//GEN-END:variables

    private String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
