import entity.Profile;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static entity.Profile Profile;

    public static void printMenu(ArrayList main) {
        int i = 1;
        for (Object profile : main) {
            System.out.println("Анкета №" + i++ + "\n" + profile.toString());
        }
    }

    public static void MainMenu() {
        System.out.println("Добро пожаловать! Выберите действие\n" +
                "1 - принять анкету \n" +
                "2 - показать все анкеты \n" +
                "3 - поиск анкеты \n" +
                "4 - закрыть программу \n");
    }

    public static Profile searchMenu(ArrayList main) {
        Scanner scanner = new Scanner(System.in);
        Profile result = null;
        String textSearch = "";
        textSearch = scanner.nextLine();
        if (Profile.getName().equals(textSearch) || Profile.getSecondName().equals(textSearch) || Profile.getNickName().equals(textSearch) || Profile.getHeight().equals(textSearch) || Profile.getEyeAndHairColor().equals(textSearch) || Profile.getSpecials().equals(textSearch) || Profile.getHomeland().equals(textSearch) || Profile.getPlaceAndDateOfBirth().equals(textSearch) || Profile.getCrimeProfession().equals(textSearch) || Profile.getLastJob().indexOf(textSearch) > -1) {
            result = Profile;
        }
        return Profile;
    }
}