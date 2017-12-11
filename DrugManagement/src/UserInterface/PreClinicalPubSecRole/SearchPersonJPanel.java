/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PreClinicalPubSecRole;

import Business.EcoSystem;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author neelambariverma
 */
public class SearchPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPersonJPanel
     */
    JPanel userProcessContainer;
    Person person;

    SearchPersonJPanel(JPanel userProcessContainer, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        populateSearchDetails();
        populateCombo();
    }

    public void populateCombo() {
        searchCombo.removeAllItems();
        for (String v : person.getDiseaseList()) {
            searchCombo.addItem(v);
        }
    }

    private void populateSearchDetails() {

        txtSearchName.setText(person.getName());
        txtSearchAge.setText(String.valueOf(person.getAge()));
        txtSearchDisease.setText(person.getDisease());

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
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearchName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSearchDisease = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSearchAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        searchCombo = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText(" Person's Effects of Disease");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Name: ");

        txtSearchName.setEnabled(false);
        txtSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Age:");

        txtSearchDisease.setEnabled(false);

        jLabel4.setText("Disease:");

        txtSearchAge.setEnabled(false);

        jLabel5.setText("Effect's of Disease:");

        searchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        searchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(searchCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(85, 85, 85)
                                .addComponent(txtSearchDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSearchDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnBack)
                .addContainerGap(239, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PreClinicalPubSecJPanel pcpsj = (PreClinicalPubSecJPanel) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchNameActionPerformed

    private void searchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_searchComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> searchCombo;
    private javax.swing.JTextField txtSearchAge;
    private javax.swing.JTextField txtSearchDisease;
    private javax.swing.JTextField txtSearchName;
    // End of variables declaration//GEN-END:variables
}
