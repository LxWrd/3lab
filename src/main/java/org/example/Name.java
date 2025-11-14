package org.example;

public class Name {
    public String lastName;     // Фамилия
    public final String firstName;    // Имя
    public String patronymic;   // Отчество
    public final Name parent;         // Родитель

    // Конструктор для создания ФИО
    public Name(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    // Конструктор для создания ФИ
    public Name(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    // Конструктор для создания только Имени
    public Name(String firstName) {
        this(null, firstName, null);
    }

    public void setParent(Name parent) {
        this.parent = parent;
        // Добавление фамилий, если ее нету
        if (this.lastName == null) {
            this.lastName = parent.lastName;
        }
        // Добавление отчества, если его нету
        if (this.patronymic == null) {
            this.patronymic = parent.firstName + "ович";
        }
    }

    // Метод для получения строкового представления имени
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            result.append(lastName).append(" ");
        }
        if (firstName != null && !firstName.isEmpty()) {
            result.append(firstName).append(" ");
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            result.append(patronymic);
        }

        return result.toString(); // Убираем лишние пробелы в начале и конце
    }
}
