package activities;

public class Activity3 {

    public static void main(String[] args){
        calculateAge(1000000000);
    }

    public static void calculateAge(long ageInSec){
        double earthSeconds = 31557600;
        double mercurySeconds = 0.2408467;
        double venusSeconds = 0.61519726;
        double marsSeconds = 1.8808158;
        double jupiterSeconds = 11.862615;
        double saturnSeconds = 29.447498;
        double uranusSeconds = 84.016846;
        double neptuneSeconds = 164.79132;

        System.out.println("Age is Earth : " + ageInSec/earthSeconds);
        System.out.println("Age is Mercury : " + ageInSec/earthSeconds/mercurySeconds);
        System.out.println("Age is Venus : " + ageInSec/earthSeconds/venusSeconds);
        System.out.println("Age is Mars : " + ageInSec/earthSeconds/marsSeconds);
        System.out.println("Age is Jupiter : " + ageInSec/earthSeconds/jupiterSeconds);
        System.out.println("Age is Saturn : " + ageInSec/earthSeconds/saturnSeconds);
        System.out.println("Age is Uranus : " + ageInSec/earthSeconds/uranusSeconds);
        System.out.println("Age is Neptune : " + ageInSec/earthSeconds/neptuneSeconds);
    }
}