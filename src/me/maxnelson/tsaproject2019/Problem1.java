package me.maxnelson.tsaproject2019;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        System.out.print("In decimal: ");

        Scanner decimalscanner = new Scanner(System.in);
        int decimal = decimalscanner.nextInt();

        int start = 15;

        int i = recursive(decimal, start);

        System.out.println(i);

        int binary = 0;


    }

    public static int powerOf(int base, int power) {

        int result = base;

        for (int i = 1; i < power; i++) {
            result = result * base;
        }

        return result;

    }

    public static int recursive(int decimal, int start) {
        int complete = 0;
        int test = decimal - powerOf(2, start);
        if (test < 0) {
            complete = decimal + powerOf(2, start);
            recursive(complete, start--);
        } else if (test > 0) {
            recursive(complete, start--);
        } else if (test == 0) {
                return complete;
        }
        return complete;
    }

}
