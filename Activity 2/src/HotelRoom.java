
public class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTv;
	protected boolean hasWifi;
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTv = hasTv;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff(int cost)
	{
		return numberOfSqFeet * cost;
	}
	
	public int getRatePerSqFeet()
	{
		return 0;
	}
}

class DeluxeRoom extends HotelRoom
{
	protected int ratePerSqFeet;

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSqFeet = 10; 
	}
	
	public int getRatePerSqFeet()
	{
		if(hasWifi)
			return (ratePerSqFeet +2);
		return ratePerSqFeet;
	}	
}

class DeluxeAcRoom extends DeluxeRoom
{
	protected int ratePerSqFeet;
	public DeluxeAcRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSqFeet = 12;
	}
    public int getRatePerSqFeet() {
        return ratePerSqFeet;
    }
}

class SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet;
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSqFeet = 15;
	}
	
	public int getRatePerSqFeet() {
		if(hasWifi)
			return (ratePerSqFeet +2);
		return ratePerSqFeet;
    }
}

