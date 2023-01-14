package project_gui.Functions;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import project_gui.Insert_Selection;
import project_gui.Login;
import project_gui.event.EventMenuSelected;
import project_gui.main.Main;
import project_gui.swing.ScrollBar;

public class off extends javax.swing.JFrame {
    public off() {
        initComponents();
        menu.initMoving(off.this);
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

        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        menu = new project_gui.component.Menu1();
        panelBorder1 = new project_gui.swing.PanelBorder();
        panelBorder3 = new project_gui.swing.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        OffersTable = new project_gui.swing.Table1();
        header = new project_gui.component.Header();
        Insert = new project_gui.swing.CustomButton();
        Delete = new project_gui.swing.CustomButton();
        Update = new project_gui.swing.CustomButton();
        Cancel = new project_gui.swing.CustomButton();
        dest_id = new project_gui.swing.CustomJCombo();
        TripStartText = new javax.swing.JLabel();
        TripEndText = new javax.swing.JLabel();
        CostText = new javax.swing.JLabel();
        DestinationText = new javax.swing.JLabel();
        TripStart = new com.toedter.calendar.JDateChooser();
        TripEnd = new com.toedter.calendar.JDateChooser();
        PickTime1 = new javax.swing.JTextField();
        PickTime2 = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        OffersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Offer Code", "Trip Start", "Trip End", "Cost", "Destination ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OffersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OffersTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(OffersTable);

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

        Cancel.setText("Cancel");
        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Cancel.setStyle(project_gui.swing.CustomButton.ButtonStyle.DESTRUCTIVE);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        dest_id.setLabeText("");
        dest_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dest_idActionPerformed(evt);
            }
        });

        TripStartText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TripStartText.setText("Trip Start:");

        TripEndText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TripEndText.setText("Trip End:");

        CostText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CostText.setText("Cost:");

        DestinationText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DestinationText.setText("Destination:");

        TripStart.setDateFormatString("yyyy-MM-dd");

        TripEnd.setDateFormatString("yyyy-MM-dd");

        PickTime1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime1.setText("Set Time");
        PickTime1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime1MouseClicked(evt);
            }
        });

        PickTime2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime2.setText("Set Time");
        PickTime2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(TripStartText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TripStart, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(TripEndText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TripEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PickTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CostText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(DestinationText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dest_id, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TripStart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TripStartText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CostText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DestinationText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TripEnd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(TripEndText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PickTime2, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(dest_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static Timestamp t1;
    static Timestamp t2;    
    public void convertTimeStamp(){
        String time1 = PickTime1.getText();
        String time2 = PickTime2.getText();
        time1=time1.replace(" ", "");
        time2=time2.replace(" ", "");
        if(time1.contains("PM")){
            String[] parts = time1.split(":");
            String part1 = parts[0];
            String part2 = parts[1];
            if(!"12".equals(part1)){
            int part1int = Integer.parseInt(part1)+12;
            part1 = Integer.toString(part1int);
            time1 = part1.concat(":").concat(part2);
            }else time1 = part1.concat(":").concat(part2);
        }else if(time1.contains("AM")){
            String[] parts = time1.split(":");
            String part1 = parts[0];
            String part2 = parts[1];
            if("12".equals(part1)){
                part1 = "00";
                time1 = part1.concat(":").concat(part2);
            }else time1 = part1.concat(":").concat(part2);
        }else{
            String[] parts = time1.split(":");
            String part1 = parts[0];
            String part2 = parts[1];
            time1 = part1.concat(":").concat(part2);
        }
        time1=time1.replace("PM", "");
        time1=time1.replace("AM", "");

        if(time2.contains("PM")){
            String[] parts = time2.split(":");
            String part1 = parts[0];
            String part2 = parts[1];
            if(!"12".equals(part1)){
            int part1int = Integer.parseInt(part1)+12;
            part1 = Integer.toString(part1int);
            time2 = part1.concat(":").concat(part2);
            }else time2 = part1.concat(":").concat(part2);
        }else{
            String[] parts = time2.split(":");
            String part1 = parts[0];
            String part2 = parts[1];
            if("12".equals(part1)){
                part1 = "00";
                time2 = part1.concat(":").concat(part2);
            }else time2 = part1.concat(":").concat(part2);
        }
        time2=time2.replace("PM", "");
        time2=time2.replace("AM", "");
        time1=time1.concat(":00");
        time2=time2.concat(":00");
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd ");
        String strDate1 = dateFormat1.format(TripStart.getDate());
        String date1 = strDate1.concat(time1);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
        String strDate2 = dateFormat2.format(TripEnd.getDate());
        String date2 = strDate2.concat(time2);
        t1 = java.sql.Timestamp.valueOf(date1);
        t2 = java.sql.Timestamp.valueOf(date2);
    }
    
    public void updateTable(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT * FROM offers;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultTableModel tbModel= (DefaultTableModel) OffersTable.getModel();
            tbModel.setNumRows(0);
            while(rs.next()){
                String code = rs.getString("off_code");
                String trs = rs.getString("tr_start"); 
                String tre = rs.getString("tr_end");
                String costs = rs.getString("cost");
                String des = rs.getString("dest_id");
                String tb_data[]= {code, trs, tre, costs, des};
                tbModel.addRow(tb_data);
            }
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    public void updateCombo(){
        PickTime1.setText("Set Time");
        PickTime2.setText("Set Time");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT dst_id FROM destination;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultComboBoxModel mod = new DefaultComboBoxModel();
            mod.removeAllElements();
            while(rs.next()){
                int box = rs.getInt("dst_id");
                mod.addElement(box);
            }
            dest_id.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    private void PickTime2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PickTime2MouseClicked
        timePicker2.showPopup(this, 100, 100);
        String time = timePicker2.getSelectedTime();
        time=time.replace("MP", "PM");
        PickTime2.setText(time);
    }//GEN-LAST:event_PickTime2MouseClicked

    private void PickTime1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PickTime1MouseClicked
        timePicker1.showPopup(this, 100, 100);
        String time = timePicker1.getSelectedTime();
        time=time.replace("MP", "PM");
        PickTime1.setText(time);
    }//GEN-LAST:event_PickTime1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        updateCombo();
        updateTable();
    }//GEN-LAST:event_formWindowOpened

    private void OffersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OffersTableMouseClicked
        DefaultTableModel tbModel= (DefaultTableModel) OffersTable.getModel();
        String start = tbModel.getValueAt(OffersTable.getSelectedRow(), 1).toString();
        String end = tbModel.getValueAt(OffersTable.getSelectedRow(), 2).toString();
        String costs = tbModel.getValueAt(OffersTable.getSelectedRow(), 3).toString();
        String dest = tbModel.getValueAt(OffersTable.getSelectedRow(), 4).toString();
        cost.setText(costs);
        dest_id.setSelectedItem(Integer.valueOf(dest));
        String[] parts1 = start.split(" ");
        String part1s = parts1[0];
        String part2s = parts1[1];
        TripStart.setDate(java.sql.Date.valueOf(part1s));
        PickTime1.setText(part2s);
        String[] parts2 = end.split(" ");
        String part1e = parts2[0];
        String part2e = parts2[1];
        TripEnd.setDate(java.sql.Date.valueOf(part1e));
        PickTime2.setText(part2e);
    }//GEN-LAST:event_OffersTableMouseClicked

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO offers(off_code,tr_start,tr_end,cost,dest_id) VALUES(null,?,?,?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
            convertTimeStamp();
            insrt.setTimestamp(1,t1);
            insrt.setTimestamp(2,t2);
            insrt.setFloat(3,Float.parseFloat(cost.getText()));
            insrt.setInt(4, Integer.parseInt(dest_id.getSelectedItem().toString()));
            insrt.execute();
            updateTable();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            DefaultTableModel tbModel= (DefaultTableModel) OffersTable.getModel();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String delete="DELETE FROM offers WHERE off_code = ?";
            PreparedStatement dlt = con.prepareStatement(delete);
            dlt.setInt(1, Integer.parseInt(tbModel.getValueAt(OffersTable.getSelectedRow(), 0).toString()));
            dlt.executeUpdate();
            updateTable();
            TripStart.setDate(null);
            TripEnd.setDate(null);
            PickTime1.setText("");
            PickTime2.setText("");
            cost.setText("");
            JOptionPane.showMessageDialog(this, "Deleted Succesfully");
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        convertTimeStamp();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            DefaultTableModel tbModel= (DefaultTableModel) OffersTable.getModel();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String update="UPDATE offers SET tr_start = ?, tr_end = ?, cost = ?, dest_id = ? WHERE off_code = ?";
            PreparedStatement upd = con.prepareStatement(update);
            upd.setTimestamp(1, t1);
            upd.setTimestamp(2, t2);
            upd.setFloat(3, Float.parseFloat(cost.getText()));
            upd.setInt(4, Integer.parseInt(dest_id.getSelectedItem().toString()));
            upd.setInt(5, Integer.parseInt(tbModel.getValueAt(OffersTable.getSelectedRow(), 0).toString()));
            upd.executeUpdate();
            updateTable();
            JOptionPane.showMessageDialog(this, "Updated Succesfully");
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_UpdateActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
        Main main = new Main();
        main.show();
    }//GEN-LAST:event_CancelActionPerformed

    private void dest_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dest_idActionPerformed
        updateTable();
    }//GEN-LAST:event_dest_idActionPerformed
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new off().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.swing.CustomButton Cancel;
    private javax.swing.JLabel CostText;
    private project_gui.swing.CustomButton Delete;
    private javax.swing.JLabel DestinationText;
    private project_gui.swing.CustomButton Insert;
    private project_gui.swing.Table1 OffersTable;
    private javax.swing.JTextField PickTime1;
    private javax.swing.JTextField PickTime2;
    private com.toedter.calendar.JDateChooser TripEnd;
    private javax.swing.JLabel TripEndText;
    private com.toedter.calendar.JDateChooser TripStart;
    private javax.swing.JLabel TripStartText;
    private project_gui.swing.CustomButton Update;
    private javax.swing.JTextField cost;
    private project_gui.swing.CustomJCombo dest_id;
    private project_gui.component.Header header;
    private javax.swing.JScrollPane jScrollPane3;
    private project_gui.component.Menu1 menu;
    private project_gui.swing.PanelBorder panelBorder1;
    private project_gui.swing.PanelBorder panelBorder3;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    // End of variables declaration//GEN-END:variables
}
