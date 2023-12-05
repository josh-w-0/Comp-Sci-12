/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a4_joshuawu;

import java.text.DecimalFormat;

/**
 *
 * @author 335181541
 */
public class Item {
    private String sku, name, category;
    private int quantity, minimumQuantity;
    private double vendorPrice, markupPercentage, regularPrice, currentDiscount, currentPrice;
    private static int fruNum = 1, vegNum = 1, meaNum = 1; 
    DecimalFormat df = new DecimalFormat("0000.");
    public Item(String sku, String name, String category, 
            int quantity, int minimumQuantity, double vendorPrice, double markupPercentage, 
            double regularPrice, double currentDiscount, double currentPrice) {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.minimumQuantity = minimumQuantity;
        this.vendorPrice = vendorPrice;
        this.markupPercentage = markupPercentage;
        this.regularPrice = regularPrice;
        this.currentDiscount = currentDiscount;
        this.currentPrice = currentPrice;
        switch (this.sku.substring(0,3)){
            case "FRU" -> fruNum++;
            case "VEG" -> vegNum++;
            case "MEA" -> meaNum++;
            default -> System.out.println("An error occured.");
        }
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    public static int getFruNum() {
        return fruNum;
    }

    public static int getVegNum() {
        return vegNum;
    }

    public static int getMeaNum() {
        return meaNum;

    }

    @Override
    public String toString() {
        return  sku + "," + name + "," + category + "," + quantity + "," + minimumQuantity + "," + vendorPrice + "," + markupPercentage + "," + regularPrice + "," + currentDiscount + "," + currentPrice;
    }

    
}
