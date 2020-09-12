package IQ;

public class Factorial {

	//1.Without recursive function
	public static int facto(int num) {
		int fact=1;
		System.out.print("Fact of  "+ num+ " is:=" );
		if(num==0)
		//System.out.print("Fact of  "+ num+ " is:=" );
		return 1;
		for(int i=1;i<=num;i++)
			fact=fact*i;
		//System.out.print("Fact of  "+ num+ " is:=" );
	     return fact;
	}
	//2.With recursive function :=function which calling itself
	
	public static int factorial(int num) {
		
		if(num==0)
			return 1;
		else
			return(num*factorial(num-1));
	}
	
	public static void main(String[] args) {
				// TODO Auto-generated method stub

//		 System.out.println( facto(4));
//		 System.out.println( facto(1));
//		 System.out.println( facto(0));
//	       
		System.out.println("Factorial of 4 is:="+factorial(4));
		System.out.println("Factorial of 1 is:="+factorial(1));
		System.out.println("Factorial of 0 is:="+factorial(0));
	}

}
