package project_gui.Inserts;
import java.sql.*;
import javax.swing.*;

public class mngs_Ins extends javax.swing.JFrame {

    public mngs_Ins() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Insert_btn = new javax.swing.JButton();
        Cancel_btn = new javax.swing.JButton();
        br_code = new javax.swing.JComboBox<>();
        adm_AT = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Manager AT:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Branch Code:");

        Insert_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Insert_btn.setText("Insert");
        Insert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_btnActionPerformed(evt);
            }
        });

        Cancel_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancel_btn.setText("Cancel");
        Cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_btnActionPerformed(evt);
            }
        });

        br_code.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        br_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_codeActionPerformed(evt);
            }
        });

        adm_AT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        adm_AT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_ATActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adm_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(br_code, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adm_AT, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(br_code))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_btnActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO manages(mng_adm_AT,mng_br_code) VALUES(?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
            String code = br_code.getSelectedItem().toString().replaceAll("[^0-9.]", "");
            int i=Integer.parseInt(code);
            insrt.setString(2,adm_AT.getSelectedItem().toString());
            insrt.setInt(2,i);
            insrt.execute();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Insert_btnActionPerformed

    private void Cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_btnActionPerformed
        dispose();
    }//GEN-LAST:event_Cancel_btnActionPerformed

    private void br_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_codeActionPerformed
        
    }//GEN-LAST:event_br_codeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select1="SELECT br_code FROM branch;";
            String select2="SELECT adm_AT FROM admin;";
            Statement slct1 = con.createStatement();
            Statement slct2 = con.createStatement();
            ResultSet rs1 = slct1.executeQuery(select1);
            ResultSet rs2 = slct2.executeQuery(select2);
            DefaultComboBoxModel mod1 = new DefaultComboBoxModel();
            DefaultComboBoxModel mod2 = new DefaultComboBoxModel();
            mod1.removeAllElements();
            mod2.removeAllElements();
            while(rs1.next()){
                String box = "Branch: "+rs1.getInt("br_code")+"";
                mod1.addElement(box);
            }
            while(rs2.next()){
                mod2.addElement(rs2.getString("adm_AT"));
            }
            br_code.setModel(mod1);
            adm_AT.setModel(mod2);
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void adm_ATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_ATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adm_ATActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mngs_Ins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_btn;
    private javax.swing.JButton Insert_btn;
    private javax.swing.JComboBox<String> adm_AT;
    private javax.swing.JComboBox<String> br_code;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
