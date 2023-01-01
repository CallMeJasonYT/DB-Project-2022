package project_gui.Inserts;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.DefaultComboBoxModel;

public class evt_Ins extends javax.swing.JFrame {
    public evt_Ins() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        ev_descr = new javax.swing.JTextField();
        PickTime1 = new javax.swing.JTextField();
        Insert_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ev_tr_id = new javax.swing.JComboBox<>();
        Cancel_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PickTime2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        timePicker1.setName(""); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Event End:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Description:");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Event Start:");

        ev_tr_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Cancel_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancel_btn.setText("Cancel");
        Cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Trip ID:");

        PickTime2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PickTime2.setText("Set Time");
        PickTime2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PickTime2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PickTime2MouseClicked(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ev_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PickTime2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ev_descr, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ev_tr_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PickTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PickTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ev_descr, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_btnActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String insert="INSERT INTO event(ev_tr_id,ev_start,ev_end,ev_descr) VALUES(?,?,?,?)";
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
            String strDate1 = dateFormat1.format(jDateChooser1.getDate());
            String date1 = strDate1.concat(time1);
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
            String strDate2 = dateFormat2.format(jDateChooser2.getDate());
            String date2 = strDate2.concat(time2);
            Timestamp t1 = java.sql.Timestamp.valueOf(date1);
            Timestamp t2 = java.sql.Timestamp.valueOf(date2);
            String code = ev_tr_id.getSelectedItem().toString().replaceAll("[^0-9.]", "");
            int i=Integer.parseInt(code);
            insrt.setInt(1, i);
            insrt.setTimestamp(2,t1);
            insrt.setTimestamp(3,t2);
            insrt.setString(4,ev_descr.getText());
            insrt.execute();
            
            JOptionPane.showMessageDialog(this, "Inserted Succesfully");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Insert_btnActionPerformed

    private void Cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_btnActionPerformed
        dispose();
    }//GEN-LAST:event_Cancel_btnActionPerformed

    private void PickTime1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PickTime1MouseClicked
        timePicker1.showPopup(this, 100, 100);
        String time = timePicker1.getSelectedTime();
        time=time.replace("MP", "PM");
        PickTime1.setText(time);
    }//GEN-LAST:event_PickTime1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        PickTime1.setText("Set Time");
        PickTime2.setText("Set Time");
        try
        {
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
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void PickTime2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PickTime2MouseClicked
        timePicker2.showPopup(this, 100, 100);
        String time = timePicker2.getSelectedTime();
        time=time.replace("MP", "PM");
        PickTime2.setText(time);
    }//GEN-LAST:event_PickTime2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new evt_Ins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_btn;
    private javax.swing.JButton Insert_btn;
    private javax.swing.JTextField PickTime1;
    private javax.swing.JTextField PickTime2;
    private javax.swing.JTextField ev_descr;
    private javax.swing.JComboBox<String> ev_tr_id;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    // End of variables declaration//GEN-END:variables
}
