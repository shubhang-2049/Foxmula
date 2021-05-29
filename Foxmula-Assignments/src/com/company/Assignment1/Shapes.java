package com.company.Assignment1;

public class Shapes {
    public static void main(String args[])
    {
        Trapezoid t=new Trapezoid(2,2,2,2,2,2,2,2,4);
        Parallelogram p = new Parallelogram(2,2,2,2,2,2,2,2,4);
        Rectangle r = new Rectangle(2,2,2,2,2,2,2,2);
        Square s = new Square(2,2,2,2,2,2,2,2);
        System.out.println("Area of Trapezoid : "+t.getArea());
        System.out.println("Area of Parallelogram : "+p.getArea());
        System.out.println("Area of Rectangle : "+r.getArea());
        System.out.println("Area of Square : "+s.getArea());
    }
}
