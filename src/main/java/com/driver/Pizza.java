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
        return this.price;
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
//        if(!map.contains("Cheese"))
//        {
//            map.add("Cheese");
//            total += 80;
//            bill += "Extra Cheese Added: 80\n";
//        }
        if(!map.contains("Toppings"))
        {
            if(isVeg)
            {
                map.add("Toppings");
                total += 70;
                bill += "Extra Toppings Added: 70\n";
            }else{
                map.add("Toppings");
                total += 120;
                bill += "Extra Toppings Added: 120\n";
            }

        }
    }

    public void addTakeaway(){
        // your code goes here
//        if(!map.contains("bag"))
//        {
            map.add("bag");
            total += 20;
            bill += "Paperbag Added: 20\n";
//        }
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
