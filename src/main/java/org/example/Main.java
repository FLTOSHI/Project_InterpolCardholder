package org.example;

import org.example.entity.CriminalProfileList;
import org.example.entity.Profile;
import com.google.gson.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        CriminalProfileList criminalList = new CriminalProfileList();
        Scanner inputReader = new Scanner(System.in);

        byte input = 0;

        do {
            Menu.mainMenu();
            try {
                input = inputReader.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Введите только число из пунктов меню!");
                inputReader.nextLine();
                continue;
            }
            switch (input) {
                case 1:
                    if (criminalList.getData() == null) {
                        System.out.println("База преступников пуста, может быть, стоит её заполнить?");
                    } else criminalList.getData().forEach(System.out::println);
                    break;

                case 2:
                    Profile criminal = new Profile();
                    inputReader.nextLine();

                    System.out.println("Введите имя преступника: ");
                    criminal.setName(inputReader.nextLine());
                    System.out.println("Введите фамилию преступника: ");
                    criminal.setSecondName(inputReader.nextLine());
                    System.out.println("Введите прозвище преступника: ");
                    criminal.setNickName(inputReader.nextLine());
                    System.out.println("Введите рост преступника: ");
                    criminal.setHeight(inputReader.nextLine());
                    System.out.println("Введите цвет глаз и волос преступника: ");
                    criminal.setEyeColor(inputReader.nextLine());
                    System.out.println("Введите цвет волос преступника: ");
                    criminal.setHairColor(inputReader.nextLine());
                    System.out.println("Введите приметы преступника: ");
                    criminal.setUnusuals(inputReader.nextLine());
                    System.out.println("Введите гражданство преступника: ");
                    criminal.setHomeland(inputReader.nextLine());
                    System.out.println("Введите место рождения преступника: ");
                    criminal.setPlaceOfBirth(inputReader.nextLine());
                    System.out.println("Введите дату рождения преступника: ");
                    criminal.setDateOfBirth(inputReader.nextLine());
                    System.out.println("Введите род деятельности: ");
                    criminal.setCrimeProfession(inputReader.nextLine());
                    System.out.println("Введите последнее дело преступника: ");
                    criminal.setLastJob(inputReader.nextLine());

                    criminalList.getData().add(criminal);
                    System.out.println("Преступник успешно занесён в базу данных!\n");


                    break;
                case 3:{
                        System.out.println("Введите данные для поиска преступника: ");
                        List<Profile> searchCriminal = new ArrayList<>();
                        String textSearch;
                        textSearch = inputReader.nextLine();

                        for (Profile criminalSearch : criminalList.getData())
                            if ( criminalSearch.getName().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getSecondName().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getNickName().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getHeight().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getEyeColor().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getHairColor().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getUnusuals().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getHomeland().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getDateOfBirth().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getPlaceOfBirth().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getCrimeProfession().equalsIgnoreCase(textSearch) ||
                                criminalSearch.getLastJob().equalsIgnoreCase(textSearch)) {
                                searchCriminal.add(criminalSearch);
                        }
                        if (searchCriminal.isEmpty()) {
                            System.out.println("Книга не найдена!");
                        } else {
                            searchCriminal.forEach(System.out::println);
                        }
                    }
                    break;
                case 4:
                    try {
                        File fileForJson = new File("./CardholderText.txt");
                        if (!fileForJson.exists())
                            fileForJson.createNewFile();
                        FileWriter fw;
                        fw = new FileWriter(fileForJson);

                        fw.write(gson.toJson(criminalList));
                        fw.close();
                        System.out.println("Запись завершена.");
                    } catch (IOException e) {
                        e.printStackTrace();

                    }
                    break;
                case 5:
                    System.out.println("До свидания, приятного времени суток!");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }

        } while (input != 5);
    }
}