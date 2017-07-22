package Ques1.toppings;

/**
 * Created by Lenovo-1 on 12-07-2017.
 */
public class Tomato extends PizzaToppings {
    @Override
    public void setPrice(){setPrice(100);}

    @Override
    public String toString() {
        return "Tomato price= Rs." + price;
    }
}
