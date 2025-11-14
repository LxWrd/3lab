package org.example;

public class Name_n_Height extends Name {
    public int height;
    public Name name ;
    public Name_n_Height(Name name,int height) {

        super(name.lastName, name.firstName,name.patronymic);
        // Условие для создания роста
        if (height < 0 || height > 501) {
            throw new IllegalArgumentException("Значение не может быть отрицательным");
            }

        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Человека с именем " + name.toString() + " имеет рост - " + height;
    }
}
