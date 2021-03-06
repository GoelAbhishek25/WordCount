/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountingWords;

/**
 *
 * @author nishu
 */
public class wordCount extends javax.swing.JFrame {

    /**
     * Creates new form wordCount
     */
    public wordCount() {
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

        wrdocuntPanel = new javax.swing.JPanel();
        wrdLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wrdTextArea = new javax.swing.JTextArea();
        wrdCountButton = new javax.swing.JButton();
        totalCountTextField = new javax.swing.JTextField();
        totalWrdLabel = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wrdocuntPanel.setBackground(new java.awt.Color(51, 153, 255));

        wrdLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wrdLabel.setText("Type your words");

        wrdTextArea.setColumns(20);
        wrdTextArea.setRows(5);
        jScrollPane1.setViewportView(wrdTextArea);

        wrdCountButton.setBackground(new java.awt.Color(102, 0, 255));
        wrdCountButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        wrdCountButton.setText("Count your words");
        wrdCountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrdCountButtonActionPerformed(evt);
            }
        });

        totalWrdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalWrdLabel.setText("Total Words");

        clearBtn.setBackground(new java.awt.Color(102, 102, 255));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(102, 204, 255));
        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("Word Count Tool");

        javax.swing.GroupLayout wrdocuntPanelLayout = new javax.swing.GroupLayout(wrdocuntPanel);
        wrdocuntPanel.setLayout(wrdocuntPanelLayout);
        wrdocuntPanelLayout.setHorizontalGroup(
            wrdocuntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrdocuntPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(wrdocuntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wrdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(wrdocuntPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(totalWrdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(wrdocuntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(wrdocuntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(wrdCountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addGroup(wrdocuntPanelLayout.createSequentialGroup()
                            .addGroup(wrdocuntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(totalCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 234, Short.MAX_VALUE))
        );
        wrdocuntPanelLayout.setVerticalGroup(
            wrdocuntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrdocuntPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(wrdocuntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wrdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(wrdocuntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wrdocuntPanelLayout.createSequentialGroup()
                        .addComponent(wrdCountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(totalCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(wrdocuntPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrdocuntPanelLayout.createSequentialGroup()
                        .addComponent(totalWrdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrdocuntPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrdocuntPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        wrdTextArea.setText("");
        totalCountTextField.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void wrdCountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrdCountButtonActionPerformed
        String sentence = wrdTextArea.getText();
        int i =0,words =1;
        
        for(i=0;i<sentence.length();i++) {
        {
            if(sentence.charAt(i)==' ')
                words++;
                
                }
                   totalCountTextField.setText(" "+words);
    }//GEN-LAST:event_wrdCountButtonActionPerformed
    }
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
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wordCount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField totalCountTextField;
    private javax.swing.JLabel totalWrdLabel;
    private javax.swing.JButton wrdCountButton;
    private javax.swing.JLabel wrdLabel;
    private javax.swing.JTextArea wrdTextArea;
    private javax.swing.JPanel wrdocuntPanel;
    // End of variables declaration//GEN-END:variables
}
