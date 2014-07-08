package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/7/14.
 *
 * Uri 1013 - The Greatest
 */
public class TheGreatest {


    public int choiceTheGreatest(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        }
        return 0;
    }

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int greatest;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        greatest = 0;

        if (a > b && a > c) {
            greatest = a;
        } else if (b > a && b > c){
            greatest = b;
        } else if (c > a && c > b) {
            greatest = c;
        }

        System.out.println(greatest+" eh o maior");

    }
}
