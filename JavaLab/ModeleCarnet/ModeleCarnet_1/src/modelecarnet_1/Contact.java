/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Contact.java
 *
 * Created on 10 juil. 2010, 21:58:16
 */

package modelecarnet_1;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author AnneT
 */
public class Contact extends javax.swing.JPanel {

    /** Creates new form Contact */

    public Contact() {
        setVisible(true);
        initComponents();
    }

     /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photoLbl = new javax.swing.JLabel();
        prenomLbl = new javax.swing.JLabel();
        nomLbl = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(390, 50));
        setMinimumSize(new java.awt.Dimension(390, 50));
        setPreferredSize(new java.awt.Dimension(380, 50));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.GridLayout(1, 0));
        add(photoLbl);

        prenomLbl.setText("prénom");
        add(prenomLbl);

        nomLbl.setText("nom");
        add(nomLbl);
    }// </editor-fold>//GEN-END:initComponents
  private String nom, prenom, url;
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nomLbl;
    private javax.swing.JLabel photoLbl;
    private javax.swing.JLabel prenomLbl;
    // End of variables declaration//GEN-END:variables

}
