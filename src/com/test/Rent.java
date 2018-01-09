package com.test;

import lombok.Data;

import java.util.Scanner;

/**
 * @Author:Small_White
 * @Date:Created in 12:39 2018/1/8
 */

public class Rent {
    public static void main(String[] args) {
        double sum = 0;
        System.out.println("*****欢迎使用笨鸟租赁系统*****");
        boolean w = true;
        while (w) {
            System.out.println("现有两种车");
            PassengerCar.show();
            VanCar.show();
            Scanner sc = new Scanner(System.in, "utf-8");

            System.out.println("\n选择您想租赁的车辆类型：");
            System.out.println("1.客车   2.货车");
            int s2 = sc.nextInt();

            System.out.println("\n选择租赁数量：");
            int s1 = sc.nextInt();

            System.out.println("\n输入您的租赁天数：");
            int s3 = sc.nextInt();

            switch (s2) {
                case 1:
                    sum += PassengerCar.rent(s3, s1);
                    break;
                case 2:
                    sum += VanCar.rent(s3, s1);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            System.out.println("\n是否退出？");
            System.out.println("1.是  2.否");
            int s4 = sc.nextInt();

            if (s4 == 1) {
                w = false;
            }

            switch (s4) {
                case 1:
                    w = false;
                    break;
                case 2:
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        System.out.println("总计：" + sum);

    }
}
