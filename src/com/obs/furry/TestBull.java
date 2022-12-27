package com.obs.furry;

//静态方法只能访问静态变量和静态方法
//非静态方法可以访问任何变量和方法
//静态方法中没有this关键字
public class TestBull {
    public static void main(String[] args) {
        Bull.paleName = "Jorida";
        Bull b1 = new Bull();
        b1.name = "Tor";
        b1.age = 43;
        b1.show1();

        System.out.println("============");



    }
}
