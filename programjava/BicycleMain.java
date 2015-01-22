package vehicles;
import vehicles;
public class BicycleMain {
public static void main (String args[]) {
Bicycle Bike = new Bicycle(1, 2, 1);
System.out.println("We have a new bicycle wth speed = " + Bike.getSpeed() + ",
cadence = " + Bike.getCadence() + ", gear = " + Bike.getGear());
}
}
