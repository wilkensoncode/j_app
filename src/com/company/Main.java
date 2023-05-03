package com.company;

import com.company.pizza.Pizza;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pizza basePizza = new Pizza(true);
        basePizza.addExtraCheese(false);
        basePizza.addExtraTopping(false);
        basePizza.isTakeAway(true);
        basePizza.printBill();

        Pizza pizza = new Pizza(false);
        pizza.addExtraCheese(true);
        pizza.addExtraTopping(false);
        pizza.isTakeAway(false);
        pizza.printBill();

    }
}
