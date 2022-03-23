/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Entity.Graph2Simon;
import Entity.Graph3Dumitru;
import Tools.ConnexionBDD;
import Tools.FonctionsMetier;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author dim
 */
public class FrmPageStatistique extends javax.swing.JFrame {

    /**
     * Creates new form FrmPageStatistique
     */
    public FrmPageStatistique() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        camenbert2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPRDNavVis = new javax.swing.JButton();
        btnPRDNavReg = new javax.swing.JButton();
        btnPRDNavStats = new javax.swing.JButton();
        btnDeconnexion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCamembertJack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnHistogrammeSimon = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCourbeDumitru = new javax.swing.JButton();

        jLabel4.setText("GRAPHIQUE DU NOMBRE DE REGIONS AU TOTAL PAR SECTEURS");

        camenbert2.setText("VOIR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true)));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion des Visiteurs");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        btnPRDNavVis.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnPRDNavVis.setText("Visiteurs");
        btnPRDNavVis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnPRDNavVis.setPreferredSize(new java.awt.Dimension(160, 29));
        btnPRDNavVis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPRDNavVisMouseClicked(evt);
            }
        });

        btnPRDNavReg.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnPRDNavReg.setText("Régions");
        btnPRDNavReg.setPreferredSize(new java.awt.Dimension(160, 37));
        btnPRDNavReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPRDNavRegMouseClicked(evt);
            }
        });

        btnPRDNavStats.setBackground(new java.awt.Color(255, 204, 0));
        btnPRDNavStats.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnPRDNavStats.setText("Statistiques");
        btnPRDNavStats.setMaximumSize(new java.awt.Dimension(160, 37));
        btnPRDNavStats.setMinimumSize(new java.awt.Dimension(160, 37));
        btnPRDNavStats.setPreferredSize(new java.awt.Dimension(160, 37));

        btnDeconnexion.setText("DECONNEXION");
        btnDeconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeconnexionMouseClicked(evt);
            }
        });

        jLabel2.setText("GRAPHIQUE DU NOMBRE DE REGIONS AU TOTAL PAR SECTEURS");

        btnCamembertJack.setText("VOIR");
        btnCamembertJack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCamembertJackMouseClicked(evt);
            }
        });

        jLabel3.setText("GRAPHIQUE DES 10 REGIONS LES PLUS VISITÉS");

        btnHistogrammeSimon.setText("VOIR");
        btnHistogrammeSimon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistogrammeSimonMouseClicked(evt);
            }
        });

        jLabel5.setText("GRAPHIQUE DE NOMBRE DE VISITEURS PAR DATE D'EMBAUCHE");

        btnCourbeDumitru.setText("VOIR");
        btnCourbeDumitru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCourbeDumitruMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPRDNavReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnPRDNavVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnPRDNavStats, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDeconnexion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCourbeDumitru))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHistogrammeSimon))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(btnCamembertJack)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeconnexion)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPRDNavReg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPRDNavVis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPRDNavStats, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCamembertJack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistogrammeSimon))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCourbeDumitru))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPRDNavVisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPRDNavVisMouseClicked
        // TODO add your handling code here:
        FrmPageVisiteurDefault frm = new FrmPageVisiteurDefault();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPRDNavVisMouseClicked

    private void btnDeconnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnexionMouseClicked
        // TODO add your handling code here:

        FrmPageAccueil frm = new FrmPageAccueil();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDeconnexionMouseClicked

    private void btnPRDNavRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPRDNavRegMouseClicked
        // TODO add your handling code here:
        
        FrmPageRegionDefault frm = new FrmPageRegionDefault();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPRDNavRegMouseClicked

    private void btnCourbeDumitruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCourbeDumitruMouseClicked
        // TODO add your handling code here:
        
        ConnexionBDD bdd = new ConnexionBDD();
        FonctionsMetier fm = new FonctionsMetier();
        
        DefaultCategoryDataset source = new DefaultCategoryDataset();
        for (Graph3Dumitru g3d  : fm.getGraph3())
        {
            source.setValue(g3d.getNbVisiteurs(), "courbe",g3d.getDate());
        }
        System.err.println(source.getRowCount());
        JFreeChart chart3 = ChartFactory.createLineChart("Nombre de visiteurs par date ", "date", "nombre", source);
        ChartFrame fra = new ChartFrame("Graphique nr*3 -- Dumitru", chart3);
        fra.pack();
        fra.setVisible(true);
        
    }//GEN-LAST:event_btnCourbeDumitruMouseClicked

    private void btnHistogrammeSimonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistogrammeSimonMouseClicked
        // TODO add your handling code here:
        
        ConnexionBDD bdd = new ConnexionBDD();
        FonctionsMetier fm = new FonctionsMetier();
        
        DefaultCategoryDataset donnees = new DefaultCategoryDataset();

        for (Graph2Simon dgs : fm.getGraph2())
        {
            //Double prix = Double.parseDouble(((String[])valeur.getValue())[1].toString());
            //String nomTrader = ((String[])valeur.getValue())[0].toString();
            //String nomAction = ((String[])valeur.getValue())[2].toString();
            //donnees.setValue(prix,nomAction,nomTrader);
            donnees.setValue(dgs.getTotal_visiteur(),dgs.getRegion_nom(),"");
        }

        JFreeChart chart1 = ChartFactory.createBarChart(
            "Titre du graphique",
            "",
            "test",
            donnees,
            PlotOrientation.VERTICAL,
            true, true, false);
        ChartFrame frame = new ChartFrame("Graphique n°2 -- Simon", chart1);
        frame.pack();
        frame.setVisible(true);
        
    }//GEN-LAST:event_btnHistogrammeSimonMouseClicked

    private void btnCamembertJackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCamembertJackMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnCamembertJackMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPageStatistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPageStatistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPageStatistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPageStatistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPageStatistique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCamembertJack;
    private javax.swing.JButton btnCourbeDumitru;
    private javax.swing.JButton btnDeconnexion;
    private javax.swing.JButton btnHistogrammeSimon;
    private javax.swing.JButton btnPRDNavReg;
    private javax.swing.JButton btnPRDNavStats;
    private javax.swing.JButton btnPRDNavVis;
    private javax.swing.JButton camenbert2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
