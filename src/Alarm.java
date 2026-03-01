public class Alarm {
    public Alarm() {}

    public String ring(String time) {
        //TODO: реализовать метод до конца позднее
        if (time.equals("06:00") || time.equals("06:01")) return "RING!";
        throw new IllegalArgumentException("ring() works only with 06:00");
    }
}
