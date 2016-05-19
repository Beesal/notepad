package Notepad;

import com.leapfrog.np.util.FileHelper;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bishal
 */
public class Notepad1 extends javax.swing.JFrame {

    private JFileChooser fileChooser = new JFileChooser();

    public Notepad1() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotepad1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mifile = new javax.swing.JMenu();
        miNew = new javax.swing.JMenuItem();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miQuit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu1.setText("File");
        jMenuBar3.add(jMenu1);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNotepad1.setColumns(20);
        txtNotepad1.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 13)); // NOI18N
        txtNotepad1.setRows(5);
        jScrollPane1.setViewportView(txtNotepad1);

        mifile.setText("File");
        mifile.setAlignmentX(4.0F);
        mifile.setAlignmentY(4.0F);
        mifile.setFocusPainted(true);

        miNew.setText("New");
        miNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuClick(evt);
            }
        });
        mifile.add(miNew);

        miOpen.setText("Open");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openClick(evt);
            }
        });
        mifile.add(miOpen);

        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSave(evt);
            }
        });
        mifile.add(miSave);

        miQuit.setText("Quit");
        miQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miQuitActionPerformed(evt);
                clickQuit(evt);
            }
        });
        mifile.add(miQuit);

        jMenuBar1.add(mifile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newMenuClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuClick
        if (txtNotepad1.getText().length() > 0) {
            int result = JOptionPane.showConfirmDialog(null, "Do You Want To Save Changes The Untitled", "Notepad", JOptionPane.YES_NO_CANCEL_OPTION);

            switch (result) {
                case JOptionPane.YES_OPTION:
                    int dialougeResult = fileChooser.showSaveDialog(null);
                    if (dialougeResult == JFileChooser.APPROVE_OPTION) {
                        try {
                            FileHelper.write(fileChooser.getSelectedFile(), txtNotepad1.getText());
                        } catch (IOException ioe) {

                        }
                    }

                    break;

                case JOptionPane.NO_OPTION:
                    txtNotepad1.setText("");
                    break;
                case JOptionPane.CANCEL_OPTION:
                    break;
            }
        }
    }//GEN-LAST:event_newMenuClick

    private void openClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openClick
        int dialougeResult = fileChooser.showOpenDialog(null);
        if (dialougeResult == JFileChooser.APPROVE_OPTION) {
            try {
                txtNotepad1.setText(FileHelper.read(fileChooser.getSelectedFile()));

            } catch (IOException ioe) {

            }
        }
    }//GEN-LAST:event_openClick

    private void clickSave(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSave
        int result = JOptionPane.showConfirmDialog(null, "Do You Want To Save Changes The Untitled", "Notepad", JOptionPane.YES_NO_CANCEL_OPTION);
        int dialougeResult = fileChooser.showSaveDialog(null);
        switch (result) {
            case JOptionPane.YES_OPTION:
                if (dialougeResult == JFileChooser.APPROVE_OPTION) {
                    try {
                        FileHelper.write(fileChooser.getSelectedFile(), txtNotepad1.getText());
                    } catch (IOException ioe) {

                    }
                }
        }
    }//GEN-LAST:event_clickSave

    private void miQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miQuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miQuitActionPerformed

    private void clickQuit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickQuit
        int result = JOptionPane.showConfirmDialog(null, "Are You Ready To Close");
        if (result == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_clickQuit

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miQuit;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenu mifile;
    private javax.swing.JTextArea txtNotepad1;
    // End of variables declaration//GEN-END:variables
}