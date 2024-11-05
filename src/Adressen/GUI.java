/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adressen;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Datenbank.DBverwaltung;
import java.sql.SQLException;

/**
 *
 * @author JCSBK-User
 */
public class GUI extends javax.swing.JFrame {

   ArrayList<Adresse> adressen = new ArrayList<Adresse>();

   private void clear_txt() {
      txtHausnummer.setText("");
      txtNachname.setText("");
      txtPLZ.setText("");
      txtStadt.setText("");
      txtStrasse.setText("");
      txtTelefon.setText("");
      txtVorname.setText("");
      txtUid.setText("");
      txtUid_nr.setText("");
      txtEmail.setText("");
   }

   private void load_display_selector() {
      this.fDisplay_cmbSelector.removeAllItems();
      this.fDisplay_cmbSelector.addItem("-");

      for (Adresse a : adressen) {
         this.fDisplay_cmbSelector.addItem(a.getVorname() + ", " + a.getNachname());
      }
   }

   private void set_display_txt(Adresse a) {
      this.fDisplay_txtUid.setText(a.getUid());
      this.fDisplay_txtUid_nr.setText("" + a.getUid_nr());
      this.fDisplay_txtStrasse.setText(a.getStrasse());
      this.fDisplay_txtStadt.setText(a.getStadt());
      this.fDisplay_txtPLZ.setText(a.getPLZ());
      this.fDisplay_txtHausnummer.setText(a.getHausnummer());
      this.fDisplay_txtTelefon.setText(a.getTelefon());
      this.fDisplay_txtEmail.setText(a.getEmail());
   }

   private void clear_display_txt() {
      this.fDisplay_txtUid.setText("");
      this.fDisplay_txtUid_nr.setText("");
      this.fDisplay_txtStrasse.setText("");
      this.fDisplay_txtStadt.setText("");
      this.fDisplay_txtPLZ.setText("");
      this.fDisplay_txtHausnummer.setText("");
      this.fDisplay_txtTelefon.setText("");
      this.fDisplay_txtEmail.setText("");
   }

   public GUI() {
      // initComponents();
      //clear_txt();

      DBverwaltung db_verwaltung = new DBverwaltung("adressen.sqlite");

      try {
         ArrayList<Adresse> adressen = db_verwaltung.getAlleAdressen();

         for (Adresse it : adressen) {
            System.out.println(it);
         }
      } catch (SQLException e) {
         System.out.println(e);
      }
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        fDisplay = new javax.swing.JFrame();
        fDisplay_lbTelefon = new javax.swing.JLabel();
        fDisplay_txtStrasse = new javax.swing.JTextField();
        fDisplay_txtPLZ = new javax.swing.JTextField();
        fDisplay_txtTelefon = new javax.swing.JTextField();
        fDisplay_lbStrasse = new javax.swing.JLabel();
        fDisplay_lbStadt = new javax.swing.JLabel();
        fDisplay_txtStadt = new javax.swing.JTextField();
        fDisplay_txtHausnummer = new javax.swing.JTextField();
        fDisplay_lbHausnummer = new javax.swing.JLabel();
        fDisplay_lbPLZ = new javax.swing.JLabel();
        fDisplay_txtUid = new javax.swing.JTextField();
        fDisplay_lbUid = new javax.swing.JLabel();
        fDisplay_lbEmail = new javax.swing.JLabel();
        fDisplay_txtEmail = new javax.swing.JTextField();
        fDisplay_txtUid_nr = new javax.swing.JTextField();
        fDisplay_lbUid_nr = new javax.swing.JLabel();
        fDisplay_lbTitel = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        fDisplay_cmbSelector = new javax.swing.JComboBox<>();
        lbTitel = new javax.swing.JLabel();
        btnBeenden = new javax.swing.JButton();
        txtVorname = new javax.swing.JTextField();
        lbTelefon = new javax.swing.JLabel();
        txtStrasse = new javax.swing.JTextField();
        txtPLZ = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtNachname = new javax.swing.JTextField();
        lbNachname = new javax.swing.JLabel();
        lbVorname = new javax.swing.JLabel();
        lbStrasse = new javax.swing.JLabel();
        lbStadt = new javax.swing.JLabel();
        txtStadt = new javax.swing.JTextField();
        txtHausnummer = new javax.swing.JTextField();
        lbHausnummer = new javax.swing.JLabel();
        lbPLZ = new javax.swing.JLabel();
        txtUid = new javax.swing.JTextField();
        lbUid = new javax.swing.JLabel();
        btnSpeichern = new javax.swing.JButton();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtUid_nr = new javax.swing.JTextField();
        lbUid_nr = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();

        fDisplay.setMinimumSize(new java.awt.Dimension(535, 400));
        fDisplay.setPreferredSize(new java.awt.Dimension(535, 400));
        fDisplay.setResizable(false);
        fDisplay.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fDisplay_lbTelefon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fDisplay_lbTelefon.setText("Telefon");
        fDisplay.getContentPane().add(fDisplay_lbTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, 20));

