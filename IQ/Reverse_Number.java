package IQ;

public class Reverse_Number {
	//1. Using for loop
	public static void  palinodrome(String s) {
		String s1 = "";
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
			System.out.println(s1);
		
	}

	//2.Using String Buffer object
	public static void palinodromeStrBuffer(String s2) {
	StringBuffer bf=new StringBuffer(s2);
	System.out.println(bf.reverse());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 palinodrome("madam");
		 palinodrome("teeth");
		 

	}

}
