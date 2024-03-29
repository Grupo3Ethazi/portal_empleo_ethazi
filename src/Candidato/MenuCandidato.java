package Candidato;

import inicioSesion.ConexionSQL;
import inicioSesion.errorSesion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class MenuCandidato extends JFrame  {

    /**
     * Creates new form ConsultarSolicitudes
     */
    public MenuCandidato() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelConsultarOfertas = new javax.swing.JLabel();
        jLabelBuscarOfertas = new javax.swing.JLabel();
        jLabelConsultarSolicitudes = new javax.swing.JLabel();
        jLabelActualizarCurriculum = new javax.swing.JLabel();
        jLabelConocimientos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscarEmpleo = new javax.swing.JButton();
        jButtonConsultarOfertas = new javax.swing.JButton();
        jButtonConsultarSolicitudes = new javax.swing.JButton();
        jButtonActualizarCurriculum = new javax.swing.JButton();
        jButtonConocimientosDemandados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Candidato");

        jLabelConsultarOfertas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelConsultarOfertas.setText("Consultar Ofertas:");

        jLabelBuscarOfertas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBuscarOfertas.setText("Buscar ofertas de empleo:");

        jLabelConsultarSolicitudes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelConsultarSolicitudes.setText("Consultar Solicitudes:");

        jLabelActualizarCurriculum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelActualizarCurriculum.setText("Actualizar Curriculum:");

        jLabelConocimientos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelConocimientos.setText("Conocimientos más Demandados:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione la operacion a realizar:");

        jButtonBuscarEmpleo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBuscarEmpleo.setText("Seleccionar");
        jButtonBuscarEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarEmpleoActionPerformed(evt);
            }
        });

        jButtonConsultarOfertas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonConsultarOfertas.setText("Seleccionar");
        jButtonConsultarOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarOfertasActionPerformed(evt);
            }
        });

        jButtonConsultarSolicitudes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonConsultarSolicitudes.setText("Seleccionar");
        jButtonConsultarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarSolicitudesActionPerformed(evt);
            }
        });

        jButtonActualizarCurriculum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonActualizarCurriculum.setText("Seleccionar");
        jButtonActualizarCurriculum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarCurriculumActionPerformed(evt);
            }
        });

        jButtonConocimientosDemandados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonConocimientosDemandados.setText("Seleccionar");
        jButtonConocimientosDemandados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConocimientosDemandadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelConocimientos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jButtonConocimientosDemandados))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelActualizarCurriculum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonActualizarCurriculum))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelConsultarSolicitudes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConsultarSolicitudes))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelConsultarOfertas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConsultarOfertas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelBuscarOfertas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBuscarEmpleo)))
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBuscarOfertas)
                    .addComponent(jButtonBuscarEmpleo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultarOfertas)
                    .addComponent(jButtonConsultarOfertas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultarSolicitudes)
                    .addComponent(jButtonConsultarSolicitudes))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelActualizarCurriculum)
                    .addComponent(jButtonActualizarCurriculum))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConocimientos)
                    .addComponent(jButtonConocimientosDemandados))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarEmpleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarEmpleoActionPerformed
         
         BuscarOferta b1=new BuscarOferta();
         ConexionSQL mysql=new ConexionSQL();
         Connection co=mysql.Conectar();
           
         b1.setVisible(true);
         
         
   
    }//GEN-LAST:event_jButtonBuscarEmpleoActionPerformed

    private void jButtonConsultarOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarOfertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarOfertasActionPerformed

    private void jButtonConsultarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarSolicitudesActionPerformed
        SolicitudesEmitidas s1=new SolicitudesEmitidas();
        ConexionSQL mysql=new ConexionSQL();
        Connection co=mysql.Conectar();
           
        s1.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarSolicitudesActionPerformed

    private void jButtonConocimientosDemandadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConocimientosDemandadosActionPerformed
        ConocerConocimientosMasDemandados c1=new ConocerConocimientosMasDemandados();
        ConexionSQL mysql=new ConexionSQL();
        Connection co=mysql.Conectar();
           
        c1.setVisible(true);
        
    }//GEN-LAST:event_jButtonConocimientosDemandadosActionPerformed

    private void jButtonActualizarCurriculumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarCurriculumActionPerformed
        ConexionSQL mysql=new ConexionSQL();
        Connection co=mysql.Conectar();
        //Salta a la ventana de DNI
        PedirDni pDNI=new PedirDni();
        pDNI.setVisible(true);

    }//GEN-LAST:event_jButtonActualizarCurriculumActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCandidato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarCurriculum;
    private javax.swing.JButton jButtonBuscarEmpleo;
    private javax.swing.JButton jButtonConocimientosDemandados;
    private javax.swing.JButton jButtonConsultarOfertas;
    private javax.swing.JButton jButtonConsultarSolicitudes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelActualizarCurriculum;
    private javax.swing.JLabel jLabelBuscarOfertas;
    private javax.swing.JLabel jLabelConocimientos;
    private javax.swing.JLabel jLabelConsultarOfertas;
    private javax.swing.JLabel jLabelConsultarSolicitudes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
