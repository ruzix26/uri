package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1008 - Salary
 */
public class Salary {

    int numberOfEmploys;

    public Salary(int numberOfEmploys) {
        this.numberOfEmploys = numberOfEmploys;
    }

    public int getNumberOfEmploys() {
        return numberOfEmploys;
    }

    public String calculateSalary(int hours, float oneHourWorked) {

        float salary = oneHourWorked * hours;

        String salaryFormat = "U$ " + salary;

        return salaryFormat;
    }


    public static void main(String[] args) {

        int numberOfEmploys;
        int hours;
        float oneHourWorked;
        float salary;

        Scanner sc = new Scanner(System.in);

        numberOfEmploys = sc.nextInt();
        hours = sc.nextInt();
        oneHourWorked = sc.nextFloat();

        salary = hours * oneHourWorked;

        System.out.println("NUMBER = " + numberOfEmploys);
        System.out.printf("SALARY = U$ %.2f\n", salary);

    }
}

