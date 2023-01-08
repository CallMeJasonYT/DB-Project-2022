package project_gui;
import java.awt.Color;
import project_gui.Functions.*;
import java.sql.*;
import javax.swing.*;
import project_gui.event.EventMenuSelected;
import project_gui.main.Main;

public class Insert_Selection extends javax.swing.JFrame{

    public Insert_Selection() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        menu.initMoving(Insert_Selection.this);
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
        header1 = new project_gui.component.Header();
        jLabel1 = new javax.swing.JLabel();
        Selection1 = new combobox.CustomJCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Select the Table of your choice");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Selection1.setLabeText("");
        Selection1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selection1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Selection1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Selection1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(887, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static int select = 0;
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
            Selection1.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void Selection1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selection1ActionPerformed
        String select = Selection1.getSelectedItem().toString();
        switch(select)
        {
            case "branch":
                dispose();
                branch inspage1 = new branch();
                inspage1.show();
                break;
            case "phones":
                dispose();
                phones inspage2 = new phones();
                inspage2.show();
                break;
            case "worker":
                dispose();
                wrk inspage3 = new wrk();
                inspage3.show();
                break;
            case "it":    
                dispose();
                it inspage4 = new it();
                inspage4.show();
                break;
            case "driver":   
                dispose();
                drv inspage5 = new drv();
                inspage5.show();
                break;
            case "admin":    
                dispose();
                adm inspage6 = new adm();
                inspage6.show();
                break;
            case "manages":    
                dispose();
                mngs inspage7 = new mngs();
                inspage7.show();
                break;
            case "guide":    
                dispose();
                gui inspage8 = new gui();
                inspage8.show();
                break;
            case "languages":   
                dispose();
                lang inspage9 = new lang();
                inspage9.show();
                break;
            case "trip":  
                dispose();
                trip inspage10 = new trip();
                inspage10.show();
                break;
            case "event":   
                dispose();
                evt inspage11 = new evt();
                inspage11.show();
                break;
            case "destination":
                dispose();
                dst inspage12 = new dst();
                inspage12.show();
                break;
            case "travel_to":    
                dispose();
                trvl inspage13 = new trvl();
                inspage13.show();
                break;
            case "reservation":
                dispose();
                rsv inspage14 = new rsv();
                inspage14.show();
                break;
            case "offers":   
                dispose();
                off inspage15 = new off();
                inspage15.show();
                break;
            case "reservation_offers":  
                dispose();
                ResOff inspage16 = new ResOff();
                inspage16.show();
                break;
        }
    }//GEN-LAST:event_Selection1ActionPerformed

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
    private combobox.CustomJCombo Selection1;
    private project_gui.component.Header header1;
    private javax.swing.JLabel jLabel1;
    private project_gui.component.Menu menu;
    private project_gui.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
