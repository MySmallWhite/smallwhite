package com.test;

/**
 * @Author:Small_White
 * @Date:Created in 12:50 2018/1/8
 */
public class PassengerCar extends car{
    private static int load = 12;
    private static float price = 200;

    public static void show() {
        System.out.println("客车:");
        System.out.println("载客数量：" + load + "人");
        System.out.println("出租价格：" + price + "/天");
        System.out.println("剩余数量：" + num + "辆");
    }

    public static float rent(int day,int num) {
        car.num -= num;
        System.out.println("租赁客车" + num + "辆 " + day +"天，价格为：" + price*num*num + "元");
        return price*num*num;
    }
}
