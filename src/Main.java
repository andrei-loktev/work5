public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("задание 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " лет, он совершеннолетний");
        }
        int age2 = 15;
        if (age2 < 18) {
            System.out.println("Если возраст человека " + age2 + " лет, он не совершеннолетний");
        }
        //task2
        System.out.println("задание 2");
        int temperatureUnit = 3;
        if (temperatureUnit < 5) {
            System.out.println("На улице " + temperatureUnit + " градуса, нужно надеть шапку");
        }
        int temperatureUnit2 = 7;
        if (temperatureUnit2 >= 5) {
            System.out.println("На улице " + temperatureUnit2 + " градусов, можно идти без шапки");
        }
        //task3
        System.out.println("задание 3");
        int speedDriver = 60;
        if (speedDriver <= 60) {
            System.out.println("Если скорость водителя " + speedDriver + " ,штрафа нет");
        int speedDriver2 = 80;
        if (speedDriver2 > 60) {
            System.out.println("Если скорость водителя " + speedDriver2 + " ,штраф есть");
        }
        }
    }
}