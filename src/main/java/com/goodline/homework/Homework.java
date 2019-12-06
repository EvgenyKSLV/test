package com.goodline.homework;

import com.goodline.helpers.Variables;

public class Homework {
    // В этом массиве неизвестно сколько элементов
    // Количество элементов всегда разное
    static String[] names = Variables.names;

    // Массив с числами
    static int[] numbers = Variables.numbers;

    private static void main(String[] args) {
        // Здесь запускаете функции
    }

    public static int[] printEven() {
        // Вернуть массив четных чисел меньше 100
        int[] numarr = new int[50];
        for (int i = 2 , j = 0 ; i < 100 ; i += 2 , j ++ )
        {
            numarr[j] = i;
        }
        return numarr;
    }

    private static void printNames() {
       // Вывести все элементы массива names
       for (int i = 0 ; i <= numbers.length ; i ++) 
       {
           System.out.println(numbers[i]);
       }
    }

    private static int getCount() {
        // Вернуть количество цифр, которые делятся на 3 и 7 без остатка в массиве numbers
        int[] numbers1 = new int[numbers.length];
        for (int i = 0 ; i  <= numbers.length ; i ++) 
        {
            if ((numbers[i] % 7 == 0) && (numbers[i] % 3 == 0)) 
            {
                numbers1[i] = numbers[i];
            }
        }
        return numbers1.length;
    }

    private static void printCounts() {
        // СЛОЖНОЕ ЗАДАНИЕ
        // Вывести количество всех цифр в массиве numbers
        // Допустим [1, 1, 1, 2, 2, 3, 3, 3, 4]
        // Значит надо вывести 1:3 2:2 3:3 4:1
        for (int i = 0 ; i <= numbers.length; i ++ )
        {
            for (int j = 0 , count = 0 ; j <= numbers.length ; j ++) 
            {
                if (numbers[i] == numbers[j]) {
                    count ++ ;
                }
                
            } 
            System.out.println(numbers[i] + " : " + count);
        }
    }
}
