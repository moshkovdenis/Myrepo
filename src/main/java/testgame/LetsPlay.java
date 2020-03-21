package testgame;


public class LetsPlay {
    public static void main(String[] args) {
        System.out.println("Добрый день !");
        String userName = "";
        do {
            userName = Name.entryName();
        } while (!Name.checkName(userName));
        System.out.println("Предлагаю вам сыграть в две игры");
        do {
            System.out.println("Выберите игру: \"Угадать число\" или \"Загадать число\"");
            System.out.println("----------------------");
            System.out.println("Введите название игры");

            Games.choseGame();
        } while (true);

    }
}
