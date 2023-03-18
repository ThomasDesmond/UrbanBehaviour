
package urbanbehaviour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;


public class processNYC extends javax.swing.JFrame 
{
    Vector columnNames =new Vector();
    Vector data=new Vector();
    Connection con = null;
    Statement stmt,stmt1 = null;
    ResultSet rs, rs1;
    ResultSetMetaData rsmd;
    List preprocess = new ArrayList();
    String url = "jdbc:mysql://localhost:3306/urbanbehaviour";
    String path;
    List processHdfs = new ArrayList();
    String spath, dpath;
    long exetime;
    public static File inputFiles;
    int rcount = 0;
    
    public processNYC() 
    {
        initComponents();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            System.out.println("Preprocess_NYC : DB Connection Success");
            
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
        jPanel_choosedataset = new javax.swing.JPanel();
        jButton_preprocess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_preview = new javax.swing.JTable();
        jLabel_next = new javax.swing.JLabel();
        jButton_viewdata = new javax.swing.JButton();
        jLabel_title1 = new javax.swing.JLabel();
        jLabel_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_main.setLayout(null);

        jPanel_choosedataset.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preprocess NYC Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel_choosedataset.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_choosedataset.setOpaque(false);
        jPanel_choosedataset.setLayout(null);

        jButton_preprocess.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_preprocess.setForeground(new java.awt.Color(0, 51, 204));
        jButton_preprocess.setText("Preprocess");
        jButton_preprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_preprocessActionPerformed(evt);
            }
        });
        jPanel_choosedataset.add(jButton_preprocess);
        jButton_preprocess.setBounds(40, 140, 130, 30);

        jTable_preview.setBackground(new java.awt.Color(204, 204, 255));
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
        jScrollPane1.setViewportView(jTable_preview);

        jPanel_choosedataset.add(jScrollPane1);
        jScrollPane1.setBounds(204, 61, 530, 370);

        jLabel_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/res.png"))); // NOI18N
        jLabel_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_nextMouseClicked(evt);
            }
        });
        jPanel_choosedataset.add(jLabel_next);
        jLabel_next.setBounds(60, 260, 140, 90);

        jButton_viewdata.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_viewdata.setForeground(new java.awt.Color(0, 51, 204));
        jButton_viewdata.setText("View Data");
        jButton_viewdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewdataActionPerformed(evt);
            }
        });
        jPanel_choosedataset.add(jButton_viewdata);
        jButton_viewdata.setBounds(40, 210, 130, 30);

        jPanel_main.add(jPanel_choosedataset);
        jPanel_choosedataset.setBounds(30, 60, 750, 450);

        jLabel_title1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title1.setText("Modeling Urban Behavior by Mining Geotagged Social Data");
        jPanel_main.add(jLabel_title1);
        jLabel_title1.setBounds(60, 0, 660, 40);

        jLabel_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/new-york-city-gettyimages-1269226133.jpg"))); // NOI18N
        jPanel_main.add(jLabel_bg);
        jLabel_bg.setBounds(0, 0, 1120, 580);

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

    private void jButton_preprocessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_preprocessActionPerformed

       try 
        {
            stmt.executeUpdate("TRUNCATE TABLE pre_nycdata");
            stmt.executeUpdate("INSERT into pre_nycdata SELECT * FROM `nyc_data`");
            

            JOptionPane.showMessageDialog(this, "Preprocess Done Successfully");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_jButton_preprocessActionPerformed

    private void jLabel_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_nextMouseClicked
        
        processTKY pt = new processTKY();
        pt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel_nextMouseClicked

    private void jButton_viewdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewdataActionPerformed

       
        try
        {
            rs = stmt.executeQuery("SELECT * from pre_nycdata");
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
            DefaultTableModel model=new DefaultTableModel(data, columnNames);
            jTable_preview.setModel(model);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_viewdataActionPerformed

  
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new processNYC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_preprocess;
    private javax.swing.JButton jButton_viewdata;
    private javax.swing.JLabel jLabel_bg;
    private javax.swing.JLabel jLabel_next;
    private javax.swing.JLabel jLabel_title1;
    private javax.swing.JPanel jPanel_choosedataset;
    private javax.swing.JPanel jPanel_main;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_preview;
    // End of variables declaration//GEN-END:variables
}
