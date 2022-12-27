package com.obs.furry;

public class Horse {
    private String name;
    private int length;

    public Horse() {
    }

    public Horse(String name, int length) {
        this.name = name;
        this.length = length;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return "Horse{name = " + name + ", length = " + length + "}";
    }
}
