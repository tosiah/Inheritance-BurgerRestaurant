package com.timbuchalka;

/**
 * Created by Antonina on 2017-05-06.
 */
public class FitBurger extends Burger{
    private boolean avocado;
    private boolean carrot;
    public FitBurger(String meat, double price) {
        super("brown rye", meat, price);
        this.avocado = false;
        this.carrot = false;
    }

    public boolean isAvocado() {
        return avocado;
    }

    public void setAvocado(boolean avocado) {
        this.avocado = avocado;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    @Override
    public String showOrderDetails() {

        return super.showOrderDetails() + "\navocado: " + isAvocado() + "\ncarrot: " + isCarrot();
    }

    @Override
    public double countCost() {
        super.countCost();
        if(avocado) {
            this.price += 0.40;
        }

        if(carrot) {
            this.price += 0.20;
        }
        return this.price;
    }
}
