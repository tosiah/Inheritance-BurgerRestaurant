package com.timbuchalka;

/**
 * Created by Antonina on 2017-05-06.
 */
public class Burger {
    private String rollType;
    private String meat;
    protected double price;
    private boolean lettuce;
    private boolean tomato;
    private boolean bbqSauce;
    private boolean cucumber;

    public Burger(String rollType, String meat, double price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.lettuce = false;
        this.tomato = false;
        this.bbqSauce = false;
        this.cucumber = false;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isBbqSauce() {
        return bbqSauce;
    }

    public void setBbqSauce(boolean bbqSauce) {
        this.bbqSauce = bbqSauce;
    }

    public boolean isCucumber() {
        return cucumber;
    }

    public void setCucumber(boolean cucumber) {
        this.cucumber = cucumber;
    }

    public void showSummary(){
        System.out.println("\nThe cost of " + getClass().getSimpleName() + ": " + countCost());
        System.out.println(showOrderDetails());
    }

    public String showOrderDetails() {
        return "lettuce: " + isLettuce() + "\ntomato: "
                + isTomato() + "\nbbqSauce: " + isBbqSauce() + "\ncucmber: " + isCucumber();
    }


    public double countCost() {
        if(lettuce) {
            this.price += 0.20;
        }

        if(tomato) {
            this.price += 0.35;
        }

        if(bbqSauce) {
            this.price += 0.25;
        }

        if(cucumber) {
            this.price += 0.30;
        }
        return this.price;
    }

}
