import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeatTest {
    @Test
    public void isTheSeatAllocatedTest() {
        // Arrange
        Seat seat = new Seat('A', 1, false);

        // Act
        boolean expected = false;
        boolean actual = seat.isAllocated();

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void makeWholeSeatsAvailableTest() {
        SeatPlan seatPlan = new SeatPlan();

        boolean expected = false;

        for(int i = 0; i < 15; i ++) {
            Assertions.assertEquals(expected, seatPlan.getSeats().get(i).isAllocated());
        }

    }

    @Test
    public void allocateSeatsTest() {
        SeatPlan seatPlan = new SeatPlan();

        boolean expected = true;
        seatPlan.allocateSeats(3);

        boolean actual = seatPlan.getSeats().get(2).isAllocated();

        Assertions.assertEquals(expected, actual);

    }
}
