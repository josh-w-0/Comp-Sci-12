/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a1_joshuawu;

/**
 *
 * @author 335181541
 */
public class Vehicle {
    private int passengerNum;
    private double passengerFare, fuelEfficiency;
    private static double gasPrice;
    private static final int PROFIT = 400;

    public Vehicle(int passengerNum, double passengerFare, double fuelEfficiency) {
        this.passengerNum = passengerNum;
        this.passengerFare = passengerFare;
        this.fuelEfficiency = fuelEfficiency;
    }
    public double revenue(){
        return passengerNum*passengerFare;
    }

    public static void setGasPrice(double gasPrice) {
        Vehicle.gasPrice = gasPrice;
    }
    
}
