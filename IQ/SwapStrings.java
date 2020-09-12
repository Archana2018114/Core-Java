package IQ;
import java.util.Scanner;

public class SwapStrings {

	public static  void swapStrings(String a , String b) {
		// 1.Concate the a by b String as
		a=a+b;
		//2.
		b=a.substring(0,a.length()-b.length());
		//3 set value of b as
		a=a.substring(b.length());
		 System.out.println("After Swapping");
			System.out.println(" Value of  String X:="+a);
			System.out.println("Value of  String Y:="+b);
		
		//return(String a , String b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new  Scanner(System.in);
		System.out.println("Enter Value of  String x:=");
		String x=sc.nextLine();
		System.out.println("Enter Value of  String Y:=");
		String y=sc.nextLine();
		System.out.println("Before Swapping");
		System.out.println(" Value of  String X:="+x);
		System.out.println("Value of  String Y:="+y);
		 swapStrings(x,y);
		

	}

}
