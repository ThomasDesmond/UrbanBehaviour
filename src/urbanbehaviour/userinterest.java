
package urbanbehaviour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class userinterest extends javax.swing.JFrame 
{
    Vector columnNames =new Vector();
    Vector data=new Vector();
    Vector columnNames1 =new Vector();
    Vector data1=new Vector();
    Connection con = null;
    Statement stmt,stmt1 = null;
    ResultSet rs, rs1;
    ResultSetMetaData rsmd , rsmd1;
    DefaultTableModel model,model1;
    String url = "jdbc:mysql://localhost:3306/urbanbehaviour";
    String getuserid, comctyval;
    int rcount = 0;
    int cityval = 0;
    public userinterest() 
    {
        initComponents();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel_main = new javax.swing.JPanel();
        jLabel_title1 = new javax.swing.JLabel();
        jPanel_choosedataset = new javax.swing.JPanel();
        jButton_feature = new javax.swing.JButton();
        jRadioButton_tky = new javax.swing.JRadioButton();
        jRadioButton_nyc = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_preview = new javax.swing.JTable();
        jButton_refresh = new javax.swing.JButton();
        jPanel_choosedataset1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_userdata = new javax.swing.JTable();
        jButton_loaduserid = new javax.swing.JButton();
        jComboBox_userid = new javax.swing.JComboBox<>();
        jButton_getdata = new javax.swing.JButton();
        jButton_city = new javax.swing.JButton();
        jComboBox_city = new javax.swing.JComboBox<>();
        jButton_getdata1 = new javax.swing.JButton();
        jLabel_bg = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_main.setLayout(null);

        jLabel_title1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_title1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title1.setText("Modeling Urban Behavior by Mining Geotagged Social Data");
        jLabel_title1.setOpaque(true);
        jPanel_main.add(jLabel_title1);
        jLabel_title1.setBounds(70, 10, 660, 40);

        jPanel_choosedataset.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Feature Values", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel_choosedataset.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_choosedataset.setOpaque(false);
        jPanel_choosedataset.setLayout(null);

        jButton_feature.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_feature.setForeground(new java.awt.Color(0, 51, 204));
        jButton_feature.setText("Feature Values");
        jButton_feature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_featureActionPerformed(evt);
            }
        });
        jPanel_choosedataset.add(jButton_feature);
        jButton_feature.setBounds(40, 100, 150, 30);

        jRadioButton_tky.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jRadioButton_tky.setText("Tokyo City");
        jRadioButton_tky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_tkyActionPerformed(evt);
            }
        });
        jPanel_choosedataset.add(jRadioButton_tky);
        jRadioButton_tky.setBounds(260, 50, 130, 31);

        jRadioButton_nyc.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jRadioButton_nyc.setText("New York City");
        jRadioButton_nyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_nycActionPerformed(evt);
            }
        });
        jPanel_choosedataset.add(jRadioButton_nyc);
        jRadioButton_nyc.setBounds(120, 50, 140, 31);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel1.setText("Select City");
        jLabel1.setOpaque(true);
        jPanel_choosedataset.add(jLabel1);
        jLabel1.setBounds(20, 50, 100, 30);

        jTable_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_preview.setOpaque(false);
        jTable_preview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_previewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_preview);

        jPanel_choosedataset.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 360, 290);

        jButton_refresh.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_refresh.setForeground(new java.awt.Color(0, 51, 204));
        jButton_refresh.setText("Refresh");
        jButton_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refreshActionPerformed(evt);
            }
        });
        jPanel_choosedataset.add(jButton_refresh);
        jButton_refresh.setBounds(210, 100, 150, 30);

        jPanel_main.add(jPanel_choosedataset);
        jPanel_choosedataset.setBounds(20, 70, 400, 450);

        jPanel_choosedataset1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Interests", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel_choosedataset1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_choosedataset1.setOpaque(false);
        jPanel_choosedataset1.setLayout(null);

        jTable_userdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_userdata.setOpaque(false);
        jTable_userdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_userdataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_userdata);

        jPanel_choosedataset1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 190, 300, 190);

        jButton_loaduserid.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_loaduserid.setForeground(new java.awt.Color(0, 51, 204));
        jButton_loaduserid.setText("Load User ID");
        jButton_loaduserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loaduseridActionPerformed(evt);
            }
        });
        jPanel_choosedataset1.add(jButton_loaduserid);
        jButton_loaduserid.setBounds(30, 100, 120, 30);

        jComboBox_userid.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jComboBox_userid.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox_userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_useridActionPerformed(evt);
            }
        });
        jPanel_choosedataset1.add(jComboBox_userid);
        jComboBox_userid.setBounds(180, 100, 150, 30);

        jButton_getdata.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_getdata.setForeground(new java.awt.Color(0, 51, 204));
        jButton_getdata.setText("User Interest");
        jButton_getdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_getdataActionPerformed(evt);
            }
        });
        jPanel_choosedataset1.add(jButton_getdata);
        jButton_getdata.setBounds(120, 150, 130, 30);

        jButton_city.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_city.setForeground(new java.awt.Color(0, 51, 204));
        jButton_city.setText("Load City");
        jButton_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cityActionPerformed(evt);
            }
        });
        jPanel_choosedataset1.add(jButton_city);
        jButton_city.setBounds(30, 50, 120, 30);

        jComboBox_city.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jComboBox_city.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_cityActionPerformed(evt);
            }
        });
        jPanel_choosedataset1.add(jComboBox_city);
        jComboBox_city.setBounds(180, 50, 150, 30);

        jButton_getdata1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_getdata1.setForeground(new java.awt.Color(0, 51, 204));
        jButton_getdata1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/urbanbehaviour/pop.png"))); // NOI18N
        jButton_getdata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_getdata1ActionPerformed(evt);
            }
        });
        jPanel_choosedataset1.add(jButton_getdata1);
        jButton_getdata1.setBounds(130, 390, 100, 50);

        jPanel_main.add(jPanel_choosedataset1);
        jPanel_choosedataset1.setBounds(430, 70, 360, 450);

        jLabel_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/attentive-boy-looking-sprout-magnifying-glass-little-scientist-calm-clever-enthusiastic-pupil-feeling-interested-112807793.jpg"))); // NOI18N
        jPanel_main.add(jLabel_bg);
        jLabel_bg.setBounds(0, 0, 800, 534);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_featureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_featureActionPerformed

        if(rcount == 1)
        {
            try
            {
                rs = stmt.executeQuery("SELECT Venue_catgname, count(*) as 'TimesVisited' FROM `nyc_data` GROUP BY Venue_catgname ORDER BY count(*) DESC");
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
                jTable_preview.setModel(model);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        if(rcount == 2)
        {
            try
            {
                rs = stmt.executeQuery("SELECT Venue_catgname, count(*) as 'TimesVisited' FROM `tky_data` GROUP BY Venue_catgname ORDER BY count(*) DESC");
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
                jTable_preview.setModel(model);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
        if(rcount == 0)
        {
            JOptionPane.showMessageDialog(this, "Select City");
        }
        
    }//GEN-LAST:event_jButton_featureActionPerformed

    private void jRadioButton_tkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_tkyActionPerformed

        if(jRadioButton_tky.isSelected())
        {
            rcount = 2;
            jRadioButton_nyc.setSelected(false);
        }
        else if(jRadioButton_nyc.isSelected())
        {
            rcount = 1;
            jRadioButton_tky.setSelected(false);
        }
       

    }//GEN-LAST:event_jRadioButton_tkyActionPerformed

    private void jRadioButton_nycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_nycActionPerformed

        if(jRadioButton_nyc.isSelected())
        {
            rcount = 1;
            jRadioButton_tky.setSelected(false);
        }
        else if(jRadioButton_tky.isSelected())
        {
            rcount = 2;
            jRadioButton_nyc.setSelected(false);
        }

    }//GEN-LAST:event_jRadioButton_nycActionPerformed

    private void jButton_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refreshActionPerformed
        
        model.setColumnCount(0);
        model.setRowCount(0);
    }//GEN-LAST:event_jButton_refreshActionPerformed

    private void jTable_previewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_previewMouseClicked
        
        
    }//GEN-LAST:event_jTable_previewMouseClicked

    private void jTable_userdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_userdataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_userdataMouseClicked

    private void jButton_loaduseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loaduseridActionPerformed
        
        jComboBox_userid.removeAllItems();
        jComboBox_userid.addItem("Select User ID");
        if(cityval == 1)
        {
            try 
            {
                rs = stmt.executeQuery("SELECT DISTINCT User_id FROM `pre_nycdata` ORDER BY User_id");
                while(rs.next())
                {
                    String comboval = rs.getString(1);
                    jComboBox_userid.addItem(comboval);
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        
        if(cityval == 2)
        {
            try 
            {
                rs = stmt.executeQuery("SELECT DISTINCT User_id FROM `pre_tkydata` ORDER BY User_id");
                while(rs.next())
                {
                    String comboval = rs.getString(1);
                    jComboBox_userid.addItem(comboval);
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_jButton_loaduseridActionPerformed

    private void jComboBox_useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_useridActionPerformed
       
        getuserid = (String) jComboBox_userid.getSelectedItem();
    }//GEN-LAST:event_jComboBox_useridActionPerformed

    private void jButton_getdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_getdataActionPerformed
        
        
        System.out.println("user id "+getuserid);  
        System.out.println("cityvalue "+cityval);  
        
        if(cityval == 1)
        {
            try
            {
                rs1 = stmt1.executeQuery("SELECT Venue_catgname, count(*) as VisitTimes FROM `pre_nycdata` WHERE User_id ='"+getuserid+"' GROUP BY Venue_catgname ORDER BY count(*) DESC");
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
                jTable_userdata.setModel(model1);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }   
        }
        if(cityval == 2)
        {
            try
            {
                rs1 = stmt1.executeQuery("SELECT Venue_catgname, count(*) FROM `pre_tkydata` WHERE User_id ='"+getuserid+"' GROUP BY Venue_catgname ORDER BY count(*) DESC");
                rsmd=rs1.getMetaData();
                int columns= rsmd.getColumnCount();
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
                jTable_userdata.setModel(model1);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
                
    }//GEN-LAST:event_jButton_getdataActionPerformed

    private void jButton_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cityActionPerformed
        
        jComboBox_city.removeAllItems();
        jComboBox_city.addItem("Select City");
        jComboBox_city.addItem("New York");
        jComboBox_city.addItem("Tokyo");
        
    }//GEN-LAST:event_jButton_cityActionPerformed

    private void jComboBox_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_cityActionPerformed
       
        
        comctyval = (String) jComboBox_city.getSelectedItem();
        if(comctyval.equals("New York"))
        {
            cityval = 1;
        }
        if(comctyval.equals("Tokyo"))
        {
            cityval = 2;
        }
        
        System.out.println(comctyval);
    }//GEN-LAST:event_jComboBox_cityActionPerformed

    private void jButton_getdata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_getdata1ActionPerformed
        
        Similarity s = new Similarity();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_getdata1ActionPerformed

  
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new userinterest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_city;
    private javax.swing.JButton jButton_feature;
    private javax.swing.JButton jButton_getdata;
    private javax.swing.JButton jButton_getdata1;
    private javax.swing.JButton jButton_loaduserid;
    private javax.swing.JButton jButton_refresh;
    private javax.swing.JComboBox<String> jComboBox_city;
    private javax.swing.JComboBox<String> jComboBox_userid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_bg;
    private javax.swing.JLabel jLabel_title1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_choosedataset;
    private javax.swing.JPanel jPanel_choosedataset1;
    private javax.swing.JPanel jPanel_main;
    private javax.swing.JRadioButton jRadioButton_nyc;
    private javax.swing.JRadioButton jRadioButton_tky;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_preview;
    private javax.swing.JTable jTable_userdata;
    // End of variables declaration//GEN-END:variables
}
