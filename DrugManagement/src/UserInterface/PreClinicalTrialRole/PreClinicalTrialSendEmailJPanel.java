/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PreClinicalTrialRole;

import Business.ClinicalReport.ClinicalReport;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Request.Request;
import Business.UserAccount.UserAccount;
import UserInterface.ProgressBar.ProgressBarJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.V;
import javax.swing.JPanel;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Sumanth
 */
public class PreClinicalTrialSendEmailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PreClinicalTrialSendEmail
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    EcoSystem system;
    Request request;

    PreClinicalTrialSendEmailJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Request request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.request = request;
        progressBarJPanel1.setVisible(false);
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
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        progressBarJPanel1 = new UserInterface.ProgressBar.ProgressBarJPanel();

        jLabel1.setText("Enter Email to send request");

        jButton1.setText("Send email");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout progressBarJPanel1Layout = new javax.swing.GroupLayout(progressBarJPanel1);
        progressBarJPanel1.setLayout(progressBarJPanel1Layout);
        progressBarJPanel1Layout.setHorizontalGroup(
            progressBarJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        progressBarJPanel1Layout.setVerticalGroup(
            progressBarJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(progressBarJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(progressBarJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public Void createExcelFile() {

        XSSFWorkbook workbook = new XSSFWorkbook();
        for (ClinicalReport c : request.getClinicalReportDirectory().clinicalReportDirectory) {
            XSSFSheet sheet = workbook.createSheet(c.getPerson().getName());
            int rownum = 0;
            int cellnum = 0;
            Row row = sheet.createRow(rownum++);
            Cell cell = row.createCell(cellnum++);
            cell.setCellValue("Question");
            cell = row.createCell(cellnum++);
            cell.setCellValue("Interpretation of Score");
            for (int j = 0; j < 14; j++) {
                cellnum = 0;
                row = sheet.createRow(rownum++);
                boolean check = false;
                for (int i = 0; i < 2; i++) {
                    if (j == 13) {
                        if (!check) {
                            check = true;
                            cell = row.createCell(cellnum++);
                            cell.setCellValue("Total Score");
                        } else {
                            cell = row.createCell(cellnum++);
                            cell.setCellValue(c.getFinalReportValue());
                        }
                    } else {
                        if (!check) {
                            check = true;
                            cell = row.createCell(cellnum++);
                            cell.setCellValue(c.getQuestion().get(j));
                        } else {
                            cell = row.createCell(cellnum++);
                            cell.setCellValue(c.getReportValue().get(j));
                        }
                    }
                }
            }
            cellnum = 0;
            row = sheet.createRow(rownum++);
            cell = row.createCell(cellnum++);
            cell.setCellValue("Average Score");
            cell = row.createCell(cellnum++);
            cell.setCellValue(request.getInterpretationScore());
        }

        //Iterate over data and write to sheet
        try {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("PreClinicalReport.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("PreClinicalReport.xlsx has been created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return null;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        progressBarJPanel1.setVisible(true);
        Thread t1 = new Thread() {
            public void run() {
                Void p = createExcelFile();
                float score = 0;
                if (request.getClinicalReportDirectory() != null) {
                    for (ClinicalReport c : request.getClinicalReportDirectory().getClinicalReportDirectory()) {
                        score = score + c.getFinalReportValue();
                    }
                }
                request.setInterpretationScore(score / request.getClinicalReportDirectory().getClinicalReportDirectory().size());
                request.setStatus("Pre Clinical Trial Completed");
                final String username = "aedexplorers@gmail.com";
                final String password = "aedexplorers123";

                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");

                Session session = Session.getInstance(props,
                        new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

                try {
                    String toAddr = jTextField1.getText();
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress("aedexplorers@gmail.com"));
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(toAddr));
                    message.setSubject("Testing Subject");
                    String file = "H:/NEU/Java_Netbeans/Git_Final_Project/explorers/DrugManagement/PreClinicalReport.xlsx";
                    Multipart multipart = new MimeMultipart();
                    MimeBodyPart messageBodyPart = new MimeBodyPart();
                    messageBodyPart.setText("Dear Admin,"
                            + "\n\n Score for the request sent is " + request.getInterpretationScore());
                    multipart.addBodyPart(messageBodyPart);
                    messageBodyPart = new MimeBodyPart();
                    String fileName = "PreClinicalReport.xlsx";
                    DataSource source = new FileDataSource(file);
                    messageBodyPart.setDataHandler(new DataHandler(source));
                    messageBodyPart.setFileName(fileName);
                    multipart.addBodyPart(messageBodyPart);
                    message.setContent(multipart);
                    Transport.send(message);
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                try {
                    for (int num = 0; num <= 100; num++) {
                        progressBarJPanel1.UpdateProgess(num);
                        progressBarJPanel1.repaint();
                        Thread.sleep(50);
                    }
                } catch (Exception e) {

                }
            }
        };
        new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                t1.start();
                t2.start();
                try {
                    Thread.sleep(5500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PreClinicalTrialSendEmailJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
            }

            protected void done() {
                progressBarJPanel1.setVisible(false);
                JOptionPane.showMessageDialog(null, "Email Sent successfully");
                Component[] componentArray = userProcessContainer.getComponents();
                Component component = componentArray[componentArray.length - 1];
                PreClinicalTrialSendEmailJPanel aa = (PreClinicalTrialSendEmailJPanel) component;
                userProcessContainer.remove(aa);
                Component[] componentArray1 = userProcessContainer.getComponents();
                Component component1 = componentArray1[componentArray1.length - 1];
                PreClinicalTrialJPanel sysAdminwjp = (PreClinicalTrialJPanel) component1;
                sysAdminwjp.populateTable();
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
            }
        }.execute();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private UserInterface.ProgressBar.ProgressBarJPanel progressBarJPanel1;
    // End of variables declaration//GEN-END:variables
}
