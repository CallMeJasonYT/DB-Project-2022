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

public class trvl extends javax.swing.JFrame {
    public trvl() {
        initComponents();
        menu.initMoving(trvl.this);
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
        panelBorder1 = new project_gui.swing.PanelBorder();
        panelBorder3 = new project_gui.swing.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        TravelToTable = new project_gui.swing.Table1();
        header = new project_gui.component.Header();
        Insert = new project_gui.swing.CustomButton();
        Delete1 = new project_gui.swing.CustomButton();
        Update1 = new project_gui.swing.CustomButton();
        to_tr_id = new project_gui.swing.CustomJCombo();
        to_dst_id = new project_gui.swing.CustomJCombo();
        Cancel = new project_gui.swing.CustomButton();
        TripText = new javax.swing.JLabel();
        DestinationtText = new javax.swing.JLabel();
        ArrivalText = new javax.swing.JLabel();
        DepartureText = new javax.swing.JLabel();
        Arrival = new com.toedter.calendar.JDateChooser();
        Departure = new com.toedter.calendar.JDateChooser();
        PickTime1 = new javax.swing.JTextField();
        PickTime2 = new javax.swing.JTextField();
        menu = new project_gui.component.Menu1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        TravelToTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip ID", "Destination ID", "Arrival", "Departure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TravelToTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TravelToTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TravelToTable);

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

