package com.obs;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        // int 包装类
        ArrayList<Integer> list = new ArrayList<>();
        // int Integer 可以互相转化
        list.add(24);
        list.add(15);
        list.add(18);
        list.add(33);
        list.add(13);
        System.out.println(list); // [24, 15, 18, 33, 13]
        // 遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i== list.size() - 1){
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");  // [24, 15, 18, 33, 13]
    }
}
