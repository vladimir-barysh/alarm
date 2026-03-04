import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Alarm {
    public Alarm() {}

    /**
     * Метод, который звонит в определенное время
     * @param scheduledTime время, в которое нужно звонить. Строка
     * @return результат проверки времени
     */
    public String ring(String scheduledTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String now = LocalTime.now().format(formatter);
        if (now.equals(scheduledTime)) {
            return "RING!";
        } else {
            return "Silence...";
        }
    }

    /**
     * Метод, проверяющий сегодня ли тот день, что указан
     * @param day указанный день
     * @return да, сегодня этот день / нет, сегодня другой день
     */
    public Boolean checkDayIsToday(String day) {
        String today = LocalDate.now()
                .getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return today.equalsIgnoreCase(day);
    }

}
