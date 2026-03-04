import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alarm alarm = new Alarm();
        while (true) {
            System.out.println("Введите день недели, когда будет срабатывать будильник, пустая строка – выход");
            String day = sc.nextLine();
            if (day.isEmpty()) break;
            if (alarm.checkDayIsToday(day)) {
                System.out.println("Установите время для будильника:");
                String time = sc.nextLine();
                System.out.println("Результат: " + alarm.ring(time));
            } else {
                System.out.println("Этот день не сегодня. Будильник не сработает.");
            }
        }
    }
}