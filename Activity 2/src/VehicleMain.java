import java.util.*;
class TwoWheeler extends Vehicle
{
	private boolean kickStartAvailable;

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	
    public void displayDetailInfo() {
        System.out.println("---Detail Information---");
        if (kickStartAvailable) {
            System.out.println("kickStartAvailable: YES");
        } else {
            System.out.println("kickStartAvailable: No");
        }
    }	
	
	
}

class FourWheeler extends Vehicle
{
	private String audioSystem;
	private int numberOFDoors;
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOFDoors ) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOFDoors = numberOFDoors;
		
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOFDoors() {
		return numberOFDoors;
	}
	public void setNumberOFDoors(int numberOFDoors) {
		this.numberOFDoors = numberOFDoors;
	}

    public void displayDetailInfo() {
        System.out.println("---Detail Information---");
        System.out.println("Audio System: " + audioSystem + "\nNumber Of Doors: " + numberOFDoors);
    }
}

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("1. Four Wheeler");
        System.out.println("2. Two Wheeler");
        System.out.println("Enter Vehicle Type:");
        int choice = sc.nextInt();
        System.out.println("Vehicle make: ");
        String make = sc.next();
        System.out.println("Vehicle Number: ");
        String vehicleNumber = sc.next();
        System.out.println("Fuel Type:");
        System.out.println("1.Diesel");
        System.out.println("2.Petrol");
        int ch = sc.nextInt();
        String fuelType;
        if (ch == 1)
            fuelType = "Diesel";
        else
            fuelType = "Petrol";
        
        System.out.println("Fuel Capacity: ");
        int fuelCapacity = sc.nextInt();
        System.out.println("Engine CC: ");
        int cc = sc.nextInt();      
        if (choice == 1) 
        {

            System.out.println("Audio System: ");
            String audioSystem = sc.next();
            System.out.println("Number of Doors: ");
            int numberOfDoors = sc.nextInt();
            FourWheeler fw = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem,
                    numberOfDoors);
            fw.displayMake();
            fw.displayBasicInfo();
            fw.displayDetailInfo();
        } 
        else 
        {

            System.out.println("KickStart Available(yes/no):");
            boolean kickStartAvailable = sc.nextBoolean();
            TwoWheeler tw = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
            tw.displayMake();
            tw.displayBasicInfo();
            tw.displayDetailInfo();
        }		
	}
}
