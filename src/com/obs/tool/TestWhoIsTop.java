package com.obs.tool;

import com.obs.furry.Furry;

public class TestWhoIsTop {
    public static void main(String[] args) {
//    private String specie;
//    private String name;
//    private String bodyType;
//    private double preferedPosition;
//    private int length;
        Furry horse = new Furry("Horse","Jorida","Muscular",1,22);
        Furry bull = new Furry("Bull","Minos","Muscular",1,22);
        WhoIsTop.checkOnEach(horse,bull);
    }

}
