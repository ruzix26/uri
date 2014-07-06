package br.com.uri.beginner;

import java.util.Scanner;

/**
 * Created by gustavo on 7/6/14.
 *
 * Uri 1009 - Salary with bonus
 */
public class SalaryBonus {


    public String getSalaryBonus(double salary, double totalSold) {

        double salaryBonus;

        salaryBonus = totalSold * 0.15 + salary;

        String salaryBonusFormat = "R$ "+ salaryBonus;

        return salaryBonusFormat;
    }

    public static void main(String[] args) {

        String name;
        float salary;
        float totalSold;
        double salaryBonus;

        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        salary = sc.nextFloat();
        totalSold = sc.nextFloat();

        salaryBonus = totalSold * 0.15 + salary;

        System.out.printf("TOTAL = R$ %.2f\n", salaryBonus);

    }
}
