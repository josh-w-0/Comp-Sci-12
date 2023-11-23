/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_joshuawu;

/**
 *
 * @author 335181541
 */
public abstract class Shape {
    protected static double unitPrice = -1;
    protected double[] dimensionsList;

    public static double getUnitPrice() {
        return unitPrice;
    }

    public static void setUnitPrice(double price) {
        unitPrice = price;
    }

    public abstract double[] getDimensionsList();

    public abstract double getArea();
    
    @Override
    public abstract String toString();
    
 
}
