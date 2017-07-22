package Ques1.toppings;

import Ques1.pizza.Pizza;

/**
 * Created by Lenovo-1 on 12-07-2017.
 */
public abstract class PizzaToppings {

    int price;

    public Pizza addTopping(Pizza pizza){
        pizza.setPrice(pizza.getPrice()+this.price);
        return pizza;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
       this.price=price;
    }

    public abstract void setPrice();
}
