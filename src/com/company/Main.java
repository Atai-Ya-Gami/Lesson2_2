package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle("Круг", 10);
        //System.out.println("Периметр --> " + circle.getName()+" "+circle.CalculatePerimeter());
    Triangle triangle = new Triangle("Треугольник", 10,10,12);
        //System.out.println("Периметр --> "+ triangle.getName()+" " + triangle.CalculatePerimeter());
    Square square = new Square("Квадрат", 4);
        //System.out.println("Периметр --> " + square.getName()+ " " + square.CalculatePerimeter());
    Rectangle rectangle = new Rectangle("Прямоуольник", 20,10);
       // System.out.println("Периметр --> " + rectangle.getName()+ " " + rectangle.CalculatePerimeter());
    Dog dog = new Dog("Рекс");
    Cat cat = new Cat("Кошкин");
        Drawable[] drawables = {circle, triangle, square, rectangle, dog, cat};
        for (Drawable drawable: drawables) {
            if(drawable instanceof Figure){
                System.out.println("Периметр -->" + ((Figure)drawable).getName() + " " + ((Figure)drawable).CalculatePerimeter());
            }
            if (drawable instanceof Animal){
                ((Animal) drawable).makeVoice();
            }
            drawable.draw();
        }
//        for (int i = 0; i < figures.length; i++) {
//            System.out.println("Периметр -->" + figures[i].getName()+ figures[i].CalculatePerimeter());
//        }
    }
}
