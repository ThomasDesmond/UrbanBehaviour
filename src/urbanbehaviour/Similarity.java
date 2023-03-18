
package urbanbehaviour;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Similarity extends javax.swing.JFrame 
{
     
    Vector columnNames =new Vector();
    Vector data=new Vector();
    Vector columnNames1 =new Vector();
    Vector data1=new Vector();
    Vector columnNames2 =new Vector();
    Vector data2=new Vector();
    Connection con = null;
    Statement stmt,stmt1,stmt2,stmt3,stmt4,stmt5,stmt6,stmt7 = null;
    ResultSet rs, rs1, rs2,rs3,rs4, rs5,rs6;
    ResultSetMetaData rsmd , rsmd1;
    DefaultTableModel model,model1,model2;
    String url = "jdbc:mysql://localhost:3306/urbanbehaviour";
    String getuserid, comctyval;
    int rcount = 0;
    int cityval = 0;
    int k=0;
    public static ArrayList<String> list1=new ArrayList<String>();
    public static ArrayList<String> list2=new ArrayList<String>();
    public static ArrayList<String> list3=new ArrayList<String>();
    public Similarity() 
    {
        initComponents();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            stmt2 = con.createStatement();
            stmt3 = con.createStatement();
            stmt4 = con.createStatement();
            stmt5 = con.createStatement();
            stmt6 = con.createStatement();
            System.out.println("Preprocess_TKY : DB Connection Success");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_main = new javax.swing.JPanel();
        jLabel_title1 = new javax.swing.JLabel();
        jPanel_choosedataset1 = new javax.swing.JPanel();
        jButton_nyc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_city1 = new javax.swing.JTable();
        jButton_tky = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_city2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_title1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title1.setText("Modeling Urban Behavior by Mining Geotagged Social Data");
        jPanel_main.add(jLabel_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 660, 40));

        jPanel_choosedataset1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Spatial Distribution", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel_choosedataset1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_choosedataset1.setOpaque(false);
        jPanel_choosedataset1.setLayout(null);

        jButton_nyc.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_nyc.setForeground(new java.awt.Color(0, 51, 204));
        jButton_nyc.setText("Show");
        jButton_nyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nycActionPerformed(evt);
            }
        });
        jPanel_choosedataset1.add(jButton_nyc);
        jButton_nyc.setBounds(100, 70, 140, 30);

        jTable_city1.setBackground(new java.awt.Color(255, 204, 204));
        jTable_city1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_city1.setOpaque(false);
        jTable_city1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_city1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_city1);

        jPanel_choosedataset1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 240, 300, 190);

        jButton_tky.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_tky.setForeground(new java.awt.Color(0, 51, 204));
        jButton_tky.setText("Show");
        jButton_tky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_tkyActionPerformed(evt);
            }
        });
        jPanel_choosedataset1.add(jButton_tky);
        jButton_tky.setBounds(490, 70, 140, 30);

        jTable_city2.setBackground(new java.awt.Color(255, 204, 204));
        jTable_city2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_city2.setOpaque(false);
        jTable_city2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_city2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_city2);

        jPanel_choosedataset1.add(jScrollPane3);
        jScrollPane3.setBounds(400, 250, 300, 180);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Areas that need development in NYC");
        jLabel1.setOpaque(true);
        jPanel_choosedataset1.add(jLabel1);
        jLabel1.setBounds(60, 40, 230, 18);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Areas that need development in TKY");
        jLabel2.setOpaque(true);
        jPanel_choosedataset1.add(jLabel2);
        jLabel2.setBounds(440, 40, 240, 20);

        jPanel_main.add(jPanel_choosedataset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 680, 410));
        jPanel_choosedataset1.getAccessibleContext().setAccessibleDescription("");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/urbanbehaviour/pop.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_main.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 90, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/urbanbehaviour/smart-cities-1.jpg"))); // NOI18N
        jPanel_main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -10, 980, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_nycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nycActionPerformed

        try
        {
            rs = stmt.executeQuery("SELECT Venue_catgname FROM `pre_nycdata` GROUP BY Venue_catgname ORDER BY count(*) ASC LIMIT 5");
            
            rsmd=rs.getMetaData();
            int columns = rsmd.getColumnCount();
            for(int i=1;i<=columns;i++)
            {
                columnNames.addElement(rsmd.getColumnName(i));
            }
            while(rs.next())
            {
                Vector row=new Vector(columns);
                for(int i=1;i<=columns;i++)
                {
                    row.addElement(rs.getObject(i));
                    
                }
                data.addElement(row);
            }
            rs.close();
            model=new DefaultTableModel(data, columnNames);
            jTable_city1.setModel(model);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
        try 
        {   list1.clear();
            stmt3.executeUpdate("TRUNCATE city1_venues");
            rs3 = stmt3.executeQuery("SELECT Venue_catgname FROM `pre_nycdata` GROUP BY Venue_catgname ORDER BY count(*) ASC LIMIT 5");
            while(rs3.next())
            {
                String value1 = rs3.getString(1);
                list1.add(value1);
                stmt4.executeUpdate("INSERT into city1_venues VALUES('"+value1+"')");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
       
        
    }//GEN-LAST:event_jButton_nycActionPerformed

    private void jTable_city1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_city1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_city1MouseClicked

    private void jTable_city2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_city2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_city2MouseClicked

    private void jButton_tkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_tkyActionPerformed
        
        try
        {
            rs1 = stmt1.executeQuery("SELECT Venue_catgname FROM `pre_tkydata` GROUP BY Venue_catgname ORDER BY count(*) ASC LIMIT 5");
            rsmd=rs1.getMetaData();
            int columns = rsmd.getColumnCount();
            for(int i=1;i<=columns;i++)
            {
                columnNames1.addElement(rsmd.getColumnName(i));
            }
            while(rs1.next())
            {
                Vector row=new Vector(columns);
                for(int i=1;i<=columns;i++)
                {
                    row.addElement(rs1.getObject(i));
                }
                data1.addElement(row);
            }
            rs1.close();
            model1=new DefaultTableModel(data1, columnNames1);
            jTable_city2.setModel(model1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        try 
        {   list2.clear();
            stmt4.executeQuery("TRUNCATE city2_venues");
            rs4 = stmt4.executeQuery("SELECT Venue_catgname FROM `pre_tkydata` GROUP BY Venue_catgname ORDER BY count(*) ASC LIMIT 5");
            while(rs4.next())
            {
                String value = rs4.getString(1);
                list2.add(value);
                stmt3.executeUpdate("INSERT into city2_venues VALUES('"+value+"')");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton_tkyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Suggestions su = new Suggestions();
        su.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Similarity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_nyc;
    private javax.swing.JButton jButton_tky;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_title1;
    private javax.swing.JPanel jPanel_choosedataset1;
    private javax.swing.JPanel jPanel_main;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_city1;
    private javax.swing.JTable jTable_city2;
    // End of variables declaration//GEN-END:variables
}
