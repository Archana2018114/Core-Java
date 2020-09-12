package IQ;
import java.util.Scanner;

public class StringReplace {

	public static void removeSpecialandJunckcharsfromString(String s) {
		String s2=s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println("String After Replacement is:="+s2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: you want to replace");
		try(Scanner sc = new Scanner(System.in)){
		String s1 = sc.nextLine();
		System.out.println("String Before Replacement is:="+s1); 
		removeSpecialandJunckcharsfromString(s1);
		}
		

	}

}
