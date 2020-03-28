package testgame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    private static Random random = new Random();
    private static int a = random.nextInt(100);

    public static boolean checkNum(int num) {
        System.out.println("если хотите выйти введите 0");
        if (num == 0) {
            System.out.println("Спасибо за игру!");
            return true;
        }
        if (num > a) {
            System.out.println("Ваше число больше");
            return false;
        } else if (num < a) {
            System.out.println("Ваше число меньше");
            return false;
        } else {
            System.out.println("Поздравляю вы выиграли!");
            a = random.nextInt(100);
        }
        return true;
    }



    public static int entryNum() {
        try {
            System.out.println("Введите число: от 0 до 100");
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("нужно ввести число!");
            return entryNum();
        }
    }
}
