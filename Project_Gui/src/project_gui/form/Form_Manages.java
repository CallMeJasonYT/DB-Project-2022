package project_gui.form;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import project_gui.Login;
import static project_gui.form.Form_Home.cost;
import static project_gui.form.Form_Home.profit;
import project_gui.model.Model_Card;
import project_gui.model.StatusType;

public class Form_Manages extends javax.swing.JPanel {
    public Form_Manages() {
        initComponents();
        cost = 0;
        profit = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_agency?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String select1="SELECT tr_id, tr_departure, tr_return, tr_cost, tr_br_code, tr_maxseats, COUNT(res_tr_id) FROM trip INNER JOIN reservation ON tr_id = res_tr_id WHERE tr_br_code = "+Login.getBranch()+" GROUP BY tr_id ORDER BY tr_departure ASC;";
            String select2="SELECT COUNT(tr_id), tr_cost FROM reservation INNER JOIN trip ON tr_id = res_tr_id WHERE tr_br_code = "+Login.getBranch()+" GROUP BY tr_id;";
            String select3="SELECT wrk_salary FROM worker WHERE wrk_br_code = "+Login.getBranch()+"";
            String select4="SELECT COUNT(*) FROM worker WHERE wrk_br_code = "+Login.getBranch()+"";
            Statement slct1 = con.createStatement();
            Statement slct2 = con.createStatement();
            Statement slct3 = con.createStatement();
            Statement slct4 = con.createStatement();
            ResultSet rs1 = slct1.executeQuery(select1);
            ResultSet rs2 = slct2.executeQuery(select2);
            ResultSet rs3 = slct3.executeQuery(select3);
            ResultSet rs4 = slct4.executeQuery(select4);
            while(rs1.next()){
                if(rs1.getRow() == 1){
                    String date = rs1.getString("tr_departure");
                    card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/project_gui/icon/calendar.png")), "Upcoming Trip", date, "Next trip on Calendar"));
                }
                String id = rs1.getString("tr_id");
                String departure = rs1.getString("tr_departure");
                String ret = rs1.getString("tr_return");
                String cost = rs1.getString("tr_cost");
                String max = rs1.getString("tr_maxseats");
                String res = rs1.getString("COUNT(res_tr_id)");
                String code = rs1.getString("tr_br_code");
                if(Integer.parseInt(res) <= Integer.parseInt(max)/2){
                    table1.addRow(new Object[]{id, departure, ret, cost, code, StatusType.Available_Seats});
                }else if (res.equals(max)){table1.addRow(new Object[]{id, departure, ret, cost, code, StatusType.Fully_Booked});
                }else table1.addRow(new Object[]{id, departure, ret, cost, code, StatusType.Limited_Availability});
            }
            while(rs2.next()){
                int count = rs2.getInt("COUNT(tr_id)");
                profit = profit + rs2.getFloat("tr_cost") * count;
            }
            while(rs3.next()){cost = cost + rs3.getFloat("wrk_salary");}
            String str1 = String.format("%.02f", cost);
            card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/project_gui/icon/profit.png")), "Total Profit", Float.toString(profit)+"€", "Total Profit From Branch "+Login.getBranch()+""));
            card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/project_gui/icon/costs.png")), "Total Costs", str1+"€", "Total Costs From Branch "+Login.getBranch()+""));
            while(rs4.next()){
                int employees = rs4.getInt("COUNT(*)");
                card4.setData(new Model_Card(new ImageIcon(getClass().getResource("/project_gui/icon/employees.png")), "Number Of Employees", Integer.toString(employees), "Number of Employees in Branch "+Login.getBranch()+""));
            }
            
            con.close();
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JLayeredPane();
        card1 = new project_gui.component.Card();
        card4 = new project_gui.component.Card();
        card2 = new project_gui.component.Card();
        card3 = new project_gui.component.Card();
        panelBorder1 = new project_gui.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new project_gui.swing.Table();

        panel.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        card1.setColor1(new java.awt.Color(25, 236, 32));
        card1.setColor2(new java.awt.Color(10, 105, 6));
        panel.add(card1);

        card4.setColor1(new java.awt.Color(0, 91, 255));
        card4.setColor2(new java.awt.Color(0, 6, 105));
        panel.add(card4);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(80, 45, 114));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(255, 192, 19));
        card3.setColor2(new java.awt.Color(237, 101, 23));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 58, 58));
        jLabel1.setText("Pending Trips");

        jScrollPane1.setBorder(null);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip ID", "Trip Departure", "Trip Return", "Trip Cost", "Brach Code", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_gui.component.Card card1;
    private project_gui.component.Card card2;
    private project_gui.component.Card card3;
    private project_gui.component.Card card4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane panel;
    private project_gui.swing.PanelBorder panelBorder1;
    private project_gui.swing.Table table1;
    // End of variables declaration//GEN-END:variables

}
