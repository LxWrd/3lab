package ru.fokin.meowable;

public class Tomcat implements Meowable {
    private String name;

    public Tomcat(String name) {
        this.name = name;
    }
    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
    }
}


