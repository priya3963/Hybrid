package day27Mar23;

public class Thar extends Car{

	static String carName;
	int launchDate;
	boolean automatic;
	
	void disp2()
	{
		System.out.println(Thar.carName + " : " + this.launchDate + " : " + this.automatic);
	}
	
	static void show2()
	{
		System.out.println("Show() Thar class ---");
	}

	public Thar(String model, int price, int launchDate, boolean automatic) {
		super(model, price);
		this.launchDate = launchDate;
		this.automatic = automatic;
		System.out.println("Thar Child1 class");
	}

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		Thar.carName = carName;
	}

	public int getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(int launchDate) {
		this.launchDate = launchDate;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	
	
}
