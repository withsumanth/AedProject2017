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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author neelambariverma
 */
public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    
    JPanel userProcessContainer;
    Person person;

    UpdateJPanel(JPanel userProcessContainer, Person person) {
          initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        
        populatePersonDetails();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }
    
    private void populatePersonDetails(){
        
        txtName.setText(person.getName());
        txtAge.setText(String.valueOf(person.getAge()));
        txtDisease.setText(person.getDisease());
 
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtDisease = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(0, 204, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 105, 40));

        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Update Person");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 66, 190, 40));

        jLabel3.setText("Name: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 149, -1, -1));

        jLabel4.setText("Age:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 193, -1, -1));

        jLabel5.setText("Disease:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 236, -1, -1));

        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        txtName.setEnabled(false);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 146, 184, -1));

        txtAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(204, 204, 0)));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 184, -1));

        txtDisease.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        add(txtDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 233, 184, -1));

        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 87, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PreClinicalPubSecJPanel pcpsj = (PreClinicalPubSecJPanel) component;
        pcpsj.populatePreClinicalPubSecTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(true);

        txtDisease.setEnabled(true);
        txtAge.setEnabled(true);
        txtDisease.setEnabled(true);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if(txtName.getText().trim().length()==0 || txtAge.getText().trim().length()==0 ||txtDisease.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter valid details", "Invalid Details", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            int age = Integer.parseInt(txtAge.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter integer values for age", "Invalid Details", JOptionPane.ERROR_MESSAGE);
            return;
        }
        person.setName(txtName.getText());
        person.setDisease(txtDisease.getText());
        person.setAge(Integer.parseInt(txtAge.getText()));
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Person Updated Successfully.");
        
        
      
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
