package testgame;

import java.util.Scanner;

public class Games {
    public static void choseGame() {
        Scanner sc = new Scanner(System.in);
        String chose = sc.nextLine();
        if (chose.equals("выйти")){
            Exit.exitGames();
        }
        if (chose.equals("Угадать число")) {
            int num = 0;
            do {
                num = GuessNum.entryNum();
            } while (!GuessNum.checkNum(num));
        } else if (chose.equals("Загадать число")) {
            System.out.println("Загадайте число от 0 до 100 ");
            String riddl = sc.nextLine();
            if (riddl.equals("загадал")) {
                RiddleNum.programGuess();
            }

        }
    }

}
