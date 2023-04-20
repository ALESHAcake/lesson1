package ru.geekbrains;

public class Chocolate extends Product {
    private double calories;

    public double getCalories(){return calories;}
    public Chocolate(String name, double price, double calories){
        super(name, price);
        this.calories = calories;
    }



    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - каллории : %f", brand, name, price,calories);

    }
}
