package ru.fokin.meowable;

public class Cat implements Meowable {
    private String name;

    // Конструктор, который принимает имя кота
    public Cat(String name) {
        this.name = name;
    }

    // Метод для приведения кота к текстовой форме
    @Override
    public String toString() {
        return "кот: " + name;
    }

    // Метод для мяуканья один раз
    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
    }

    // Метод для мяуканья N раз
    public void meow(int times) {
        StringBuilder meowSound = new StringBuilder(name + ": ");
        for (int i = 0; i < times; i++) {
            meowSound.append("мяу");
            if (i < times - 1) {
                meowSound.append("-"); // добавляем разделитель между мяу
            }
        }
        System.out.println(meowSound.toString() + "!");
    }
}