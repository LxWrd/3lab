package ru.fokin.birds;
import java.util.Random;
public class Gowk extends Bird {
    public Gowk (String color, String name) {
        super(color, name);
        this.color = color;
        this.name = name;
    }
    @Override
    public String toString() {
        Random random = new Random();
        int num = random.nextInt(9);
        StringBuilder result = new StringBuilder();
        result.append("Ку");
        int i;
        for (i = 1; i < num;i++) {
            result.append("-ку");
        }
        return result.toString();
    }
}