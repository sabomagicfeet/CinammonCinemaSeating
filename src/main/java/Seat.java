public class Seat {

    private char row; // A to C
    private int seat; // 1 to 5
    private boolean isAllocated;

    public Seat(char row, int seat, boolean isAllocated) {
        this.row = row;
        this.seat = seat;
        this.isAllocated = isAllocated;
    }

    public boolean isAllocated() {
        return isAllocated;
    }

    public void setAllocated(boolean allocated) {
        isAllocated = allocated;
    }
}
