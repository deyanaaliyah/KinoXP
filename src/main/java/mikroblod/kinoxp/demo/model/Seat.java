package mikroblod.kinoxp.demo.model;

public class Seat {
    private int id;
    private String seatName;



    public Seat(int id, String seatName) {
        this.id = id;
        this.seatName = seatName;
    }
    public Seat() {
    }
    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


