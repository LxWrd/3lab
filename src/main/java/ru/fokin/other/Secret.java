package ru.fokin.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Secret {
    private String text;
    private String keeper;
    private List<String> keeperlist;
    private boolean isShared;

    // Конструктор для создания нового секрета
    public Secret(String keeper, String text) {
        this.keeper = keeper;
        this.text = text;
        this.keeperlist = new ArrayList<>();
        this.isShared = false;
        System.out.println(keeper + " создал секрет: " + text);
    }

    // Конструктор для передачи секрета другому хранителю
    public Secret(Secret secretToShare, String newKeeperName) {
        if (secretToShare.isShared) {
            throw new IllegalStateException("Секрет уже был передан другому человеку.");
        }

        this.text = distortion(secretToShare.text);
        this.keeper = newKeeperName;
        this.keeperlist = new ArrayList<>(secretToShare.keeperlist);
        this.keeperlist.add(secretToShare.keeper);
        this.isShared = true;

        System.out.println(secretToShare.keeper + " сказал что: " + secretToShare.text);
    }

    // Метод для добавления случайных символов в текст секрета
    private String distortion(String originalText) {
        Random random = new Random();
        int N = originalText.length() / 10;
        int numOfRandomChars = random.nextInt(N + 1);

        StringBuilder newText = new StringBuilder(originalText);
        for (int i = 0; i < numOfRandomChars; i++) {
            int position = random.nextInt(newText.length());
            char randomChar = (char) ('а' + random.nextInt(66)); // Случайный символ от 'а' до 'Я'
            newText.insert(position, randomChar);
        }

        return newText.toString();
    }

    // Приведение к строке
    @Override
    public String toString() {
        return keeper + ": это секрет!";
    }

    // Получение имени текущего хранителя
    public String getCurrentKeeper() {
        return keeper;
    }

    // Получение количества людей, узнавших секрет после текущего хранителя
    public int countPeopleBefore() {
        return keeperlist.size();
    }

    // Получение имени N-го человека, узнавшего секрет
    public String getNthKeeper(int n) {
        if (n >= 0) {
            if (n < keeperlist.size()) {
                return keeperlist.get(n);
            } else {
                throw new IndexOutOfBoundsException("Нету человека, узнавшего секрет.");
            }
        } else {
            int index = keeperlist.size() + n; // Для отрицательного значения
            if (index >= 0) {
                return keeperlist.get(index);
            } else {
                throw new IndexOutOfBoundsException("Нету человека, узнавшего секрет.");
            }
        }
    }

    // Разница в количестве символов текста секрета с N-ым человеком
    public int difference(int n) {
        if (n >= 0 && n < keeperlist.size()) {
            return Math.abs(this.text.length() - keeperlist.get(n).length()); // Примерная логика
        } else {
            throw new IndexOutOfBoundsException("Нет такого человека, узнавшего секрет.");
        }
    }
}
