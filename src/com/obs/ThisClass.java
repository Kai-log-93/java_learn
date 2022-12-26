package com.obs;

public class ThisClass {
    private int bullLength = 18;
    private String bullName = "Striper";


    public void setBullName(String bullName){
        //will reset the bullName
        this.bullName = bullName;
    }
    public int getBullLength() {
        int bullLength = 10;
        //如果使用this关键字，就会使用class 的属性
        //否则会使用 方法中的变量
        //就近原则
        System.out.println(bullName + " has a " + this.bullLength + "cm penis!!");
        return  bullLength;
    }
}
