package com.obs;

public class Horse {
    private String name;
    private String bodyType;
    private String dickType;
    private String skinColor;
    private double age;
    private double height;
    private double dickLength;
    char sexualOrient;

    //自动生成Constructor, get, set
    // alt + insert
    // 插件ptg 自动生成Javabean， 牛逼

    public Horse() {
    }

    public Horse(String name, String bodyType, String dickType, String skinColor, double age, double height, double dickLength, char sexualOrient) {
        this.name = name;
        this.bodyType = bodyType;
        this.dickType = dickType;
        this.skinColor = skinColor;
        this.age = age;
        this.height = height;
        this.dickLength = dickLength;
        this.sexualOrient = sexualOrient;
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
     * @return dickType
     */
    public String getDickType() {
        return dickType;
    }

    /**
     * 设置
     * @param dickType
     */
    public void setDickType(String dickType) {
        this.dickType = dickType;
    }

    /**
     * 获取
     * @return skinColor
     */
    public String getSkinColor() {
        return skinColor;
    }

    /**
     * 设置
     * @param skinColor
     */
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    /**
     * 获取
     * @return age
     */
    public double getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(double age) {
        this.age = age;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return dickLength
     */
    public double getDickLength() {
        return dickLength;
    }

    /**
     * 设置
     * @param dickLength
     */
    public void setDickLength(double dickLength) {
        this.dickLength = dickLength;
    }

    /**
     * 获取
     * @return sexualOrient
     */
    public char getSexualOrient() {
        return sexualOrient;
    }

    /**
     * 设置
     * @param sexualOrient
     */
    public void setSexualOrient(char sexualOrient) {
        this.sexualOrient = sexualOrient;
    }

    public String toString() {
        return "Horse{name = " + name + ", bodyType = " + bodyType + ", dickType = " + dickType + ", skinColor = " + skinColor + ", age = " + age + ", height = " + height + ", dickLength = " + dickLength + ", sexualOrient = " + sexualOrient + "}";
    }

}
