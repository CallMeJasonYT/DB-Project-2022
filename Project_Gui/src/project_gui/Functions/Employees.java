package project_gui.Functions;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project_gui.Insert_Selection;
import project_gui.Login;
import project_gui.event.EventMenuSelected;
import project_gui.main.Main;

public class Employees extends javax.swing.JFrame {
    public Employees() {
        initComponents();
        menu.initMoving(Employees.this);
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

        panelBorder1 = new project_gui.swing.PanelBorder();
        totalcost = new javax.swing.JTextField();
        Cancel1 = new project_gui.swing.CustomButton();
        panelBorder2 = new project_gui.swing.PanelBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        EmployeesTable = new project_gui.swing.Table1();
        header1 = new project_gui.component.Header();
        jLabel4 = new javax.swing.JLabel();
        br_code = new combobox.CustomJCombo();
        jLabel3 = new javax.swing.JLabel();
        menu = new project_gui.component.Menu1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Cancel1.setText("Cancel");
        Cancel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Cancel1.setStyle(project_gui.swing.CustomButton.ButtonStyle.DESTRUCTIVE);
        Cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel1ActionPerformed(evt);
            }
        });

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        EmployeesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employer Name", "Employer Last Name", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(EmployeesTable);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Branch Code:");

        br_code.setLabeText("");
        br_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_codeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Total Costs:");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(br_code, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBorder2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(br_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    float total = 0;
    public void updateCombo(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select="SELECT br_code FROM branch;";
            Statement slct = con.createStatement();
            ResultSet rs = slct.executeQuery(select);
            DefaultComboBoxModel mod = new DefaultComboBoxModel();
            mod.removeAllElements();
            while(rs.next()){
                String box = "Branch: "+rs.getInt("br_code")+"";
                mod.addElement(box);
            }
            br_code.setModel(mod);
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    public void updateTable(){
        String code = br_code.getSelectedItem().toString().replaceAll("[^0-9.]", "");
        if(!"".equals(code)){
            try{
                DefaultTableModel tbModel= (DefaultTableModel) EmployeesTable.getModel();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                String select1="SELECT wrk_name, wrk_lname, wrk_salary FROM worker WHERE wrk_br_code = ?";
                int i=Integer.parseInt(code);
                PreparedStatement slct1 = con.prepareStatement(select1);
                slct1.setInt(1, i);
                ResultSet rs1 = slct1.executeQuery();
                tbModel.setRowCount(0);
                total = 0;
                while(rs1.next()){
                    String name = rs1.getString("wrk_name");
                    String lname = rs1.getString("wrk_lname");
                    String salary = rs1.getString("wrk_salary");
                    total = total + Float.parseFloat(salary);
                    String tb_data[]= {name, lname, salary};
                    tbModel.addRow(tb_data);
                }
                String str1 = String.format("%.02f", total);
                totalcost.setText(str1);
                if(tbModel.getRowCount()==0){JOptionPane.showMessageDialog(this, "There aren't any Employees");}
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}}
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        updateCombo();
    }//GEN-LAST:event_formWindowOpened

    private void Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel1ActionPerformed
        dispose();
        Main main = new Main();
        main.show();
    }//GEN-LAST:event_Cancel1ActionPerformed

    private void br_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_codeActionPerformed
        updateTable();
    }//GEN-LAST:event_br_codeActionPerformed
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new Employees().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.swing.CustomButton Cancel1;
    private project_gui.swing.Table1 EmployeesTable;
    private combobox.CustomJCombo br_code;
    private project_gui.component.Header header1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private project_gui.component.Menu1 menu;
    private project_gui.swing.PanelBorder panelBorder1;
    private project_gui.swing.PanelBorder panelBorder2;
    private javax.swing.JTextField totalcost;
    // End of variables declaration//GEN-END:variables
}
