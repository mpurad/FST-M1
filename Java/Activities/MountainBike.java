package activities;

public class MountainBike extends Bicycle{

    private int seatHeight;

    public MountainBike(int gears, int speed, int seatHeight) {
        super(gears, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public String bicycleDesc() {
        return(super.bicycleDesc() + "\nSeat height : " + seatHeight);
    }
}
