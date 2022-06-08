package com.company;

public class Equation {
    private final double a;
    private final double b;
    private final double c;
    public Equation(double[] values)
    {
        this.a = values[0];
        this.b = values[1];
        this.c = values[2];
    }

    public double[] Solve()
    {

        double delta = Math.pow(b,2)-4*this.a*this.c;
        double []arr = {};
        if(delta>0)
        {
            double x1 = (-this.b-delta)/2*this.a;
            double x2 = (-this.b+delta)/2*this.a;
            arr = new double[]{x1, x2};
        }else if(delta==0){
            double x1 = -this.b/2*a;
            arr = new double[]{x1};
        }
        return arr;
    }
}
