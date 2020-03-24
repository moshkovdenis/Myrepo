package testgame;

import java.util.Random;
import java.util.Scanner;

public class RiddleNum {
    private static int min = 0;
    private static int max = 100;
    public static boolean programGuess() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int resNum = rnd.nextInt(max - min) + min;
        while (true) {
            try {
                System.out.println("Для выхода введите \"выйти\"");
                System.out.println("если ваше число больше введите \"больше\", если меньше введите \"меньше");
                System.out.println("если число верно введи \"правильно\".");
                System.out.println(resNum);
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("выйти")){
                    return true;
                }
                if (input.equalsIgnoreCase("меньше")) {
                    max = resNum;
                    resNum = rnd.nextInt(max - min) + min;
                } else if (input.equalsIgnoreCase("больше")) {
                    min = resNum + 1;
                    resNum = rnd.nextInt(max - min) + min;
                } else if (input.equalsIgnoreCase("правильно")) {
                    System.out.println("Система победила! Спасибо за игру человек.");
                    return true;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Обманывать плохо, твоё число " + resNum);
                return true;
            }

        }
    }
}

