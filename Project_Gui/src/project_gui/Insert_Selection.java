package project_gui;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import project_gui.Functions.BranchInfo;
import project_gui.Functions.CheckOffers;
import project_gui.Functions.CheckTrip;
import project_gui.Functions.Employees;
import project_gui.Functions.Logs;
import project_gui.Functions.ResOff;
import project_gui.Functions.adm;
import project_gui.Functions.branch;
import project_gui.Functions.drv;
import project_gui.Functions.dst;
import project_gui.Functions.evt;
import project_gui.Functions.gui;
import project_gui.Functions.it;
import project_gui.Functions.lang;
import project_gui.Functions.mngs;
import project_gui.Functions.off;
import project_gui.Functions.phones;
import project_gui.Functions.rsv;
import project_gui.Functions.trip;
import project_gui.Functions.trvl;
import project_gui.Functions.wrk;
import project_gui.event.EventMenuSelected;
import project_gui.main.Main;

public class Insert_Selection extends javax.swing.JFrame {
    public Insert_Selection() {
        initComponents();
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

        menu = new project_gui.component.Menu1();
        panelBorder1 = new project_gui.swing.PanelBorder();
        header = new project_gui.component.Header();
        Text = new javax.swing.JLabel();
        Selection = new project_gui.swing.CustomJCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Text.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("Please Select the Table of your choice");
        Text.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Selection.setLabeText("");
        Selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(Text)
                .addGap(121, 133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Selection, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void SelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionActionPerformed
        String select = Selection.getSelectedItem().toString();
        switch(select){
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
    }//GEN-LAST:event_SelectionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            Statement stm = con.createStatement();
            String[] types = {"TABLE"};
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet tables = metaData.getTables(null, null, "%", types);
            DefaultComboBoxModel mod = new DefaultComboBoxModel();
            mod.removeAllElements();
            while (tables.next()){
                if(!"sys_config".equals(tables.getString("TABLE_NAME")) && !"logging".equals(tables.getString("TABLE_NAME")) && !"user".equals(tables.getString("TABLE_NAME")) 
                        && !"new".equals(tables.getString("TABLE_NAME")) && !"final_paid".equals(tables.getString("TABLE_NAME")) && !"new_res_off".equals(tables.getString("TABLE_NAME"))){
                    mod.addElement(tables.getString("TABLE_NAME"));
                }
            }
            Selection.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_formWindowOpened
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new Insert_Selection().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.swing.CustomJCombo Selection;
    private javax.swing.JLabel Text;
    private project_gui.component.Header header;
    private project_gui.component.Menu1 menu;
    private project_gui.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
