package testgame;

import java.util.Random;
import java.util.Scanner;

public class RiddleNum {
    private static   Scanner sc = new Scanner(System.in);
    private static   Random rnd = new Random();
    private static int min = 0;
    private static int max = 100;
    private static int resNum = rnd.nextInt(max - min) + min;

    public static boolean programGuess() {
        System.out.println("Для выхода введите \"выйти\"");
        System.out.println(resNum);
        while (true) {
            try {
                System.out.println("если ваше число больше введите \"больше\", если меньше введите \"меньше");
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("выйти")){
                    return true;
                }
                if (input.equalsIgnoreCase("меньше")) {
                    max = resNum;
                    resNum = rnd.nextInt(max - min) + min;
                    System.out.println(resNum);
                } else if (input.equalsIgnoreCase("больше")) {
                    min = resNum + 1;
                    resNum = rnd.nextInt(max - min) + min;
                    System.out.println(resNum);
                } else if (input.equalsIgnoreCase("правильно")) {
                    System.out.println("Система победила! Спасибо за игру человек.");
                    return true;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Обманывать плохо,ваще число " + resNum);
                return true;
            }

        }
    }
}

