package com.cognizant.shoppingcart;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.*;

public class ItemTests {


    Cart ct = new Cart();
    LineItem li = new LineItem();


    //    Given that I visit the site, when I begin shopping, then I expect my cart to be empty.
    @Test
    public void cartEmpty() {
        // Setup
        int expected = 0;

        // Execute
        int actual = ct.cartEmpty();


        // Assert
        Assert.assertEquals(expected, actual);
    }

    //    Given I have an empty cart, when I add an Item, then I expect to getTotalPrice() reflect the sum of all the Items in my cart, times the quantities of each item.
    @Test

    public void canAddItem() {

        //setup
        Item newItem = new Item("hhh", 9.99, true);
        Item item2 = new Item("apple", 9.99, true);
        int quantity = 1;
        double expected =29.97;

        //Ececute
        ct.addItem(newItem, quantity);
        ct.addItem(item2, 2);
        double actual = ct.totalPrice;

//        HashMap<Item, Integer> shoppingCart = ct.getCart();
//        for(Item item : shoppingCart.keySet()){
//            System.out.println("Name : " + item.getName() + ", price : " + item.getPrice() + ", Quantity : " + shoppingCart.get(item));
//        }

        //Assert
        Assert.assertEquals(expected,actual,0);
    }
//

    //    Given I have an empty cart, when I add more than one of an item, then I expect itemQuantities() to show the number of items I have added.
    @Test
    public void itemCount() {
        //setup
        Item item1 = new Item("Shirt", 50.00, true);
        Item item2 = new Item("apple", 9.99, true);
        int quantity1 = 1;
        int quantity2 = 6;
        int expected =7;

        //Ececute
        ct.addItem(item1, quantity1);
        ct.addItem(item2, quantity2);
        int actual = ct.itemCount;

        //Assert
        Assert.assertEquals(expected,actual);
    }
    //    Given I have an empty cart, when I add items, then I expect itemizedList() reflect the items I have added along with their price and quantity.
    @Test
    public void itemsList() {
        //setup
        Item item1 = new Item("Shirt", 50.00, true);
        Item item2 = new Item("apple", 9.99, true);
        int quantity1 = 1;
        int quantity2 = 6;


        //Ececute
        ct.addItem(item1, quantity1);
        ct.addItem(item2, quantity2);

        HashMap<Item, Integer> shoppingCart = ct.getCart();
        for(Item item : shoppingCart.keySet()){
            System.out.println("Name : " + item.getName() + ", price : " + item.getPrice() + ", Quantity : " + shoppingCart.get(item));
        }

        //Assert

    }
//    Given I have an empty cart, when I add more than one of an item, then I expect getTotalPrice() to reflect both the item price and quantity.
//    Given I have a cart with items that are not on sale, when I add items that are on sale, I expect onSaleItems() to include only the items on sale.

}

