package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[]values = {0,0,0};
        System.out.println("Podaj wartosci (a b c): ");
        values[0] = in.nextDouble();
        values[1] = in.nextDouble();
        values[2] = in.nextDouble();

        Equation eq = new Equation(values);
        double[] results = eq.Solve();
        if(results.length==0)
        {
            System.out.println("Nieprawidlowe wartosci. Delta mniejsza niz 0");
        }else if(results.length==1){
            System.out.println("x = "+results[0]);
        }else{
            System.out.println("x1 = "+results[0]+"\nx2 = "+results[1]);
        }
    }
}

