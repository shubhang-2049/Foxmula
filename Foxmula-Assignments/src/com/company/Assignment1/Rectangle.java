package com.company.Assignment1;

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
