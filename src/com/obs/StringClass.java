package com.obs;

public class StringClass {
    public static void main(String[] args) {
        // Horse
        String horse = "Horse";
        System.out.println(horse);
        // Bull
        String bull = new String("Bull");
        System.out.println(bull);
        String holy = new String(); // ""
        System.out.println("Nothing"+ holy + "Nothing");
        // 传递数组到字符串
        char[] orientation= {'M','F'};
        String s = new String(orientation);
        System.out.println(s);
        // byte
        byte[] b = {97,98,99,100};
        String s1 = new String(b);
        System.out.println(s1);
    }
}
