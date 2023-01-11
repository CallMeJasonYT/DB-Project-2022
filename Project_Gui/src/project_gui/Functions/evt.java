package project_gui.Functions;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import project_gui.Insert_Selection;
import project_gui.Login;
import project_gui.event.EventMenuSelected;
import project_gui.main.Main;

public class evt extends javax.swing.JFrame {
    public evt() {
        initComponents();
        menu.initMoving(evt.this);
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
    static Timestamp t1;
    static Timestamp t2;
    static Timestamp temp;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        panelBorder1 = new project_gui.swing.PanelBorder();
        panelBorder3 = new project_gui.swing.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        EventTable = new project_gui.swing.Table1();
        header = new project_gui.component.Header();
        Insert = new project_gui.swing.CustomButton();
        Cancel = new project_gui.swing.CustomButton();
        Delete = new project_gui.swing.CustomButton();
        Update = new project_gui.swing.CustomButton();
        ev_descr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PickTime2 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        PickTime1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ev_tr_id = new combobox.CustomJCombo();
        menu = new project_gui.component.Menu1();

        timePicker1.setName(""); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        EventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Trip ID", "Start", "End", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EventTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(EventTable);

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Description:");

        PickTime2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime2.setText("Set Time");
        PickTime2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime2MouseClicked(evt);
            }
        });

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        PickTime1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime1.setText("Set Time");
        PickTime1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Event End:");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Event Start:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Trip ID:");

        ev_tr_id.setLabeText("");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(header, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181)
                                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ev_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PickTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ev_descr, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelBorder1Layout.createSequentialGroup()
                            .addComponent(ev_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGap(1, 1, 1))
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ev_descr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PickTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
        }else if(time2.contains("AM")){
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
        String strDate1 = dateFormat1.format(jDateChooser1.getDate());
        String date1 = strDate1.concat(time1);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
        String strDate2 = dateFormat2.format(jDateChooser2.getDate());
        String date2 = strDate2.concat(time2);
        System.out.println(date1);
        t1 = java.sql.Timestamp.valueOf(date1);
        t2 = java.sql.Timestamp.valueOf(date2);
    }
    
    public void updateTable(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT * FROM event;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultTableModel tbModel= (DefaultTableModel) EventTable.getModel();
            tbModel.setNumRows(0);
            while(rs.next()){
                String id = rs.getString("ev_tr_id");
                String start = rs.getString("ev_start"); 
                String end = rs.getString("ev_end");
                String descr = rs.getString("ev_descr");
                String tb_data[]= {id, start, end, descr};
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
            String select="SELECT DISTINCT ev_tr_id FROM event;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultComboBoxModel mod = new DefaultComboBoxModel();
            mod.removeAllElements();
            while(rs.next()){
                String box = "Trip: "+rs.getInt("ev_tr_id")+"";
                mod.addElement(box);
            }
            ev_tr_id.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    
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

    private void PickTime2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PickTime2MouseClicked
        timePicker2.showPopup(this, 100, 100);
        String time = timePicker2.getSelectedTime();
        time=time.replace("MP", "PM");
        PickTime2.setText(time);
    }//GEN-LAST:event_PickTime2MouseClicked

    private void EventTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventTableMouseClicked
        DefaultTableModel tbModel= (DefaultTableModel) EventTable.getModel();
        String id = "Trip: "+tbModel.getValueAt(EventTable.getSelectedRow(), 0).toString()+"";
        String start = tbModel.getValueAt(EventTable.getSelectedRow(), 1).toString();
        String end = tbModel.getValueAt(EventTable.getSelectedRow(), 2).toString();
        String descr = tbModel.getValueAt(EventTable.getSelectedRow(), 3).toString();
        
        temp = java.sql.Timestamp.valueOf(start);
        
        ev_tr_id.setSelectedItem(id);
        ev_descr.setText(descr);
        String[] parts1 = start.split(" ");
        String part1s = parts1[0];
        String part2s = parts1[1];

        jDateChooser1.setDate(java.sql.Date.valueOf(part1s));
        PickTime1.setText(part2s);

        String[] parts2 = end.split(" ");
        String part1e = parts2[0];
        String part2e = parts2[1];
        jDateChooser2.setDate(java.sql.Date.valueOf(part1e));
        PickTime2.setText(part2e);
    }//GEN-LAST:event_EventTableMouseClicked

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO event(ev_tr_id,ev_start,ev_end,ev_descr) VALUES(?,?,?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
            convertTimeStamp();
            String code = ev_tr_id.getSelectedItem().toString().replaceAll("[^0-9.]", "");
            int i=Integer.parseInt(code);
            insrt.setInt(1, i);
            insrt.setTimestamp(2,t1);
            insrt.setTimestamp(3,t2);
            insrt.setString(4,ev_descr.getText());
            insrt.execute();
            updateTable();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_InsertActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
        Main main = new Main();
        main.show();
    }//GEN-LAST:event_CancelActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                String delete="DELETE FROM event WHERE ev_tr_id = ?";
                PreparedStatement dlt = con.prepareStatement(delete);
                String code = ev_tr_id.getSelectedItem().toString().replaceAll("[^0-9.]", "");
                int i=Integer.parseInt(code);
                dlt.setInt(1, i);
                dlt.executeUpdate();
                updateTable();
                jDateChooser1.setDate(null);
                jDateChooser2.setDate(null);
                PickTime1.setText("");
                PickTime2.setText("");
                ev_descr.setText("");
                JOptionPane.showMessageDialog(this, "Deleted Succesfully");
                con.close();
            }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        convertTimeStamp();
        System.out.println(temp);
        System.out.println(t1);
        if(temp.toString().equals(t1.toString())){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                String update="UPDATE event SET ev_end = ?, ev_descr = ? WHERE ev_tr_id = ? AND ev_start = ?";
                PreparedStatement upd = con.prepareStatement(update);
                String code = ev_tr_id.getSelectedItem().toString().replaceAll("[^0-9.]", "");
                int i=Integer.parseInt(code);
                upd.setTimestamp(1, t2);
                upd.setString(2, ev_descr.getText());
                upd.setInt(3, i);
                upd.setTimestamp(4, t1);
                upd.executeUpdate();
                updateTable();
                JOptionPane.showMessageDialog(this, "Updated Succesfully");
                con.close();
            }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
        }else{JOptionPane.showMessageDialog(this, "You cannot Update the Event Start Date! Try Using Insert/Delete Instead.");}
    }//GEN-LAST:event_UpdateActionPerformed

    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new evt().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.swing.CustomButton Cancel;
    private project_gui.swing.CustomButton Delete;
    private project_gui.swing.Table1 EventTable;
    private project_gui.swing.CustomButton Insert;
    private javax.swing.JTextField PickTime1;
    private javax.swing.JTextField PickTime2;
    private project_gui.swing.CustomButton Update;
    private javax.swing.JTextField ev_descr;
    private combobox.CustomJCombo ev_tr_id;
    private project_gui.component.Header header;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private project_gui.component.Menu1 menu;
    private project_gui.swing.PanelBorder panelBorder1;
    private project_gui.swing.PanelBorder panelBorder3;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    // End of variables declaration//GEN-END:variables
}
