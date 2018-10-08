package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Burger hamburger = new Burger("dark", "beef", 3.0);
        hamburger.setLettuce(true);
        hamburger.setTomato(true);
        hamburger.setBbqSauce(false);
        hamburger.setCucumber(true);

        FitBurger fit = new FitBurger("pork", 4.0);
        fit.setLettuce(true);
        fit.setTomato(true);
        fit.setBbqSauce(false);
        fit.setCucumber(true);
        fit.setAvocado(true);
        fit.setCucumber(true);

        FancyBurger fancy = new FancyBurger("rye", "chicken", 6.0);
        fancy.setLettuce(true);
        fancy.setTomato(true);
        fancy.setBbqSauce(false);
        fancy.setCucumber(true);
        fancy.setDrink("tea");

        hamburger.showSummary();
        fit.showSummary();
        fancy.showSummary();
    }


}
