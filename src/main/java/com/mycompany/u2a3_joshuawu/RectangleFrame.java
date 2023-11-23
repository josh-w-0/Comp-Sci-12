/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_joshuawu;

/**
 *
 * @author 335181541
 */
public class RectangleFrame extends Shape{
    public RectangleFrame(double inLength, double inWidth, double outLength, double outWidth){
        this.dimensionsList = new double[]{inLength, inWidth, outLength, outWidth};
    }
    
    @Override
    public double[] getDimensionsList() {
        return this.dimensionsList;
    }
 
    @Override
    public double getArea(){
        return (this.dimensionsList[3]*this.dimensionsList[4])-(this.dimensionsList[0]*this.dimensionsList[1]);
    }
    
    @Override
    public String toString() {
        return "Rectangle Frame: Inner Length = " + this.dimensionsList[0] + " cm, Inner Width = "  
                + this.dimensionsList[1] + " cm, Outer Length = " + 
                this.dimensionsList[2] + " cm, Outer Width = " + this.dimensionsList[3] + " cm";
    }
}

