package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    private boolean billGenerated;
    private boolean extraCheese;
    private boolean extraTopping;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            price = 300;
            topping = 70;
        }
        else {
            price = 400;
            topping = 120;
        }
        this.billGenerated = false;
        this.extraTopping = false;
        this.extraCheese = false;
        this.takeAway = false;
        this.bill="";
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            price += 80;
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraTopping) {
            price+=topping;
            extraTopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            price += 20;
            takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billGenerated){
            if(extraCheese)
                bill += "Extra Cheese Added: "+80+"\n";
            if(extraTopping)
                bill+="Extra Toppings Added: "+this.topping+"\n";
            if(takeAway)
                bill+="Paperbag Added: "+20+"\n";
            bill+="Total Price: "+this.price+"\n";
            billGenerated = true;
        }
        return this.bill;
    }
}
