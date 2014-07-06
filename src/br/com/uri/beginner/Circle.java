package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/3/14.
 *
 * Uri 1002 - Area of a Circle
 */
public class Circle {

    private static final double PI = 3.14159;

    public double calculateArea(int R) {

        double area = Math.PI*R*R;

        return area;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();

        double area = PI*R*R;
        System.out.printf("A=%.4f\n", area);

    }
}



