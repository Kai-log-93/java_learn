package com.obs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //创建手机对象
        Phone p = new Phone();
        p.brand = "Mi";
        p.price = 999.9;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.game();
    }
}