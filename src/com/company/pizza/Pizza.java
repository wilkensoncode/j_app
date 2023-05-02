package com.company.pizza;

import java.io.BufferedReader;

public class Pizza {

    private int price;
    private int basePizzaPrice;
    private boolean veggie;
    private boolean togo;
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
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.basePizzaPrice = this.price;
    }

    public void businessInfo(String businessName, String phone, String street, String address) {
        StringBuilder br = new StringBuilder("@mainstreetpizza.com");
        this.businessName = businessName;
        this.email = (this.businessName.replace(" ", "") + br).replace("'", "");
        this.phone = phone;
        this.street = street;
        this.address = address;
    }

    public boolean addExtraCheese(boolean cheese) {
        boolean choice = false;
        if (cheese) {
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

    public void isTakeAway(boolean isTogo) {
        this.togo = isTogo;
        if (isTogo) {
            this.price += backpack;
        }
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

        if (this.veggie) {
            System.out.println("++With veggie++");
        } else {
            System.out.println("++Without Veggie++");
        }
        if (togo) {
            System.out.println("Take away opt in");
        }
        System.out.printf("%s%sTotal bill %d \n", bizInfo, receipt, getBill());

    }

}
