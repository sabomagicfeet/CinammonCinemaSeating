public class Seat {

    private char row;
    private int seat;
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

    public char getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }
}
