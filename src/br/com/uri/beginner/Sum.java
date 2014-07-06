package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/3/14.
 *
 * Uri 1001 - Extremely Basic
 */
public class Sum {


    public static int sumNumbers(int a, int b) {

        int result;

        result = a + b;

        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a + b;

        System.out.println("X = " + result);

        sc.close();
    }
}
