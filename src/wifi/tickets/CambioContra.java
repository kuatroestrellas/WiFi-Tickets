package wifi.tickets;

import javax.swing.JOptionPane;

public class CambioContra extends javax.swing.JFrame {

    /**
     * Creates new form CambioContra
     */
    public CambioContra() {
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

        Volver = new javax.swing.JButton();
        Generar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ContraseñaActual = new javax.swing.JPasswordField();
        ContraseñaNueva = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        ContraseñaConfirmar = new javax.swing.JPasswordField();
        Volver1 = new javax.swing.JButton();
        Generar1 = new javax.swing.JButton();

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wifi/tickets/icons/arrow-back-icon.png"))); // NOI18N
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wifi/tickets/icons/add-icon.png"))); // NOI18N
        Generar.setText("Generar ticket");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wifi/tickets/icons/Key-icon.png"))); // NOI18N
        jLabel1.setText("Cambio de contraseña");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña actual");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña nueva");

        ContraseñaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActualActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Confirmar contraseña");

        Volver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wifi/tickets/icons/arrow-back-icon.png"))); // NOI18N
        Volver1.setText("Volver");
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });

        Generar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wifi/tickets/icons/add-icon.png"))); // NOI18N
        Generar1.setText("Confirmar");
        Generar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(93, Short.MAX_VALUE)
                        .addComponent(Generar1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ContraseñaConfirmar)
                            .addComponent(ContraseñaNueva)
                            .addComponent(ContraseñaActual, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(87, 87, 87))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(ContraseñaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActualActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed

    }//GEN-LAST:event_VolverActionPerformed

    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        this.setVisible(false);
         new Main().main();
    }//GEN-LAST:event_Volver1ActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed

    }//GEN-LAST:event_GenerarActionPerformed

    private void Generar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generar1ActionPerformed
        if (String.valueOf(CambioContra.ContraseñaActual.getPassword()).length() == 0 || String.valueOf(CambioContra.ContraseñaConfirmar.getPassword()).length() == 0 || String.valueOf(CambioContra.ContraseñaNueva.getPassword()).length() == 0) // Checking for empty field
        {
            JOptionPane.showMessageDialog(null, "¡Los campos no deben estar vacios!");
        }else if(!String.valueOf(CambioContra.ContraseñaNueva.getPassword()).equals(String.valueOf(CambioContra.ContraseñaConfirmar.getPassword()))){
          
            JOptionPane.showMessageDialog(null, "¡La contraseña nueva no coincide con la confirmación!");
        }
        else {
            String Contraseña = String.valueOf(CambioContra.ContraseñaActual.getPassword());
            String ContraseñaNueva = String.valueOf(CambioContra.ContraseñaNueva.getPassword());
            ValidarContra ContraCambio = new ValidarContra();
            if (ContraCambio.ValidarContra(Contraseña,ContraseñaNueva).equals("SI")) {
                JOptionPane.showMessageDialog(null, "La contraseña se cambio exitosamente");
                this.setVisible(false);
                new Main().main();
            } else if (ContraCambio.ValidarContra(Contraseña,ContraseñaNueva).equals("NO")) {
                JOptionPane.showMessageDialog(null, "¡La contraseña actual no es correcta!");
            }
        }
    }//GEN-LAST:event_Generar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CambioContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField ContraseñaActual;
    public static javax.swing.JPasswordField ContraseñaConfirmar;
    public static javax.swing.JPasswordField ContraseñaNueva;
    private javax.swing.JButton Generar;
    private javax.swing.JButton Generar1;
    private javax.swing.JButton Volver;
    private javax.swing.JButton Volver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
