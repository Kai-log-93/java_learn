package com.obs;

public class SBClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("fuck you");
        //打印的的是值
        //StringBuilder 的函数作用于当前的语句
        System.out.println(sb);
        sb.append(" Garrosh ");
        sb.append(18);
        sb.append(" cm ");
        sb.append(" penis ");
        System.out.println(sb); //fuck youGarrosh18cmpenis
        sb.reverse();
        System.out.println(sb); //fuck youGarrosh18cmpenis
        sb.reverse();
        // to string
        String str = sb.toString();
        System.out.println(str);
    }
}
