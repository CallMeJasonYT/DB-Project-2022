package project_gui;
import project_gui.Functions.Employees_mng;
import project_gui.Functions.adm_mng;
import project_gui.Functions.drv_mng;
import project_gui.Functions.gui_mng;
import project_gui.Functions.trip_mng;
import project_gui.Functions.wrk_mng;
import project_gui.event.EventMenuSelected;
import project_gui.main.Main_Mng;

public class Insert_Selection2 extends javax.swing.JFrame {
    public Insert_Selection2() {
        initComponents();
        menu.initMoving(Insert_Selection2.this);
        menu.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index) {
                switch (index) {
                    case 0:
                        Main_Mng main = new Main_Mng();
                        main.show();
                        dispose();
                        break;
                    case 1:
                        Insert_Selection2 select = new Insert_Selection2();
                        select.show();
                        dispose();
                        break;
                    case 2:
                        Employees_mng empl = new Employees_mng();
                        empl.show();
                        dispose();
                        break;
                    case 5:   
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
        header = new project_gui.component.Header();
        Text = new javax.swing.JLabel();
        Selection = new project_gui.swing.CustomJCombo();
        menu = new project_gui.component.Menu_Manager();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
                .addGap(121, 125, Short.MAX_VALUE))
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorder1Layout.createSequentialGroup()
                    .addGap(219, 219, 219)
                    .addComponent(Selection, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorder1Layout.createSequentialGroup()
                    .addGap(291, 291, 291)
                    .addComponent(Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(291, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void SelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionActionPerformed
        String select = Selection.getSelectedItem().toString();
        switch(select){
            case "Worker":
            dispose();
            wrk_mng inspage3 = new wrk_mng();
            inspage3.show();
            break;
            case "Driver":
            dispose();
            drv_mng inspage5 = new drv_mng();
            inspage5.show();
            break;
            case "Admin":
            dispose();
            adm_mng inspage6 = new adm_mng();
            inspage6.show();
            break;
            case "Guide":
            dispose();
            gui_mng inspage8 = new gui_mng();
            inspage8.show();
            break;
            case "Trip":
            dispose();
            trip_mng inspage10 = new trip_mng();
            inspage10.show();
            break;
        }
    }//GEN-LAST:event_SelectionActionPerformed
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new Insert_Selection2().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.swing.CustomJCombo Selection;
    private javax.swing.JLabel Text;
    private project_gui.component.Header header;
    private project_gui.component.Menu_Manager menu;
    private project_gui.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
