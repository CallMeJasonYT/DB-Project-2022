package project_gui;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import project_gui.main.Main;
import project_gui.main.Main_Mng;

public class Login extends javax.swing.JFrame {
    public static int getBranch() {return branch;}
    
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
        Clear = new project_gui.swing.CustomButton();
        Username = new javax.swing.JTextField();
        UsernameText = new javax.swing.JLabel();
        PasswordText = new javax.swing.JLabel();
        Login = new project_gui.swing.CustomButton();
        Exit = new project_gui.swing.CustomButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 600));
        setUndecorated(true);

        menu.setInheritsPopupMenu(true);

        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Clear.setText("Clear");
        Clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clear.setStyle(project_gui.swing.CustomButton.ButtonStyle.SECONDARY);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        UsernameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsernameText.setText("Username:");

        PasswordText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PasswordText.setText("Password:");

        Login.setText("Login");
        Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Exit.setStyle(project_gui.swing.CustomButton.ButtonStyle.DESTRUCTIVE);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordText)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
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
                    .addGap(0, 267, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(850, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String lname = "";
    public static int branch = 0;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Username.setText("");
        Password.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String username = Username.getText();
            String password = Password.getText();
            
            Statement stm1 = con.createStatement();
            Statement stm2 = con.createStatement();
            String delete = "DELETE FROM user";
            PreparedStatement del = con.prepareStatement(delete);
            String logini = "SELECT * FROM it INNER JOIN worker ON wrk_it_AT = wrk_AT WHERE IT_AT='"+username+"' AND pass='"+password+"' AND end_date IS NULL";
            String loginm = "SELECT * FROM manages INNER JOIN worker ON mng_adm_AT = wrk_AT WHERE mng_username='"+username+"' AND mng_pass='"+password+"'";
            del.execute();
            ResultSet rs1 = stm1.executeQuery(logini);
            ResultSet rs2 = stm2.executeQuery(loginm);
            if(rs1.next()){
                lname = rs1.getString("wrk_lname");
                dispose();
                Main hpage1 = new Main();
                hpage1.show();
            }else if(rs2.next()){
                lname = rs2.getString("wrk_lname");
                branch = rs2.getInt("mng_br_code");
                dispose();
                Main_Mng hpage1 = new Main_Mng();
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
        }catch (HeadlessException | ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_LoginActionPerformed
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new Login().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.swing.CustomButton Clear;
    private project_gui.swing.CustomButton Exit;
    private project_gui.swing.CustomButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel UsernameText;
    private project_gui.component.MenuLogin menu;
    private project_gui.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
