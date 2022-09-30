package activities;

public class Car {

    public String color;
    public String transmission;
    public int make;
    public int tyres;
    public int doors;

    public Car(){
        this.tyres = 4;
        this.doors = 4;
    }

    public void displayCharacteristics(){
        System.out.println("The color : " + this.color);
        System.out.println("The transmission : " + this.transmission);
        System.out.println("The make : " + this.make);
        System.out.println("Number of tyres : " + this.tyres);
        System.out.println("NUmber of doors : " + this.doors);
    }

    public void accelarate(){
        System.out.println("Car is moving forward.");
    }

    public void brake(){
        System.out.println("Car has stopped.");
    }
}
