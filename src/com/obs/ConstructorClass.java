package com.obs;

public class ConstructorClass {
    private String horse;
    private int length;
    public ConstructorClass(){
        this.horse = "Muscle Black";
        this.length = 18;
        System.out.println("You want fuck this Muscle Horse?");
    }
    public ConstructorClass(String horse, int length){
        this.horse = horse;
        this.length = length;
    }
    public String getHorse(){
        return horse;
    }
    public int getLength(){
        return length;
    }
}
