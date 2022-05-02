import java.util.ArrayList;
import java.util.List;

public class SeatPlan {
    private List<Seat> seats;

    // make 15 seats available
    public SeatPlan() {
        this.seats = new ArrayList<Seat>();

        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 5; j ++) {
                switch(i) {
                    case 0:
                        seats.add(new Seat('A', j + 1, false));
                        break;
                    case 1:
                        seats.add(new Seat('B', j + 1, false));
                        break;
                    case 2:
                        seats.add(new Seat('C', j + 1, false));
                        break;
                }
            }
        }

    }

    public List<Seat> getSeats() {
        return seats;
    }

    // allocate seats
    // args : howManySeats : 1 - 3
    // return : void
    public void allocateSeats(int howManySeats) {
        int allocateSeatCounter = 0;

        for(int i = 0; i < 15; i ++) {
            // if current seat is allocated, see next seat
            // if all seats are allocated, break
            // if current seat is not allocated, allocate a seat, allocateSeatCounter++, if allocateSeatCounter equals howManySeats, break

            if( ( ! seats.get(i).isAllocated() ) && (allocateSeatCounter < howManySeats) ) {
                seats.get(i).setAllocated(true);
                allocateSeatCounter ++;
            }
        }
    }
}
