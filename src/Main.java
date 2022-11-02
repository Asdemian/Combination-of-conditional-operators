public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println( "Установите версию приложения для Android по ссылке.");
        }
        //task 2
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //task 3
        int year = 2021;
        if (year % 100 == 0 && year % 400 !=0) {
            System.out.println(year+ " год не является високосным.");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year+ " год является високосным.");
        } else {
            System.out.println(year+ " год не является високосным.");
        }
    }

}