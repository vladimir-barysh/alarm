import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alarm alarm = new Alarm();
        while (true) {
            System.out.println("Введите какой сегодня день недели, пустая строка – выход");
            String day = sc.nextLine();
            if (day.isEmpty()) break;
            System.out.println("Установите время для первого будильника:");
            String firstAlarm = sc.nextLine();
            System.out.println("Установите время для второго будильника:");
            String secondAlarm = sc.nextLine();
            switch (day) {
                case "Monday": {
                    System.out.println(alarm.ring(firstAlarm));
                    System.out.println(alarm.ring(secondAlarm));
                    break;
                }
                default: System.out.println("На сегодня будильников нет");
            }
        }
    }
}