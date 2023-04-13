public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2016;
        byte clientOS = 0;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        boolean leapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (leapYear)
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 120;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1 ");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 ");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 ");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNomber = 15;
        switch (monthNomber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNomber + " месяц относится к зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNomber + " месяц относится к весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNomber + " месяц относится к лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNomber + " месяц относится к осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}