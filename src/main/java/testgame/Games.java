package testgame;

import java.util.Scanner;

public class Games {
    private static int num = 0;
    private static Scanner sc = new Scanner(System.in);
    private static String word = "";

    public static void choseGame() {
        String chose = sc.nextLine();
        if (chose.equalsIgnoreCase("выйти")) {
            System.out.println("Спасибо за игру");
            System.exit(0);
        }
        if (chose.equalsIgnoreCase("Угадать число")) {
            do {
                num = GuessNum.entryNum();
            } while (!GuessNum.checkNum(num));
        } else if (chose.equalsIgnoreCase("Загадать число")) {
            do {
                System.out.println("Для выхода введите \"выйти\"");
                System.out.println("Загадайте число от 0 до 100 ");
                System.out.println("Как будете готовы напишите \"загадал\"");
                word = sc.nextLine();
            } while (!RiddleNum.checkRiddle(word));
            RiddleNum.programGuess();
        }
    }

    public static void playTheGames () {
        System.out.println("Предлагаю вам сыграть в две игры");
        do {
            System.out.println("Выберите игру: \"Угадать число\" или \"Загадать число\"");
            System.out.println("Для выхода введите \"выйти\"");
            System.out.println("----------------------");
            System.out.println("Введите название игры");
            choseGame();
        } while (true);
    }
}

