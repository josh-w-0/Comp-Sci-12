/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u2a4_joshuawu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 335181541
 */
public class GroceryInventory extends javax.swing.JFrame {

    /**
     * Creates new form GroceryInventory
     */
    public GroceryInventory() {
        initComponents();
    }
  public static String[] readFromFile(){
    
    String outputAsString = "";
    String [] outputAsArray;
    
    try {
      File file = new File("inventory.txt"); //Creation of file object
      Scanner fileInput = new Scanner(file); //Scanner can also be used to read information from a file. 

      while (fileInput.hasNextLine()){
        outputAsString += fileInput.nextLine()+"\n"; //Converting the file into one large string which can be split into an array of strings later on.
      }
      
      fileInput.close(); //Closing the scanner to prevent memory leaks.
        
      
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred."); //This would happen if something goes wrong such as the file does not exist. 
    }
     
    outputAsArray = outputAsString.split("\n"); //Converting the string into an array of strings delimited (look up that word if you don't know what it is) by the by the end of line character (\n). Remember the .split() commend for the future (maybe for a test??).  
    
    return outputAsArray;
    
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        read = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodList = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();
        output = new javax.swing.JTextField();
        skuType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        skuNums = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        read.setText("Read File");
        read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readActionPerformed(evt);
            }
        });

        foodList.setColumns(20);
        foodList.setRows(5);
        jScrollPane1.setViewportView(foodList);
        String[] list = readFromFile();
        for (String str: list){
            String[] vars = str.split(",");
            itemList.add(new Item(vars[0],vars[1],vars[2],
                Integer.parseInt(vars[3]),Integer.parseInt(vars[4]),Double.parseDouble(vars[5]),
                Double.parseDouble(vars[6]),Double.parseDouble(vars[7]),
                Double.parseDouble(vars[8]),Double.parseDouble(vars[9])));
        foodList.append(itemList.get(itemList.size()-1).toString() + "\n");
    }

    title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    title.setText("Grocery Store Inventory");

    skuType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FRU", "VEG", "MEA" }));
    skuType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            skuTypeActionPerformed(evt);
        }
    });

    jLabel1.setText("-");

    jTextField1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
        }
    });

    jLabel2.setText("Food Name:");

    jButton1.setText("Search Food");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(skuType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(skuNums, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addComponent(jScrollPane1)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(read)
                    .addGap(84, 84, 84)
                    .addComponent(title))
                .addComponent(output))
            .addContainerGap(11, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(read)
                .addComponent(title))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(skuType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(skuNums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(jButton1))
            .addContainerGap(106, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    ArrayList<Item> itemList = new ArrayList<>();
    
    private void readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readActionPerformed
        String[] list = readFromFile();
        itemList.clear();
        foodList.setText("");
        for (String str: list){
        String[] vars = str.split(",");
        itemList.add(new Item(vars[0],vars[1],vars[2],
                Integer.parseInt(vars[3]),Integer.parseInt(vars[4]),Double.parseDouble(vars[5]),
                Double.parseDouble(vars[6]),Double.parseDouble(vars[7]),
                Double.parseDouble(vars[8]),Double.parseDouble(vars[9])));
        foodList.append(itemList.get(itemList.size()-1).toString() + "\n");
        }

    }//GEN-LAST:event_readActionPerformed

    private void skuTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skuTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skuTypeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(GroceryInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroceryInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroceryInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroceryInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroceryInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea foodList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField output;
    private javax.swing.JButton read;
    private javax.swing.JTextField skuNums;
    private javax.swing.JComboBox<String> skuType;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
