package project_gui;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import project_gui.main.Main;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        menu.initMoving(Login.this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new project_gui.component.MenuLogin();
        panelBorder1 = new project_gui.swing.PanelBorder();
        Password = new javax.swing.JPasswordField();
        clear = new project_gui.swing.CustomButton();
        Username = new javax.swing.JTextField();
        Jlabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new project_gui.swing.CustomButton();
        exit = new project_gui.swing.CustomButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 600));
        setUndecorated(true);

        menu.setInheritsPopupMenu(true);

        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        clear.setText("Clear");
        clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clear.setStyle(project_gui.swing.CustomButton.ButtonStyle.SECONDARY);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Jlabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Jlabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password:");

        login.setText("Login");
        login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setStyle(project_gui.swing.CustomButton.ButtonStyle.DESTRUCTIVE);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(582, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 268, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(850, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String lname = "";
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Username.setText("");
        Password.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            
            String username = Username.getText();
            String password = Password.getText();
            
            Statement stm = con.createStatement();
            String delete = "DELETE FROM user";
            PreparedStatement del = con.prepareStatement(delete);
            String login = "SELECT * FROM it INNER JOIN worker ON wrk_it_AT = wrk_AT WHERE IT_AT='"+username+"' AND pass='"+password+"' AND end_date IS NULL";
            del.execute();
            ResultSet rs = stm.executeQuery(login);
            if(rs.next()){
                lname = rs.getString("wrk_lname");
                dispose();
                Main hpage1 = new Main();
                hpage1.show();
            }else{
                JOptionPane.showMessageDialog(this, "Username or Password was Incorrect");
                Username.setText("");
                Password.setText("");
            }
            if(!"".equals(lname)){
                String insert = "INSERT INTO user VALUES('"+lname+"')";
                PreparedStatement ins = con.prepareStatement(insert);
                ins.execute();
            }
            con.close(); 
        }catch (HeadlessException | ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_loginActionPerformed

    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new Login().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private project_gui.swing.CustomButton clear;
    private project_gui.swing.CustomButton exit;
    private javax.swing.JLabel jLabel2;
    private project_gui.swing.CustomButton login;
    private project_gui.component.MenuLogin menu;
    private project_gui.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
