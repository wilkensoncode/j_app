package com.company.pizza;

public class Pizza {

    private int price;
    private final int basePizzaPrice;
    private final int extraCheesePrice = 100;
    private final int extraTopping = 150;
    private final int backpack = 20;

    private final boolean veggie;
    private boolean togo;

    private String email;
    private String businessName;
    private String phone;
    private String street;
    private String address;

    public Pizza(boolean veggie) {
        this.veggie = veggie;
        if (this.veggie) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.basePizzaPrice = this.price;
    }

    private void businessInfo() {
        StringBuilder br = new StringBuilder("@mainstreetpizza.com");
        this.businessName = "Mike's pizza";
        this.email = (this.businessName.replace(" ", "") + br).replace("'", "");
        this.phone = "+1(203) 403-4545";
        this.street = "88";
        this.address = "main st";
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
        businessInfo();

        String bizInfo = "";

        String receipt = String.format("\nbase pizza: %d\nExtra cheese:%d\n" +
                        "Extra topping: %d\nBack pack: %d\n"
                , this.basePizzaPrice, this.extraCheesePrice,
                this.extraTopping, this.backpack);
        if (togo) {
            receipt += "\ntake away opt in";
        }

        bizInfo += this.businessName + "\n";
        bizInfo += this.street + " ";
        bizInfo += this.address + "\n";
        bizInfo += this.email + "\n";
        bizInfo += this.phone + "\n";

        if (this.veggie) {
            System.out.println("++With veggie++\n");
        } else {
            System.out.println("++Without Veggie++\n");
        }
        System.out.printf("%n%s%sTotal bill %d \n", bizInfo, receipt, getBill());
        System.out.println();

    }

}
