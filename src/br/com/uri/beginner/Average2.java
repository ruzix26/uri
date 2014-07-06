package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1006 - Average 2
 */
public class Average2 {

    public float average2Numbers(float a, float b, float c){

        float resutl;

        a *= 2;
        b *= 3;
        c *= 5;

        resutl = (a + b + c) / 10;

        return resutl;
    }


    public static void main(String[] args) {

        float a;
        float b;
        float c;
        float resutl;

        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        a *= 2;
        b *= 3;
        c *= 5;

        resutl = (a + b + c) / 10;

        System.out.printf("MEDIA = %.1f\n", resutl);

    }
}
