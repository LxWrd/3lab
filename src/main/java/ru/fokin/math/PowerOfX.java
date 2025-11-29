package ru.fokin.math;

public class PowerOfX {

    public static double calculatePower(String xStr, String yStr) {
        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);


        return Math.pow(x, y);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Пожалуйста, укажите два числа: X и Y.");
            return;
        }
        String xStr = args[0];
        String yStr = args[1];

        double result = calculatePower(xStr, yStr);
        System.out.print(result);
    }
}
