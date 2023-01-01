package project_gui.Inserts;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.DefaultComboBoxModel;

public class trvl_Ins extends javax.swing.JFrame {

    public trvl_Ins() {
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
        to_dst_id = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        to_arrival = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        to_departure = new com.toedter.calendar.JDateChooser();
        PickTime1 = new javax.swing.JTextField();
        Insert_btn = new javax.swing.JButton();
        to_tr_id = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Arrival:");

        Cancel_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancel_btn.setText("Cancel");
        Cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_btnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Destination:");

        PickTime2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime2.setText("Set Time");
        PickTime2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime2MouseClicked(evt);
            }
        });

        to_dst_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Departure:");

        to_arrival.setDateFormatString("yyyy-MM-dd");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Trip:");

        to_departure.setDateFormatString("yyyy-MM-dd");

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

        to_tr_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(to_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to_dst_id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to_arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to_departure, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PickTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(to_departure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(to_dst_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(to_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(to_arrival, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PickTime2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PickTime1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
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
            String insert="INSERT INTO travel_to(to_tr_id,to_dst_id,to_arrival,to_departure) VALUES(?,?,?,?)";
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
            String strDate1 = dateFormat1.format(to_arrival.getDate());
            String date1 = strDate1.concat(time1);
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
            String strDate2 = dateFormat2.format(to_departure.getDate());
            String date2 = strDate2.concat(time2);
            Timestamp t1 = java.sql.Timestamp.valueOf(date1);
            Timestamp t2 = java.sql.Timestamp.valueOf(date2);
            insrt.setInt(1,Integer.parseInt(to_tr_id.getSelectedItem().toString()));
            insrt.setInt(2, Integer.parseInt(to_dst_id.getSelectedItem().toString()));
            insrt.setTimestamp(3,t1);
            insrt.setTimestamp(4,t2);
            insrt.execute();
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Insert_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        PickTime1.setText("Set Time");
        PickTime2.setText("Set Time");
        try
        {
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
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new trvl_Ins().setVisible(true);
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
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    private com.toedter.calendar.JDateChooser to_arrival;
    private com.toedter.calendar.JDateChooser to_departure;
    private javax.swing.JComboBox<String> to_dst_id;
    private javax.swing.JComboBox<String> to_tr_id;
    // End of variables declaration//GEN-END:variables
}
