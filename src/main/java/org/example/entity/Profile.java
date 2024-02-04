package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Profile {

    private String name;
    private String secondName;
    private String nickName;
    private String height;
    private String eyeColor;
    private String hairColor;
    private String unusuals;
    private String homeland;
    private String placeOfBirth;
    private String dateOfBirth;
    private String crimeProfession;
    private String lastJob;

    public Profile() {

    }

    @Override
    public String toString() {
        return "" + "Фамилия и Имя: " + name + "" + secondName + "\n" + "Прозвище: " + nickName + "\n" + "Рост: " + height + "\n" + "Цвет глаз: " + eyeColor + "Цвет волос: " + hairColor + "Приметы: " + unusuals + "\n" + "Гражданство: " + homeland + "\n" + "Место и дата рождения: " + placeOfBirth + dateOfBirth + "\n" + "Преступная профессия: " + crimeProfession + "\n" + "Последнее дело: " + lastJob + "\n";
    }

}


