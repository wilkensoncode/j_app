package com.company.pizza;

public class Pizza {

    private int price;
    private int basePizzaPrice;
    private boolean veggie;
    private int extraCheesePrice = 100;
    private int extraTopping = 150;
    private int backpack = 20;
    private String email;
    String businessName;
    String phone;
    String street;
    String address;

    public Pizza(boolean veggie) {
        this.veggie = veggie;
        if (this.veggie) {
            System.out.println("----------\nwith veggie\n-----------");
            this.price = 300;
        } else {
            System.out.println("------------\nWithout veggie\n-------------");
            this.price = 400;
        }
        this.basePizzaPrice = this.price;
    }
    public void businessInfo(String businessName, String phone, String street, String address){
        this.email ="@mainstreetpizza.com";
        this.businessName = businessName + this.email;
        this.phone = phone;
        this.street = street;
        this.address = address;
    }
    public boolean addExtraCheese(boolean cheese) {
        boolean choice = false;
        if (cheese) {
            System.out.println("Extra cheese added");
            this.price += extraCheesePrice;
            choice = true;
        }
        return choice;
    }

    public boolean addExtraTopping(boolean topping) {
        boolean choice = false;
        if (topping) {
            System.out.println("Extra topping added");
            this.price += extraTopping;
            choice = true;
        }
        return choice;
    }

    public boolean isTakeAway(boolean isTogo) {
        boolean toGo = false;
        if (isTogo) {
            System.out.println("Take away opt in");
            this.price += backpack;
            toGo = true;
        }
        return toGo;
    }

    private int getBill() {
        return this.price;
    }

    public void printBill() {
        String bizInfo = "";
        String receipt = "";
        receipt += "base pizza: " + Integer.toString(this.basePizzaPrice) + "\n";
        receipt += "Extra cheese: " + Integer.toString(this.extraCheesePrice) + "\n";
        receipt += "Extra topping: " + Integer.toString(this.extraTopping) + "\n";
        receipt += "Back pack: " + Integer.toString(this.backpack) + "\n";

        bizInfo += this.businessName + "\n";
        bizInfo += this.street + " ";
        bizInfo += this.address + "\n";
        bizInfo += this.email + "\n";
        bizInfo += this.phone + "\n";

        System.out.printf("%s %sTotal bill %d \n",bizInfo, receipt, getBill());

    }

}
