package ru.bystryakov.springcourse;

/**
 * User: Serge Bystryakov
 * Дата: 27.05.2020  Время: 18:32
 */
public class PopMusic implements Music {
    public void doMyInit() {
        String className = super.getClass().getSimpleName();
        System.out.println("init: инициализация " + className );
    }
    public void doMyDestroy() {
        String className = super.getClass().getSimpleName();
        System.out.println("destroy: уничтожение " + className );
    }
    @Override
    public String getSong() {
        return "Попса: Валерия - Часики..." ;

    }
}
