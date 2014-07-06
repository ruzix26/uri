package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1005 - Average 1
 */
public class Average {

    public float averageNumbers(float a, float b){

        float result;

        a *= 3.5;
        b *= 7.5;

        result = (a+b)/11;

        return result;

    }

    public static void main(String[] args){

        double a;
        double b;
        double result;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        a *= 3.5;
        b *= 7.5;

        result = (a + b)/11;
        System.out.printf("MEDIA = %.5f\n", result);
    }
}
