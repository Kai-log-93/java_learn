package com.obs;

public class TestPhoneClass {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //创建手机对象
        PhoneClass p = new PhoneClass();
        p.brand = "Mi";
        p.setPrice(999.9);
        System.out.println(p.brand);
        System.out.println(p.getPrice());
        p.call();
        p.game();
    }
}