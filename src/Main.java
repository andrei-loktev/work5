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
        }
        int speedDriver2 = 80;
        if (speedDriver2 > 60) {
            System.out.println("Если скорость водителя " + speedDriver2 + " ,штраф есть");
        }
        //task4
        System.out.println("задание 4");
        int agePerson = 18;
        boolean GoToKindergarten = agePerson > 2 && agePerson <= 6;
        if (GoToKindergarten) {
            System.out.println("Нужно ходить в детский сад");
        }
        boolean GoToSchool = agePerson >= 7 && agePerson < 18;
        if (GoToSchool) {
            System.out.println("Нужно ходить в школу");
        }
        boolean GoToUniversity = agePerson >= 18 && agePerson < 24;
        if (GoToUniversity) {
            System.out.println("Нужно ходить в университет");
        }
        boolean GoToWork = agePerson >= 24;
        if (GoToWork) {
            System.out.println("Нужно ходить на работу");
        }
        //task5
        System.out.println("задание 5");
        int ageChildren = 15;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребёнка " + ageChildren + " ,ему нельзя кататься на аттракционе.");
        } else if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Если возраст ребёнка " + ageChildren + " ,ему можно кататься на аттракционе при родителях.");
        } else if (ageChildren >= 14) {
            System.out.println("Если возраст ребёнка " + ageChildren + " ,ему можно кататься на аттракционе");
        }
        //task6
        System.out.println("задание 6");

    }
}