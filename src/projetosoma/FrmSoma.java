/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetosoma;

import java.lang.ref.Cleaner;
import javax.swing.JTextField;

/**
 *
 * @author caio.alunos
 */
public class FrmSoma extends javax.swing.JFrame {

  
    public FrmSoma() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnlimpar = new javax.swing.JButton();
        btncalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jvalor1 = new javax.swing.JTextField();
        jtotal = new javax.swing.JTextField();
        jvalor2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai Light", 0, 24)); // NOI18N
        jLabel1.setText("Projeto Soma");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 147, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Valor 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Total:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 20));

        btnlimpar.setBackground(new java.awt.Color(255, 51, 51));
        btnlimpar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnlimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnlimpar.setText("Limpar");
        btnlimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 147, 56));

        btncalcular.setBackground(new java.awt.Color(153, 255, 255));
        btncalcular.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btncalcular.setForeground(new java.awt.Color(0, 0, 0));
        btncalcular.setText("Calcular");
        btncalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btncalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 147, 56));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Valor 2:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));
        getContentPane().add(jvalor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 50, -1));

        jtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtotalActionPerformed(evt);
            }
        });
        getContentPane().add(jtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 50, -1));

        jvalor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvalor2ActionPerformed(evt);
            }
        });
        getContentPane().add(jvalor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtotalActionPerformed

    private void jvalor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvalor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvalor2ActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        double valor1, valor2, total;
        
        valor1=Double.parseDouble(jvalor1.getText());
        valor2=Double.parseDouble(jvalor2.getText());
        
        total = valor1 + valor2;
        
       
        jtotal.setText(String.valueOf(total));
        
        
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        jvalor1.setText(null);
        jvalor2.setText(null);
        jtotal.setText(null);
    }//GEN-LAST:event_btnlimparActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSoma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtotal;
    private javax.swing.JTextField jvalor1;
    private javax.swing.JTextField jvalor2;
    // End of variables declaration//GEN-END:variables

    private void Cleaner(JTextField jvalor1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
