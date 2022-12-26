package com.obs;

import java.util.ArrayList;

public class GetStringClass {
    public static void main(String[] args) {
//        <String> 泛型： 限定集合中存储数据的类型
//        JDK7
//        ArrayList<String> list = new ArrayList<String>();
//        JDK8
//        ArrayList 打印对象不是地址，而是集合中存储的内容
//        List 可以增删改查
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);  // []

//        boolean add(E e)     添加
        list.add("Horse");
        list.add("Bull");
        list.add("Green Orc");
        list.add("Brown Orc");
        System.out.println(list);  // [Horse, Bull, Green Orc, Brown Orc]
//        boolean remove(E e)  删除
        boolean result = list.remove("Green Orc");
        System.out.println(list);  // [Horse, Bull, Brown Orc]
        System.out.println(result); // true
        list.remove(0);
        System.out.println(list); // [Bull, Brown Orc]
//        E set(set index,E e) 修改
        String result1 = list.set(1,"Green Orc");
        System.out.println(result1); // Brown Orc
        System.out.println(list); // [Bull, Green Orc]

//        E get(int index)     查询
        String result2 = list.get(0);
        System.out.println(result2); // Bull
        System.out.println(list); // [Bull, Green Orc]
//       Size
        System.out.println(list.size()); //2

    }
}