package ru.yandex.praktikum;

public class Account {

    private final String name;
    int spaces = 0;
    String foo = null;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.equals(foo)) { // проверяет, не передано ли значение null
            return false;
        } else if (name.isEmpty()) { // проверяет, не пустая ли строка
            return false;
        } else if (name.isBlank()) { // проверяет, не состоит ли строка из пробелов
            return false;
        } else if (name.startsWith(" ")) { // проверяет, не начинается ли строка из пробела
            return false;
        } else if (name.endsWith(" ")) { // проверяет, не заканчивается ли строка пробелом
            return false;
        } else if (name.length() > 19) { // проверка длины строки (не более 19 символов)
            return false;
        } else if (name.length() < 3) { // проверка длины строки (не менее 3 символов)
            return false;
        } else if (name.contains(" ")) {
            {
                for (int i = 0; i < name.length(); i++) {
                    spaces += (Character.isWhitespace(name.charAt(i))) ? 1 : 0;
                }
                if (spaces > 1) {    // проверка на содержание не более одного пробела в строке
                    return false;
                }
            }
            return true;
        }
        return false;
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }
}