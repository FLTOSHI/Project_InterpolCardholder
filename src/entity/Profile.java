package entity;

import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Profile {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getEyeAndHairColor() {
        return eyeAndHairColor;
    }

    public void setEyeAndHairColor(String eyeAndHairColor) {
        this.eyeAndHairColor = eyeAndHairColor;
    }

    public String getSpecials() {
        return specials;
    }

    public void setSpecials(String specials) {
        this.specials = specials;
    }

    public String getHomeland() {
        return homeland;
    }

    public void setHomeland(String homeland) {
        this.homeland = homeland;
    }

    public String getPlaceAndDateOfBirth() {
        return placeAndDateOfBirth;
    }

    public void setPlaceAndDateOfBirth(String placeAndDateOfBirth) {
        this.placeAndDateOfBirth = placeAndDateOfBirth;
    }

    public String getCrimeProfession() {
        return crimeProfession;
    }

    public void setCrimeProfession(String crimeProfession) {
        this.crimeProfession = crimeProfession;
    }

    public String getLastJob() {
        return lastJob;
    }

    public void setLastJob(String lastJob) {
        this.lastJob = lastJob;
    }

    public Profile() {
    }

    private String name;
    private String secondName;
    private String nickName;
    private String height;
    private String eyeAndHairColor;
    private String specials;
    private String homeland;
    private String placeAndDateOfBirth;
    private String crimeProfession;
    private String lastJob;

    public Profile(String name, String secondName, String nickName, String height, String eyeAndHairColor, String specials, String homeland, String placeAndDateOfBirth, String crimeProfession, String lastJob) {
        this.name = name;
        this.secondName = secondName;
        this.nickName = nickName;
        this.height = height;
        this.eyeAndHairColor = eyeAndHairColor;
        this.specials = specials;
        this.homeland = homeland;
        this.placeAndDateOfBirth = placeAndDateOfBirth;
        this.crimeProfession = crimeProfession;
        this.lastJob = lastJob;
    }


    @Override
    public String toString() {
        return "" + "Фамилия и Имя: " + name + "" + secondName + "\n" + "Прозвище: " + nickName + "\n" + "Рост: " + height + "\n" + "Цвет волос и глаз: " + eyeAndHairColor + "\n" + "Особенности: " + specials + "\n" + "Гражданство: " + homeland + "\n" + "Место и дата рождения: " + placeAndDateOfBirth + "\n" + "Преступная профессия: " + crimeProfession + "\n" + "Последнее дело: " + lastJob + "\n";
    }

    public static Profile addProfile() {
        Scanner scanner = new Scanner(System.in);
        Profile enter = new Profile();
        System.out.println("Введите имя: ");
        addProfile().setName(scanner.nextLine());
        System.out.println("Введите фамилию: ");
        addProfile().setSecondName(scanner.nextLine());
        System.out.println("Введите прозвище: ");
        addProfile().setNickName(scanner.nextLine());
        System.out.println("Введите рост: ");
        addProfile().setHeight(scanner.nextLine());
        System.out.println("Введите цвет волос и глаз: ");
        addProfile().setEyeAndHairColor(scanner.nextLine());
        System.out.println("Введите внешние особенности: ");
        addProfile().setSpecials(scanner.nextLine());
        System.out.println("Введите гражданство: ");
        addProfile().setHomeland(scanner.nextLine());
        System.out.println("Введите дату и место рождения: ");
        addProfile().setPlaceAndDateOfBirth(scanner.nextLine());
        System.out.println("Введите род деятельности: ");
        addProfile().setCrimeProfession(scanner.nextLine());
        System.out.println("Введите последнее преступление: ");
        addProfile().setLastJob(scanner.nextLine());
        return enter;
    }
}

