/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a4_joshuawu;

/**
 *
 * @author 335181541
 */
public class Item {
    private String sku, name, category;
    private int quantity, minimumQuantity;
    private double vendorPrice, markupPercentage, regularPrice, currentDiscount, currentPrice;

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
    }

    
}
