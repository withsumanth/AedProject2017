/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PostClinicalPubSecRole;

import Business.EcoSystem;
import Business.Person.Person;



import Business.Person.PersonDirectory;
import Business.PostClinicalPerson.PostClinicalPerson;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class AddPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    PersonDirectory personDirectory;
    

   public AddPersonJPanel(JPanel userProcessContainer, EcoSystem system) {
    initComponents();
    
    this.userProcessContainer=userProcessContainer;
    
    this.system=system;
    
    this.personDirectory=personDirectory;
    
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        effect1 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("Add Person ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 250, 50));

        jLabel2.setText("Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 133, -1, -1));

        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 130, 235, -1));

        jLabel3.setText("Age:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 177, -1, -1));

        txtAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 174, 235, -1));

        jLabel4.setText("Disease:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtDisease.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        add(txtDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 217, 235, -1));

        jLabel6.setText("Side Effect:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, -1));

        effect1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        add(effect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 255, 235, -1));

        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 329, 80, 30));

        btnBack.setText("<<Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 329, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/PostClinicalPubSecRole/icons8-add-user-male-50.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -20, 210, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        String name = txtName.getText();
        String disease = txtDisease.getText();
        Integer age =0;
        try
        {
            age = Integer.parseInt(txtAge.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid Integer");
        }

        if(name.equalsIgnoreCase("") || txtAge.getText().equalsIgnoreCase("") || disease.trim().length()==0 || effect1.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter valid details", "Invalid Details", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            PostClinicalPerson person = system.getPostClinicalPersonDirectory().addPerson();
            person.setName(name);
            person.setAge(age);
            person.setDisease(disease);
            person.setSideEffects(effect1.getText());
            JOptionPane.showMessageDialog(null,"Person Successfully created.");
            txtName.setText("");
            txtAge.setText("");
            txtDisease.setText("");
            effect1.setText("");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PostClinicalPubSecJPanel pcpsj = (PostClinicalPubSecJPanel) component;
        pcpsj.populatePostClinicalPubSecTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
        
       this.btnAdd.setBackground(Color.green); 

    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
        
      this.btnAdd.setBackground(Color.lightGray); 

    }//GEN-LAST:event_btnAddMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField effect1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
