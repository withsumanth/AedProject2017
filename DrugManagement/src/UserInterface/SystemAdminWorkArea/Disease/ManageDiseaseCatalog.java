/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea.Disease;

import Business.Disease.Disease;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class ManageDiseaseCatalog extends javax.swing.JPanel {

    /**
     * Creates new form ManageDiseaseCatalog
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    public ManageDiseaseCatalog(JPanel userProcessContainer, EcoSystem system) {
       initComponents(); 
       this.userProcessContainer = userProcessContainer;
       this.system = system;
       populateTable();
    }
    
    void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) vaccineJTable.getModel();
        dtm.setRowCount(0);
        for(Disease v:system.getDiseaseCatalog().getDiseaseCatalog()){
            Object[] row = new Object[1];
            row[0] = v;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineJTable = new javax.swing.JTable();
        delBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        updBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vaccineJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disease Name"
            }
        ));
        jScrollPane1.setViewportView(vaccineJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 96));

        delBtn.setText("Delete Disease");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 204, 150, -1));

        addBtn.setText("Add Disease");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 204, 110, -1));

        updBtn.setText("Update Disease");
        updBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtnActionPerformed(evt);
            }
        });
        add(updBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 204, 120, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        int selectedRow = vaccineJTable.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the Disease ", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Disease disease = (Disease) vaccineJTable.getValueAt(selectedRow,0);
                system.getDiseaseCatalog().removeDisease(disease);
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please Select Any Row","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        AddDiseaseJPanel manageVaccineCatalogJPanel = new AddDiseaseJPanel(userProcessContainer, system);
        userProcessContainer.add("AddDiseaseJPanel", manageVaccineCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addBtnActionPerformed

    private void updBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtnActionPerformed
        int selectedRow = vaccineJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        }
        Disease disease = (Disease) vaccineJTable.getValueAt(selectedRow, 0);
        UpdateDiseaseJPanel manageVaccineCatalogJPanel = new UpdateDiseaseJPanel(userProcessContainer, disease);
        userProcessContainer.add("UpdateDiseaseJPanel", manageVaccineCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton delBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updBtn;
    private javax.swing.JTable vaccineJTable;
    // End of variables declaration//GEN-END:variables
}