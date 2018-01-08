package com.test;

/**
 * @Author:Small_White
 * @Date:Created in 12:41 2018/1/8
 */
public abstract class car {
    public static int num = 5;
    private int  load;
    private double price;

    public static void show(){};
    public static void rent(){};

    public int getLoad() {
        return load;
    }
    public  void setLoad(int load) {
        this.load = load;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
