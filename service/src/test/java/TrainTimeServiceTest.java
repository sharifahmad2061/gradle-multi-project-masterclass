import com.ahmad.maxirail.service.TrainTimeService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTimeServiceTest {
    @Test
    public void testArrivalStationNames() {
        TrainTimeService trainTimeService = new TrainTimeService();
        assertEquals("B", trainTimeService.getTrainTimes().get(0).arrivalStation());
        assertEquals("B", trainTimeService.getTrainTimes().get(1).arrivalStation());
        assertEquals("A", trainTimeService.getTrainTimes().get(2).arrivalStation());
        assertEquals("A", trainTimeService.getTrainTimes().get(3).arrivalStation());
    }
}
