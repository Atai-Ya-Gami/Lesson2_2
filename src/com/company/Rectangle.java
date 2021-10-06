package com.company;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int CalculatePerimeter() {
        return (sideA+sideB)*2;
    }

    @Override
    public void draw() {
        System.out.println(getName()+"\uD83D\uDFE9");
    }
}
