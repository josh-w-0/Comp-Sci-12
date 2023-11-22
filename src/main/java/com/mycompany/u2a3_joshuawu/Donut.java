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
public class Donut extends Shape{
    public Donut(double inRadius, double outRadius){
        this.dimensionsList = new double[]{inRadius, outRadius};
    }
    
    @Override
    public double[] getDimensionsList() {
        return this.dimensionsList;
    }
 
    @Override
    public double getArea(){
        return (Math.PI*Math.pow(this.dimensionsList[1],2))-(Math.PI*Math.pow(this.dimensionsList[0],2));
    }
    
    @Override
    public String toString() {
        return "Donut " + Arrays.toString(this.getDimensionsList());
    }
}