        fDisplay_txtStrasse.setEditable(false);
        fDisplay_txtStrasse.setText("Lang");
        fDisplay_txtStrasse.setFocusable(false);
        fDisplay.getContentPane().add(fDisplay_txtStrasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 210, -1));

        fDisplay_txtPLZ.setEditable(false);
        fDisplay_txtPLZ.setText("34414");
        fDisplay_txtPLZ.setFocusable(false);
        fDisplay.getContentPane().add(fDisplay_txtPLZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 100, -1));

        fDisplay_txtTelefon.setEditable(false);
        fDisplay_txtTelefon.setText("0142");
        fDisplay_txtTelefon.setFocusable(false);
        fDisplay.getContentPane().add(fDisplay_txtTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, -1));

        fDisplay_lbStrasse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fDisplay_lbStrasse.setText("Straße");
        fDisplay.getContentPane().add(fDisplay_lbStrasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 20));

        fDisplay_lbStadt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fDisplay_lbStadt.setText("Stadt");
        fDisplay.getContentPane().add(fDisplay_lbStadt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 50, 20));

        fDisplay_txtStadt.setEditable(false);
        fDisplay_txtStadt.setText("Warburg");
        fDisplay_txtStadt.setFocusable(false);
        fDisplay.getContentPane().add(fDisplay_txtStadt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 210, -1));

        fDisplay_txtHausnummer.setEditable(false);
        fDisplay_txtHausnummer.setText("44");
        fDisplay_txtHausnummer.setFocusable(false);
        fDisplay.getContentPane().add(fDisplay_txtHausnummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 70, -1));

        fDisplay_lbHausnummer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fDisplay_lbHausnummer.setText("Hausnummer");
        fDisplay.getContentPane().add(fDisplay_lbHausnummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 90, 20));

        fDisplay_lbPLZ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fDisplay_lbPLZ.setText("PLZ");
        fDisplay.getContentPane().add(fDisplay_lbPLZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, 20));

        fDisplay_txtUid.setEditable(false);
        fDisplay_txtUid.setText("dean");
        fDisplay_txtUid.setFocusable(false);
        fDisplay.getContentPane().add(fDisplay_txtUid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, -1));

        fDisplay_lbUid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fDisplay_lbUid.setText("UID");
        fDisplay.getContentPane().add(fDisplay_lbUid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 20));

        fDisplay_lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fDisplay_lbEmail.setText("Email");
        fDisplay.getContentPane().add(fDisplay_lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 20));

        fDisplay_txtEmail.setEditable(false);
        fDisplay_txtEmail.setText("dean@gmail.de");
        fDisplay_txtEmail.setFocusable(false);
        fDisplay.getContentPane().add(fDisplay_txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 200, -1));

        fDisplay_txtUid_nr.setEditable(false);
        fDisplay_txtUid_nr.setText("12");
        fDisplay_txtUid_nr.setFocusable(false);
        fDisplay.getContentPane().add(fDisplay_txtUid_nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 140, -1));

        fDisplay_lbUid_nr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fDisplay_lbUid_nr.setText("UID-Nr");
        fDisplay.getContentPane().add(fDisplay_lbUid_nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 50, 20));

        fDisplay_lbTitel.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        fDisplay_lbTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fDisplay_lbTitel.setText("Gespeicherte Adressen");
        fDisplay.getContentPane().add(fDisplay_lbTitel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 520, -1));

        btnClose.setText("Schließen");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fDisplay_btnCloseActionPerformed(evt);
            }
        });
        fDisplay.getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        fDisplay_cmbSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        fDisplay_cmbSelector.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fDisplay_cmbSelectorActionPerformed(evt);
            }
        });
        fDisplay.getContentPane().add(fDisplay_cmbSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 240, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adressdatenbank");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitel.setText("Adressdatenbank");
        getContentPane().add(lbTitel, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 6, 550, 40));

        btnBeenden.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBeenden.setForeground(new java.awt.Color(204, 0, 0));
        btnBeenden.setText("Beenden");
        btnBeenden.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBeendenActionPerformed(evt);
            }
        });
        getContentPane().add(btnBeenden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 550, -1));

        txtVorname.setText("Dean");
        getContentPane().add(txtVorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 140, -1));

        lbTelefon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTelefon.setText("Telefon");
        getContentPane().add(lbTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 20));

        txtStrasse.setText("Lang");
        getContentPane().add(txtStrasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, -1));

        txtPLZ.setText("34414");
        getContentPane().add(txtPLZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, -1));

        txtTelefon.setText("0142");
        getContentPane().add(txtTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 200, -1));

        txtNachname.setText("Schneider");
        getContentPane().add(txtNachname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 140, -1));

        lbNachname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNachname.setText("Nachname");
        getContentPane().add(lbNachname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 80, 20));

        lbVorname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbVorname.setText("Vorname");
        getContentPane().add(lbVorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 20));

        lbStrasse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbStrasse.setText("Straße");
        getContentPane().add(lbStrasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 20));

        lbStadt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbStadt.setText("Stadt");
        getContentPane().add(lbStadt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 50, 20));

        txtStadt.setText("Warburg");
        getContentPane().add(txtStadt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 210, -1));

        txtHausnummer.setText("44");
        getContentPane().add(txtHausnummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, -1));

        lbHausnummer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbHausnummer.setText("Hausnummer");
        getContentPane().add(lbHausnummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 90, 20));

        lbPLZ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPLZ.setText("PLZ");
        getContentPane().add(lbPLZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 20));

        txtUid.setText("dean");
        getContentPane().add(txtUid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 140, -1));

        lbUid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUid.setText("UID");
        getContentPane().add(lbUid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));

        btnSpeichern.setText("Speichern");
        btnSpeichern.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSpeichernActionPerformed(evt);
            }
        });
        getContentPane().add(btnSpeichern, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 120, -1));

        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEmail.setText("Email");
        getContentPane().add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, 20));

        txtEmail.setText("dean@gmail.de");
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, -1));

        txtUid_nr.setText("12");
        getContentPane().add(txtUid_nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 140, -1));

        lbUid_nr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUid_nr.setText("UID-Nr");
        getContentPane().add(lbUid_nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 50, 20));

        btnClear.setText("Textfelder löschen");
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 160, -1));

        btnDisplay.setText("Gespeichertes anzeigen");
        btnDisplay.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(btnDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 320, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeendenActionPerformed
      if (JOptionPane.showConfirmDialog(this, "Wollen Sie wirklich beenden?",
              "Warnung", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
         System.exit(0);
      }
    }//GEN-LAST:event_btnBeendenActionPerformed

    private void btnSpeichernActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSpeichernActionPerformed
    {//GEN-HEADEREND:event_btnSpeichernActionPerformed
      String uid = txtUid.getText();
      int uid_nr;
      String vorname = txtVorname.getText();
      String nachname = txtNachname.getText();
      String stadt = txtStadt.getText();
      String plz = txtPLZ.getText();
      String strasse = txtStrasse.getText();
      String hausnummer = txtHausnummer.getText();
      String telefon = txtTelefon.getText();
      String email = txtEmail.getText();

      if (uid.isBlank() || vorname.isBlank() || nachname.isBlank()
              || stadt.isBlank() || strasse.isBlank() || telefon.isBlank() || email.isBlank()) {
         JOptionPane.showMessageDialog(this,
                 "Es wurde nicht in jedes Feld etwas eingetragen!");
         return;
      }

      try {
         uid_nr = Integer.parseInt(txtUid_nr.getText());
      } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this,
                 "Es wurde Text in Zahlenfelder eingetragen!");
         return;
      }

      Adresse adresse = new Adresse(
              uid_nr,
              uid,
              vorname,
              nachname,
              stadt,
              plz,
              strasse,
              hausnummer,
              telefon,
              email);

      System.out.println(adresse);
      adressen.add(adresse);
    }//GEN-LAST:event_btnSpeichernActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
      clear_txt();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDisplayActionPerformed
    {//GEN-HEADEREND:event_btnDisplayActionPerformed
      load_display_selector();
      fDisplay.setVisible(true);
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void fDisplay_btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fDisplay_btnCloseActionPerformed
    {//GEN-HEADEREND:event_fDisplay_btnCloseActionPerformed
      fDisplay.dispose();
    }//GEN-LAST:event_fDisplay_btnCloseActionPerformed

    private void fDisplay_cmbSelectorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fDisplay_cmbSelectorActionPerformed
    {//GEN-HEADEREND:event_fDisplay_cmbSelectorActionPerformed
      int index = this.fDisplay_cmbSelector.getSelectedIndex() - 1;

      if (index == -1) {
         clear_display_txt();
      }

      if (index < 0) {
         return;
      }

      set_display_txt(adressen.get(index));
    }//GEN-LAST:event_fDisplay_cmbSelectorActionPerformed

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
         java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new GUI().setVisible(true);
         }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeenden;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnSpeichern;
    private javax.swing.JFrame fDisplay;
    private javax.swing.JComboBox<String> fDisplay_cmbSelector;
    private javax.swing.JLabel fDisplay_lbEmail;
    private javax.swing.JLabel fDisplay_lbHausnummer;
    private javax.swing.JLabel fDisplay_lbPLZ;
    private javax.swing.JLabel fDisplay_lbStadt;
    private javax.swing.JLabel fDisplay_lbStrasse;
    private javax.swing.JLabel fDisplay_lbTelefon;
    private javax.swing.JLabel fDisplay_lbTitel;
    private javax.swing.JLabel fDisplay_lbUid;
    private javax.swing.JLabel fDisplay_lbUid_nr;
    private javax.swing.JTextField fDisplay_txtEmail;
    private javax.swing.JTextField fDisplay_txtHausnummer;
    private javax.swing.JTextField fDisplay_txtPLZ;
    private javax.swing.JTextField fDisplay_txtStadt;
    private javax.swing.JTextField fDisplay_txtStrasse;
    private javax.swing.JTextField fDisplay_txtTelefon;
    private javax.swing.JTextField fDisplay_txtUid;
    private javax.swing.JTextField fDisplay_txtUid_nr;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHausnummer;
    private javax.swing.JLabel lbNachname;
    private javax.swing.JLabel lbPLZ;
    private javax.swing.JLabel lbStadt;
    private javax.swing.JLabel lbStrasse;
    private javax.swing.JLabel lbTelefon;
    private javax.swing.JLabel lbTitel;
    private javax.swing.JLabel lbUid;
    private javax.swing.JLabel lbUid_nr;
    private javax.swing.JLabel lbVorname;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHausnummer;
    private javax.swing.JTextField txtNachname;
    private javax.swing.JTextField txtPLZ;
    private javax.swing.JTextField txtStadt;
    private javax.swing.JTextField txtStrasse;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtUid;
    private javax.swing.JTextField txtUid_nr;
    private javax.swing.JTextField txtVorname;
    // End of variables declaration//GEN-END:variables
}
