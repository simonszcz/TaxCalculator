/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taxcalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author AIPE2007
 */
public class Tax extends javax.swing.JFrame {

    /**
     * Creates new form Tax
     */
    public Tax() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rdWeekly = new javax.swing.JRadioButton();
        rdFortnight = new javax.swing.JRadioButton();
        rdMonthly = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAI = new javax.swing.JTextField();
        lblAT = new javax.swing.JTextField();
        lblNI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("AustralianTaxCalculator2016-2017");

        buttonGroup1.add(rdWeekly);
        rdWeekly.setSelected(true);
        rdWeekly.setText("Weekly");
        rdWeekly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdWeeklyActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdFortnight);
        rdFortnight.setText("Fortnight");
        rdFortnight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFortnightActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdMonthly);
        rdMonthly.setText("Monthly");
        rdMonthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMonthlyActionPerformed(evt);
            }
        });

        jLabel2.setText("Income");

        txtIncome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIncomeActionPerformed(evt);
            }
        });

        btnCalculate.setText("CALCULATE");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel3.setText("ANNUAL INCOME");

        jLabel4.setText("ANNUAL TAX");

        jLabel5.setText("ANNUAL NET INCOME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rdWeekly)
                                    .addGap(36, 36, 36)
                                    .addComponent(rdFortnight)
                                    .addGap(31, 31, 31)
                                    .addComponent(rdMonthly))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(163, 163, 163))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIncome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblAI, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                        .addComponent(lblNI)
                                        .addComponent(lblAT))))
                            .addGap(10, 10, 10)
                            .addComponent(btnCalculate)
                            .addGap(18, 18, 18)
                            .addComponent(btnExit)
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdWeekly)
                                    .addComponent(rdFortnight)
                                    .addComponent(rdMonthly))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalculate)
                                    .addComponent(btnExit))
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3))
                            .addComponent(lblAI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(lblAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lblNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        calculate();
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIncomeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void rdWeeklyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdWeeklyActionPerformed
        // TODO add your handling code here:
        calculate();
    }//GEN-LAST:event_rdWeeklyActionPerformed

    private void rdFortnightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFortnightActionPerformed
        // TODO add your handling code here:
        calculate();
    }//GEN-LAST:event_rdFortnightActionPerformed

    private void rdMonthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMonthlyActionPerformed
        // TODO add your handling code here:
        calculate();
    }//GEN-LAST:event_rdMonthlyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tax().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lblAI;
    private javax.swing.JTextField lblAT;
    private javax.swing.JTextField lblNI;
    private javax.swing.JRadioButton rdFortnight;
    private javax.swing.JRadioButton rdMonthly;
    private javax.swing.JRadioButton rdWeekly;
    private javax.swing.JTextField txtIncome;
    // End of variables declaration//GEN-END:variables

    private void calculate() {
        double taxRate = 0.0;
        double taxIncome = 0.0;
        double income = 0.0;
        int payperiod = 0;
        double baseTax = 0.0;
        double annualTax = 0.0;
        double annualIncome = 0.0;
        double annualNet = 0.0;
        if (rdWeekly.isSelected() == true) {
            payperiod = 52;
        }
        if (rdFortnight.isSelected() == true) {
            payperiod = 26;
        }
        if (rdMonthly.isSelected() == true) {
            payperiod = 12;
        }
         try {
             
             income = Double.parseDouble(txtIncome.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter Numbers only");
            txtIncome.setText("0.0");
        }
        annualIncome = payperiod * income;
        lblAI.setText(String.valueOf(annualIncome));
        
        if (annualIncome>=0 && annualIncome<=18200){
            taxRate = 0.0;
            baseTax = 0.0;
            taxIncome = annualIncome;
        }
        if (annualIncome>=18201 && annualIncome<=37000){
            taxRate = 0.19;
            baseTax = 0.0;
            taxIncome = annualIncome - 18200;
        }
        if (annualIncome>=37001 && annualIncome<=80000){
            taxRate = 0.325;
            baseTax = 3572;
            taxIncome = annualIncome - 37000;
        }
        if (annualIncome>=80001 && annualIncome<=180000){
            taxRate = 0.37;
            baseTax = 17547;
            taxIncome = annualIncome - 80000;
        }
        if (annualIncome>=180001){
            taxRate = 0.45;
            baseTax = 54547;
            taxIncome = annualIncome - 180000;
        } 
        
        annualTax = baseTax + taxRate * taxIncome;
        lblAT.setText(String.valueOf(annualTax));
        
        annualNet = annualIncome - annualTax;
        lblNI.setText(String.valueOf(annualNet));
}
}
