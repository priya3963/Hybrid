package day27Mar23;

public class Vehical {
	int price;
	static String color;

	void disp() {
		System.out.println(this.price + " : " + Vehical.color);
	}

	static void show() {
		System.out.println("Show() Calls Vehhical class");
	}

	Vehical(int price) {
		this.price = price;
		System.out.println("Vehical grandParent class");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Vehical.color = color;
	}

}
