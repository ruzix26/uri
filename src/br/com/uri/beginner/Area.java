package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1012 - Area
 */
public class Area {

    public double calculateAreaTriangle(double a, double c) {

        double area = (a*c)/2;

        return area;
    }

    public double calculaleAreaCircle(double c) {

        double area = Math.PI*c*c;

        return area;
    }

    public double calculateAreaTrapezium(double a, double b, double c){

        double area = ((a + b) * c)/2;

        return area;
    }

    public double calculateAreaSquare(double b){

        double area = b*b;

        return area;
    }

    public double calculateAreaRectangle(double a, double b) {

        double area = a*b;

        return area;
    }

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        double areaTriangle;
        double areaCircle;
        double areaTrapezium;
        double areaSquare;
        double areaRectangle;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTriangle = (a*c)/2;

        areaCircle = Math.PI*c*c;

        areaTrapezium = ((a+b)*c)/2;

        areaSquare = b*b;

        areaRectangle = a*b;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangle);
        System.out.printf("CIRCULO: %.3f\n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f\n", areaSquare);
        System.out.printf("RETANGULO: %.3f\n", areaRectangle);
    }


}
