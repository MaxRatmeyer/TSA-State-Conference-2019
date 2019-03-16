package me.maxnelson.tsaproject2019;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {

    public static ArrayList<String> combinations;

    public static void main(String[] args) {

        combinations = new ArrayList<>();

        System.out.println("Number of Dice: ");

        Scanner dicescanner = new Scanner(System.in);
        int dice = dicescanner.nextInt();

        if (dice > 3 || dice < 1) {
            System.out.println("Number must be between 1 and 3!");
            return;
        }

        System.out.println("Sum: ");

        Scanner sumscanner = new Scanner(System.in);
        int sum = sumscanner.nextInt();

        for (int i = 1; i <= 6; i++) {

            if (dice > 1) {

                for (int x = 1; x <=6; x++) {

                    if (dice > 2) {

                        for (int y = 1; y <=6; y++) {

                            ArrayList<Integer> ints = new ArrayList<>();
                            ints.add(i);
                            ints.add(x);
                            ints.add(y);

                            checkSum(ints, sum);

                        }

                    } else {

                        ArrayList<Integer> ints = new ArrayList<>();
                        ints.add(i);
                        ints.add(x);

                        checkSum(ints, sum);

                    }

                }

            } else {

                ArrayList<Integer> ints = new ArrayList<>();
                ints.add(i);

                checkSum(ints, sum);

            }

        }

        System.out.println("Number of possible combinations: " + combinations.size());
        System.out.println("Combinations: ");

        for (String combination : combinations) {

            System.out.print("(" + combination + ") ");

        }

    }

    public static void checkSum(ArrayList<Integer> nums, int sum) {

        int i = 0;

        for (int num : nums) {

            i = i + num;

        }

        if (i == sum) {

            String text = "";

            for (int x : nums) {

                text = text + x + ",";

            }

            combinations.add(text);

        }

    }

}
