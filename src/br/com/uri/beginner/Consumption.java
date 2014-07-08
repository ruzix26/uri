package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/7/14.
 *
 * Uri 1014 - Consumption
 */
public class Consumption {


    public double calculateConsumption(int x, double y) {

        double average;

        average = x/y;

        return average;
    }

    public static void main(String[] args) {

        int x;
        double y;
        double average;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextDouble();

        average = x/y;

        System.out.printf("%.3f km/l\n", average);

    }
}
