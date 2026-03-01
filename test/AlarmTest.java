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

    @Test
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
    }

    @Test
    void alarmCheckTodayIsTuesdayTest() {
        assertFalse(alarm.checkDayIsToday("Tuesday"));
    }
}
