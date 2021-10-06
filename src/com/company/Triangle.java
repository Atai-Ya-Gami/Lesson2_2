package com.company;

public class Triangle extends Figure{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int CalculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void draw() {
        System.out.println(getName()+ "\uD83D\uDD3A");
    }
}
