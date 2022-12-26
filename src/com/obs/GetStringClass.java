package com.obs;

import java.util.ArrayList;

public class GetStringClass {
    public static void main(String[] args) {
        // <String> 泛型： 限定集合中存储数据的类型
        // JDK7
        // ArrayList<String> list = new ArrayList<String>();
        // JDK8
        // ArrayList 打印对象不是地址，而是集合中存储的内容
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}