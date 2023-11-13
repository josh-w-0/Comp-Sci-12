/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_joshuawu;

/**
 *
 * @author 335181541
 */
public class Circle extends Shape{
    public Circle(){
        this.dimensionsList = new double[]{3.14159,1};
    }
    @Override
    public double[] getDimensionsList() {
        return dimensionsList;
    }
    
}
