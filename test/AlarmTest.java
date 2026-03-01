import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlarmTest {
    @Test
    void alarmClassCreationtest() {
        Alarm alarm = new Alarm();
        assertNotNull(alarm);
    }
}
