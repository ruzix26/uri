package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1003 - Simple Sum
 */
public class Sum2 {

    public int sumNumbers2(int a, int b) {

        int result = a + b;

        return result;

    }

    public static void main (String[] args) {

        int a;
        int b;
        int result;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        result = a + b;

        System.out.println("SOMA = "+result);



    }

}
