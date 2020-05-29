package com.yang.day26;

import java.util.ArrayList;
import java.util.Scanner;

public class CarSystem {

    private static String goodByeInfo = "欢迎再次使用本系统，再见！";
    private static int dayBorrow;

    public static void beginSystem() {
        CarSystem.SystemWelcome();
        Scanner scanner = new Scanner(System.in);
        String userCommand = scanner.next();


        switch (userCommand) {
            case "1":
                CarSystem.getUserInput();
                break;
            case "0":
                System.out.println(goodByeInfo);
                break;
            default:
                System.out.println("输入错误..End running..");
                System.exit(0);
                break;
        }
    }

    public static void SystemWelcome() {
        System.out.println("欢迎使用答答租车系统:");
        System.out.println("您是否要租车: 1-是  0-否");
    }

    public static void getUserInput() {
        int numCarBorrow = 0;
        ArrayList<Car> carList = new ArrayList<Car>(6);
        carList.add(new MannedCar(4, 500, "奥迪A4"));
        carList.add(new MannedCar(4, 400, "马自达6"));
        carList.add(new BothCarry(450, 4, 2, "皮卡雪6"));
        carList.add(new MannedCar(20, 800, "金龙"));
        carList.add(new Truck(400, 4, "松花江"));
        carList.add(new Truck(1000, 20, "依维河"));

        System.out.println("请输入您要租汽车的数量:");
        Scanner sr = new Scanner(System.in);

        numCarBorrow = sr.nextInt();

        int[] carNumList = new int[numCarBorrow];
        for (int i = 0; i < numCarBorrow; i++) {
            System.out.println("请输入第" + (i + 1) + "辆车的序号:");
            if (sr.hasNext()) {
                carNumList[i] = sr.nextInt();
            }
        }
        System.out.println("请输入租车天数:");
        if (sr.hasNext()) {
            dayBorrow = sr.nextInt();
        }
        sr.close();

        StringBuilder manned = new StringBuilder();
        int numOfManned = 0;
        StringBuilder goods = new StringBuilder();
        int numOfGoods = 0;
        int totalCost = 0;

        for (int i = 0; i < carNumList.length; i++) {
            if (carNumList[i] > 0 && carNumList[i] < 3 || carNumList[i] == 4) {
                manned.append("    ");
                manned.append(carList.get(carNumList[i] - 1).getName());
                numOfManned += carList.get(carNumList[i] - 1).getPersonNum();
            } else if (carNumList[i] == 3) {
                manned.append("    ");
                manned.append(carList.get(carNumList[i] - 1).getName());
                goods.append("    ");
                goods.append(carList.get(carNumList[i] - 1).getName());
                numOfManned += carList.get(carNumList[i] - 1).getPersonNum();
                numOfGoods += carList.get(carNumList[i] - 1).getGoodsNum();
            } else {
                goods.append("    ");
                goods.append(carList.get(carNumList[i] - 1).getName());
                numOfGoods += carList.get(carNumList[i] - 1).getGoodsNum();
            }
            totalCost += carList.get(carNumList[i] - 1).getPrice();
        }
        //Output
        System.out.println("您的账单:\n***可载人的车有:");
        System.out.println(manned + "    共载人: " + numOfManned);
        System.out.println("***载货的车有:\n" + goods + "    共载货 : " + numOfGoods + "吨");
        System.out.println("***租车总价格: " + totalCost * dayBorrow + "元");

    }


}
