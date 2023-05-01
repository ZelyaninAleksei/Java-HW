//Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
//        Пример:
//        Россия идет вперед всей планеты. Планета — это не Россия.
//        Запрос: Россия
//        Ответ: Россия - 2
//        toLoverCase().
//        (Усложнение - игнорировать пунктуацию)*
package ru.gb.java;

import java.util.*;


public class HW12 {
    public static void main(String[] args) {

        Map<String, Integer> userMap = new HashMap<>();

        String userText = enterString("Введите предложение: ");
        String userRequest = enterString("Запрос: ");

        userRequest = userRequest.replaceAll("\\p{Punct}", "");

        userText = userText.replaceAll("\\p{Punct}", "");
        String[] words = userText.split("\\s+");

        int counter = findWord(userRequest, words);
        userMap.put(userRequest,counter);
        System.out.println("Колчиество искомого слова: " + userMap.getOrDefault(userRequest, 0));
    }


        public static String enterString(String msg)
    {
        System.out.print(msg);
        Scanner sc = new Scanner(System.in);
        String userStr = sc.nextLine();
        return userStr;
    }
    public static int findWord(String userRequest, String[] words)
    {
        int count = 0;
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++)
        {
            if (userRequest.equalsIgnoreCase(words[i]))
            {
                count += 1;
        }
        }
            return count;
        }
    }

