package mikroblod.kinoxp.demo.model;

public class Seats {
    private int id;
    private String seatName;



    public Seats(int id, String seatName) {
        this.id = id;
        this.seatName = seatName;
    }
    public Seats() {
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


