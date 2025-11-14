package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        // 1.7 задание
        String firstname = get_variable("имя");
        String secondname = get_variable("фамилию");
        String partonymic = get_variable("отчество");
        Name name = new Name(firstname,secondname,partonymic);
    }
    private static String get_variable(String word) {
        // Обработка исключений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите " + word + ": " );
        Scanner scan = new Scanner(System.in);
        try {
            String satr = scan.toString();
            return satr;
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
            return get_variable(word);
        }

    }
}
