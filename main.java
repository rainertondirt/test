/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6.GUI1;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS X505ZA
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        tfSoto.setEditable(false);
        tfRawon.setEditable(false);
        tfGudeg.setEditable(false);
        tfBakso.setEditable(false);
        tfHitung.setEditable(false);
        JOptionPane.showMessageDialog(rootPane, "Selamat Datang");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        cbSoto = new javax.swing.JCheckBox();
        cbRawon = new javax.swing.JCheckBox();
        cbBakso = new javax.swing.JCheckBox();
        cbGudeg = new javax.swing.JCheckBox();
        lblJudul = new javax.swing.JLabel();
        tfSoto = new javax.swing.JTextField();
        tfRawon = new javax.swing.JTextField();
        tfBakso = new javax.swing.JTextField();
        tfGudeg = new javax.swing.JTextField();
        lblHitung = new javax.swing.JLabel();
        tfHitung = new javax.swing.JTextField();
        btHitung = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfBayar = new javax.swing.JTextField();
        btBayar = new javax.swing.JButton();
        tfKembalian = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbSoto.setText("Soto : 5000");
        cbSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSotoActionPerformed(evt);
            }
        });

        cbRawon.setText("Rawon : 6000");
        cbRawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRawonActionPerformed(evt);
            }
        });

        cbBakso.setText("Bakso : 4000");
        cbBakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBaksoActionPerformed(evt);
            }
        });

        cbGudeg.setText("Gudeg : 8000");
        cbGudeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGudegActionPerformed(evt);
            }
        });

        lblJudul.setFont(new java.awt.Font("TOMMY HILFIGER AF", 1, 24)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(255, 153, 0));
        lblJudul.setText("MENU MAKANAN");

        tfSoto.setText("0");
        tfSoto.setToolTipText("");
        tfSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSotoActionPerformed(evt);
            }
        });

        tfRawon.setText("0");
        tfRawon.setToolTipText("");
        tfRawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRawonActionPerformed(evt);
            }
        });

        tfBakso.setText("0");

        tfGudeg.setText("0");

        lblHitung.setText("Hitung :");

        btHitung.setText("Hitung");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Bayar :");

        tfBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBayarActionPerformed(evt);
            }
        });

        btBayar.setText("Bayar");
        btBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBayarActionPerformed(evt);
            }
        });

        tfKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKembalianActionPerformed(evt);
            }
        });

        jLabel2.setText("Kembalian :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfRawon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbSoto)
                            .addGap(52, 52, 52)
                            .addComponent(tfSoto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbRawon)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbBakso)
                                    .addGap(48, 48, 48)
                                    .addComponent(tfBakso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cbGudeg)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(lblHitung)
                                                .addComponent(jLabel2))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfKembalian)
                                        .addComponent(tfGudeg, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(tfHitung)
                                        .addComponent(tfBayar)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btHitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(lblJudul)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblJudul)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSoto)
                    .addComponent(tfSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRawon)
                    .addComponent(tfRawon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBakso)
                    .addComponent(tfBakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGudeg)
                    .addComponent(tfGudeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHitung))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHitung)
                    .addComponent(btClear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBayar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfRawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRawonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRawonActionPerformed

    private void cbSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSotoActionPerformed
        // TODO add your handling code here:
        if (cbSoto.isSelected()== true){
            tfSoto.setEditable(true);
        }else {
            tfSoto.setEditable(false);
            tfSoto.setText("");
        }
    }//GEN-LAST:event_cbSotoActionPerformed

    private void cbRawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRawonActionPerformed
        // TODO add your handling code here:
        if (cbRawon.isSelected()== true){
            tfRawon.setEditable(true);
        }else {
            tfRawon.setEditable(false);
            tfRawon.setText("");
    }//GEN-LAST:event_cbRawonActionPerformed
        
    }    
    private void cbBaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBaksoActionPerformed
        // TODO add your handling code here:
        if (cbBakso.isSelected()== true){
            tfBakso.setEditable(true);
        }else {
            tfBakso.setEditable(false);
            tfBakso.setText("");
    }//GEN-LAST:event_cbBaksoActionPerformed

    }
    private void cbGudegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGudegActionPerformed
        // TODO add your handling code here:
        if (cbGudeg.isSelected()== true){
            tfGudeg.setEditable(true);
        }else {
            tfGudeg.setEditable(false);
            tfGudeg.setText("");
    }//GEN-LAST:event_cbGudegActionPerformed

    }
    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        cbSoto.setSelected(false);
        cbBakso.setSelected(false);
        cbRawon.setSelected(false);
        cbGudeg.setSelected(false);
        tfSoto.setText("");
        tfRawon.setText("");
        tfBakso.setText("");
        tfGudeg.setText("");
        tfHitung.setText("");
        tfBayar.setText("");
        tfKembalian.setText("");
    }//GEN-LAST:event_btClearActionPerformed

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
        // TODO add your handling code here:
        int hitung,soto,bakso,rawon,gudeg;
        soto = 5000;
        rawon = 6000;
        bakso = 4000;
        gudeg = 8000;
        hitung = Integer.parseInt(tfSoto.getText())*soto+
                 Integer.parseInt(tfRawon.getText())*rawon+
                 Integer.parseInt(tfBakso.getText())*bakso+
                 Integer.parseInt(tfGudeg.getText())*gudeg;
        tfHitung.setText(String.valueOf(hitung));
    }//GEN-LAST:event_btHitungActionPerformed

    private void tfSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSotoActionPerformed

    private void tfBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBayarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfBayarActionPerformed

    private void tfKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKembalianActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfKembalianActionPerformed

    private void btBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBayarActionPerformed
        // TODO add your handling code here:
        int kembalian;
        kembalian = Integer.parseInt (tfBayar.getText()) - Integer.parseInt(tfHitung.getText());
        tfKembalian.setText(String.valueOf(kembalian));
        if (kembalian<0) {
            JOptionPane.showMessageDialog(rootPane, "Uang anda kurang");
    }
    }//GEN-LAST:event_btBayarActionPerformed
        
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBayar;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btHitung;
    private javax.swing.JCheckBox cbBakso;
    private javax.swing.JCheckBox cbGudeg;
    private javax.swing.JCheckBox cbRawon;
    private javax.swing.JCheckBox cbSoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblHitung;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JTextField tfBakso;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfGudeg;
    private javax.swing.JTextField tfHitung;
    private javax.swing.JTextField tfKembalian;
    private javax.swing.JTextField tfRawon;
    private javax.swing.JTextField tfSoto;
    // End of variables declaration//GEN-END:variables
}
