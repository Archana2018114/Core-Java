package IQ;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void revnum(int num) {
		int r=0;
		int sum=0;
	//	int t =num;
		while(num!=0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		System.out.println("Reverse of number is:="+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the u want to reverse:=");
		try(Scanner sc = new Scanner(System.in)){
			int x= sc.nextInt();
			revnum(x);
			sc.close();
			
			
		}
	}

}
