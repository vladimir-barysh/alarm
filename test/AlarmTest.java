import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlarmTest {
    private Alarm alarm;

    @BeforeEach
    void setUp() {
        alarm = new Alarm();
    }

    @Test
    void alarmClassCreationTest() {
        assertNotNull(alarm);
    }

    /*@Test
    void alarmRingTest0600() {
        assertEquals("RING!", alarm.ring("06:00"));
    }

    @Test
    void alarmRingTest0601() {
        assertEquals("RING!", alarm.ring("06:01"));
    }

    @Test
    void alarmCheckDayIsTodayTest() {
        assertTrue(alarm.checkDayIsToday("Monday"));
    }*/

    @Test
    void alarmCheckTodayIsTuesdayTest() {
        assertFalse(alarm.checkDayIsToday("Tuesday"));
    }

    @Test
    void alarmRingNowTest() {
        String currentTime = java.time.LocalTime.now()
                .format(java.time.format.DateTimeFormatter.ofPattern("HH:mm"));

        assertEquals("RING!", alarm.ring(currentTime));
    }

    @Test
    void alarmCheckDayIsTodayDynamicTest() {
        String currentDay = java.time.LocalDate.now().getDayOfWeek()
                .getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.ENGLISH);
        assertTrue(alarm.checkDayIsToday(currentDay));
    }

    @Test
    void alarmRingDelayTime() {
        String futureTime = java.time.LocalTime.now().plusMinutes(1)
                .format(java.time.format.DateTimeFormatter.ofPattern("HH:mm"));

        assertEquals("Silence...", alarm.ring(futureTime));
    }
}
