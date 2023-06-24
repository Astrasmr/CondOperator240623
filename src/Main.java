public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();}
    public static void task1 () {
        System.out.println (" Задача 1");
        int age = 50;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " , то он совершеннолетний.");
        } else {
            System.out.println(" Если возраст человека меньше " + age + " , то он несовершеннолетний.");
    }
    }
    public static void task2 () {
        System.out.println(" Задача 2 ");
        int temperature = 2;
        if (temperature <= 5) {
            System.out.println(" На улице градусов " + temperature + " , то нужно надеть шапку.");
        } else {
            System.out.println(" На улице градусов " + temperature +  ", то можно идти без шапки.");
        }
    }


    public static void task3 () {
        System.out.println(" Задача 3 ");
        int speed = 80;
        if (speed >= 60) {
            System.out.println(" Если скорость " + speed + " , то придеться заплатить штраф.");
        } else {
            System.out.println(" Если скорость " + speed +  ", то можно ездить спокойно.");
        }
    }
}