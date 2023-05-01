//Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

package ru.gb.java;

import java.util.HashMap;
import java.util.Map;

public class HW13 {
    public static void main(String[] args) {

        String[] personal = new String[] {
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников","Петр Петин", "Иван Ежов"
        };

        Map<String, Integer> mapNames= new HashMap<>();

        fillMap(personal, mapNames );
        mapNames.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println); // или любой другой конечный метод
    }

    public static void fillMap(String[] personal, Map<String, Integer> mapNames)
    {

        for (int i = 0; i < personal.length; i++) {
        String keyName = personal[i].split(" ")[0];

        if (!mapNames.containsKey(keyName)) {
            int counter = countVal(keyName, personal);
            mapNames.put(keyName, counter);
        }
        }
    }
    public static int countVal(String keyName, String[] personal){
        int count = 0;

        for (int i = 0; i < personal.length ; i++) {
            if (personal[i].contains(keyName + " ")) {
                count++;
            }
        }
       return count;
    }
}
