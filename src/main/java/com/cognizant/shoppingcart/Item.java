package com.cognizant.shoppingcart;

public class Item {
    private String name;
    private double itemPrice;
    private boolean available;

    public Item (String itemName, double price, boolean onSale){

        name = itemName;
        available = onSale;
        itemPrice = price;
    }



    public String getName(){
        return name;
    }

    public boolean getOnSale(){
        return available;
    }

    public double getPrice(){
        return itemPrice;
    }

}

