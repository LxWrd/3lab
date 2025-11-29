package ru.fokin.main;

import ru.fokin.birds.Bird;
import ru.fokin.birds.Gowk;
import ru.fokin.birds.Parrot;
import ru.fokin.birds.Sparrow;
import ru.fokin.dot.Dot;
import ru.fokin.dot.dot_with_3coord;
import ru.fokin.meowable.Cat;
import ru.fokin.meowable.Tomcat;
import ru.fokin.name.Name;
import ru.fokin.name.Name_n_Height;
import ru.fokin.other.Secret;

import java.util.Scanner;

public class Main {
    static void main() {
        // 1.7 задание
        String firstname = get_variable("имя");
        String secondname = get_variable("фамилию");
        String partonymic = get_variable("отчество");
        Name name = new Name(firstname, secondname, partonymic);
        System.out.println(name);

        // 1.8 задание
        int height = Integer.parseInt(get_variable("Рост"));
        Name_n_Height name1 = new Name_n_Height(name, height);
        System.out.println(name1);

        // 2.2 задание
        String secret = get_variable("Секрет");

        Secret secret1 = new Secret("Иван", secret);

        Secret secret2 = new Secret(secret1, "Петя");

        System.out.println(secret2.toString());
        System.out.println("Текущий хранитель: " + secret2.getCurrentKeeper());
        System.out.println("Количество людей, узнавших секрет: " + secret2.countPeopleBefore());

        System.out.println("Имя первого человека, узнавшего секрет: " + secret2.getNthKeeper(0));

        try {
            System.out.println("Разница в количестве символов с первым хранителем: " + secret2.difference(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // 3.5 задание
        dot_with_3coord Dot = new dot_with_3coord("1", "2", "3");
        System.out.println(Dot);
        // 4.3 задание
        String text = get_variable("что будет петь попугай");
        Bird bird1 = new Parrot("Синий","Кеша",text);
        System.out.println(bird1);
        Bird bird2 = new Sparrow("Коричневый","Пернатый");
        System.out.println(bird2);
        Bird bird3 = new Gowk("Золотистый","Петя");
        System.out.println(bird3);

        // 5.4 задание
        Cat cat = new  Cat("Барсик");
        Tomcat tomcat = new Tomcat("Милок");
        cat.meow();
        tomcat.meow();

        // 6.2
        Dot dot0 = new Dot("1","4");
        Dot dot1 = new Dot("1","4");
        Dot dot2 = new Dot("5","12");

        System.out.println(dot0.equals(dot1));
        System.out.println(dot0.equals(dot2));
        // 8.4
        Dot dot3 = new Dot("2","6");
        System.out.println("Оригинальная точка" + dot3);

        Dot dot4 = (Dot) dot3.clone();
        System.out.println("Копируемая точка" + dot4);

        System.out.println("Меняем X в оригинальной точке");
        dot3.changeX("75");
        System.out.println("Оригинальная точка" + dot3);
        System.out.println("Копируемая точка" + dot4);


    }

    public static String get_variable(String word) {
        // Обработка исключений при ошибке рекурсивно запускает этот же метод
        System.out.print("Введите " + word + ": ");
        Scanner scan = new Scanner(System.in);
        try {
            String input = scan.nextLine(); // Получаем строку от сканера
            return input;
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
            return get_variable(word);
        }
    }
}


