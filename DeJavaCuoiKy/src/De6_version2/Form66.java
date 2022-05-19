/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De6_version2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author arohigh
 */
public class Form66 extends javax.swing.JFrame {

    ArrayList<Word> listWord = new ArrayList<>();

    /**
     * Creates new form Form66
     */
    public Form66() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        firstList();
    }

    public void firstList() {
        Word w1 = new Word(1, "one", "một");
        Word w2 = new Word(2, "two", "hai");
        Word w3 = new Word(3, "three", "ba");
        Word w4 = new Word(4, "four", "bốn");
        Word w5 = new Word(5, "five", "năm");
        Word w6 = new Word(6, "six", "sáu");
        Word w7 = new Word(7, "seven", "bảy");
        Word w8 = new Word(8, "eight", "tám");
        Word w9 = new Word(9, "nine", "chín");
        Word w10 = new Word(10, "ten", "mười");
        Word w11 = new Word(11, "eleven", "mười một");
        Word w12 = new Word(12, "twelve", "mười hai");
        listWord.add(w1);
        listWord.add(w2);
        listWord.add(w3);
        listWord.add(w4);
        listWord.add(w5);
        listWord.add(w6);
        listWord.add(w7);
        listWord.add(w8);
        listWord.add(w9);
        listWord.add(w10);
        listWord.add(w11);
        listWord.add(w12);

        sort();
        printListWord();
    }

    public void sort() {
        Collections.sort(listWord, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getEn().compareToIgnoreCase(o2.getEn());
            }
        });
    }

    public void printListWord() {
        System.out.println("TU DIEN");
        for (Word word : listWord) {
            word.show();
        }
    }

    public int BinarySearch(String s) {
        int left = 0;
        int right = listWord.size();
        while (left <= right) {
            int mid = (left + right) / 2;
            if (listWord.get(mid).getEn().equals(s)) {
                return mid;
            } else if (listWord.get(mid).getEn().compareToIgnoreCase(s) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfEn = new javax.swing.JTextField();
        tfVn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dictionary");

        jLabel2.setText("En");

        jLabel3.setText("Vn");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfVn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton1)
                        .addGap(77, 77, 77)
                        .addComponent(jButton2)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfEn, tfVn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfVn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (tfEn.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "nhap vao da");
            return;
        } else if (BinarySearch(tfEn.getText()) == -1) {
            JOptionPane.showMessageDialog(null, "khong tim thay, them tu nay vao!");
            tfVn.setText("");
            return;
        } else {
            Word w = (Word) listWord.get(BinarySearch(tfEn.getText()));
            tfVn.setText(w.getVn());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (tfEn.getText().equals("") || tfVn.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "fill all infomation about this new word for adding");
            return;
        } else {
            for (Word word : listWord) {
                if (word.getEn().equals(tfEn.getText())) {
                    JOptionPane.showMessageDialog(null, "tu nay da co trong tu dien");
                    return;
                }
            }
            Word w = new Word(listWord.size() + 1, tfEn.getText(), tfVn.getText());
            listWord.add(w);
            JOptionPane.showMessageDialog(null, "them thanh cong");
            sort();
            printListWord();
            tfEn.setText("");
            tfVn.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form66.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form66.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form66.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form66.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form66().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfEn;
    private javax.swing.JTextField tfVn;
    // End of variables declaration//GEN-END:variables
}
