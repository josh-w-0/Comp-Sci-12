/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_joshuawu;

import java.util.Arrays;

/**
 *
 * @author 335181541
 */
public class Rectangle extends Shape {

    public Rectangle(double length, double width) {
        this.dimensionsList = new double[]{length, width};
    }
    
    @Override
    public double[] getDimensionsList() {
        return this.dimensionsList;
    }
    @Override
    public String toString() {
        return "Rectangle " + Arrays.toString(this.getDimensionsList());
    }
}
