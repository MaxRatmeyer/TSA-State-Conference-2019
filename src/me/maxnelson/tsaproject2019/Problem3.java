package me.maxnelson.tsaproject2019;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        System.out.println("Set: ");

        Scanner setscanner = new Scanner(System.in);
        String set = setscanner.next();

        System.out.println("k: ");

        Scanner kscanner = new Scanner(System.in);
        int k = kscanner.nextInt();

        ArrayList<Character> sets = new ArrayList<>();
        for (int i = 0; i < set.length(); i++) {
            sets.add(set.charAt(i));
        }

        for (Character part : sets) {

            for (Character part2 : sets) {

                for (Character part3 : sets) {

                    if (k == 3) {
                        System.out.println(part.toString() + part2.toString() + part3.toString());
                    }

                }

                if (k == 2) {
                    System.out.println(part.toString() + part2.toString());
                }

            }

            if (k == 1) {
                System.out.println(part.toString());
            }

        }

    }

}
