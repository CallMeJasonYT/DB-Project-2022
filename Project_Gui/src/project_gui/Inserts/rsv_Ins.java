package project_gui.Inserts;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class rsv_Ins extends javax.swing.JFrame {
    public rsv_Ins() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Insert_btn = new javax.swing.JButton();
        Cancel_btn = new javax.swing.JButton();
        res_isadult = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        res_seatnum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        res_lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        res_name = new javax.swing.JTextField();
        res_tr_id = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        res_isadult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        res_isadult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADULT", "MINOR" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Last Name:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Trip ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Seat Number:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Age:");

        JLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabel3.setText("Name:");

        res_tr_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res_seatnum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res_name, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res_isadult, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res_seatnum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res_isadult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_btnActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO reservation(res_tr_id,res_seatnum,res_name,res_lname,res_isadult) VALUES(?,?,?,?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
            String code = res_tr_id.getSelectedItem().toString().replaceAll("[^0-9.]", "");
            int i=Integer.parseInt(code);
            insrt.setInt(1,i);
            insrt.setInt(2,Integer.parseInt(res_seatnum.getText()));
            insrt.setString(3,res_name.getText());
            insrt.setString(4,res_lname.getText());
            insrt.setString(5,res_isadult.getSelectedItem().toString());
            insrt.execute();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Insert_btnActionPerformed

    private void Cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_btnActionPerformed
        dispose();
    }//GEN-LAST:event_Cancel_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT tr_id FROM trip ORDER BY tr_id;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultComboBoxModel mod = new DefaultComboBoxModel();
            mod.removeAllElements();
            while(rs.next()){
                mod.addElement("Trip: "+rs.getInt("tr_id")+"");
            }
            res_tr_id.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rsv_Ins().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_btn;
    private javax.swing.JButton Insert_btn;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> res_isadult;
    private javax.swing.JTextField res_lname;
    private javax.swing.JTextField res_name;
    private javax.swing.JTextField res_seatnum;
    private javax.swing.JComboBox<String> res_tr_id;
    // End of variables declaration//GEN-END:variables
}