package com.yang.day13;

public class Item {
    String name;
    int price;

    public static void main(String[] args) {
        Item item = new Item();
        item.effect();

        LifePotion lp = new LifePotion();
        lp.effect();
    }

    public void buy() {
        System.out.println("购买");
    }

    public void effect() {
        System.out.println("物品使用hou可以有效果！");
    }
}
