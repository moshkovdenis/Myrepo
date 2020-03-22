package testgame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    static Random random = new Random();
    static int a = random.nextInt(100);

    public static boolean checkNum(int num){
        if (num > a)
        {
            System.out.println("Ваше число больше");
            return false;
        }
        else if(num < a)
        {
            System.out.println("Ваше число меньше");
            return false;
        } else
            System.out.println("Поздравляю вы выиграли!");
        return true;
    }

    public static int entryNum() {
        try {
            System.out.println("Введите число");
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("нужно ввести число");
            return new Scanner(System.in).nextInt();
        }
    }
}
