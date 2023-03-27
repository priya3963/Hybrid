package day27Mar23;

public class Runner {
	public static void main(String[] args) {
		System.out.println("\n******************Vehical class ***********");
Vehical v=new Vehical(20050);
Vehical.color= "Green";
Vehical.show();
v.setPrice(300000);
Vehical.setColor("White");
v.disp();

System.out.println("\n--------Car Parent clas and Vehicl Grandparent class--------------");

Car c=new Car("KIA",2000);
Car.setPrice1(200000);//Car
c.setModel("Honda");//car
c.disp1();//car
Car.show1();//car
Car.color = "Black";//vehical
c.setPrice(400000);//vehical
c.disp();//vehical
Car.show();//vehical

System.out.println("\n------Thar Child1 class and Car Parent class and vehical Grandparent class------------");

Thar t=new Thar("KIa",3000,2019,false);
t.automatic=true;//Thar child1 class of Car Parent Class
t.launchDate=2020;//Thar child1 class of Car Parent Class
Thar.carName="Maruti Suzuki";//Thar child1 class of Car Parent Class
t.disp2();//Thar child1 class of Car Parent Class
Thar.show2();//Thar child1 class of Car Parent Class
Thar.setPrice1(2050);//Car
t.setModel("Tata motors");//car
t.disp1();//car
Thar.show1();//car
Thar.color = "Blue";//vehical
t.setPrice(200);//vehical
t.disp();//vehical
Thar.show();//vehical

System.out.println("\n------Bmw Child2 class ,Thar Child1 class and Car Parent class and vehical Grandparent class------------");

Bmw b=new Bmw("KIa",3000,"Skoda",false);
b.modelName="Hyundai i20";//Bmw child2 class of Car Parent Class
Bmw.launchDate1=2022;//Bmw child2 class of Car Parent Class
b.automatic1=true;// Bmw child2 class of Car Parent Class
b.disp3();//Bmw child2 class of Car Parent Class
Bmw.show3();//Bmw child2 class of Car Parent Class
Thar.setPrice1(20500);//Car
t.setModel("Renault Kwid");//car
t.disp1();//car
Thar.show1();//car
Thar.color = "Red";//vehical
t.setPrice(50000);//vehical
t.disp();//vehical
Thar.show();//vehical



	}
}
