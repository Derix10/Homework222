package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(nameAndTemperature(13, -11));
        System.out.println(nameAndTemperature(29, 15));
        System.out.println(nameAndTemperature(40, 23));
        System.out.println(nameAndTemperature(80, -45));
        System.out.println(nameAndTemperature(70, -31));
        generateRandomAge();
    }

    public static String nameAndTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)

            return "Можно идти гулять";

        else if (age < 20 && temperature >= 0 && temperature <= 28)

            return "Можно идти гулять";

        else if (age > 45 && temperature >= -10 && temperature <= 25)

            return "Можно идти гулять";

        else

            return "Отсавайтесь дома";

    }

    public static void generateRandomAge() {
        int a = 0; // Начальное значение диапазона - "от"
        int b = 120; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b);
        System.out.println("1-ое случайное число: " + random_number1);
    }



}
