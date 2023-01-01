package project_gui.Inserts;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class drv_Ins extends javax.swing.JFrame {

    public drv_Ins() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        wrk_AT = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        Insert_btn = new javax.swing.JButton();
        Cancel_btn = new javax.swing.JButton();
        drv_license = new javax.swing.JComboBox<>();
        drv_route = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        drv_experience = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Worker AT:");

        wrk_AT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("License Type:");

        JLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabel3.setText("Route:");

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

        drv_license.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drv_license.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        drv_route.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drv_route.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "Abroad" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Experience:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wrk_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drv_license, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drv_route, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drv_experience, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(wrk_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drv_license, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drv_route, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drv_experience, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_btnActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO driver(drv_AT,drv_license,drv_route,drv_experience) VALUES(?,?,?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
            insrt.setString(1,wrk_AT.getSelectedItem().toString());
            insrt.setString(2,drv_license.getSelectedItem().toString());
            insrt.setString(3,drv_route.getSelectedItem().toString());
            insrt.setInt(4,Integer.parseInt(drv_experience.getText()));
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
            String select1="SELECT wrk_AT FROM worker;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select1);
            DefaultComboBoxModel mod = new DefaultComboBoxModel();
            mod.removeAllElements();
            while(rs.next()){
                mod.addElement(rs.getString("wrk_AT"));
            }
            wrk_AT.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drv_Ins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_btn;
    private javax.swing.JButton Insert_btn;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JTextField drv_experience;
    private javax.swing.JComboBox<String> drv_license;
    private javax.swing.JComboBox<String> drv_route;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> wrk_AT;
    // End of variables declaration//GEN-END:variables
}
