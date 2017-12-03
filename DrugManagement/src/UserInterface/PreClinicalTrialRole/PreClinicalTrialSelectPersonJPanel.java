/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PreClinicalTrialRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class PreClinicalTrialSelectPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PreClinicalTrialProcessJpanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    EcoSystem system;
    PreClinicalTrialSelectPersonJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        populatePersonTable();
    }
    
    void populatePersonTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblPreClinical.getModel();
        dtm.setRowCount(0);
        tblPreClinical.getCellEditor();
        for(Person person: system.getPersonDirectory().getPersonList()){
            Object row[] = new Object[4];
            row[0] = person;
            row[1] = person.getAge();
            row[2] = person.getDisease();
            disTypComb.removeAllItems();
            dtm.addRow(row);
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disTypComb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPreClinical = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        selectPerson = new javax.swing.JButton();

        disTypComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPreClinical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Disease "
            }
        ));
        jScrollPane1.setViewportView(tblPreClinical);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 690, 212));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        selectPerson.setText("Select Person for Test");
        selectPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPersonActionPerformed(evt);
            }
        });
        add(selectPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 210, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void selectPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPersonActionPerformed
        int selectedRow = tblPreClinical.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        }
        Person person = (Person) tblPreClinical.getValueAt(selectedRow, 0);
        PreClinicalTrialProcessJpanel muajp = new PreClinicalTrialProcessJpanel(userProcessContainer, account, organization, enterprise, system, person);
                userProcessContainer.add("PharmaRequestJPanel", muajp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
    }//GEN-LAST:event_selectPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> disTypComb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectPerson;
    private javax.swing.JTable tblPreClinical;
    // End of variables declaration//GEN-END:variables
}