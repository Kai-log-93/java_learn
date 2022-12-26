package com.obs;

public class StringCompare {
    public static void main(String[] args) {
        // ==
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); //使用相同地址，true
        // 直接赋值是在串池
        // new 是在堆内存
        // 这两个不相同
        String s3 = new String("abc");
        String s4 = "abc";
        System.out.println(s3 == s4); // false
        // 字符串比较内容
        System.out.println(s3.equals(s4)); // true


    }
}
