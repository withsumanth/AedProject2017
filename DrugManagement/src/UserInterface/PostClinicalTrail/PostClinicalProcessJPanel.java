/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PostClinicalTrail;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.PostClinicalPerson.PostClinicalPerson;
import Business.Request.Request;
import Business.Request.WorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class PostClinicalProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PostClinicalProcessJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    EcoSystem system;
    Request request;
    Map<Integer, String> effects;
    ArrayList<PostClinicalPerson> persons;
    ArrayList<String> sideEffectName;

    PostClinicalProcessJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, WorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.request = request;
        compResultJpanel.setEnabled(true);
        getCommonEffects();
        calculateCommonSideEffectPer();
        txt6.setText("6. "+sideEffectName.get(0)+ " (Common  Side  Effects greater than 50%)");
        txt7.setText("7. "+sideEffectName.get(1)+ " (Common  Side  Effects greater than 25%)");
        txt13.setText("13. "+sideEffectName.get(2)+ " (Common  Side  Effects less than 25%)");
    }

    void getCommonEffects() {
        effects = new HashMap();
        persons = new ArrayList();
        ArrayList<String> personsTemp = new ArrayList();
        for (PostClinicalPerson p : system.getPostClinicalPersonDirectory().getPostClinicalPersonList()) {
            if(p.getDisease().equals(request.getDisease().getdName())){
                persons.add(p);
                personsTemp.add(p.getSideEffects());
            }
        }
        for (int i = 0; i < personsTemp.size(); i++) {
            int count = 0;
            String effect = null;
            for (int j = i + 1; j < personsTemp.size(); j++) {
                if (personsTemp.get(i).equals(personsTemp.get(j))) {
                    effect = personsTemp.get(i);
                    count++;
                    personsTemp.remove(j);
                    j--;
                }
            }
            effects.put(count+1, effect);
        }
        System.out.println(effects);
    }

    void calculateCommonSideEffectPer() {
        Map<Integer, String> sorted = new TreeMap<Integer, String>(Collections.reverseOrder());
        sorted.putAll(effects);
        sideEffectName = new ArrayList();
        boolean checkHigh = false;
        boolean checkMiddle = false;
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            if (entry.getKey() / persons.size() * 100 >= 50) {
                if (checkHigh) {
                    checkHigh = true;
                    sideEffectName.add(entry.getValue());
                }
            } else if (entry.getKey() / persons.size() * 100 <= 50 && entry.getKey() / persons.size() * 100 >= 25) {
                if (checkMiddle) {
                    checkMiddle = true;
                    sideEffectName.add(entry.getValue());
                }
            } else {
                sideEffectName.add(entry.getValue());
            }
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

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt5 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt12 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt8 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txt9 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txt10 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txt11 = new javax.swing.JTextArea();
        yes1 = new javax.swing.JRadioButton();
        no1 = new javax.swing.JRadioButton();
        yes2 = new javax.swing.JRadioButton();
        no2 = new javax.swing.JRadioButton();
        yes3 = new javax.swing.JRadioButton();
        no3 = new javax.swing.JRadioButton();
        yes4 = new javax.swing.JRadioButton();
        no4 = new javax.swing.JRadioButton();
        yes5 = new javax.swing.JRadioButton();
        no5 = new javax.swing.JRadioButton();
        yes8 = new javax.swing.JRadioButton();
        no8 = new javax.swing.JRadioButton();
        yes9 = new javax.swing.JRadioButton();
        no9 = new javax.swing.JRadioButton();
        yes10 = new javax.swing.JRadioButton();
        no10 = new javax.swing.JRadioButton();
        yes11 = new javax.swing.JRadioButton();
        no11 = new javax.swing.JRadioButton();
        yes12 = new javax.swing.JRadioButton();
        no12 = new javax.swing.JRadioButton();
        effectsCombo7 = new javax.swing.JComboBox<>();
        effectsCombo13 = new javax.swing.JComboBox<>();
        effectsCombo6 = new javax.swing.JComboBox<>();
        compResultJpanel = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        txt7 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        txt6 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txt13 = new javax.swing.JTextArea();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("Post Clinical Trial Process Panel");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 380, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt5.setBackground(new java.awt.Color(204, 204, 255));
        txt5.setColumns(20);
        txt5.setRows(5);
        txt5.setText("5. Are there alternative causes (other than the drug) \nthat could on their own have caused the reaction?\n");
        txt5.setAutoscrolls(false);
        txt5.setEnabled(false);
        txt5.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(txt5);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 400, 70));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt3.setBackground(new java.awt.Color(204, 204, 255));
        txt3.setColumns(20);
        txt3.setRows(5);
        txt3.setText("3. Did the adverse reaction improve when the \ndrug was discontinued or a specific \nantagonist was administered? ");
        txt3.setAutoscrolls(false);
        txt3.setEnabled(false);
        txt3.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(txt3);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 400, 70));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt2.setBackground(new java.awt.Color(204, 204, 255));
        txt2.setColumns(20);
        txt2.setRows(5);
        txt2.setText("2. Did the adverse event appear after the suspected drug \nwas administered?\n");
        txt2.setAutoscrolls(false);
        txt2.setEnabled(false);
        txt2.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane3.setViewportView(txt2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 400, 70));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt12.setBackground(new java.awt.Color(204, 204, 255));
        txt12.setColumns(20);
        txt12.setRows(5);
        txt12.setText("12. Was the adverse event \nconfirmed by any objective evidence?\n");
        txt12.setAutoscrolls(false);
        txt12.setEnabled(false);
        txt12.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane4.setViewportView(txt12);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 360, 70));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt4.setBackground(new java.awt.Color(204, 204, 255));
        txt4.setColumns(20);
        txt4.setRows(5);
        txt4.setText("4. Did the adverse reaction reappear when the drug \nwas readministered?\n");
        txt4.setAutoscrolls(false);
        txt4.setEnabled(false);
        txt4.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane5.setViewportView(txt4);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 400, 70));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt1.setBackground(new java.awt.Color(204, 204, 255));
        txt1.setColumns(20);
        txt1.setRows(5);
        txt1.setText("1. Are there previous conclusive reports on this reaction?\n");
        txt1.setAutoscrolls(false);
        txt1.setEnabled(false);
        txt1.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane6.setViewportView(txt1);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 70));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt8.setBackground(new java.awt.Color(204, 204, 255));
        txt8.setColumns(20);
        txt8.setRows(5);
        txt8.setText("8. Did the reaction reappear \nwhen a placebo was given?\n");
        txt8.setAutoscrolls(false);
        txt8.setEnabled(false);
        txt8.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane7.setViewportView(txt8);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 360, 70));

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt9.setBackground(new java.awt.Color(204, 204, 255));
        txt9.setColumns(20);
        txt9.setRows(5);
        txt9.setText("9. Was the drug detected \nin the blood (or other fluids) \nin concentrations known to be toxic?\n");
        txt9.setAutoscrolls(false);
        txt9.setEnabled(false);
        txt9.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane8.setViewportView(txt9);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 360, 70));

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt10.setBackground(new java.awt.Color(204, 204, 255));
        txt10.setColumns(20);
        txt10.setRows(5);
        txt10.setText("10. Was the reaction more severe \nwhen the dose was increased, \nor less severe when the dose was decreased?\n");
        txt10.setAutoscrolls(false);
        txt10.setEnabled(false);
        txt10.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane9.setViewportView(txt10);

        add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 360, 70));

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt11.setBackground(new java.awt.Color(204, 204, 255));
        txt11.setColumns(20);
        txt11.setRows(5);
        txt11.setText("11. Did the patient have a similar \nreaction to the same or similar drugs \nin any previous exposure?\n");
        txt11.setAutoscrolls(false);
        txt11.setEnabled(false);
        txt11.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane10.setViewportView(txt11);

        add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 360, 70));

        yes1.setText("Yes");
        add(yes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 80, -1));

        no1.setSelected(true);
        no1.setText("No");
        add(no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 80, -1));

        yes2.setText("Yes");
        add(yes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 80, -1));

        no2.setSelected(true);
        no2.setText("No");
        add(no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 80, -1));

        yes3.setText("Yes");
        add(yes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 80, -1));

        no3.setSelected(true);
        no3.setText("No");
        add(no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 80, -1));

        yes4.setText("Yes");
        add(yes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 80, 30));

        no4.setSelected(true);
        no4.setText("No");
        add(no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 80, 30));

        yes5.setText("Yes");
        add(yes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 80, -1));

        no5.setSelected(true);
        no5.setText("No");
        add(no5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 80, -1));

        yes8.setText("Yes");
        add(yes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, 80, -1));

        no8.setSelected(true);
        no8.setText("No");
        add(no8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 80, -1));

        yes9.setText("Yes");
        add(yes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 80, -1));

        no9.setSelected(true);
        no9.setText("No");
        add(no9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 150, 80, -1));

        yes10.setText("Yes");
        add(yes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 200, 80, -1));

        no10.setSelected(true);
        no10.setText("No");
        add(no10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 80, -1));

        yes11.setText("Yes");
        add(yes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, 80, -1));

        no11.setSelected(true);
        no11.setText("No");
        add(no11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 300, 80, -1));

        yes12.setText("Yes");
        add(yes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 80, -1));

        no12.setSelected(true);
        no12.setText("No");
        add(no12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 360, 80, -1));

        effectsCombo7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Increased", "Decreased" }));
        add(effectsCombo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 100, -1));

        effectsCombo13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Increased", "Decreased" }));
        add(effectsCombo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 430, 100, -1));

        effectsCombo6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Increased", "Decreased" }));
        add(effectsCombo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 100, -1));

        compResultJpanel.setText("Proceed For Calculation");
        compResultJpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compResultJpanelActionPerformed(evt);
            }
        });
        add(compResultJpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 200, 30));

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt7.setBackground(new java.awt.Color(204, 204, 255));
        txt7.setColumns(20);
        txt7.setRows(5);
        txt7.setText("7. >25% Common Side  Effects");
        txt7.setAutoscrolls(false);
        txt7.setEnabled(false);
        txt7.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane12.setViewportView(txt7);

        add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 400, 70));

        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt6.setBackground(new java.awt.Color(204, 204, 255));
        txt6.setColumns(20);
        txt6.setRows(5);
        txt6.setText("6. >50% Common  Side  Effects");
        txt6.setAutoscrolls(false);
        txt6.setEnabled(false);
        txt6.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane13.setViewportView(txt6);

        add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 400, 70));

        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt13.setBackground(new java.awt.Color(204, 204, 255));
        txt13.setColumns(20);
        txt13.setRows(5);
        txt13.setText("13. <25% Common Side Effects");
        txt13.setAutoscrolls(false);
        txt13.setEnabled(false);
        txt13.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane14.setViewportView(txt13);

        add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 360, 70));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void compResultJpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compResultJpanelActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to Proceed for calculation? ", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            String[] txtValue = {txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), txt5.getText(), "", "", txt8.getText(), txt9.getText(), txt10.getText(), txt11.getText(), txt12.getText(), ""};
            boolean[] yesValue = {yes1.isSelected(), yes2.isSelected(), yes3.isSelected(), yes4.isSelected(), yes5.isSelected(), false, false, yes8.isSelected(), yes9.isSelected(), yes10.isSelected(), yes11.isSelected(), yes12.isSelected(), false};
            boolean[] noValue = {no1.isSelected(), no2.isSelected(), no3.isSelected(), no4.isSelected(), no5.isSelected(), false, false, no8.isSelected(), no9.isSelected(), no10.isSelected(), no11.isSelected(), no12.isSelected(), false};
            ArrayList<String> que = new ArrayList();
            ArrayList<String> val = new ArrayList();
            for (int i = 0; i < 13; i++) {
                if (i == 0 || i == 2 || i == 8 || i == 9 || i == 10 || i == 11) {
                    que.add(txtValue[i]);
                    if (yesValue[i]) {
                        val.add("1");
                    } else if (noValue[i]) {
                        val.add("0");
                    }
                } else if (i == 1 || i == 3) {
                    que.add(txtValue[i]);
                    if (yesValue[i]) {
                        val.add("2");
                    } else if (noValue[i]) {
                        val.add("-1");
                    }
                } else if (i == 4) {
                    que.add(txtValue[i]);
                    if (yesValue[i]) {
                        val.add("-1");
                    } else if (noValue[i]) {
                        val.add("2");
                    }
                } else if (i == 7) {
                    que.add(txtValue[i]);
                    if (yesValue[i]) {
                        val.add("-1");
                    } else if (noValue[i]) {
                        val.add("1");
                    }
                } else if (i == 5) {
                    que.add("6. "+sideEffectName.get(0)+ " (Common  Side  Effects greater than 50%)");
                    val.add((String) effectsCombo6.getSelectedItem());
                }else if(i==6){
                    que.add("7. "+sideEffectName.get(1)+ " (Common  Side  Effects greater than 25%)");
                    val.add((String) effectsCombo7.getSelectedItem());
                }else if(i==12){
                    que.add("13. "+sideEffectName.get(2)+ " (Common  Side  Effects less than 25%)");
                    val.add((String) effectsCombo13.getSelectedItem());
                }
            }
            request.getPostClinicalTrialDataEntry().setQuestion(que);
            request.getPostClinicalTrialDataEntry().setReportValue(val);
            PostClinicalTrialCalculationJPanel muajp = new PostClinicalTrialCalculationJPanel(userProcessContainer, account,persons, request,sideEffectName);
            userProcessContainer.add("PostClinicalTrialCalculationJPanel", muajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_compResultJpanelActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PostClinicalTrialJPanel sysAdminwjp = (PostClinicalTrialJPanel) component;
        sysAdminwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    public javax.swing.JButton compResultJpanel;
    private javax.swing.JComboBox<String> effectsCombo13;
    private javax.swing.JComboBox<String> effectsCombo6;
    private javax.swing.JComboBox<String> effectsCombo7;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JRadioButton no1;
    private javax.swing.JRadioButton no10;
    private javax.swing.JRadioButton no11;
    private javax.swing.JRadioButton no12;
    private javax.swing.JRadioButton no2;
    private javax.swing.JRadioButton no3;
    private javax.swing.JRadioButton no4;
    private javax.swing.JRadioButton no5;
    private javax.swing.JRadioButton no8;
    private javax.swing.JRadioButton no9;
    private javax.swing.JTextArea txt1;
    private javax.swing.JTextArea txt10;
    private javax.swing.JTextArea txt11;
    private javax.swing.JTextArea txt12;
    private javax.swing.JTextArea txt13;
    private javax.swing.JTextArea txt2;
    private javax.swing.JTextArea txt3;
    private javax.swing.JTextArea txt4;
    private javax.swing.JTextArea txt5;
    private javax.swing.JTextArea txt6;
    private javax.swing.JTextArea txt7;
    private javax.swing.JTextArea txt8;
    private javax.swing.JTextArea txt9;
    private javax.swing.JRadioButton yes1;
    private javax.swing.JRadioButton yes10;
    private javax.swing.JRadioButton yes11;
    private javax.swing.JRadioButton yes12;
    private javax.swing.JRadioButton yes2;
    private javax.swing.JRadioButton yes3;
    private javax.swing.JRadioButton yes4;
    private javax.swing.JRadioButton yes5;
    private javax.swing.JRadioButton yes8;
    private javax.swing.JRadioButton yes9;
    // End of variables declaration//GEN-END:variables
}