package ru.fokin.birds;

public class Parrot extends Bird {
    public String text;
    public Parrot (String color, String name,String text) {
        super(color, name);
        this.color = color;
        this.name = name;
        this.text = text;
    }
    @Override
    public String toString() {
        return this.text;
    }
}
