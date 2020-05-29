package com.yang.day24;

import com.yang.day23.Telphone;

public class Smartphone extends Telphone implements IPlayGame {
    @Override
    public void call() {
        System.out.println("通过语音打电话");
    }

    @Override
    public void message() {
        System.out.println("通过语言发短信");
    }

    @Override
    public void playGame() {
        System.out.println("具有了玩游戏的功能");
    }
}
