
package urbanbehaviour;

import java.io.BufferedReader;
import java.io.File;
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


public class getdata2 extends javax.swing.JFrame 
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
    public static File inputFiles;
    int rcount = 0;
    
    public getdata2() 
    {
        initComponents();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            System.out.println("Load_TKYData : DB Connection Success");
            
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
        jButton_choosedataBtn = new javax.swing.JButton();
        jTextField_choosedata = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_preview = new javax.swing.JTable();
        jButton_loaddataBtn = new javax.swing.JButton();
        jLabel_next = new javax.swing.JLabel();
        jLabel_title1 = new javax.swing.JLabel();
        jLabel_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_main.setLayout(null);

        jPanel_choosedataset.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TKY Data Loading", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel_choosedataset.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_choosedataset.setOpaque(false);
        jPanel_choosedataset.setLayout(null);

        jButton_choosedataBtn.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_choosedataBtn.setForeground(new java.awt.Color(0, 51, 204));
        jButton_choosedataBtn.setText("Get Data_2");
        jButton_choosedataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_choosedataBtnActionPerformed(evt);
            }
        });
        jPanel_choosedataset.add(jButton_choosedataBtn);
        jButton_choosedataBtn.setBounds(30, 70, 140, 30);

        jTextField_choosedata.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jPanel_choosedataset.add(jTextField_choosedata);
        jTextField_choosedata.setBounds(30, 140, 140, 30);

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

        jButton_loaddataBtn.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton_loaddataBtn.setForeground(new java.awt.Color(0, 51, 204));
        jButton_loaddataBtn.setText("Load Data");
        jButton_loaddataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loaddataBtnActionPerformed(evt);
            }
        });
        jPanel_choosedataset.add(jButton_loaddataBtn);
        jButton_loaddataBtn.setBounds(30, 210, 140, 30);

        jLabel_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/res.png"))); // NOI18N
        jLabel_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_nextMouseClicked(evt);
            }
        });
        jPanel_choosedataset.add(jLabel_next);
        jLabel_next.setBounds(50, 250, 150, 140);

        jPanel_main.add(jPanel_choosedataset);
        jPanel_choosedataset.setBounds(30, 60, 750, 450);

        jLabel_title1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title1.setText("Modeling Urban Behavior by Mining Geotagged Social Data");
        jPanel_main.add(jLabel_title1);
        jLabel_title1.setBounds(70, 10, 660, 40);

        jLabel_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Askusa-and-Tokyo-Skytree-2048x1365.jpg"))); // NOI18N
        jPanel_main.add(jLabel_bg);
        jLabel_bg.setBounds(-160, 0, 970, 810);

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

    private void jButton_choosedataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_choosedataBtnActionPerformed

        try
        {
            JFileChooser fc = new JFileChooser("./Dataset_2/");
            setDefaultCloseOperation(index.EXIT_ON_CLOSE);
            setVisible(true);
            int option = fc.showOpenDialog(this);
            if(option == JFileChooser.APPROVE_OPTION)
            {
                inputFiles = fc.getSelectedFile();
            }
            jTextField_choosedata.setText(inputFiles.getName());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_jButton_choosedataBtnActionPerformed

    private void jButton_loaddataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loaddataBtnActionPerformed

        try
        {
            String newline;
            String spt[];
            BufferedReader br = new BufferedReader(new FileReader(inputFiles));
            stmt1.executeUpdate("TRUNCATE TABLE tky_data");
            while((newline = br.readLine()) != null)
            {
                spt = newline.split(",");
                stmt.executeUpdate("INSERT into tky_data VALUES('" +spt[0]+ "','" +spt[1]+ "','" +spt[2]+ "','" +spt[3]+ "','" +spt[4]+ "','" +spt[5]+ "','" +spt[6]+ "','" +spt[7]+ "')");
            }
            JOptionPane.showMessageDialog(this, "Data Loaded Successfully");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        
        try
        {
            rs = stmt.executeQuery("SELECT * from tky_data");
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

    }//GEN-LAST:event_jButton_loaddataBtnActionPerformed

    private void jLabel_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_nextMouseClicked
        
        processNYC p = new processNYC();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel_nextMouseClicked

  
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new getdata2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_choosedataBtn;
    private javax.swing.JButton jButton_loaddataBtn;
    private javax.swing.JLabel jLabel_bg;
    private javax.swing.JLabel jLabel_next;
    private javax.swing.JLabel jLabel_title1;
    private javax.swing.JPanel jPanel_choosedataset;
    private javax.swing.JPanel jPanel_main;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_preview;
    private javax.swing.JTextField jTextField_choosedata;
    // End of variables declaration//GEN-END:variables
}
