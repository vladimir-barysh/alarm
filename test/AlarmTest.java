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
    void alarmClassCreationtest() {
        assertNotNull(alarm);
    }

    @Test
    void alarmRingTest() {
        assertEquals("RING!", alarm.ring("06:00"));
    }
}
