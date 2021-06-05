import java.util.*;
public class HotelRoomMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");
		System.out.println("Select Room Type:");
		int roomtype = sc.nextInt();
		
        System.out.println("Hotel Name:");
        String hotelName = sc.next();
        System.out.println("Room Square Feet Area");
        int numberOfSqFeet = sc.nextInt();
        System.out.println("Room has TV(Enter yes/no)");
        boolean hasTV;
		if(sc.next().equals("yes"))
        	hasTV = true;
        else
        	hasTV = false;
        System.out.println("Room has Wifi(Enter yes/no)");
        boolean hasWifi ;
        if(sc.next().equals("yes"))
        	hasWifi = true;
        else
        	hasWifi = false;
        
        if(roomtype == 1)
        {
        	DeluxeRoom dr = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = dr.getRatePerSqFeet();
            System.out.println("Room Tariff per day is:"+dr.calculateTariff(rate));
        }
        else if(roomtype == 2)
        {
        	DeluxeAcRoom dar = new DeluxeAcRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
        	int rate = dar.getRatePerSqFeet();
        	System.out.println("Room Tariff per day is:"+dar.calculateTariff(rate));
        }
        else if(roomtype == 3)
        {
        	SuiteACRoom sar = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
        	int rate = sar.getRatePerSqFeet();
        	System.out.println("Room Tariff per day is: "+sar.calculateTariff(rate));
        }
        else
        	System.out.println("Invalid Input");
	}

}
