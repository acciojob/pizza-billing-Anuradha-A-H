package com.driver;

import java.util.HashMap;
import java.util.HashSet;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    HashSet<String> map;
    private int total;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
         bill = "";
         price = 0;
        if(isVeg)
        {
            price = 300;

        }else{
            price = 400;

        }
        bill += "Base Price Of The Pizza: "+price+"\n";
        map = new HashSet<>();
        total = price;
    }

    public int getPrice(){
        return this.total;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!map.contains("Cheese"))
        {

                map.add("Cheese");
                total += 80;
                bill += "Extra Cheese Added: 80\n";

        }

    }

    public void addExtraToppings(){
        // your code goes here
        if (!map.contains("Toppings")) {
            int toppingsPrice = isVeg ? 70 : 120;
            map.add("Toppings");
            total += toppingsPrice;
            bill += "Extra Toppings Added: " + toppingsPrice + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here

        if(!map.contains("bag")) {
            total += 20;
            map.add("bag");
            bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        if(!map.contains("totalbill"))
        {
            map.add("totalbill");
            bill += "Total Price: "+total+"\n";
        }

        return this.bill;
    }
}
