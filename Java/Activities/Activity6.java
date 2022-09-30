package activities;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);

        plane.onBoard("Passenger 1");
        plane.onBoard("Passenger 2");
        plane.onBoard("Passenger 3");
        plane.onBoard("Passenger 4");
        plane.onBoard("Passenger 5");

        System.out.println("Take off time : " + plane.takeOff());

        System.out.println("List of passengers : ");

        for(String str:plane.getPassengers()){
            System.out.println(str);
        }

        Thread.sleep(5000);

        plane.land();

        System.out.println("Landing time : " + plane.getLastTimeLanded());

        System.out.println("People on plane after landing : " + plane.getPassengers());
    }
}
