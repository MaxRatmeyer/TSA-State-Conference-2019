package me.maxnelson.tsaproject2019;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        ArrayList<String> common = new ArrayList<>();

        System.out.println("Input: ");

        Scanner firstwordscanner = new Scanner(System.in);
        String first = firstwordscanner.next();

        Scanner secondwordscanner = new Scanner(System.in);
        String second = secondwordscanner.next();

        int firstLength = first.length();

        for (int i = 0; i <= firstLength; i++) {

            for (int x = 0; x <= firstLength; x++) {

                if (!(i > x)) {
                    String test = first.substring(i, x);

                    if (second.contains(test)) {
                        common.add(test);
                    }

                }

            }

        }

        String highest = "";

        for (String test : common) {
            if (test.length() > highest.length()) {
                highest = test;
            }
        }

        System.out.println(highest);

    }

}
