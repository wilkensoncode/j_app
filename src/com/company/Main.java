package com.company;

import com.company.pizza.Pizza;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pizza basePizza = new Pizza(true);
        basePizza.businessInfo("Mike's pizza","+1(203) 403-4545","88","main st");
        basePizza.addExtraCheese(false);
        basePizza.addExtraTopping(false);
        basePizza.isTakeAway(true);
        basePizza.printBill();

        Pizza pizza = new Pizza(false);
        pizza.businessInfo("Jhon's pizza","+1(203) 433-4545","95","Jane st");
        pizza.addExtraCheese(true);
        pizza.addExtraTopping(false);
        pizza.isTakeAway(false);
        pizza.printBill();
    }
}
