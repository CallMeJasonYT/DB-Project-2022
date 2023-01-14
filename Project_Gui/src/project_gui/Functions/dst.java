package project_gui.Functions;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project_gui.Insert_Selection;
import project_gui.Login;
import project_gui.event.EventMenuSelected;
import project_gui.main.Main;
import project_gui.swing.ScrollBar;

public class dst extends javax.swing.JFrame {
    public dst() {
        initComponents();
        menu.initMoving(dst.this);
        jScrollPane3.setVerticalScrollBar(new ScrollBar());
        jScrollPane3.getVerticalScrollBar().setBackground(Color.WHITE);
        menu.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index) {
                switch (index) {
                    case 0:
                        Main main = new Main();
                        main.show();
                        dispose();
                        break;
                    case 1:
                        Insert_Selection select = new Insert_Selection();
                        select.show();
                        dispose();
                        break;
                    case 2:
                        CheckTrip checktr = new CheckTrip();
                        checktr.show();
                        dispose();
                        break;
                    case 3:
                        CheckOffers checkoff = new CheckOffers();
                        checkoff.show();
                        dispose();
                        break;
                    case 4:
                        BranchInfo brinfo = new BranchInfo();
                        brinfo.show();
                        dispose();
                        break;
                    case 5:
                        Employees empl = new Employees();
                        empl.show();
                        dispose();
                        break;
                    case 8:
                        Logs log = new Logs();
                        log.show();
                        dispose();
                        break;
                    case 9:    
                        Login login = new Login();
                        login.show();
                        dispose();
                        break;
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new project_gui.component.Menu1();
        panelBorder1 = new project_gui.swing.PanelBorder();
        panelBorder3 = new project_gui.swing.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        DstTable = new project_gui.swing.Table1();
        header = new project_gui.component.Header();
        dst_rtype = new project_gui.swing.CustomJCombo();
        Insert = new project_gui.swing.CustomButton();
        Cancel = new project_gui.swing.CustomButton();
        Delete = new project_gui.swing.CustomButton();
        Update = new project_gui.swing.CustomButton();
        dst_name = new javax.swing.JTextField();
        dst_descr = new javax.swing.JTextField();
        dst_language = new javax.swing.JTextField();
        dst_location = new javax.swing.JTextField();
        RouteText = new javax.swing.JLabel();
        DescriptionText = new javax.swing.JLabel();
        LanguageText = new javax.swing.JLabel();
        LocationText = new javax.swing.JLabel();
        DestinationText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        DstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination ID", "Name", "Description", "Route Type", "Language", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DstTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DstTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(DstTable);

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dst_rtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ABROAD", "LOCAL" }));
        dst_rtype.setLabeText("");

        Insert.setText("Insert");
        Insert.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Cancel.setStyle(project_gui.swing.CustomButton.ButtonStyle.DESTRUCTIVE);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Delete.setStyle(project_gui.swing.CustomButton.ButtonStyle.DELETE);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Update.setStyle(project_gui.swing.CustomButton.ButtonStyle.SECONDARY);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        RouteText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RouteText.setText("Route:");

        DescriptionText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DescriptionText.setText("Description:");

        LanguageText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LanguageText.setText("Language:");

        LocationText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LocationText.setText("Location:");

        DestinationText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DestinationText.setText("Destination:");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(DestinationText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescriptionText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dst_descr, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RouteText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dst_rtype, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LanguageText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dst_language, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(LocationText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dst_location, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(DestinationText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dst_name, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dst_language, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dst_location, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocationText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(dst_descr, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DescriptionText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LanguageText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dst_rtype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RouteText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        updateTable();
    }//GEN-LAST:event_formWindowOpened

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
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_UpdateActionPerformed

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
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_DeleteActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
        Main main = new Main();
        main.show();
    }//GEN-LAST:event_CancelActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
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
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_InsertActionPerformed

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
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new dst().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.swing.CustomButton Cancel;
    private project_gui.swing.CustomButton Delete;
    private javax.swing.JLabel DescriptionText;
    private javax.swing.JLabel DestinationText;
    private project_gui.swing.Table1 DstTable;
    private project_gui.swing.CustomButton Insert;
    private javax.swing.JLabel LanguageText;
    private javax.swing.JLabel LocationText;
    private javax.swing.JLabel RouteText;
    private project_gui.swing.CustomButton Update;
    private javax.swing.JTextField dst_descr;
    private javax.swing.JTextField dst_language;
    private javax.swing.JTextField dst_location;
    private javax.swing.JTextField dst_name;
    private project_gui.swing.CustomJCombo dst_rtype;
    private project_gui.component.Header header;
    private javax.swing.JScrollPane jScrollPane3;
    private project_gui.component.Menu1 menu;
    private project_gui.swing.PanelBorder panelBorder1;
    private project_gui.swing.PanelBorder panelBorder3;
    // End of variables declaration//GEN-END:variables
}
