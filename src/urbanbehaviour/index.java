
package urbanbehaviour;

import javax.swing.UIManager;


public class index extends javax.swing.JFrame 
{

    public index() 
    {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_main = new javax.swing.JPanel();
        jLabel_title1 = new javax.swing.JLabel();
        jLabel_next = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_main.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_title1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title1.setText("Modeling Urban Behavior by Mining Geotagged Social Data");
        jPanel_main.add(jLabel_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 660, 40));

        jLabel_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/res.png"))); // NOI18N
        jLabel_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_nextMouseClicked(evt);
            }
        });
        jPanel_main.add(jLabel_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 110, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/jonathan-riley-vw8mubhyxcu-unsplash.jpg"))); // NOI18N
        jPanel_main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_nextMouseClicked

        getdata g = new getdata();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel_nextMouseClicked

  
    public static void main(String args[]) 
    {
        try 
        {
            
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            new index().setVisible(true);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_next;
    private javax.swing.JLabel jLabel_title1;
    private javax.swing.JPanel jPanel_main;
    // End of variables declaration//GEN-END:variables
}
