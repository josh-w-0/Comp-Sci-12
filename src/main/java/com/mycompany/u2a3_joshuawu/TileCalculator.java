/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u2a3_joshuawu;

import java.util.ArrayList;

/**
 *
 * @author 335181541
 */
public class TileCalculator extends javax.swing.JFrame {
   
    /**
     * Creates new form TileCalculator
     */
    public TileCalculator() {
        initComponents();
    }
    public static boolean isDouble(String str) { 
     try {  
        Double i = Double.parseDouble(str);  
        return (i>0);
     } catch(NumberFormatException e){  
        return false;  
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

        shapeType = new javax.swing.ButtonGroup();
        rectangle = new javax.swing.JRadioButton();
        parallelogram = new javax.swing.JRadioButton();
        triangle = new javax.swing.JRadioButton();
        circle = new javax.swing.JRadioButton();
        donut = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        dimen1 = new javax.swing.JLabel();
        dimen2 = new javax.swing.JLabel();
        selectShape = new javax.swing.JLabel();
        dimen3 = new javax.swing.JLabel();
        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        input3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        shapes = new javax.swing.JTextArea();
        output = new javax.swing.JTextField();
        addShape = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shapeType.add(rectangle);
        rectangle.setText("Rectangle");
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });

        shapeType.add(parallelogram);
        parallelogram.setText("Parallelogram");
        parallelogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parallelogramActionPerformed(evt);
            }
        });

        shapeType.add(triangle);
        triangle.setText("Triangle");
        triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleActionPerformed(evt);
            }
        });

        shapeType.add(circle);
        circle.setText("Circle");
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });

        shapeType.add(donut);
        donut.setText("Donut");
        donut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donutActionPerformed(evt);
            }
        });

        shapeType.add(jRadioButton7);
        jRadioButton7.setText("jRadioButton7");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        shapeType.add(jRadioButton8);
        jRadioButton8.setText("jRadioButton8");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Tile Caclulator");

        dimen1.setText("Length:");

        dimen2.setText("Width:");

        selectShape.setText("Please select a shape:");

        input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input1ActionPerformed(evt);
            }
        });

        input2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input2ActionPerformed(evt);
            }
        });

        input3.setVisible(false);
        input3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input3ActionPerformed(evt);
            }
        });

        shapes.setEditable(false);
        shapes.setColumns(20);
        shapes.setRows(5);
        jScrollPane1.setViewportView(shapes);

        output.setEditable(false);
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        addShape.setText("Add Shape");
        addShape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addShapeActionPerformed(evt);
            }
        });

        jLabel2.setText("List of Shapes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rectangle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addComponent(selectShape))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(parallelogram)
                                            .addComponent(triangle))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dimen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dimen1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(circle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dimen3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jRadioButton8)
                                    .addComponent(donut)
                                    .addComponent(jRadioButton7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addShape, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rectangle)
                    .addComponent(selectShape))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parallelogram)
                    .addComponent(dimen1)
                    .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(triangle)
                    .addComponent(dimen2)
                    .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(circle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dimen3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addGap(12, 12, 12)
                .addComponent(donut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addShape)
                    .addComponent(jRadioButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String shape;
    ArrayList<Shape> shapeList = new ArrayList<>();
    private void triangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleActionPerformed
        dimen1.setText("Base:");
        dimen2.setText("Height:");
        dimen3.setText("");
        shape = "triangle";
        input2.setVisible(true);        
        input3.setVisible(false);
    }//GEN-LAST:event_triangleActionPerformed

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        dimen1.setText("Length:");
        dimen2.setText("Width:");
        dimen3.setText("");
        shape = "rectangle";
        input2.setVisible(true);
        input3.setVisible(false);
    }//GEN-LAST:event_rectangleActionPerformed

    private void input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input1ActionPerformed

    private void input3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input3ActionPerformed

    private void input2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input2ActionPerformed

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleActionPerformed
        dimen1.setText("Radius:");
        dimen2.setText("");
        dimen3.setText("");
        shape = "circle";
        input2.setVisible(false);
        input3.setVisible(false);
    }//GEN-LAST:event_circleActionPerformed

    private void parallelogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parallelogramActionPerformed
        dimen1.setText("Base:");
        dimen2.setText("Height:");
        dimen3.setText("");
        shape = "parallelogram";
        input2.setVisible(true);
        input3.setVisible(false);
    }//GEN-LAST:event_parallelogramActionPerformed

    private void donutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donutActionPerformed
        dimen1.setText("Inner Radius:");
        dimen2.setText("Outer Radius:");
        dimen3.setText("");
        shape = "donut";
        input2.setVisible(true);
        input3.setVisible(false);
    }//GEN-LAST:event_donutActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        dimen3.setText("test");
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void addShapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addShapeActionPerformed
        String str1 = input1.getText();
        String str2 = input2.getText();
        String str3 = input3.getText();
        switch(shape){
            case "circle":
                if (isDouble(str1))
                {
                    shapeList.add(new Circle(Double.parseDouble(str1)));
                    shapes.append(shapeList.get(shapeList.size()-1).toString() + "\n" );
                }
                break;
            case "donut":
                if (isDouble(str1) && isDouble(str2))
                {
                    shapeList.add(new Donut(Double.parseDouble(str1), Double.parseDouble(str2)));
                    shapes.append(shapeList.get(shapeList.size()-1).toString() + "\n" );
                }
                break;
            case "parallelogram":
                if (isDouble(str1) && isDouble(str2))
                {
                    shapeList.add(new Parallelogram(Double.parseDouble(str1), Double.parseDouble(str2)));
                    shapes.append(shapeList.get(shapeList.size()-1).toString() + "\n" );                    
                }   
                break;
            case "rectangle":
                if (isDouble(str1) && isDouble(str2))
                {
                    shapeList.add(new Rectangle(Double.parseDouble(str1), Double.parseDouble(str2)));
                    shapes.append(shapeList.get(shapeList.size()-1).toString() + "\n" );
                }   
                break;
            case "triangle":
                if (isDouble(str1) && isDouble(str2))
                {
                    shapeList.add(new Triangle(Double.parseDouble(str1), Double.parseDouble(str2)));
                    shapes.append(shapeList.get(shapeList.size()-1).toString() + "\n" );
                }
                break;
            default:
                output.setText("Please select a shape.");
                break;
        }
    }//GEN-LAST:event_addShapeActionPerformed

    
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
            java.util.logging.Logger.getLogger(TileCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TileCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TileCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TileCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TileCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addShape;
    private javax.swing.JRadioButton circle;
    private javax.swing.JLabel dimen1;
    private javax.swing.JLabel dimen2;
    private javax.swing.JLabel dimen3;
    private javax.swing.JRadioButton donut;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JTextField input3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField output;
    private javax.swing.JRadioButton parallelogram;
    private javax.swing.JRadioButton rectangle;
    private javax.swing.JLabel selectShape;
    private javax.swing.ButtonGroup shapeType;
    private javax.swing.JTextArea shapes;
    private javax.swing.JRadioButton triangle;
    // End of variables declaration//GEN-END:variables
}
