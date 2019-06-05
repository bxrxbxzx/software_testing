package ru.softwaretesting.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
       hello("world");
        hello("user");
        hello("Alexey");

        Point p1 = new Point(5, 15);
        Point p2 = new Point(7, 22);
        System.out.println( "Расстояние между двумя точками равно: " + distance(p1, p2));
        System.out.println("Расстояние между двумя точками равно: " +  p1.distance(p2));

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);

        System.out.println("Площадь прямоугольника со стороноами " + r.a + " и " + r.b + " = " + s.area());

    }
    public static void hello(String somebody){

        System.out.println("Hello, " + somebody + "!");

    }

    public static double distance(Point p1, Point p2){

        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));



    }






}

