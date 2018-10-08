package com.timbuchalka;

/**
 * Created by Antonina on 2017-05-06.
 */
public class FancyBurger extends Burger{
    private boolean chips;
    private String drink;

    public FancyBurger(String rollType, String meat, double price) {
        super(rollType, meat, price);
        this.chips = true;
        this.drink = "cola";
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String showOrderDetails() {
        return super.showOrderDetails() + "\nchips: true \ndrink: " + drink;
    }

    @Override
    public void setLettuce(boolean lettuce) {
        super.setLettuce(false);
    }

    @Override
    public void setTomato(boolean tomato) {
        super.setTomato(false);
    }

    @Override
    public void setBbqSauce(boolean bbqSauce) {
        super.setBbqSauce(false);
    }

    @Override
    public void setCucumber(boolean cucumber) {
        super.setCucumber(false);
    }
}
