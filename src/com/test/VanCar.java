package com.test;

import lombok.Data;

/**
 * @Author:Small_White
 * @Date:Created in 13:51 2018/1/8
 */
public class VanCar extends AbstractCar {
    private static int load = 20;
    private static double price = 300;

    public static void show() {
        System.out.println("货车:");
        System.out.println("载客数量：" + load + "吨");
        System.out.println("出租价格：" + price + "/天");
        System.out.println("剩余数量：" + AbstractCar.getNum() + "辆");
    }

    public static double rent(int day, int num) {
        int c = AbstractCar.getNum();
        c -= num;
        setNum(c);
        System.out.println("租赁客车" + num + "辆 " + day + "天，价格为：" + price * num * num + "元");
        return price * num * num;
    }
}
