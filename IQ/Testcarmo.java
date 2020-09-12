package IQ;

public class Testcarmo  extends Car{
	// static method can't be overriden
	public static  void start() {
		System.out.println("TestCar-----start");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testcarmo m= new Testcarmo();
	start();
		m.stop();
		m.refuel();
		

	}

}
