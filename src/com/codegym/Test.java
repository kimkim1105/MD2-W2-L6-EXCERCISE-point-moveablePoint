package com.codegym;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(2,3);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(3,7);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());

        movablePoint = new MovablePoint(1,2,3,7);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}