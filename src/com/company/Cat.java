package com.company;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeVoice() {
        System.out.println("Кис кис!!!");
    }

    @Override
    public void draw() {
        System.out.println(getName()+"\uD83D\uDE3D");
    }
}
