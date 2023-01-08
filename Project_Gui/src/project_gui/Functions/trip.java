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

public class trip extends javax.swing.JFrame {
    public trip() {
        initComponents();
        menu.initMoving(trip.this);
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
        menu = new project_gui.component.Menu();
        panelBorder1 = new project_gui.swing.PanelBorder();
        panelBorder3 = new project_gui.swing.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        TripTable = new project_gui.swing.Table1();
        header = new project_gui.component.Header();
        Insert = new project_gui.swing.CustomButton();
        Delete1 = new project_gui.swing.CustomButton();
        Update1 = new project_gui.swing.CustomButton();
        Cancel = new project_gui.swing.CustomButton();
        jLabel1 = new javax.swing.JLabel();
        tr_br_code = new combobox.CustomJCombo();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PickTime2 = new javax.swing.JTextField();
        PickTime1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tr_maxseats = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tr_cost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tr_gui_AT = new combobox.CustomJCombo();
        tr_drv_AT = new combobox.CustomJCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        TripTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip ID", "Departure", "Return", "Max Seats", "Cost", "Branch", "Guide AT", "Driver AT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TripTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TripTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TripTable);

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
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

        Cancel.setText("Cancel");
        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Cancel.setStyle(project_gui.swing.CustomButton.ButtonStyle.DESTRUCTIVE);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Branch Code:");

        tr_br_code.setLabeText("");
        tr_br_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_br_codeActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Return:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Departure:");

