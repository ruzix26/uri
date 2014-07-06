package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1010 - Simple Calculte
 */
public class SimpleCalculate {

    public String simpleCalculte(int unit1, float price1, int unit2, float price2){

        float valueToPay = unit1 * price1 + unit2 * price2;

        String valueToPlayFormat = "R$ "+valueToPay;

        return valueToPlayFormat;
    }

    public static void main(String[] args) {

        int product1;
        int product2;
        int unit1;
        int unit2;
        float price1;
        float price2;
        float valueToPay;

        Scanner sc = new Scanner(System.in);

        product1 = sc.nextInt();
        unit1 = sc.nextInt();
        price1 = sc.nextFloat();

        product2 = sc.nextInt();
        unit2 = sc.nextInt();
        price2 = sc.nextFloat();

        valueToPay = unit1 * price1 + unit2 * price2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valueToPay);

    }
}
