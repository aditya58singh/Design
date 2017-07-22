package Ques1.toppings;

import Ques1.pizza.Pizza;

/**
 * Created by Lenovo-1 on 12-07-2017.
 */
public class Barbeque extends PizzaToppings {

    public void setPrice(){setPrice(200);}

    @Override
    public String toString() {
        return "Barbeque price= Rs." + price;
    }
}
