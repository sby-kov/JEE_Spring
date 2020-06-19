package ru.bystryakov.springcourse;

import org.springframework.stereotype.Component;

/**
 * User:  Marina
 * Дата:  24.05.2020
 * Время: 19:23
 */
//@Component        // убираем, чтобы избежать неоднозначности бинов
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Классика: Венгерская рапсодия";
    }
}
