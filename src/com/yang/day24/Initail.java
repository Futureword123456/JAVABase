package com.yang.day24;


public class Initail {
    public static void main(String[] args) {


        IPlayGame iPlayGame = (IPlayGame) new Smartphone();
        IPlayGame iPlayGame1 = new Psp();
        iPlayGame.playGame();
        iPlayGame1.playGame();
        IPlayGame iPlayGame2 = new IPlayGame() {

            @Override
            public void playGame() {
                System.out.println("使用内部类方式实现接口");
            }
        };
        iPlayGame2.playGame();
        new IPlayGame() {

            @Override
            public void playGame() {
                System.out.println("使用内部类方式实现接口1");
            }
        }.playGame();
    }
}
