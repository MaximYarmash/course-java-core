package com.rakovets.course.java.core.practice.decision_making_statements;

import java.io.Console;
import java.util.Scanner;

/**
 * Разработать программу для desktop приложения
 * которая выведет приветствии для пользователя в зависимости от времени суток.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int hour = 1;

        String greeting = getGreetingByHour(hour);
        System.out.printf("Result: %s", greeting);
    }

    /**
     * Возвращает приветствие в зависимости от значения часов.
     *
     * @param hour текущее значение часов (от 0 до 23)
     * @return одно из приветствий:
     * <ul>
     *     <li>when 6-11 that 'Good morning'</li>
     *     <li>when 12-17 that 'Good day'</li>
     *     <li>when 18-23 that 'Good evening'</li>
     *     <li>when 0-5 that 'Good night'</li>
     * </ul>
     */
    static String getGreetingByHour(int hour) {
        String result = "";
        if (hour > 5 && hour <= 11) {
            result = "Good morning";
        }
        if (hour > 12 && hour <= 17) {
            result = "Good day";
        }
        if (hour > 17 && hour <= 23) {
            result = "Good evening";
        }
        if (hour >= 0 && hour <= 5) {
            result = "Good night";
        }
        return result;
    }
}
