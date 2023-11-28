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
public class Parallelogram extends Shape{
    public Parallelogram(double length, double width){
        this.dimensionsList = new double[]{length, width};
    }
    
    @Override
    public double[] getDimensionsList() {
        return this.dimensionsList;
    }
    
    @Override
    public double getArea(){
        return (this.dimensionsList[0]*this.dimensionsList[1]);
    }
    
    @Override
    public String toString() {
        return "Parallelogram: Base = " + this.dimensionsList[0] + " cm, Height = "  + this.dimensionsList[1] + " cm" 
                + "\nArea: " + df.format(this.getArea()) + "cm\u00B2";
    }    
}
