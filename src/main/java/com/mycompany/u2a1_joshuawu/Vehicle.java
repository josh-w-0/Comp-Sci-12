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
        this.tripCost = gasPrice*distance;
        return gasPrice*distance;
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
    public static String compareTo(Vehicle a, Vehicle b){
        if (a.calculateProfit()>b.calculateProfit())
        {
            return a.toString();
        }
        else return b.toString();
    }
    @Override
    public String toString() {
        return " passengerNum=" + passengerNum + ", passengerFare=" + passengerFare + ", fuelEfficiency=" + fuelEfficiency;
    }
    
    
}
