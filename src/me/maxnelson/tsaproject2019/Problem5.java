package me.maxnelson.tsaproject2019;

import java.util.HashMap;
import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        HashMap<Integer, Integer> footageMap = new HashMap<>();

        System.out.println("How many rooms are there: ");

        Scanner roomsscanner = new Scanner(System.in);
        int rooms = roomsscanner.nextInt();

        for (int i = 1; i <= rooms; i++) {

            System.out.println("Enter the square footage of room " + i + ": ");

            Scanner footagescanner = new Scanner(System.in);
            int footage = footagescanner.nextInt();

            footageMap.put(i, footage);

        }

        int maximum = 5000;
        int roomsCleaned = 0;

        for (Integer room : footageMap.keySet()) {

            int roomFootage = footageMap.get(room);
            int afterWards = maximum - roomFootage;

            if (afterWards >= 0) {

                roomsCleaned++;
                maximum = afterWards;

            }

        }

        System.out.println(roomsCleaned + " room(s) were cleaned");

    }

}