        Delete1.setText("Delete");
        Delete1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Delete1.setStyle(project_gui.swing.CustomButton.ButtonStyle.DELETE);
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });

        Update1.setText("Update");
        Update1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Update1.setStyle(project_gui.swing.CustomButton.ButtonStyle.SECONDARY);
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });

        to_tr_id.setLabeText("");

        to_dst_id.setLabeText("");

        Cancel.setText("Cancel");
        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Cancel.setStyle(project_gui.swing.CustomButton.ButtonStyle.DESTRUCTIVE);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        TripText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TripText.setText("Trip:");

        DestinationtText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DestinationtText.setText("Destination:");

        ArrivalText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ArrivalText.setText("Arrival:");

        DepartureText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DepartureText.setText("Departure:");

        Arrival.setDateFormatString("yyyy-MM-dd");

        Departure.setDateFormatString("yyyy-MM-dd");

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
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(TripText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DestinationtText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to_dst_id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ArrivalText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DepartureText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Departure, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PickTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Departure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ArrivalText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TripText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DestinationtText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(to_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(to_dst_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PickTime2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepartureText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PickTime1)
                    .addComponent(Arrival, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static Timestamp t1;
    static Timestamp t2;
    static int temp;       
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
        String strDate1 = dateFormat1.format(Arrival.getDate());
        String date1 = strDate1.concat(time1);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
        String strDate2 = dateFormat2.format(Departure.getDate());
        String date2 = strDate2.concat(time2);
        t1 = java.sql.Timestamp.valueOf(date1);
        t2 = java.sql.Timestamp.valueOf(date2);
    }
    
    public void updateTable(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT * FROM travel_to;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultTableModel tbModel= (DefaultTableModel) TravelToTable.getModel();
            tbModel.setNumRows(0);
            while(rs.next()){
                String trid = rs.getString("to_tr_id");
                String dstid = rs.getString("to_dst_id"); 
                String arr = rs.getString("to_arrival");
                String dep = rs.getString("to_departure");
                String tb_data[]= {trid, dstid, arr, dep};
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
            String select1="SELECT dst_id FROM destination;";
            String select2="SELECT tr_id FROM trip ORDER BY tr_id;";
            Statement slct1 = con.createStatement();
            Statement slct2 = con.createStatement();
            ResultSet rs1 = slct1.executeQuery(select1);
            ResultSet rs2 = slct2.executeQuery(select2);
            DefaultComboBoxModel mod1 = new DefaultComboBoxModel();
            DefaultComboBoxModel mod2 = new DefaultComboBoxModel();
            mod1.removeAllElements();
            mod2.removeAllElements();
            while(rs1.next()){
                int box1 = rs1.getInt("dst_id");
                mod1.addElement(box1);
            }
            while(rs2.next()){
                int box2 = rs2.getInt("tr_id");
                mod2.addElement(box2);
            }
            to_dst_id.setModel(mod1);
            to_tr_id.setModel(mod2);
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
        updateTable();
        updateCombo();
    }//GEN-LAST:event_formWindowOpened

    private void TravelToTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravelToTableMouseClicked
        DefaultTableModel tbModel= (DefaultTableModel) TravelToTable.getModel();
        String trid = tbModel.getValueAt(TravelToTable.getSelectedRow(), 0).toString();
        String dstid = tbModel.getValueAt(TravelToTable.getSelectedRow(), 1).toString();
        String arr = tbModel.getValueAt(TravelToTable.getSelectedRow(), 2).toString();
        String dep = tbModel.getValueAt(TravelToTable.getSelectedRow(), 3).toString();
        to_tr_id.setSelectedItem(Integer.valueOf(trid));
        to_dst_id.setSelectedItem(Integer.valueOf(dstid));
        temp = Integer.parseInt(tbModel.getValueAt(TravelToTable.getSelectedRow(), 1).toString());
        String[] parts1 = arr.split(" ");
        String part1s = parts1[0];
        String part2s = parts1[1];
        Arrival.setDate(java.sql.Date.valueOf(part1s));
        PickTime1.setText(part2s);
        String[] parts2 = dep.split(" ");
        String part1e = parts2[0];
        String part2e = parts2[1];
        Departure.setDate(java.sql.Date.valueOf(part1e));
        PickTime2.setText(part2e);
    }//GEN-LAST:event_TravelToTableMouseClicked

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO travel_to(to_tr_id,to_dst_id,to_arrival,to_departure) VALUES(?,?,?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
            convertTimeStamp();
            insrt.setInt(1,Integer.parseInt(to_tr_id.getSelectedItem().toString()));
            insrt.setInt(2, Integer.parseInt(to_dst_id.getSelectedItem().toString()));
            insrt.setTimestamp(3,t1);
            insrt.setTimestamp(4,t2);
            insrt.execute();
            updateTable();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_InsertActionPerformed

    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String delete="DELETE FROM travel_to WHERE to_tr_id = ? AND to_dst_id = ?";
            PreparedStatement dlt = con.prepareStatement(delete);
            dlt.setInt(1, Integer.parseInt(to_tr_id.getSelectedItem().toString()));
            dlt.setInt(2, Integer.parseInt(to_dst_id.getSelectedItem().toString()));
            dlt.executeUpdate();
            updateTable();
            Arrival.setDate(null);
            Departure.setDate(null);
            PickTime1.setText("");
            PickTime2.setText("");
            JOptionPane.showMessageDialog(this, "Deleted Succesfully");
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_Delete1ActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        convertTimeStamp();
        if(temp == Integer.parseInt(to_dst_id.getSelectedItem().toString())){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                String update="UPDATE travel_to SET to_arrival = ?, to_departure = ? WHERE to_tr_id = ? AND to_dst_id = ?";
                PreparedStatement upd = con.prepareStatement(update);
                upd.setTimestamp(1, t1);
                upd.setTimestamp(2, t2);
                upd.setInt(3, Integer.parseInt(to_tr_id.getSelectedItem().toString()));
                upd.setInt(4, Integer.parseInt(to_dst_id.getSelectedItem().toString()));
                upd.executeUpdate();
                updateTable();
                JOptionPane.showMessageDialog(this, "Updated Succesfully");
                con.close();
            }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
        }else{JOptionPane.showMessageDialog(this, "You cannot Update the Travel_to destination ID! Try Using Insert/Delete Instead.");}
    }//GEN-LAST:event_Update1ActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
        Main main = new Main();
        main.show();
    }//GEN-LAST:event_CancelActionPerformed
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run(){new trvl().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Arrival;
    private javax.swing.JLabel ArrivalText;
    private project_gui.swing.CustomButton Cancel;
    private project_gui.swing.CustomButton Delete1;
    private com.toedter.calendar.JDateChooser Departure;
    private javax.swing.JLabel DepartureText;
    private javax.swing.JLabel DestinationtText;
    private project_gui.swing.CustomButton Insert;
    private javax.swing.JTextField PickTime1;
    private javax.swing.JTextField PickTime2;
    private project_gui.swing.Table1 TravelToTable;
    private javax.swing.JLabel TripText;
    private project_gui.swing.CustomButton Update1;
    private project_gui.component.Header header;
    private javax.swing.JScrollPane jScrollPane3;
    private project_gui.component.Menu1 menu;
    private project_gui.swing.PanelBorder panelBorder1;
    private project_gui.swing.PanelBorder panelBorder3;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    private project_gui.swing.CustomJCombo to_dst_id;
    private project_gui.swing.CustomJCombo to_tr_id;
    // End of variables declaration//GEN-END:variables
}
