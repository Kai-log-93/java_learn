package com.obs;

public class PhoneClass {
    String brand;
    private double price;
    // must be void
    public void setPrice(double a){
        price = a;
    }
    // must no prameter
    public double getPrice(){
        return price;
    }
    public void call(){System.out.println("Calling!");}
    public void game(){
        System.out.println("Gaming!");
    }
}