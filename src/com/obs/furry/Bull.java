package com.obs.furry;

public class Bull {
    String name;
    int age;
    static String paleName;

    public void show1() {
        System.out.println("this: " + this);
        System.out.println(name + ", " + age + ", " + paleName);
    }

    public static void method(){
        System.out.println("Static Method!");
    }
}
