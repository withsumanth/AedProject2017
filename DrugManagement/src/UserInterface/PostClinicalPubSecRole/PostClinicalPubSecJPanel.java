/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PostClinicalPubSecRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PostClinicalTrialOrganization;
import Business.Person.Person;
import Business.PostClinicalPerson.PostClinicalPerson;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author neelambariverma
 */
public class PostClinicalPubSecJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    EcoSystem system;
    /**
     * Creates new form PostClinicalPubSecJPanel
     */
    public PostClinicalPubSecJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system){
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        if(system.getPostClinicalPersonDirectory().getPostClinicalPersonList().size()==0){
            createData();
        }
        populatePostClinicalPubSecTable();
          
    }
    
    public void createData(){
        String csvFile = "Project_Disease_All_Persons.csv";
        BufferedReader bufferedReader = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            bufferedReader = new BufferedReader(new FileReader(csvFile));
            ArrayList<String[]> dataCsvArr = new ArrayList();
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] dataFromCsv = line.split(cvsSplitBy);
                dataCsvArr.add(count, dataFromCsv);
                count++;
            }
            for (int i = 1; i < dataCsvArr.size(); i++) {
                String valuesOfArray[] = dataCsvArr.get(i);
                PostClinicalPerson p = system.getPostClinicalPersonDirectory().addPerson();
                p.setDisease(valuesOfArray[2]);
                p.setName(valuesOfArray[0]);
                p.setAge(Integer.parseInt(valuesOfArray[1]));
                p.setSideEffects(valuesOfArray[3]);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(PostClinicalPubSecJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
     public void populatePostClinicalPubSecTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblPostClinical.getModel();
        dtm.setRowCount(0);
        
        for(PostClinicalPerson person: system.getPostClinicalPersonDirectory().getPostClinicalPersonList()){
            Object row[] = new Object[3];
            row[0] = person;
            row[1] = person.getAge();
            row[2] = person.getDisease();
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

        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPostClinical = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSearchByName = new javax.swing.JButton();
        TxtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 69, 30));

        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 56, 32));

        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 50, 30));

        tblPostClinical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Disease "
            }
        ));
        jScrollPane1.setViewportView(tblPostClinical);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 112, 707, 212));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Post-Clinical Public Sector Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 34, -1, -1));

        btnSearchByName.setText("Search by Name :");
        btnSearchByName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByNameActionPerformed(evt);
            }
        });
        add(btnSearchByName, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 432, 152, 40));

        TxtSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        TxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSearchActionPerformed(evt);
            }
        });
        add(TxtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 432, 178, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/PostClinicalPubSecRole/icons8-find-user-male-50.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 405, 127, 74));
    }// </editor-fold>//GEN-END:initComponents

     
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        /*int selectedRow = tblPostClinical.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        }*/
        
        int selectedRow = tblPostClinical.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a person");
            return;
        }
        PostClinicalPerson p = (PostClinicalPerson) tblPostClinical.getValueAt(selectedRow, 0);
        system.getPostClinicalPersonDirectory().deletePerson(p);
        populatePostClinicalPubSecTable();
        JOptionPane.showMessageDialog(null, "Person" + p.getName()+ " has been removed");

        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddPersonJPanel aap = new AddPersonJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageUserAccountPanel", aap);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPostClinical.getSelectedRow();

        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row from the table first","Warning",JOptionPane.WARNING_MESSAGE);

        }
        else
        {
            PostClinicalPerson person = (PostClinicalPerson) tblPostClinical.getValueAt(selectedRow, 0);
            UpdateJPanel ujp = new UpdateJPanel(userProcessContainer, person);
            
            userProcessContainer.add("UpdateJPanel", ujp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
             
            
             

        }
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByNameActionPerformed
        // TODO add your handling code here:

         if(TxtSearch.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Person's Name");
        }
        else 
         {
          String name = TxtSearch.getText();
          PostClinicalPerson p = system.getPostClinicalPersonDirectory().searchPerson(name);
          SearchPersonJPanel post = new SearchPersonJPanel(userProcessContainer, p);
          userProcessContainer.add("SearchPersonJPanel", post);
          CardLayout layout = (CardLayout) userProcessContainer.getLayout();
          layout.next(userProcessContainer);
    
         }
    
    }//GEN-LAST:event_btnSearchByNameActionPerformed

    private void TxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSearchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtSearchActionPerformed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
     this.btnAdd.setBackground(Color.green); 

        
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
     this.btnAdd.setBackground(Color.lightGray); 

        
    }//GEN-LAST:event_btnAddMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        // TODO add your handling code here:
        
             this.btnUpdate.setBackground(Color.yellow); 

    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        // TODO add your handling code here:
        
                     this.btnUpdate.setBackground(Color.lightGray); 

    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
        
                     this.btnDelete.setBackground(Color.red); 

    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
        
          this.btnDelete.setBackground(Color.lightGray); 

    }//GEN-LAST:event_btnDeleteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtSearch;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearchByName;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPostClinical;
    // End of variables declaration//GEN-END:variables
}
