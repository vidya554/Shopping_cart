package com.cognizant.shoppingcart;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Cart {

    public int itemCount =0;
    public double totalPrice =0;
    private static int capacity;

    //private static Item[] cart = new Item[capacity];

    private HashMap<Item, Integer> cart = new HashMap<>();

    public HashMap<Item, Integer> getCart() {
        return cart;
    }

    public void setCart(HashMap<Item, Integer> cart) {
        this.cart = cart;
    }

    public int cartEmpty() {

//        itemCount = 10;
//        totalPrice = 0.0;
//        capacity = 0;
        return cart.size();
    }

    public void addItem(Item item, int itemQuantity) {

        cart.put(item, itemQuantity);
        totalPrice += item.getPrice()*itemQuantity;
        itemCount += itemQuantity;

    }


//    public void addItem(int itemID, String itemName, double itemPrice, int onSale, String itemDescription, int itemQuantity, double itemTax) {
//        Item item = new Item(itemID, itemName, itemPrice, onSale, itemDescription, itemQuantity, itemTax);
//        totalPrice += (itemPrice * itemQuantity);
//        cart[itemCount] = item;
//        itemCount += 1;
//
//    }


    public int getTotalPrice() {
        return cart.size();
    }



//    public void add(int itemID, String itemName, double itemPrice, boolean onSale, String itemDescription, int itemQuantity, double itemTax){
//        Item item = new Item(itemID, itemName, itemPrice, onSale, itemDescription, itemQuantity, itemTax);
//        totalPrice += (itemPrice * itemQuantity);
//        cart[itemCount] = item;
//        itemCount += 1;
//
//
//    }




    public static void prLine (int itemID, String itemName, int itemQuantity, double itemPrice, double total, double itemTax) {
        System.out.printf("\n", itemID, itemName, itemPrice, itemQuantity, itemTax, total);
    }

    public static void prTitles () {
        System.out.printf("\n", "ID", "Item", "Price", "Quantity", "Tax", "Total");
    }


}

