/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_joshuawu;

/**
 *
 * @author 335181541
 */
public class Trapezoid extends Shape{
    public Trapezoid(double botLength, double topLength, double height){
        this.dimensionsList = new double[]{botLength, topLength, height};
    }
    
    @Override
    public double[] getDimensionsList() {
        return this.dimensionsList;
    }
 
    @Override
    public double getArea(){
        return ((this.dimensionsList[0]+this.dimensionsList[1])*(this.dimensionsList[2]))/2;
    }
    
    @Override
    public String toString() {
        return "Trapezoid: Bottom Base Length = " + this.dimensionsList[0] + " cm, Top Base Length = "  
                + this.dimensionsList[1] + " cm, Height = " + 
                this.dimensionsList[2] + " cm";
    }
}
