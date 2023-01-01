package project_gui.Inserts;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.*;
import java.awt.event.*; 
import javax.swing.DefaultComboBoxModel;

public class trip_Ins extends javax.swing.JFrame {
    public trip_Ins() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        jLabel2 = new javax.swing.JLabel();
        Cancel_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        PickTime2 = new javax.swing.JTextField();
        tr_gui_AT = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tr_departure = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        tr_return = new com.toedter.calendar.JDateChooser();
        tr_maxseats = new javax.swing.JTextField();
        PickTime1 = new javax.swing.JTextField();
        Insert_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tr_cost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tr_br_code = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tr_drv_AT = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Departure:");

        Cancel_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancel_btn.setText("Cancel");
        Cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_btnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Guide:");

        PickTime2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime2.setText("Set Time");
        PickTime2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime2MouseClicked(evt);
            }
        });

        tr_gui_AT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Return:");

        tr_departure.setDateFormatString("yyyy-MM-dd");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Max Seats:");

        tr_return.setDateFormatString("yyyy-MM-dd");

        PickTime1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime1.setText("Set Time");
        PickTime1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime1MouseClicked(evt);
            }
        });

        Insert_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Insert_btn.setText("Insert");
        Insert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_btnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cost:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Branch Code:");

        tr_br_code.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Driver:");

        tr_drv_AT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tr_departure, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tr_maxseats, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tr_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tr_gui_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tr_return, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PickTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tr_br_code, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tr_drv_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tr_maxseats, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tr_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tr_gui_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tr_drv_AT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tr_departure, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PickTime2)
                                .addGap(1, 1, 1))
                            .addComponent(tr_return, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tr_br_code, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_btnActionPerformed
        dispose();
    }//GEN-LAST:event_Cancel_btnActionPerformed

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

    private void Insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_btnActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO trip(tr_id,tr_departure,tr_return,tr_maxseats,tr_cost,tr_br_code,tr_gui_AT,tr_drv_AT) VALUES(null,?,?,?,?,?,?,?)";
            PreparedStatement insrt = con.prepareStatement(insert);
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
            }else
            {
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
            }else
            {
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
            String strDate1 = dateFormat1.format(tr_departure.getDate());
            String date1 = strDate1.concat(time1);
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
            String strDate2 = dateFormat2.format(tr_return.getDate());
            String date2 = strDate2.concat(time2);
            Timestamp t1 = java.sql.Timestamp.valueOf(date1);
            Timestamp t2 = java.sql.Timestamp.valueOf(date2);
            insrt.setTimestamp(1,t1);
            insrt.setTimestamp(2,t2);
            insrt.setInt(3, Integer.parseInt(tr_maxseats.getText()));
            insrt.setFloat(4,Float.parseFloat(tr_cost.getText()));
            insrt.setInt(5, Integer.parseInt(tr_br_code.getSelectedItem().toString()));
            insrt.setString(6, tr_gui_AT.getSelectedItem().toString());
            insrt.setString(7, tr_drv_AT.getSelectedItem().toString());
            insrt.execute();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Insert_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        PickTime1.setText("Set Time");
        PickTime2.setText("Set Time");
        jLabel5.setVisible(false);
        jLabel8.setVisible(false);
        tr_gui_AT.setVisible(false);
        tr_drv_AT.setVisible(false);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select1="SELECT br_code FROM branch;";
            Statement slct1 = con.createStatement();
            ResultSet rs1 = slct1.executeQuery(select1);
            DefaultComboBoxModel mod1 = new DefaultComboBoxModel();
            DefaultComboBoxModel mod2 = new DefaultComboBoxModel();
            DefaultComboBoxModel mod3 = new DefaultComboBoxModel();
            mod1.removeAllElements();
            mod1.addElement("");
            while(rs1.next()){
                int box1 = rs1.getInt("br_code");
                mod1.addElement(box1);
            }
            tr_br_code.setModel(mod1);
            
            tr_br_code.addItemListener(new ItemListener()
            {
                @Override
                public void itemStateChanged(ItemEvent e) {
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
                    }
                }
            });       
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
       
        
    }//GEN-LAST:event_formWindowOpened
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trip_Ins().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_btn;
    private javax.swing.JButton Insert_btn;
    private javax.swing.JTextField PickTime1;
    private javax.swing.JTextField PickTime2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    private javax.swing.JComboBox<String> tr_br_code;
    private javax.swing.JTextField tr_cost;
    private com.toedter.calendar.JDateChooser tr_departure;
    private javax.swing.JComboBox<String> tr_drv_AT;
    private javax.swing.JComboBox<String> tr_gui_AT;
    private javax.swing.JTextField tr_maxseats;
    private com.toedter.calendar.JDateChooser tr_return;
    // End of variables declaration//GEN-END:variables
}
