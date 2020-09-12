package IQ;

public class Car {
//method overloading
	//Method hiding when same static method present in Parent and child class  and if you are try to access it through
	// child class from parest is not possible because it get hide soo we can't able to inherit the strt method because it is hidden
	public static void start() {
		System.out.println("Car----start");
		
	}
	public static void start(int a) {
		System.out.println("Car----start");
		
	}
	public static void start(String s) {
		System.out.println("Car----start");
		
	}
	public static void start(int a,int b) {
		System.out.println("Car----start");
		
	}
	public void stop() {
		System.out.println("Car----stop");
			
	}
	public  void refuel() {
		System.out.println("Car----refuel");
		
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
