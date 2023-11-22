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
public class Circle extends Shape{
    public Circle(double radius){
        this.dimensionsList = new double[]{radius};
    }
    
    @Override
    public double[] getDimensionsList() {
        return this.dimensionsList;
    }

    @Override
    public double getArea(){
        return (Math.PI*Math.pow(this.dimensionsList[0],2));
    }
    
    @Override
    public String toString() {
        return "Circle " + Arrays.toString(this.getDimensionsList());
    }

    
}
