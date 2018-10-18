
import com.darkprograms.speech.synthesiser.Synthesiser;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.lang.*;
import java.util.Collection;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nguyenhuy
 */
public class DicFrame extends javax.swing.JFrame {

    DictionaryCommandline dic = new DictionaryCommandline();
    DefaultListModel<String> dlm = new DefaultListModel<>();
    DefaultListModel<String> hl = new DefaultListModel<>();
    DefaultListModel<String> tmpList = new DefaultListModel<>();

    /**
     * Creates new form DicFrame
     *
     * @throws java.io.FileNotFoundException
     */
    public DicFrame() throws FileNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        dic.dictionaryAdvanced();
        for (Word ele : Dictionary.container) {
            dlm.addElement(ele.getWordTarget());
        }
        TargetList.setModel(dlm);
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
        jButton1 = new javax.swing.JButton();
        TranButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ChangeButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        NewText = new javax.swing.JTextField();
        ExplainLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TargetList = new javax.swing.JList<>();
        DeleteButton = new javax.swing.JButton();
        Speak = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GGT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Downloads\\icons8-time-machine-20.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 30, 30));

        TranButton.setBackground(new java.awt.Color(255, 255, 255));
        TranButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Downloads\\icons8-google-translate-40.png")); // NOI18N
        TranButton.setToolTipText("Dịch");
        TranButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranButtonActionPerformed(evt);
            }
        });
        jPanel1.add(TranButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 60, 40));

        AddButton.setBackground(new java.awt.Color(255, 255, 255));
        AddButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Downloads\\icons8-add-new-40.png")); // NOI18N
        AddButton.setToolTipText("Thêm từ");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        AddButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddButtonKeyTyped(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 60, 40));

        ChangeButton.setBackground(new java.awt.Color(255, 255, 255));
        ChangeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Downloads\\icons8-up-down-arrow-40.png")); // NOI18N
        ChangeButton.setToolTipText("Thay đổi từ");
        ChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 60, 40));

        ExitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Downloads\\icons8-shutdown-40.png")); // NOI18N
        ExitButton.setToolTipText("Thoát");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 60, 40));

        NewText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NewText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        NewText.setText("Hãy nhập từ tại đây");
        NewText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NewText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewTextMouseClicked(evt);
            }
        });
        NewText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTextActionPerformed(evt);
            }
        });
        NewText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NewTextKeyReleased(evt);
            }
        });
        jPanel1.add(NewText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 282, 70));

        ExplainLable.setBackground(new java.awt.Color(255, 255, 255));
        ExplainLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExplainLable.setForeground(new java.awt.Color(51, 0, 51));
        ExplainLable.setOpaque(true);
        ExplainLable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ExplainLableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(ExplainLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 250, 70));

        TargetList.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                TargetListComponentRemoved(evt);
            }
        });
        TargetList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TargetListAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TargetList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TargetListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TargetList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 220, 270));

        DeleteButton.setBackground(new java.awt.Color(255, 255, 255));
        DeleteButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Downloads\\icons8-trash-40.png")); // NOI18N
        DeleteButton.setToolTipText("Xóa từ");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 60, 40));

        Speak.setBackground(new java.awt.Color(255, 255, 255));
        Speak.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguyenhuy\\Downloads\\icons8-voice-40.png")); // NOI18N
        Speak.setToolTipText("Phát âm");
        Speak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeakActionPerformed(evt);
            }
        });
        jPanel1.add(Speak, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 60, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tiếng Anh");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tiếng Việt");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 80, -1));

        GGT.setText("GGT");
        GGT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GGTActionPerformed(evt);
            }
        });
        jPanel1.add(GGT, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try {
            AddFrame abc = new AddFrame();
            abc.setVisible(true);
            tmpList.clear();
            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DicFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddButtonKeyTyped
        AddButton.setMnemonic(KeyEvent.VK_A);
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonKeyTyped

    private void NewTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewTextMouseClicked
        NewText.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_NewTextMouseClicked

    private void TranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranButtonActionPerformed
        TranButton.setToolTipText("Dịch");
        if (!NewText.getText().equals("")) {
            try {
            ExplainLable.setText(GoogleTranslate.translate("vi",NewText.getText()));
            // TODO add your handling code here:
        } catch (IOException ex) {
            ExplainLable.setText(dic.binaryLookup(NewText.getText(), 0, Dictionary.container.size()));
            JOptionPane.showMessageDialog(rootPane,"Vui lòng kết nối mạng");
        }    
            for(int i = 0; i < hl.size(); i++){
                if(hl.get(i).equals(NewText.getText())){
                    hl.remove(i);
                    break;
                }
            }
            hl.addElement(NewText.getText());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_TranButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        NewText.setText("");
        TargetList.setModel(hl);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeButtonActionPerformed
        ChangeFrame abc = null;
        try {
            abc = new ChangeFrame();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DicFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        abc.setVisible(true);
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if (dic.binaryLookup(NewText.getText(), 0, Dictionary.container.size()).equals("Không tìm thấy từ")) {
            JOptionPane.showMessageDialog(null, "Từ này không có trong từ điển");
        } else {
            int click = JOptionPane.showConfirmDialog(null, "Bạn muôn xóa từ " + NewText.getText());
            if (click == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Xóa từ " + NewText.getText() + " khỏi từ điển");
                dic.removeSingleWordFromCommanline(NewText.getText());
                NewText.setText("");
                ExplainLable.setText("");
            } else if (click == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Không xóa");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ExplainLableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ExplainLableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ExplainLableAncestorAdded

    private void TargetListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TargetListAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TargetListAncestorAdded

    private void TargetListComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TargetListComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TargetListComponentRemoved
    //thuộc tính giọng nói
//    private static final String VOICENAME = "kevin16";
    private void SpeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeakActionPerformed
//        Voice voice;
//        VoiceManager vm = VoiceManager.getInstance();
//        voice = vm.getVoice(VOICENAME);
//        
//        voice.allocate();
//        voice.speak(NewText.getText());
        // TODO add your handling code here:
        if (NewText.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "chọn một từ");
        } else {
            Synthesiser synthesiser = new Synthesiser();
            Thread thread = new Thread(() -> {
                try {
                    AdvancedPlayer player = new AdvancedPlayer(synthesiser.getMP3Data(NewText.getText()));
                    player.play();
                } catch (IOException | JavaLayerException e) {
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng kết nối mạng");
                }
            });

            thread.setDaemon(false);
            thread.start();
        }
    }//GEN-LAST:event_SpeakActionPerformed

    private void TargetListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TargetListMouseClicked
        NewText.setText(TargetList.getSelectedValue());
        ExplainLable.setText(dic.binaryLookup(TargetList.getSelectedValue(), 0, Dictionary.container.size()));
        // TODO add your handling code here:
    }//GEN-LAST:event_TargetListMouseClicked

    private void NewTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewTextKeyReleased
        if (NewText.getText().equals("")) {
            dlm.clear();
            for (Word ele : Dictionary.container) {
                dlm.addElement(ele.getWordTarget());
            }
            TargetList.setModel(dlm);
        } else {
            tmpList.clear();
            dlm.clear();
            for (Word word : Dictionary.container) {
                if (!word.getWordTarget().contains(NewText.getText().toLowerCase())) {
                } else {
                    tmpList.addElement(word.getWordTarget());
                }
            }
            TargetList.setModel(tmpList);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_NewTextKeyReleased

    private void NewTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewTextActionPerformed

    private void GGTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GGTActionPerformed
        if(!NewText.getText().equals("")){
        try {
            ExplainLable.setText(GoogleTranslate.translate("vi",NewText.getText()));
            // TODO add your handling code here:
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane,"Vui lòng kết nối mạng");
        }
    }
    }//GEN-LAST:event_GGTActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DicFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DicFrame().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DicFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ChangeButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel ExplainLable;
    private javax.swing.JButton GGT;
    private javax.swing.JTextField NewText;
    private javax.swing.JButton Speak;
    private javax.swing.JList<String> TargetList;
    private javax.swing.JButton TranButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
