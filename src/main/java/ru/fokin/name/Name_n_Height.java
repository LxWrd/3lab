package ru.fokin.name;

public class Name_n_Height extends Name {
    private int height; // Рост человека
    public Name name;
    // Конструктор, который принимает имя и рост
    public Name_n_Height(Name name, int height) {
        super(name.firstName);
        setHeight(height);
        this.name = name;
    }

    public void setHeight(int height) {
        if (height <= 0 || height > 500) {
            throw new IllegalArgumentException("Рост должен быть положительным и не более 500 см.");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Человек с именем " + firstName + " имеет рост - " + height + " см.";
    }
}