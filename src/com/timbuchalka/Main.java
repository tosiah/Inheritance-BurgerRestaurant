package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Burger hamburger = new Burger("dark", "beef", 3.0);
        hamburger.setLettuce(true);
        hamburger.setTomato(true);
        hamburger.setBbqSauce(false);
        hamburger.setCucumber(true);

        System.out.println("The cost of Burger is " + hamburger.countCost());
        System.out.println(hamburger.showOrder());

        HealthyBurger fit = new HealthyBurger("pork", 4.0);
        fit.setLettuce(true);
        fit.setTomato(true);
        fit.setBbqSauce(false);
        fit.setCucumber(true);
        fit.setAvocado(true);
        fit.setCucumber(true);

        System.out.println("The cost of HealthyBurger is " + fit.countCost());
        System.out.println(fit.showOrder());

        DeluxBurger del = new DeluxBurger("rye", "chicken", 6.0);
        del.setLettuce(true);
        del.setTomato(true);
        del.setBbqSauce(false);
        del.setCucumber(true);
        del.setDrink("tea");
        System.out.println("The cost of DeluxBurger is " + del.countCost());
        System.out.println(del.showOrder());

    }
}
