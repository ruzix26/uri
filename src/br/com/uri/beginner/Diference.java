package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1007 - Diference
 */
public class Diference {

    public int diferenceNumbers(int a, int b, int c, int d){

        int result;

        result = (a * b - c * d);

        return result;

    }


    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int result;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d= sc.nextInt();

        result = (a * b - c * d);

        System.out.println("DIFERENCA = "+result);
    }
}


