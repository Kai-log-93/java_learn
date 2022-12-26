package com.obs;

public class TestConstructorClass {
    public static void main(String[] args) {
        //调用空参构造方法
//        ConstructorClass horse = new ConstructorClass();
        //调用带参构造方法
        ConstructorClass horse = new ConstructorClass("Muscle Brown",22);
        System.out.println(horse.getHorse() + " has a " + horse.getLength() +
                "cm penis");
    }
}
