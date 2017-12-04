package com.timbuchalka;

/**
 * Created by Antonina on 2017-05-06.
 */
public class HealthyBurger extends Burger{
    private boolean avocado;
    private boolean carrot;
    public HealthyBurger(String meat, double price) {
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
    public String showOrder() {

        return super.showOrder() + "\n avocado: " + isAvocado() + "\n carrot: " + isCarrot();
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
