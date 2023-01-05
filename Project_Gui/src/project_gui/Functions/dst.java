package project_gui.Functions;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dst extends javax.swing.JFrame {

    public dst() {initComponents();}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabel3 = new javax.swing.JLabel();
        Insert_btn = new javax.swing.JButton();
        Cancel_btn = new javax.swing.JButton();
        dst_rtype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dst_descr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dst_language = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dst_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dst_location = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DstTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        dst_rtype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dst_rtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "Abroad" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Language:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Destination:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Description:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Location:");

        Update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        DstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "dst_id", "dst_name", "dst_descr", "dst_rtype", "dst_language", "dst_location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DstTable.setColumnSelectionAllowed(true);
        DstTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DstTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DstTable);
        DstTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dst_descr, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dst_rtype, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dst_language, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dst_location, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_rtype, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_descr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_language, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_location, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(375, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(185, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void updateTable(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT * FROM destination;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultTableModel tbModel= (DefaultTableModel) DstTable.getModel();
            tbModel.setNumRows(0);
            while(rs.next()){
                String dst_id = rs.getString("dst_id");
                String name = rs.getString("dst_name"); 
                String description = rs.getString("dst_descr"); 
                String type = rs.getString("dst_rtype"); 
                String language = rs.getString("dst_language"); 
                String location = rs.getString("dst_location"); 
                String tb_data[]= {dst_id, name, description, type, language, location};
                tbModel.addRow(tb_data);
            }
            con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }
    
    private void Insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_btnActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO destination(dst_id,dst_name,dst_descr,dst_rtype,dst_language,dst_location) VALUES(null,?,?,?,?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
            insrt.setString(1,dst_name.getText());
            insrt.setString(2,dst_descr.getText());
            insrt.setString(3,dst_rtype.getSelectedItem().toString());
            insrt.setString(4,dst_language.getText());
            insrt.setInt(5,Integer.parseInt(dst_location.getText()));
            insrt.execute();
            updateTable();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_Insert_btnActionPerformed

    private void Cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_btnActionPerformed
        dispose();
    }//GEN-LAST:event_Cancel_btnActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try{
            DefaultTableModel tbModel= (DefaultTableModel) DstTable.getModel();
            int at = Integer.parseInt(tbModel.getValueAt(DstTable.getSelectedRow(), 0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String update="UPDATE destination SET dst_name = ?, dst_descr = ?, dst_rtype = ?, dst_language = ?, dst_location = ? WHERE dst_id = ?";
            PreparedStatement upd = con.prepareStatement(update);
            upd.setString(1, dst_name.getText());
            upd.setString(2, dst_descr.getText());
            upd.setString(3, dst_rtype.getSelectedItem().toString());
            upd.setString(4, dst_language.getText());
            upd.setInt(5, Integer.parseInt(dst_location.getText()));
            upd.setInt(6, at);
            upd.executeUpdate();
            updateTable();
            JOptionPane.showMessageDialog(this, "Updated Succesfully");
            con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_UpdateActionPerformed

    private void DstTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DstTableMouseClicked
        DefaultTableModel tbModel= (DefaultTableModel) DstTable.getModel();
        String name = tbModel.getValueAt(DstTable.getSelectedRow(), 1).toString();
        String description = tbModel.getValueAt(DstTable.getSelectedRow(), 2).toString();
        String type = tbModel.getValueAt(DstTable.getSelectedRow(), 3).toString();
        String language = tbModel.getValueAt(DstTable.getSelectedRow(), 4).toString();
        String location = tbModel.getValueAt(DstTable.getSelectedRow(), 5).toString();
        dst_name.setText(name);
        dst_descr.setText(description);
        dst_rtype.setSelectedItem(type);
        dst_language.setText(language);
        dst_location.setText(location);
    }//GEN-LAST:event_DstTableMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        updateTable();
    }//GEN-LAST:event_formWindowOpened

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
            DefaultTableModel tbModel= (DefaultTableModel) DstTable.getModel();
            int at = Integer.parseInt(tbModel.getValueAt(DstTable.getSelectedRow(), 0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String delete="DELETE FROM destination WHERE dst_id = ?";
            PreparedStatement dlt = con.prepareStatement(delete);
            dlt.setInt(1, at);
            dlt.executeUpdate();
            updateTable();
            dst_name.setText("");
            dst_descr.setText("");
            dst_language.setText("");
            dst_location.setText("");
            JOptionPane.showMessageDialog(this, "Deleted Succesfully");
            con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_DeleteActionPerformed

    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new dst().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_btn;
    private javax.swing.JButton Delete;
    private javax.swing.JTable DstTable;
    private javax.swing.JButton Insert_btn;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JButton Update;
    private javax.swing.JTextField dst_descr;
    private javax.swing.JTextField dst_language;
    private javax.swing.JTextField dst_location;
    private javax.swing.JTextField dst_name;
    private javax.swing.JComboBox<String> dst_rtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