        PickTime2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime2.setText("Set Time");
        PickTime2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime2MouseClicked(evt);
            }
        });

        PickTime1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime1.setText("Set Time");
        PickTime1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Max Seats:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cost:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Driver:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Guide:");

        tr_gui_AT.setLabeText("");

        tr_drv_AT.setLabeText("");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(header, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tr_maxseats, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tr_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PickTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(tr_br_code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tr_gui_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tr_drv_AT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tr_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tr_maxseats, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tr_drv_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PickTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tr_br_code, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tr_gui_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static Timestamp t1;
    static Timestamp t2;
    static Timestamp temp;                       
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
        }else{
            String[] parts = time1.split(":");
            String part1 = parts[0];
            String part2 = parts[1];
            if("12".equals(part1)){
                part1 = "00";
                time1 = part1.concat(":").concat(part2);
            }else time1 = part1.concat(":").concat(part2);
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
        String strDate1 = dateFormat1.format(jDateChooser1.getDate());
        String date1 = strDate1.concat(time1);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
        String strDate2 = dateFormat2.format(jDateChooser2.getDate());
        String date2 = strDate2.concat(time2);
        t1 = java.sql.Timestamp.valueOf(date1);
        t2 = java.sql.Timestamp.valueOf(date2);
    }
    
    public void updateTable(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT * FROM trip;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultTableModel tbModel= (DefaultTableModel) TripTable.getModel();
            tbModel.setNumRows(0);
            while(rs.next()){
                String id = rs.getString("tr_id");
                String departure = rs.getString("tr_departure");
                String ret = rs.getString("tr_return");
                String maxseats = rs.getString("tr_maxseats"); 
                String cost = rs.getString("tr_cost");
                String code = rs.getString("tr_br_code");
                String gui = rs.getString("tr_gui_AT");
                String drv = rs.getString("tr_drv_AT");
                String tb_data[]= {id, departure, ret, maxseats, cost, code, gui, drv};
                tbModel.addRow(tb_data);
            }
            con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }
    public void updateCombo(){
        PickTime1.setText("Set Time");
        PickTime2.setText("Set Time");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT br_code FROM branch;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultComboBoxModel mod = new DefaultComboBoxModel();
            mod.removeAllElements();
            mod.addElement("");
            while(rs.next()){
                int box = rs.getInt("br_code");
                mod.addElement(box);
            }
            tr_br_code.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
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
        jLabel5.setVisible(false);
        jLabel8.setVisible(false);
        tr_gui_AT.setVisible(false);
        tr_drv_AT.setVisible(false);
        updateCombo();
        updateTable();
    }//GEN-LAST:event_formWindowOpened

    private void TripTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TripTableMouseClicked
        DefaultTableModel tbModel= (DefaultTableModel) TripTable.getModel();
        String dep = tbModel.getValueAt(TripTable.getSelectedRow(), 1).toString();
        String ret = tbModel.getValueAt(TripTable.getSelectedRow(), 2).toString();
        String max = tbModel.getValueAt(TripTable.getSelectedRow(), 3).toString();
        String cost = tbModel.getValueAt(TripTable.getSelectedRow(), 4).toString();
        String br_code = tbModel.getValueAt(TripTable.getSelectedRow(), 5).toString();
        String gui = tbModel.getValueAt(TripTable.getSelectedRow(), 6).toString();
        String drv = tbModel.getValueAt(TripTable.getSelectedRow(), 7).toString();
        tr_maxseats.setText(max);
        tr_cost.setText(cost);
        tr_br_code.setSelectedItem(Integer.valueOf(br_code));
        tr_gui_AT.setSelectedItem(gui);
        tr_drv_AT.setSelectedItem(drv);

        String[] parts1 = dep.split(" ");
        String part1s = parts1[0];
        String part2s = parts1[1];

        jDateChooser1.setDate(java.sql.Date.valueOf(part1s));
        PickTime1.setText(part2s);

        String[] parts2 = ret.split(" ");
        String part1e = parts2[0];
        String part2e = parts2[1];
        jDateChooser2.setDate(java.sql.Date.valueOf(part1e));
        PickTime2.setText(part2e);
    }//GEN-LAST:event_TripTableMouseClicked

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO trip(tr_id,tr_departure,tr_return,tr_maxseats,tr_cost,tr_br_code,tr_gui_AT,tr_drv_AT) VALUES(null,?,?,?,?,?,?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
            convertTimeStamp();
            insrt.setTimestamp(1,t1);
            insrt.setTimestamp(2,t2);
            insrt.setInt(3, Integer.parseInt(tr_maxseats.getText()));
            insrt.setFloat(4,Float.parseFloat(tr_cost.getText()));
            insrt.setInt(5, Integer.parseInt(tr_br_code.getSelectedItem().toString()));
            insrt.setString(6, tr_gui_AT.getSelectedItem().toString());
            insrt.setString(7, tr_drv_AT.getSelectedItem().toString());
            insrt.execute();
            updateTable();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_InsertActionPerformed

    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                String delete="DELETE FROM trip WHERE tr_id = ?";
                PreparedStatement dlt = con.prepareStatement(delete);
                DefaultTableModel tbModel= (DefaultTableModel) TripTable.getModel();
                dlt.setInt(1, Integer.parseInt(tbModel.getValueAt(TripTable.getSelectedRow(), 0).toString()));
                dlt.executeUpdate();
                updateTable();
                jDateChooser1.setDate(null);
                jDateChooser2.setDate(null);
                PickTime1.setText("");
                PickTime2.setText("");
                tr_maxseats.setText("");
                tr_cost.setText("");
                JOptionPane.showMessageDialog(this, "Deleted Succesfully");
                con.close();
            }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_Delete1ActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        convertTimeStamp();
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                String update="UPDATE trip SET tr_departure = ?, tr_return = ?, tr_maxseats = ?, tr_cost = ?, tr_br_code = ?, tr_gui_AT = ?, tr_drv_AT = ? WHERE tr_id = ?";
                PreparedStatement upd = con.prepareStatement(update);
                DefaultTableModel tbModel= (DefaultTableModel) TripTable.getModel();
                upd.setTimestamp(1, t1);
                upd.setTimestamp(2, t2);
                upd.setInt(3, Integer.parseInt(tr_maxseats.getText()));
                upd.setFloat(4, Float.parseFloat(tr_cost.getText()));
                upd.setInt(5, Integer.parseInt(tr_br_code.getSelectedItem().toString()));
                upd.setString(6, tr_gui_AT.getSelectedItem().toString());
                upd.setString(7, tr_drv_AT.getSelectedItem().toString());
                upd.setInt(8, Integer.parseInt(tbModel.getValueAt(TripTable.getSelectedRow(), 0).toString()));
                upd.executeUpdate();
                updateTable();
                JOptionPane.showMessageDialog(this, "Updated Succesfully");
                con.close();
            }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_Update1ActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
        Main main = new Main();
        main.show();
    }//GEN-LAST:event_CancelActionPerformed

    private void tr_br_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_br_codeActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            DefaultComboBoxModel mod2 = new DefaultComboBoxModel();
            DefaultComboBoxModel mod3 = new DefaultComboBoxModel();
            if(!"".equals(tr_br_code.getSelectedItem().toString())){
                mod2.removeAllElements();
                mod3.removeAllElements();
                jLabel5.setVisible(true);
                jLabel8.setVisible(true);
                tr_gui_AT.setVisible(true);
                tr_drv_AT.setVisible(true);
                String where = tr_br_code.getSelectedItem().toString();
                String select2="SELECT DISTINCT gui_AT FROM guide INNER JOIN worker ON wrk_AT = gui_AT WHERE wrk_br_code = "+where+";";
                try{
                Statement slct2 = con.createStatement();
                ResultSet rs2 = slct2.executeQuery(select2);
                while(rs2.next()){
                    String box2 = rs2.getString("gui_AT");
                    mod2.addElement(box2);
                }
                tr_gui_AT.setModel(mod2);
                String select3="SELECT DISTINCT drv_AT FROM driver INNER JOIN worker ON wrk_AT = drv_AT WHERE wrk_br_code = "+where+";";
                Statement slct3 = con.createStatement();
                ResultSet rs3 = slct3.executeQuery(select3);
                while(rs3.next()){
                    String box3 = rs3.getString("drv_AT");
                    mod3.addElement(box3);
                }
                tr_drv_AT.setModel(mod3);
                
                }catch(SQLException c){System.out.println(c.getMessage());}
            }con.close();
        }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_tr_br_codeActionPerformed
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new trip().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.swing.CustomButton Cancel;
    private project_gui.swing.CustomButton Delete1;
    private project_gui.swing.CustomButton Insert;
    private javax.swing.JTextField PickTime1;
    private javax.swing.JTextField PickTime2;
    private project_gui.swing.Table1 TripTable;
    private project_gui.swing.CustomButton Update1;
    private project_gui.component.Header header;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private project_gui.component.Menu menu;
    private project_gui.swing.PanelBorder panelBorder1;
    private project_gui.swing.PanelBorder panelBorder3;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    private combobox.CustomJCombo tr_br_code;
    private javax.swing.JTextField tr_cost;
    private combobox.CustomJCombo tr_drv_AT;
    private combobox.CustomJCombo tr_gui_AT;
    private javax.swing.JTextField tr_maxseats;
    // End of variables declaration//GEN-END:variables
}
