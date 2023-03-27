package day27Mar23;

public class Car extends Vehical {

	static int price1;
	String model;

	void disp1() {
		System.out.println(Car.price1 + " : " + this.model);
	}

	static void show1() {
		System.out.println("Show() Car class !!!");
	}

	public Car(String model, int price) {
		super(price);
		System.out.println("Car parent class");
		this.model = model;

	}

	public static int getPrice1() {
		return price1;
	}

	public static void setPrice1(int price1) {
		Car.price1 = price1;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
