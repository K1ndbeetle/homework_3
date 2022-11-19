public class Main {
    public static void main(String[] args) {
        //homework1
        //task №1
        System.out.println("Задача №1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        //task №2
        System.out.println("Задача №2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //task №3
        System.out.println("Задача №3");
        int people = 65;
        if (people <= 60) {
            System.out.println("У вас сидячее место");
        }
        if (people > 60 && people <= 102) {
            System.out.println("У вас стоячее место");
        }
        if (people > 102) {
            System.out.println("Вагон уже полностью забит");
        }

        //homework2
        //task №4
        System.out.println("Задача №4");
        int years = 9;
        if (years >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        //task №5
        System.out.println("Задача №5");
        if (years >= 7 && years < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (years >= 18 && years < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (years > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //task №6
        System.out.println("Задача №6");
        int passengers = 45;
        if (passengers <= 60) {
            System.out.println("У вас сидячее место");
        }
        else if (passengers > 60 && passengers <= 102) {
            System.out.println("У вас стоячее место");
        }
        else {
            System.out.println("Вагон уже полностью забит");
        }
    }
}