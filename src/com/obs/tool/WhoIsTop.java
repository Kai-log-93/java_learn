package com.obs.tool;

import com.obs.furry.Furry;

public class WhoIsTop {
    // 用于判断谁是 1
    // 以及sex的位置
    // 私有化构造方法
    // 不让外界创建它的对象
    private WhoIsTop(){}

    //定义为静态方法，方便调用
//    private String specie;
//    private String name;
//    private String bodyType;
//    private double preferedPosition;
//    private int length;
    public static void checkOnEach(Furry f1, Furry f2){
        if (f1.getLength() > f2.getLength()) {
            System.out.println(f1.getName() + " is Top！");
        } else if (f2.getBodyType() == "hulk") {
            System.out.println(f1.getName() + " is Top！");
        } else if (f2.getPreferedPosition() == 0 && f1.getPreferedPosition() > 0) {
            System.out.println(f1.getName() + " is Top！");
        } else if (f2.getPreferedPosition() == 0.5 && f1.getPreferedPosition() >0.5){
            System.out.println(f1.getName() + " is Top！");
        } else if (f2.getPreferedPosition() == f1.getPreferedPosition()){
            System.out.println(f1.getName() + " and " + f2.getName() + " will do frottage!");
        } else {
            System.out.println(f2.getName() + " is Top！");
        }
    }
}
