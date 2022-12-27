package com.obs.furry;

import java.util.ArrayList;

public class TestHorses {
    public static void main(String[] args) {
        ArrayList<Horse> list = new ArrayList<>();
        Horse Jorida = new Horse("Jorida",20);
        Horse Florida = new Horse("Florida",24);
        list.add(Jorida);
        list.add(Florida);
        System.out.println(list); // [Horse{name = Jorida, length = 20}, Horse{name = Florida, length = 24}]
        // 遍历元素
        for (int i = 0; i < list.size(); i++) {
            Horse h = list.get(i);
            System.out.println(h.getName() + ", " + h.getLength());
        }
    }
}
