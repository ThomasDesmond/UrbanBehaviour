
package urbanbehaviour;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;


public class performance extends javax.swing.JFrame 
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
    String a;
    public performance() 
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

        jPanel_main = new javax.swing.JPanel();
        jLabel_title1 = new javax.swing.JLabel();
        jPanel_choosedataset = new javax.swing.JPanel();
        jButton_taggeddata = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_preview = new javax.swing.JTable();
        jPanel_userdetails = new javax.swing.JPanel();
        jLabel_fileformat = new javax.swing.JLabel();
        jLabel_fileformat1 = new javax.swing.JLabel();
        jTextField_lat = new javax.swing.JTextField();
        jTextField_long = new javax.swing.JTextField();
        jButton_getdata = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_taggeddata = new javax.swing.JList<>();
        jLabel_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_main.setLayout(null);

        jLabel_title1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title1.setText("Modeling Urban Behavior by Mining Geotagged Social Data");
        jPanel_main.add(jLabel_title1);
        jLabel_title1.setBounds(70, 10, 660, 40);

        jPanel_choosedataset.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New York City - Geotagged Data", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel_choosedataset.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_choosedataset.setOpaque(false);
        jPanel_choosedataset.setLayout(null);

        jButton_taggeddata.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_taggeddata.setForeground(new java.awt.Color(0, 51, 204));
        jButton_taggeddata.setText("Tagged Data");
        jButton_taggeddata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_taggeddataActionPerformed(evt);
            }
        });
        jPanel_choosedataset.add(jButton_taggeddata);
        jButton_taggeddata.setBounds(70, 60, 131, 30);

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
        jScrollPane1.setBounds(270, 60, 450, 200);

        jPanel_userdetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Geographical Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel_userdetails.setForeground(new java.awt.Color(0, 51, 204));
        jPanel_userdetails.setOpaque(false);

        jLabel_fileformat.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel_fileformat.setText("Latitude");
        jLabel_fileformat.setOpaque(true);

        jLabel_fileformat1.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel_fileformat1.setText("Longitude");
        jLabel_fileformat1.setOpaque(true);

        jTextField_lat.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jTextField_lat.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField_long.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jTextField_long.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jButton_getdata.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_getdata.setForeground(new java.awt.Color(0, 51, 204));
        jButton_getdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/urbanbehaviour/pop.png"))); // NOI18N
        jButton_getdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_getdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_userdetailsLayout = new javax.swing.GroupLayout(jPanel_userdetails);
        jPanel_userdetails.setLayout(jPanel_userdetailsLayout);
        jPanel_userdetailsLayout.setHorizontalGroup(
            jPanel_userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_userdetailsLayout.createSequentialGroup()
                .addGroup(jPanel_userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_userdetailsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_getdata, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_userdetailsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel_userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_fileformat, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_fileformat1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel_userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_lat, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jTextField_long))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel_userdetailsLayout.setVerticalGroup(
            jPanel_userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_userdetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_lat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_fileformat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel_userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_fileformat1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_long, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_getdata, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel_choosedataset.add(jPanel_userdetails);
        jPanel_userdetails.setBounds(270, 270, 450, 180);

        jList_taggeddata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_taggeddataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList_taggeddata);

        jPanel_choosedataset.add(jScrollPane2);
        jScrollPane2.setBounds(40, 110, 200, 340);

        jPanel_main.add(jPanel_choosedataset);
        jPanel_choosedataset.setBounds(20, 70, 760, 460);

        jLabel_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/globe.jpg"))); // NOI18N
        jPanel_main.add(jLabel_bg);
        jLabel_bg.setBounds(0, 0, 1100, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_taggeddataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_taggeddataActionPerformed

           try 
            {
                DefaultListModel list=new DefaultListModel();
                rs=stmt.executeQuery("SELECT Venue_catgname FROM `nyc_data` GROUP BY Venue_catgname ASC");
                while(rs.next())
                {
                    String a=rs.getString(1);
                    list.addElement(a);
                }
                jList_taggeddata.setModel(list);
            } 
           catch (Exception e) 
            {
                e.printStackTrace();
            }
              
    }//GEN-LAST:event_jButton_taggeddataActionPerformed

    private void jTable_previewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_previewMouseClicked
        
        try 
        {
            int row = jTable_preview.rowAtPoint(evt.getPoint());
            int col = jTable_preview.columnAtPoint(evt.getPoint());
            String lat=jTable_preview.getValueAt(row, 4).toString();
            String lon=jTable_preview.getValueAt(row, 5).toString();
            jTextField_lat.setBackground(Color.GREEN);
            jTextField_lat.setText(lat);
            jTextField_long.setBackground(Color.GREEN);
            jTextField_long.setText(lon);
            Desktop des=Desktop.getDesktop();
            //String ur="https://maps.googleapis.com/maps/api/staticmap?center=" + lat + "," + lon    + "&zoom=11&size=612x612&scale=2&maptype=roadmap";                          
             String ur="https://www.google.com/maps/@"+lat+","+ lon+ ",13z";
            des.browse(URI.create(ur));
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jTable_previewMouseClicked

    private void jList_taggeddataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_taggeddataMouseClicked
       
        String listval = jList_taggeddata.getSelectedValue().toString();
         try
            {
                rs = stmt.executeQuery("SELECT * FROM `nyc_data` WHERE Venue_catgname='"+listval+"'");
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
    }//GEN-LAST:event_jList_taggeddataMouseClicked

    private void jButton_getdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_getdataActionPerformed

        perf_tky pf = new perf_tky();
        pf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_getdataActionPerformed

  
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new performance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_getdata;
    private javax.swing.JButton jButton_taggeddata;
    private javax.swing.JLabel jLabel_bg;
    private javax.swing.JLabel jLabel_fileformat;
    private javax.swing.JLabel jLabel_fileformat1;
    private javax.swing.JLabel jLabel_title1;
    private javax.swing.JList<String> jList_taggeddata;
    private javax.swing.JPanel jPanel_choosedataset;
    private javax.swing.JPanel jPanel_main;
    private javax.swing.JPanel jPanel_userdetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_preview;
    private javax.swing.JTextField jTextField_lat;
    private javax.swing.JTextField jTextField_long;
    // End of variables declaration//GEN-END:variables
}
