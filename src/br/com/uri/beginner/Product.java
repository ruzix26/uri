package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1004 - Simple Product
 */
public class Product {

    public int productNumbers(int a, int b) {

        int result;

        result = a * b;

        return result;

    }

    public static void main(String[] args) {

        int a;
        int b;
        int result;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        result = a * b;

        System.out.println("PROD = " + result);
    }


}

