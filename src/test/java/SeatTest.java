import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeatTest {

    // make 3 x 5 seats
    @Test
    public void makeSeatsTest() {
        Seat[][] seats = new Seat[3][5];

        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 5; j ++) {
                switch(i) {
                    case 0 :
                        seats[i][j] = new Seat('A', j + 1, false);
                        break;

                    case 1:
                        seats[i][j] = new Seat('B', j + 1, false);
                        break;

                    case 2:
                        seats[i][j] = new Seat('C', j + 1, false);
                        break;
                }
            }
        }

        boolean expected = false;

        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 5; j ++) {
                Assertions.assertEquals(expected, seats[i][j].isAllocated());
            }
        }
    }


}
