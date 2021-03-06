
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyenhuy
 */
public class ChangeFrame extends javax.swing.JFrame {
    
    DictionaryCommandline change = new DictionaryCommandline();
    /**
     * Creates new form ChangeFrame
     */
    public ChangeFrame() throws FileNotFoundException {
        initComponents();
        this.setLocationRelativeTo(this);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        OldTarget = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        NewTarget = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        NewExplain = new javax.swing.JTextArea();
        ChangeButton = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OldTarget.setColumns(20);
        OldTarget.setRows(5);
        OldTarget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OldTargetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OldTarget);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 270, -1));

        NewTarget.setColumns(20);
        NewTarget.setRows(5);
        NewTarget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewTargetMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(NewTarget);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 260, -1));

        NewExplain.setColumns(20);
        NewExplain.setRows(5);
        NewExplain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewExplainMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(NewExplain);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 260, -1));

        ChangeButton.setBackground(new java.awt.Color(255, 255, 255));
        ChangeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Downloads\\icons8-up-down-arrow-40.png")); // NOI18N
        ChangeButton.setToolTipText("Thay đổi từ");
        ChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 60, 40));

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Downloads\\icons8-exit-40.png")); // NOI18N
        Exit.setToolTipText("Thoát");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 60, 38));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nhập từ mới");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nhập nghĩa mới");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nhập từ cũ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Pictures\\caytre2.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void OldTargetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OldTargetMouseClicked
        OldTarget.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_OldTargetMouseClicked

    private void NewTargetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewTargetMouseClicked
        NewTarget.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_NewTargetMouseClicked

    private void NewExplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewExplainMouseClicked
        NewExplain.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_NewExplainMouseClicked

    private void ChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeButtonActionPerformed
        if(!OldTarget.getText().equals("")){
            if(NewExplain.getText().equals("")){
               NewExplain.setText(change.dictionaryLookUp(OldTarget.getText()));
            }
            if(change.changeSingleWord(OldTarget.getText(), NewTarget.getText(), NewExplain.getText())){
                JOptionPane.showMessageDialog(rootPane, "Bạn vừa thay đổi từ "+ OldTarget.getText());
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Thay đổi thất bại.");
            }
        }
        try {
            change.dictionaryExportToFile();
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(ChangeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChangeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChangeFrame().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ChangeFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeButton;
    private javax.swing.JButton Exit;
    private javax.swing.JTextArea NewExplain;
    private javax.swing.JTextArea NewTarget;
    private javax.swing.JTextArea OldTarget;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
