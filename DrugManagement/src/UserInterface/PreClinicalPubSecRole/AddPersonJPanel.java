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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author neelambariverma
 */
public class AddPersonJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    PersonDirectory personDirectory;



    /**
     * Creates new form AddPersonJPanel
     */
  

    AddPersonJPanel(JPanel userProcessContainer, EcoSystem system) {
    initComponents();
    this.userProcessContainer = userProcessContainer;
    this.system = system;
    this.personDirectory = personDirectory;

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
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtDisease = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        effect1 = new javax.swing.JTextField();
        effect2 = new javax.swing.JTextField();
        effect3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Add Person ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 54, -1, -1));

        jLabel2.setText("Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 133, -1, -1));

        jLabel3.setText("Age:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 177, -1, -1));

        jLabel4.setText("Disease:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 220, -1, -1));

        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 130, 235, -1));

        txtAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(0, 204, 153)));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 174, 235, -1));

        txtDisease.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        add(txtDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 217, 235, -1));

        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 380, 60, 30));

        btnBack.setText("<<Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 381, 70, 30));

        jLabel5.setText("Side Effect 1:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 258, -1, -1));

        effect1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        add(effect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 255, 235, -1));

        effect2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 51)));
        add(effect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 293, 235, -1));

        effect3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(204, 204, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        add(effect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 331, 235, -1));

        jLabel8.setText("Side Effect 2:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 293, -1, -1));

        jLabel9.setText("Side Effect 3:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 334, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        String name = txtName.getText();
        String disease = txtDisease.getText();
        Integer age =0;
        ArrayList<String> sideEffects = new ArrayList();
         try
       {                
            age = Integer.parseInt(txtAge.getText());
       }
       catch(NumberFormatException e)
       {
           JOptionPane.showMessageDialog(null, "Please enter a valid Integer");
       } 
        
         if(name.equalsIgnoreCase("") || txtAge.getText().equalsIgnoreCase("") || disease.trim().length()==0 || effect1.getText().trim().length()==0 || effect2.getText().trim().length()==0 || effect3.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter valid details", "Invalid Details", JOptionPane.ERROR_MESSAGE);
            return;
        }
         else 
         {
             sideEffects.add(effect1.getText());
             sideEffects.add(effect2.getText());
             sideEffects.add(effect3.getText());
             Person person = system.getPersonDirectory().addPerson();
             person.setName(name);
             person.setAge(age);
             person.setDisease(disease);
             person.setDiseaseList(sideEffects);
            JOptionPane.showMessageDialog(null,"Person Successfully created."); 
            txtName.setText("");
            txtAge.setText("");
            txtDisease.setText("");
            effect1.setText("");
            effect2.setText("");
            effect3.setText("");
         }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PreClinicalPubSecJPanel pcpsj = (PreClinicalPubSecJPanel) component;
        pcpsj.populatePreClinicalPubSecTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField effect1;
    private javax.swing.JTextField effect2;
    private javax.swing.JTextField effect3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
