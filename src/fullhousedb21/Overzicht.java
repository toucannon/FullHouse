/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhousedb21;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Suman
 */
public class Overzicht extends javax.swing.JFrame {

    /**
     * Creates new form Overzicht
     */
    public Overzicht() {
        initComponents();
        this.HaalTabelOp();
    }
    
    public void HaalTabelOp(){
        String query = "SELECT plaats, datum, COUNT(speler) AS 'aantal spelers' FROM Toernooi, InschrijvingToernooi WHERE naam = toernooi GROUP BY toernooi";
         Database db = new Database();
        try {
            uitTabel.setModel(db.getFromDatabase(query));
        } catch (SQLException ex) {
            Logger.getLogger(Overzicht.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uitPanel = new javax.swing.JPanel();
        menuUit = new javax.swing.JButton();
        uitPane = new javax.swing.JScrollPane();
        uitTabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uitPanel.setBackground(new java.awt.Color(228, 228, 228));
        uitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Overzicht"));
        uitPanel.setToolTipText("<leeg>");

        menuUit.setText("Terug");
        menuUit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUitActionPerformed(evt);
            }
        });

        uitTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        uitPane.setViewportView(uitTabel);

        javax.swing.GroupLayout uitPanelLayout = new javax.swing.GroupLayout(uitPanel);
        uitPanel.setLayout(uitPanelLayout);
        uitPanelLayout.setHorizontalGroup(
            uitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uitPanelLayout.createSequentialGroup()
                .addGroup(uitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uitPanelLayout.createSequentialGroup()
                        .addComponent(menuUit)
                        .addGap(0, 781, Short.MAX_VALUE))
                    .addGroup(uitPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(uitPane)))
                .addContainerGap())
        );
        uitPanelLayout.setVerticalGroup(
            uitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uitPanelLayout.createSequentialGroup()
                .addComponent(menuUit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUitActionPerformed
        setVisible(false);              
        JFrame frame = new Keuzemenu(); //gaat terug naar het keuzemenu
        frame.setVisible(true);         
    }//GEN-LAST:event_menuUitActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton menuUit;
    private javax.swing.JScrollPane uitPane;
    private javax.swing.JPanel uitPanel;
    private javax.swing.JTable uitTabel;
    // End of variables declaration//GEN-END:variables
}
