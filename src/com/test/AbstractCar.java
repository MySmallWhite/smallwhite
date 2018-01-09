package com.test;

import lombok.Data;

/**
 * @Author:Small_White
 * @Date:Created in 12:41 2018/1/8
 */
@Data
public abstract class AbstractCar {
    private static int num = 5;
    private int load;
    private double price;

    public static void show() {
    }
    public static void rent() {
    }


    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        AbstractCar.num = num;
    }
//
//    public int getLoad() {
//        return load;
//    }
//
//    public void setLoad(int load) {
//        this.load = load;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
}
