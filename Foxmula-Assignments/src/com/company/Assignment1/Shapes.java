package com.company.Assignment1;

abstract class Quadrilateral
{
    private double  x_a,y_a;
    private double  x_b,y_b;
    private double  x_c,y_c;
    private double  x_d,y_d;

    Quadrilateral(){
        x_a=0;
        x_b=0;
        x_c=0;
        x_d=0;
        y_a=0;
        y_b=0;
        y_c=0;
        y_d=0;
    }
    Quadrilateral(double  x_a,double  y_a,double  x_b,double  y_b,double  x_c,double  y_c,double  x_d,double  y_d)
    {
        this.x_a=x_a;
        this.x_b=x_b;
        this.x_c=x_c;
        this.x_d=x_d;
        this.y_a=y_a;
        this.y_b=y_b;
        this.y_c=y_c;
        this.y_d=y_d;
    }
    public double getX_a() {
        return x_a;
    }

    public double getY_a() {
        return y_a;
    }

    public double getX_b() {
        return x_b;
    }

    public double getY_b() {
        return y_b;
    }

    public double getX_c() {
        return x_c;
    }

    public double getY_c() {
        return y_c;
    }

    public double getX_d() {
        return x_d;
    }

    public double getY_d() {
        return y_d;
    }
    public double getDistance(double x1,double x2,double y1,double y2)
    {
        double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return distance;
    }
    abstract double getArea();
}
class Trapezoid extends Quadrilateral
{
    private double height;
    Trapezoid(double  x_a,double  y_a,double  x_b,double  y_b,double  x_c,double  y_c,double  x_d,double  y_d,double height)
    {
        super(x_a,x_b,x_c,x_d,y_a,y_b,y_c,y_d);
        this.height=height;
    }
    public double getArea()
    {
        return height*(getDistance(super.getX_a(),super.getX_b(),super.getY_a(),super.getY_b())+getDistance(super.getX_a(),super.getX_b(),super.getY_a(),super.getY_b()))/2;
    }
}
class Parallelogram extends Quadrilateral
{
    private double height;
    Parallelogram(double  x_a,double  y_a,double  x_b,double  y_b,double  x_c,double  y_c,double  x_d,double  y_d,double height)
    {
        super(x_a,x_b,x_c,x_d,y_a,y_b,y_c,y_d);
        this.height=height;
    }
    public double getArea()
    {
        return height*getDistance(super.getX_a(),super.getX_b(),super.getY_a(),super.getY_b());
    }
}
class Rectangle extends Quadrilateral
{
    Rectangle(double  x_a,double  y_a,double  x_b,double  y_b,double  x_c,double  y_c,double  x_d,double  y_d)
    {
        super(x_a,x_b,x_c,x_d,y_a,y_b,y_c,y_d);
    }
    public double getArea()
    {
        return getDistance(super.getX_a(),super.getX_b(),super.getY_a(),super.getY_b())*getDistance(super.getX_b(),super.getX_c(),super.getY_b(),super.getY_c());
    }
}
class Square extends Quadrilateral
{
    Square(double  x_a,double  y_a,double  x_b,double  y_b,double  x_c,double  y_c,double  x_d,double  y_d)
    {
        super(x_a,x_b,x_c,x_d,y_a,y_b,y_c,y_d);
    }
    public double getArea()
    {
        return getDistance(super.getX_a(),super.getX_b(),super.getY_a(),super.getY_b())*getDistance(super.getX_a(),super.getX_b(),super.getY_a(),super.getY_b());
    }
}
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
