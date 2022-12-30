package project_gui;
import project_gui.Inserts.*;
import java.sql.*;
import javax.swing.*;

public class Insert_Selection extends javax.swing.JFrame{

    public Insert_Selection() {initComponents();}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Selection = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Select the Table of your choice");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(Selection, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Selection, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        setSize(new java.awt.Dimension(414, 168));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            Statement stm = con.createStatement();
            String[] types = {"TABLE"};
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet tables = metaData.getTables(null, null, "%", types);
            DefaultComboBoxModel mod = new DefaultComboBoxModel();
            mod.removeAllElements();
            while (tables.next()){
                if(!"sys_config".equals(tables.getString("TABLE_NAME")) && !"logging".equals(tables.getString("TABLE_NAME")) && !"login".equals(tables.getString("TABLE_NAME"))){
                    mod.addElement(tables.getString("TABLE_NAME"));
                }
            }
            Selection.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void SelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionActionPerformed
        String select = Selection.getSelectedItem().toString();
        switch(select)
        {
            case "branch":
                dispose();
                branch_Ins inspage1 = new branch_Ins();
                inspage1.show();
                break;
            case "phones":
                dispose();
                phones_Ins inspage2 = new phones_Ins();
                inspage2.show();
                break;
            case "worker":
                dispose();
                wrk_Ins inspage3 = new wrk_Ins();
                inspage3.show();
                break;
            case "it":    
                dispose();
                it_Ins inspage4 = new it_Ins();
                inspage4.show();
                break;
            case "driver":   
                dispose();
                drv_Ins inspage5 = new drv_Ins();
                inspage5.show();
                break;
            case "admin":    
                dispose();
                adm_Ins inspage6 = new adm_Ins();
                inspage6.show();
                break;
            case "manages":    
                dispose();
                mngs_Ins inspage7 = new mngs_Ins();
                inspage7.show();
                break;
            case "guide":    
                dispose();
                gui_Ins inspage8 = new gui_Ins();
                inspage8.show();
                break;
            case "languages":   
                dispose();
                lang_Ins inspage9 = new lang_Ins();
                inspage9.show();
                break;
            case "trip":  
                dispose();
                trip_Ins inspage10 = new trip_Ins();
                inspage10.show();
                break;
            case "event":   
                dispose();
                evt_Ins inspage11 = new evt_Ins();
                inspage11.show();
                break;
            case "destination":
                dispose();
                dst_Ins inspage12 = new dst_Ins();
                inspage12.show();
                break;
            case "travel_to":    
                dispose();
                trvl_Ins inspage13 = new trvl_Ins();
                inspage13.show();
                break;
            case "reservation":
                dispose();
                rsv_Ins inspage14 = new rsv_Ins();
                inspage14.show();
                break;
            case "offers":   
                dispose();
                off_Ins inspage15 = new off_Ins();
                inspage15.show();
                break;
            case "reservation_offers":  
                dispose();
                ResOff_Ins inspage16 = new ResOff_Ins();
                inspage16.show();
                break;
        }
    }//GEN-LAST:event_SelectionActionPerformed

    public static void main(String args[]){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Selection().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Selection;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
