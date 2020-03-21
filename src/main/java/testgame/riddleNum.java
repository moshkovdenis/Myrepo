package testgame;

import java.util.Random;
import java.util.Scanner;

public class riddleNum {

    public static boolean programGuess() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int min = 0;
        int max = 100;
        int resNum = rnd.nextInt(max - min) + min;
        System.out.println(resNum);
            while (true) {
                String input = sc.nextLine();
                if (input.equals("меньше")) {
                    max = resNum;
                    resNum = rnd.nextInt(max - min) + min;
                    System.out.println(resNum);
                } else if (input.equals("больше")) {
                    min = resNum + 1;
                    resNum = rnd.nextInt(max - min) + min;
                    System.out.println(resNum);
                } else if (input.equals("правильно")) {
                    System.out.println("Система победила! Спасибо за игру человек.");
                    return true;
                }

            }

        }
    }

