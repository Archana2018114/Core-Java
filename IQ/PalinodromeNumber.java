package IQ;

public class PalinodromeNumber {
	
	public static void isPlainodromeNum(int num) {
		int r=0;
		int sum=0;
		int t=num;
		while(num>0){
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
			if(t==sum) {
				System.out.println("Number is a palinodrome Number");
			}else {
				System.out.println("Number is not  a palinodrome Number");
		}
		
	}

	public static void  palinodrome(String s) {
		String s1 = "";
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
			if(s.equals(s1))
				System.out.println("String is the palinodrome String");
			else
				System.out.println("String is  not the palinodrome String");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPlainodromeNum(151);
		isPlainodromeNum(78787);
		isPlainodromeNum(2);
		isPlainodromeNum(152);
		 palinodrome("madam");
		 palinodrome("teeth");
		 
	}

}
