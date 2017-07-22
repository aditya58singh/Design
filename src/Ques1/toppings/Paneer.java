package Ques1.toppings;

/**
 * Created by Lenovo-1 on 12-07-2017.
 */
public class Paneer extends PizzaToppings {

    public void setPrice(){setPrice(120);}

    @Override
    public String toString() {
        return "Paneer price= Rs." + price;
    }
}
