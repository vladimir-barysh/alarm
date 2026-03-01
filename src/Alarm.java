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
        throw new IllegalArgumentException("ring() works only with 06:00");
    }

    public Boolean checkDayIsToday(String day) {
        //TODO: реализовать метод до конца позднее
        return true;
    }

}
