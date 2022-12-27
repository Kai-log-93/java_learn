package com.obs.furry;

public class Furry {
    private String specie;
    private String name;
    private String bodyType;
    private double preferedPosition;
    private int length;

    public Furry() {
    }

    public Furry(String specie, String name, String bodyType, double preferedPosition, int length) {
        this.specie = specie;
        this.name = name;
        this.bodyType = bodyType;
        this.preferedPosition = preferedPosition;
        this.length = length;
    }

    /**
     * 获取
     * @return specie
     */
    public String getSpecie() {
        return specie;
    }

    /**
     * 设置
     * @param specie
     */
    public void setSpecie(String specie) {
        this.specie = specie;
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
     * @return bodyType
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * 设置
     * @param bodyType
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * 获取
     * @return preferedPosition
     */
    public double getPreferedPosition() {
        return preferedPosition;
    }

    /**
     * 设置
     * @param preferedPosition
     */
    public void setPreferedPosition(double preferedPosition) {
        this.preferedPosition = preferedPosition;
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
        return "Furry{specie = " + specie + ", name = " + name + ", bodyType = " + bodyType + ", preferedPosition = " + preferedPosition + ", length = " + length + "}";
    }
}
