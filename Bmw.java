package day27Mar23;

public class Bmw extends Car{
	
	String modelName;
	static int launchDate1;
	boolean automatic1;
	
	void disp3()
	{
		System.out.println(this.modelName + " : " + Bmw.launchDate1 + " : " + this.automatic1);
	}

	static void show3()
	{
		System.out.println("Show() Bmw class...");
	}

	public Bmw(String model, int price, String modelName, boolean automatic1) {
		super(model, price);
		System.out.println("Bmw child2 class...");
		this.modelName = modelName;
		this.automatic1 = automatic1;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public static int getLaunchDate1() {
		return launchDate1;
	}

	public static void setLaunchDate1(int launchDate1) {
		Bmw.launchDate1 = launchDate1;
	}

	public boolean isAutomatic1() {
		return automatic1;
	}

	public void setAutomatic1(boolean automatic1) {
		this.automatic1 = automatic1;
	}
	
	
}
