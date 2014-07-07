package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1011 - Sphere
 */
public class Sphere {

    private static final double PI =  3.14159;

    public float calulateSphereVolume(int R){

        float volume;

        volume = (float) ((4.0/3) * Math.PI * R*R*R);

        return volume;

    }


    public static void main(String[] args){

        int R;
        double volume;

        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();

        volume = ((4.0/3) * PI *R*R*R);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
