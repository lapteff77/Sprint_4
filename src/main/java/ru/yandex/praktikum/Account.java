package ru.yandex.praktikum;

public class Account {

    private final String name;
    int spaces = 0;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (this.name.isEmpty()) { // проверяет, не пустая ли строка
            return false;
        } else if (this.name.isBlank()) { // проверяет, не состоит ли строка из пробелов
            return false;
        } else if (this.name.indexOf(" ") == 0) { // проверяет, не начинается ли строка из пробела
            return false;
        } else if (this.name.lastIndexOf(" ") == this.name.length()) { // проверяет, не заканчивается ли строка пробелом
            return false;
        } else if (this.name.length() > 19) { // проверка длины строки (не более 19 символов)
            return false;
        } else if (this.name.length() < 3) { // проверка длины строки (не менее 3 символов)
            return false;
        } else if (this.name.contains(" ")) {
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