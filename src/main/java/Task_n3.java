// Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
// После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве необходимо найти самое длинное слово.
// Результат вывести на консоль

import java.util.Scanner;

public class Task_n3 {
    static Scanner scanner = new Scanner(System.in);

    //static getElements[] = new getElements[i];

    public static void main(String[] args) {
        int amount = getAmount();
        String wordsArray = getWordsArray();
        String words = getMostLong();
    }

        // getValue считывает с консоли целое число и возвращает его в main

        public static int getAmount() {
            System.out.println("Введите количество элементов массива: ");
            int amount;
            if(scanner.hasNextInt()){
                amount = scanner.nextInt();
            } else {
                System.out.println("Допущена ошибка при вводе числа. Попробуйте еще раз.");
                scanner.next();
                amount = getAmount();
            }
            return amount;
        }


        public static String[] getWordsArray(int amount) {
            String[] wordsArray = new String[amount];
            for (int i = 0; i < amount; i++) {
                int y = i + 1;
                    System.out.println("Введите элемент массива [№" + y + "]: ");
                    wordsArray[i] = scanner.next();
                    }
                    return wordsArray;
            }

        public static String[] getMostLong(String[] wordsArray) {

            int maxLengthString = 0;
            for(int i=0;i<words.length;i++){
                if(words[i].length()>maxLengthString){
                    maxLengthString = words[i].length();
                }
            }
            for(int i=0;i<words.length;i++){
                if(words[i].length()==maxLengthString){
                    System.out.println(words[i]);
                }

        }
            return words;
        }


}