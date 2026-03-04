import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alarm alarm = new Alarm();

        System.out.println("Введите день недели когда сработает будильник:");
        String day = sc.nextLine();

        System.out.println("Установите время для будильника:");
        String time = sc.nextLine();
        System.out.println("Будильник установлен на " + time + ". Ожидание...");

        while (true) {
            if (alarm.checkDayIsToday(day)) {
                boolean hasRung = false;
                while (!hasRung) {
                    String status = alarm.ring(time);

                    if (status.equals("RING!")) {
                        System.out.println("*  " + status + "  *");
                        hasRung = true;
                    } else {
                        try {
                            Thread.sleep(5000); //проверка каждые 5 сек
                        } catch (InterruptedException e) {
                            System.out.println("Ошибка ожидания.");
                        }
                    }
                }
                break;
            } else {
                System.out.println("Этот день не сегодня. Будильник не сработает.");
                try {
                    Thread.sleep(60000); //проверка каждую минуту
                } catch (InterruptedException e) {
                    System.out.println("Ошибка ожидания.");
                }
            }
        }
    }
}