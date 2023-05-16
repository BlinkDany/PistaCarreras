package Vista;

import Clases.Corredor;
import Clases.Cronometro;
import java.awt.Point;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PistaCarreras extends javax.swing.JFrame {

    public PistaCarreras() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("ASPHALT BIKER 10");
        btnRea.setVisible(true);
    }

    Corredor corredor1 = new Corredor();
    Corredor corredor2 = new Corredor();
    Corredor corredor3 = new Corredor();
    Corredor corredor4 = new Corredor();

    Crono c = new Crono();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTiempo = new javax.swing.JLabel();
        lblCorredor1 = new javax.swing.JLabel();
        lblCorredor2 = new javax.swing.JLabel();
        lblCorredor3 = new javax.swing.JLabel();
        lblCorredor4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        btnReiniciar = new LIB.FSButtonMD();
        btnInicar = new LIB.FSButtonMD();
        btnPau = new LIB.FSButtonMD();
        btnRea = new LIB.FSButtonMD();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 171, 105));

        jLabel1.setBackground(new java.awt.Color(2, 240, 240));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ASPHALT BIKER 10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTiempo.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setText("00:00:00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 420, 70));

        lblCorredor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/3 50.png"))); // NOI18N
        jPanel2.add(lblCorredor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        lblCorredor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/4 50.png"))); // NOI18N
        jPanel2.add(lblCorredor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        lblCorredor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tipo sin fondo_edited.PNG"))); // NOI18N
        jPanel2.add(lblCorredor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        lblCorredor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/1 50.png"))); // NOI18N
        jPanel2.add(lblCorredor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Road-bitumen-clipart-by-megapixl.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 640, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Road-bitumen-clipart-by-megapixl.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 640, 160));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/start250.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 190, 150, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 20, 320));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/llegada300.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setColorNormal(new java.awt.Color(0, 153, 204));
        btnReiniciar.setColorPressed(new java.awt.Color(0, 153, 204));
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        jPanel2.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, -1, -1));

        btnInicar.setText("Iniciar");
        btnInicar.setColorPressed(new java.awt.Color(0, 204, 51));
        btnInicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicarActionPerformed(evt);
            }
        });
        jPanel2.add(btnInicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

        btnPau.setText("Pausar");
        btnPau.setColorNormal(new java.awt.Color(255, 0, 0));
        btnPau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauActionPerformed(evt);
            }
        });
        jPanel2.add(btnPau, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        btnRea.setText("Reanudar");
        btnRea.setColorNormal(new java.awt.Color(153, 153, 255));
        btnRea.setColorPressed(new java.awt.Color(153, 153, 255));
        btnRea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReaMouseClicked(evt);
            }
        });
        jPanel2.add(btnRea, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/wallhaven-6kww78.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, 70, 1610, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicarActionPerformed
        // TODO add your handling code here:

        corredor1.setEtiqueta(lblCorredor1);
        corredor2.setEtiqueta(lblCorredor2);
        corredor3.setEtiqueta(lblCorredor3);
        corredor4.setEtiqueta(lblCorredor4);

        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();

        c.setVisible(true);
    }//GEN-LAST:event_btnInicarActionPerformed

    private void btnPauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauActionPerformed
        // TODO add your handling code here:
        corredor1.pausar();
        corredor2.pausar();
        corredor3.pausar();
        corredor4.pausar();

        c.Pau();
        btnRea.setVisible(true);
        btnPau.setVisible(false);

    }//GEN-LAST:event_btnPauActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnReaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReaMouseClicked
        // TODO add your handling code here:
        corredor1.reanudar();
        corredor2.reanudar();
        corredor3.reanudar();
        corredor4.reanudar();

        c.Rea();
        btnRea.setVisible(false);
        btnPau.setVisible(true);
    }//GEN-LAST:event_btnReaMouseClicked

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
            java.util.logging.Logger.getLogger(PistaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PistaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PistaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PistaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PistaCarreras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD btnInicar;
    private LIB.FSButtonMD btnPau;
    private LIB.FSButtonMD btnRea;
    private LIB.FSButtonMD btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCorredor1;
    private javax.swing.JLabel lblCorredor2;
    private javax.swing.JLabel lblCorredor3;
    private javax.swing.JLabel lblCorredor4;
    private javax.swing.JLabel lblTiempo;
    // End of variables declaration//GEN-END:variables
}
