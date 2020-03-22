package testgame;

import java.util.Scanner;

public class Name {
    public static boolean checkName(String name){
        if(name.equals("выйти")) {
            System.exit(0);
        }
        if (name.matches(".*\\d.*"))
        {
            System.out.println("Введите имя без чисел");
            return false;
        }
        else if (name.matches(".*\\s.*"))
        {
            System.out.println("Введите только имя");
            return false;
        }
        else
            System.out.println("Добро пожаловать " + name.substring(0,1).toUpperCase() + name.substring(1));
        return true;
    }

    public static String entryName() {
        System.out.println("Введите своё имя:");
        return new Scanner(System.in).nextLine();
    }
}
