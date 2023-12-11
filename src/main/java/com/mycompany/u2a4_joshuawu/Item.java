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
    private static int fruNum = 1, vegNum = 1, meaNum = 1; //item category indexes based on SKU.
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
        switch (this.sku.substring(0,3)){ //increments item category index based on item
            case "FRU" -> fruNum++;
            case "VEG" -> vegNum++;
            case "MEA" -> meaNum++;
            default -> System.out.println("An error occured.");
        }
    }

    public String getName() { //getter methods.
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
    public static void clearItemNums(){ //set fruNum, vegNum and meaNum to 1.
        fruNum = 1;
        vegNum = 1;
        meaNum = 1;
    }
    @Override
    public String toString() { //outputs the item object in the correct format for inventory.txt
        return  sku + "," + name + "," + category + "," + quantity + "," + minimumQuantity + "," + vendorPrice + "," + markupPercentage + "," + regularPrice + "," + currentDiscount + "," + currentPrice;
    }

    
}
