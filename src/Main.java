import entity.Profile;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList main = new ArrayList<>();
        main.add(new Profile());
        Scanner scanner = new Scanner(System.in);
        byte menu;
        do {
            Menu.MainMenu();
            menu = scanner.nextByte();
            switch (menu) {
                case (1) -> Profile.addProfile();
                case (2) -> Menu.printMenu(main);
                case (3) -> {
                    System.out.println("Введите данные для поиска: \n");
                    System.out.println(Menu.searchMenu(main));
                }
                case (4) -> System.out.println("До свидания!");
            }
        } while (menu != 4);
    }
}