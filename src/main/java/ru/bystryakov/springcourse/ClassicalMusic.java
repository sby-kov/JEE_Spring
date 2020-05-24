package ru.bystryakov.springcourse;

/**
 * User:  Marina
 * Дата:  24.05.2020
 * Время: 19:23
 */
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Классика: Венгерская рапсодия";
    }
}
