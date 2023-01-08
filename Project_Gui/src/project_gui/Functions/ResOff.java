package project_gui.Functions;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import project_gui.Insert_Selection;
import project_gui.Login;
import project_gui.event.EventMenuSelected;
import project_gui.main.Main;

public class ResOff extends javax.swing.JFrame {
    public ResOff() {
        initComponents();
        menu.initMoving(ResOff.this);
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

        menu = new project_gui.component.Menu();
        panelBorder1 = new project_gui.swing.PanelBorder();
        panelBorder3 = new project_gui.swing.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        ResOffTable = new project_gui.swing.Table1();
        header = new project_gui.component.Header();
        Insert = new project_gui.swing.CustomButton();
        Cancel = new project_gui.swing.CustomButton();
        Delete = new project_gui.swing.CustomButton();
        Update = new project_gui.swing.CustomButton();
        last_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adv_pay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        off_id = new combobox.CustomJCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        ResOffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation Offer ID", "First Name", "Last Name", "Offer ID", "Downpayment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ResOffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResOffTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ResOffTable);

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Offer ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Downpayment:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name:");

        off_id.setLabeText("");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(off_id, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(adv_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(panelBorder3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(off_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(first_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adv_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void updateTable(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT * FROM reservation_offers;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultTableModel tbModel= (DefaultTableModel) ResOffTable.getModel();
            tbModel.setNumRows(0);
            while(rs.next()){
                String id = rs.getString("res_of_id");
                String name = rs.getString("first_name"); 
                String lname = rs.getString("last_name");
                String offid = rs.getString("off_id");
                String adv = Float.toString(rs.getFloat("adv_pay"));
                String tb_data[]= {id, name, lname, offid, adv};
                tbModel.addRow(tb_data);
            }
            con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }
    public void updateCombo(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT DISTINCT off_code FROM offers;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultComboBoxModel mod = new DefaultComboBoxModel();
            mod.removeAllElements();
            while(rs.next()){
                String box = "Offer Code: "+rs.getInt("off_code")+"";
                mod.addElement(box);
            }
            off_id.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       updateCombo();
       updateTable();
    }//GEN-LAST:event_formWindowOpened

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try{
            DefaultTableModel tbModel= (DefaultTableModel) ResOffTable.getModel();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String update="UPDATE reservation_offers SET first_name = ?, last_name = ?, off_id = ?, adv_pay = ? WHERE res_of_id = ?";
            PreparedStatement upd = con.prepareStatement(update);
            String code = off_id.getSelectedItem().toString().replaceAll("[^0-9.]", "");
            int i=Integer.parseInt(code);
            upd.setString(1, first_name.getText());
            upd.setString(2, last_name.getText());
            upd.setInt(3, i);
            upd.setFloat(4, Float.parseFloat(adv_pay.getText()));
            upd.setInt(5, Integer.parseInt(tbModel.getValueAt(ResOffTable.getSelectedRow(), 0).toString()));
            upd.executeUpdate();
            updateTable();
            JOptionPane.showMessageDialog(this, "Updated Succesfully");
            con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_UpdateActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO reservation_offers(res_of_id,first_name,last_name,off_id,adv_pay) VALUES(null,?,?,?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
            String code = off_id.getSelectedItem().toString().replaceAll("[^0-9.]", "");
            int i=Integer.parseInt(code);
            insrt.setString(1,first_name.getText());
            insrt.setString(2,last_name.getText());
            insrt.setInt(3,i);
            insrt.setFloat(4,Float.parseFloat(adv_pay.getText()));
            insrt.execute();
            updateTable();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_InsertActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
        Main main = new Main();
        main.show();
    }//GEN-LAST:event_CancelActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
            DefaultTableModel tbModel= (DefaultTableModel) ResOffTable.getModel();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String delete="DELETE FROM reservation_offers WHERE res_of_id = ?";
            PreparedStatement dlt = con.prepareStatement(delete);
            dlt.setInt(1, Integer.parseInt(tbModel.getValueAt(ResOffTable.getSelectedRow(), 0).toString()));
            dlt.executeUpdate();
            updateTable();
            first_name.setText("");
            last_name.setText("");
            adv_pay.setText("");
            JOptionPane.showMessageDialog(this, "Deleted Succesfully");
            con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_DeleteActionPerformed

    private void ResOffTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResOffTableMouseClicked
        DefaultTableModel tbModel= (DefaultTableModel) ResOffTable.getModel();
        String name = tbModel.getValueAt(ResOffTable.getSelectedRow(), 1).toString();
        String lname = tbModel.getValueAt(ResOffTable.getSelectedRow(), 2).toString();
        String id = tbModel.getValueAt(ResOffTable.getSelectedRow(), 3).toString();
        String adv = tbModel.getValueAt(ResOffTable.getSelectedRow(), 4).toString();
        first_name.setText(name);
        last_name.setText(lname);
        off_id.setSelectedItem("Offer Code: "+id+"");
        adv_pay.setText(adv);
    }//GEN-LAST:event_ResOffTableMouseClicked

    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new ResOff().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.swing.CustomButton Cancel;
    private project_gui.swing.CustomButton Delete;
    private project_gui.swing.CustomButton Insert;
    private project_gui.swing.Table1 ResOffTable;
    private project_gui.swing.CustomButton Update;
    private javax.swing.JTextField adv_pay;
    private javax.swing.JTextField first_name;
    private project_gui.component.Header header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField last_name;
    private project_gui.component.Menu menu;
    private combobox.CustomJCombo off_id;
    private project_gui.swing.PanelBorder panelBorder1;
    private project_gui.swing.PanelBorder panelBorder3;
    // End of variables declaration//GEN-END:variables
}
