package activities;

public class Bicycle implements BicycleParts, BicycleOperations{

    private int gears;

    private int speed;

    public Bicycle(int gears, int speed){
        this.gears = gears;
        this.speed = speed;
    }

    @Override
    public void applyBrake(int decrement) {
        this.speed-=decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed+=increment;
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
    }
}
