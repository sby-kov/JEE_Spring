package ru.bystryakov.springcourse;

import org.springframework.stereotype.Component;

/**
 * User:  Marina
 * Дата:  24.05.2020 Время: 19:26
 */
@Component("idRockMusic")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Рок: Иисус Христос - суперзвезда";
    }
}
