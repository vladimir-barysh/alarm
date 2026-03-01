public class Alarm {
    public Alarm() {}

    /**
     * Метод, который звонит в определенное время
     * @param time время, в которое нужно звонить. Строка
     * @return результат проверки времени
     */
    public String ring(String time) {
        //TODO: реализовать метод до конца позднее
        if (time.equals("06:00") || time.equals("06:01")) return "RING!";
        else return "Silence...";
    }

    /**
     * Метод, проверяющий сегодня ли тот день, что указан
     * @param day указанный день
     * @return да, сегодня этот день / нет, сегодня другой день
     */
    public Boolean checkDayIsToday(String day) {
        //TODO: реализовать метод до конца позднее
        if (day.equals("Monday")) return true;
        return false;
    }

}
