package com.company;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeVoice() {
        System.out.println(getName() + " Саламалекум");
    }

    @Override
    public void draw() {
        System.out.println(getName()+" \uD83D\uDC15 ");
    }
}
