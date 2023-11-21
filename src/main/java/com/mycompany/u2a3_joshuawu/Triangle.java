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
public class Triangle extends Shape{
    public Triangle(double base, double height){
        this.dimensionsList = new double[]{base, height};
    }
    
    @Override
    public double[] getDimensionsList() {
        return this.dimensionsList;
    }

    @Override
    public String toString() {
        return "Triangle " + Arrays.toString(this.getDimensionsList());
    }    
}