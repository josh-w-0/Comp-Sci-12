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
    private double passengerFare, fuelEfficiency, tripCost=-1;
    private static double gasPrice = -1;
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
    
    public double totalCost(int distance){
        this.tripCost = gasPrice*distance*this.fuelEfficiency;
        return gasPrice*distance*this.fuelEfficiency;
    }

    public int getPassengerNum() {
        return passengerNum;
    }
    
    public double calculateProfit(){
        return revenue()-this.tripCost;
    }

    public static double getGasPrice() {
        return gasPrice;
    }

    public double getTripCost() {
        return tripCost;
    }
    
    public boolean isProfitable(){
        return (revenue() - this.tripCost)>PROFIT;
    }
    public static boolean compareTo(Vehicle a, Vehicle b){ //true if a is higher, false if b is higher
        return (a.revenue()-a.tripCost>b.revenue()-b.tripCost);
    }
    @Override
    public String toString() {
        return " passengerNum=" + passengerNum + ", passengerFare=" + passengerFare + ", fuelEfficiency=" + fuelEfficiency;
    }
    
    
}
