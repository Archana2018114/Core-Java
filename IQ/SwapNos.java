package IQ;

public class SwapNos {
	//1.Using three Variables
	public static void swap(int x,int y) {
		int  t;
		t=x;
		x=y;
		y=t;
		System.out.println("After Swapping value of x:="+x);
		System.out.println("After Swapping value of y:="+y);
	}
//2 .Using two variables by using Arithmetic + and - operators
	public static void swap2var(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping value of x:="+x);
		System.out.println("After Swapping value of y:="+y);
	}
	//3.Using two variables by using Arithmetic * and / operators
	public static void swapWith2var(int x,int y) {
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("After Swapping value of x:="+x);
		System.out.println("After Swapping value of y:="+y);
	}
	//4 .Using two variables by using  Logical XOR Operation
	public static void swapWithXOR2var(int x,int y) {
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After Swapping value of x:="+x);
		System.out.println("After Swapping value of y:="+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                       		swap(5,15);
		swap2var(20,25);
		swapWith2var(32,23);
		swapWith2var(5,10);
		
	}

}
