package ru.fokin.birds;

public class Sparrow extends Bird {
    public Sparrow (String color, String name) {
        super(color, name);
        this.color = color;
        this.name = name;
    }
    @Override
    public String toString() {
        return "чырык";
    }
}
