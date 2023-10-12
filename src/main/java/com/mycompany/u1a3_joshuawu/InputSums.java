/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a3_joshuawu;

/**
 *
 * @author 335181541
 */

public class InputSums extends javax.swing.JFrame {

    /**
     * Creates new form InputSums
     */
    public static boolean isNumeric(String str) { 
      try {  
        int i = Integer.parseInt(str);  
        return true;
      } catch(NumberFormatException e){  
        return false;  
      }  
    }
    int[] numList = new int[20];
    int currentIndex = 0;
    String input;
    public InputSums() {
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

        Add = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        intInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        intList = new javax.swing.JTextArea();
        sumAll = new javax.swing.JButton();
        sumEven = new javax.swing.JButton();
        sumOdd = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        List = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter an integer:");

        intInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intInputActionPerformed(evt);
            }
        });

        intList.setEditable(false);
        intList.setColumns(20);
        intList.setRows(5);
        jScrollPane1.setViewportView(intList);

        sumAll.setText("sumAll");
        sumAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumAllActionPerformed(evt);
            }
        });

        sumEven.setText("sumEven");
        sumEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumEvenActionPerformed(evt);
            }
        });

        sumOdd.setText("sumOdd");

        output.setEditable(false);
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Integer Sums");

        List.setText("List");
        List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sumAll)
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sumEven)
                                    .addComponent(sumOdd)
                                    .addComponent(List))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(output, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(intInput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(Add)
                                .addGap(18, 18, 18)
                                .addComponent(Remove)))
                        .addContainerGap(15, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(intInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add)
                    .addComponent(Remove))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sumAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(List)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sumEven)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumOdd)
                        .addGap(28, 28, 28)))
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        input = intInput.getText();
        if (currentIndex>19)
            output.setText("Max number of integers reached. Please remove an int first.");
        else if (isNumeric(input))
        {
            if (Integer.parseInt(input) > 0)
            {
                numList[currentIndex] = Integer.parseInt(input);
                currentIndex++;
            }
            else
                output.setText("You entered an negative number or 0. Enter a positive integer.");
        }
        else 
        {
            output.setText("You entered an invalid input. Enter a positive integer.");
        }
    }//GEN-LAST:event_AddActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        input = intInput.getText();
        if (isNumeric(input))
        {
            if (Integer.parseInt(input) > 0)
            {
                for (int i=0;i<20;i++)
                {
                    if (numList[i] == Integer.parseInt(input))
                    {
                        numList[i] = 0;
                        currentIndex--;
                        while ((19-i)>0)
                        {
                           numList[i] = numList[i+1];
                           i++;
                        }
                        numList[19] = 0;
                        break;
                    }
                }
            }
            else
                output.setText("You entered an negative number or 0. Enter a positive integer.");
        }
        else 
        {
            output.setText("You entered an invalid input. Enter a positive integer.");
        }       
    }//GEN-LAST:event_RemoveActionPerformed

    private void sumEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumEvenActionPerformed
        
    }//GEN-LAST:event_sumEvenActionPerformed

    private void sumAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumAllActionPerformed
        
    }//GEN-LAST:event_sumAllActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        
    }//GEN-LAST:event_outputActionPerformed

    private void intInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intInputActionPerformed

    private void ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListActionPerformed
        intList.setText("");
        for (int i = 0; i<20; i++)
            {
                if (numList[i] != 0)
                {
                    intList.append(numList[i] + "\n");
                }
            }
    }//GEN-LAST:event_ListActionPerformed

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
            java.util.logging.Logger.getLogger(InputSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputSums().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton List;
    private javax.swing.JButton Remove;
    private javax.swing.JTextField intInput;
    private javax.swing.JTextArea intList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField output;
    private javax.swing.JButton sumAll;
    private javax.swing.JButton sumEven;
    private javax.swing.JButton sumOdd;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
